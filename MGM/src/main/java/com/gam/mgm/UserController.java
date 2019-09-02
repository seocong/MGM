package com.gam.mgm;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.MessageDto;
import com.gam.mgm.dto.PointDto;
import com.gam.mgm.handler.EchoHandler;
import com.gam.mgm.service.IBoardService;
import com.gam.mgm.service.IMemberService;
import com.gam.mgm.service.IMessageService;
import com.gam.mgm.service.IPointService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public void login() {
//			logger.info("login get ......");
//	}
	@Autowired
	private IMemberService memberService;
	@Autowired
	private IMessageService messageService;
	@Autowired
	private IPointService pointService;
	@Autowired
	private IBoardService boardService;
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, Model model) {
		logger.info("LoginPost");
		HttpSession session = request.getSession();
		Map<String,String> loginMap= new HashMap<String,String>();
		loginMap.put("member_id", request.getParameter("id"));
		loginMap.put("member_pw", request.getParameter("pw"));
		MemberDto memberDto = memberService.login(loginMap);
		session.setAttribute("uid", memberDto);
		System.out.println("로그인 아이디 확인: "+session.getAttribute("uid"));
		if(memberDto != null) {
			System.out.println("로그인 아이디: "+memberDto.getMember_id());
			int msgCount = messageService.msgTotalCount(memberDto.getMember_id());
			session.setAttribute("msgCount",msgCount);
			return "redirect:main.do";
		}else {
			model.addAttribute("msg", "로그인실패");
			model.addAttribute("url","main.do");
			return "user/failmsg";
		}		
	}
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)//로그아웃
	public String logout(Locale locale, Model model,HttpSession session) {
		logger.info("로그아웃.", locale);
		session.invalidate();
		return "redirect:main.do";
	}
	@RequestMapping(value = "/signupform.do", method = RequestMethod.GET)
	public String signUpForm() {
		logger.info("회원가입 창 이동");
		return "user/signup";
	}
	
	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
	public String signUp(HttpServletRequest request,Model model) throws IOException {
		logger.info("회원가입");
		MemberDto member = new MemberDto();
		String addr = "";
		addr = request.getParameter("zipcode")+" "+request.getParameter("address")+" "+request.getParameter("detailAddress")+" "+request.getParameter("notes");
		System.out.println("addr: "+addr);
		member.setMember_address(addr);
		member.setMember_id(request.getParameter("id"));
		member.setMember_pw(request.getParameter("pw"));
		member.setMember_name(request.getParameter("name"));
		String birth = request.getParameter("year")+request.getParameter("month")+request.getParameter("date");
//		System.out.println("생년월일 찍어보기: "+birth);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date userBirth;
		try {
			userBirth = dateFormat.parse(birth);
			member.setMember_birth(userBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		member.setMember_phnum(request.getParameter("phnum"));
		boolean success = memberService.signUp(member);
		if(success) {
			PointDto point = new PointDto();
			point.setPoint_id(request.getParameter("id"));
			point.setPoint_title("회원가입");
			point.setPoint_sign("P");
			point.setPoint_price(100);
			boolean pointSuccess = pointService.insertPoint(point);
			if(pointSuccess) {
				System.out.println("포인트 추가 성공");
			}else {
				System.out.println("포인트 추가 실패");
			}
			System.out.println("회원가입 성공");
			model.addAttribute("msg","회원가입을 축하합니다.");
			model.addAttribute("url","main.do");
			return "Redirect";
		}else {
			System.out.println("회원가입 실패");
			model.addAttribute("msg","회원가입에 실패했습니다. 다시 시도해주세요.");
			model.addAttribute("url","main.do");
			return "Redirect";
		}
		
	}
	
	@RequestMapping(value="/mypage.do",method=RequestMethod.GET)
	public String mypage(HttpServletRequest request, Model model) {
		logger.info("mypage");
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		//받은쪽지 페이지 카운트
		double rMsgCount = messageService.msgCount(uid);
		//보낸쪽지 페이지 카운트
		double sMsgCount = messageService.msgCount(uid);
		//게시글 페이지 카운트
		double postCount = boardService.myPostCount(uid);
		//받은쪽지 페이지
		int rpageNum = 0;
		if(request.getParameter("rpagenum")!=null) {
			rpageNum = Integer.parseInt(request.getParameter("rpagenum"));
		}
		//보낸쪽지 페이지
		int spageNum = 0;
		if(request.getParameter("spagenum")!=null) {
			spageNum = Integer.parseInt(request.getParameter("spagenum"));
		}
		//게시글 페이지
		int boardNum = 0; 
		if(request.getParameter("boardnum")!=null) {
			boardNum = Integer.parseInt(request.getParameter("boardnum"));
		}
		//받은쪽지 맵
		Map<String,Object> rMap = new HashMap<String,Object>();
		rMap.put("id",uid);
		rMap.put("pagenum",rpageNum);
		//보낸쪽지 맵
		Map<String,Object> sMap = new HashMap<String,Object>();
		sMap.put("id",uid);
		sMap.put("pagenum",spageNum);
		//게시글 맵
		Map<String,Object> boardMap = new HashMap<String,Object>();
		boardMap.put("id",uid);
		boardMap.put("pagenum",boardNum);
		MemberDto memberInfo = memberService.myPage(uid);
		//받은쪽지
		List<MessageDto> rMsgList = messageService.msgList(rMap);
		//보낸쪽지
		List<MessageDto> sMsgList = messageService.msgSendList(sMap);
		//내가 쓴 게시글
		List<BoardDto> myPost = boardService.myPost(boardMap);
		model.addAttribute("memberInfo",memberInfo);
		model.addAttribute("msgList",rMsgList);
		model.addAttribute("msgSendList",sMsgList);
		model.addAttribute("myPost",myPost);
		model.addAttribute("rMsgCount",rMsgCount);
		model.addAttribute("sMsgCount",sMsgCount);
		model.addAttribute("postCount",postCount);
		model.addAttribute("rpageNum",rpageNum);
		model.addAttribute("spageNum",spageNum);
		model.addAttribute("boardNum",boardNum);
		return "user/myPage";
	}
	@RequestMapping(value="/sMsgDel.do",method=RequestMethod.POST)
	public String sMsgDel(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		String[] delValue = request.getParameterValues("sDelChk");
		Map<String, String> delList = new HashMap<String,String>();
		delList.put("message_receiver",uid);
		for(String del:delValue) {
			delList.put("message_seq",del);
			messageService.msgSDel(delList);
		}
		return "redirect:mypage.do";
	}
	@RequestMapping(value="/msgDel.do",method=RequestMethod.GET)
	public String msgDel(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		String delValue = request.getParameter("msgSeq");
		Map<String, String> delList = new HashMap<String,String>();
		delList.put("message_receiver",uid);
		delList.put("message_seq",delValue);
		String div = request.getParameter("div");
		boolean is=false;
		if(div.equals("s")) {
			is= messageService.msgSDel(delList);
		}else if(div.equals("r")) {
			is= messageService.msgRDel(delList);
		}
		if(is) {
			model.addAttribute("msg","메세지가 삭제되었습니다.");
			return "user/closeRedirect";
		}else {
			model.addAttribute("msg","메세지가 삭제에 실패했습니다. 다시 시도해주세요.");
			return "user/closeRedirect";
		}
	}
	@RequestMapping(value="/rMsgDel.do",method=RequestMethod.POST)
	public String rMsgDel(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		String[] delValue = request.getParameterValues("rDelChk");
		Map<String, String> delList = new HashMap<String,String>();
		delList.put("message_sender",uid);
		for(String del:delValue) {
			delList.put("message_seq",del);
			messageService.msgRDel(delList);
		}
		return "redirect:mypage.do";
	}
	@RequestMapping(value="/msgSendOpen.do",method=RequestMethod.GET)
	public String msgSendOpen(HttpServletRequest request, Model model) {
		return "user/msgsend";
	}
	//쪽지쓰기
	@RequestMapping(value="/msgSend.do",method=RequestMethod.POST)
	public String msgSend(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		MessageDto dto = new MessageDto();
		dto.setMessage_content(request.getParameter("content"));
		dto.setMessage_sender(uid);
		dto.setMessage_receiver(request.getParameter("receiver"));
		boolean is = messageService.msgSend(dto);
		if(is) {
			model.addAttribute("msg",dto.getMessage_receiver()+"에게 쪽지를 보냈습니다.");
			EchoHandler handler = new EchoHandler();
			return "user/closeRedirect";
		}else {
			model.addAttribute("msg","쪽지를 보내는데 실패했습니다. 다시 시도해주세요.");
			return "user/closeRedirect";
		}
	}
	@RequestMapping(value="/msgDetail.do",method=RequestMethod.GET)
	public String msgDetail(HttpServletRequest request, Model model) {
		MessageDto dto = new MessageDto();
		dto.setMessage_seq(Integer.parseInt(request.getParameter("msgSeq")));
		dto=messageService.msgDetail(dto);
		model.addAttribute("message",dto);
		String div = request.getParameter("div");
		if(div.equals("s")) {
			return "user/msgsDetail";
		}else if(div.equals("r")) {
			return "user/msgrDetail";
		}else {
			return null;
		}
	}
	@RequestMapping(value="/updateUserInfoForm",method=RequestMethod.GET)
	public String updateUserForm(HttpServletRequest request, Model model) {
		logger.info("updateUserForm Controller");
		HttpSession session = request.getSession();
		if(session!=null) {
			MemberDto member = (MemberDto) session.getAttribute("uid");
			String uid = member.getMember_id();
			model.addAttribute("uid",uid);
		}else {
			model.addAttribute("msg", "로그인이 필요합니다.");
			model.addAttribute("url","main.do");
			return "user/failmsg";
		}
		return "user/updateUser";
	}
	
	@ResponseBody
	@RequestMapping(value="/checkUser.do",method=RequestMethod.POST)
	public String checkUser(HttpServletRequest request, Model model){
			logger.info("checkUser들어왔니");
			HttpSession session = request.getSession();
			String id = ((MemberDto) session.getAttribute("uid")).getMember_id();
			String password = request.getParameter("pw");
			Map<String,String> user = new HashMap<String,String>();
			user.put("member_id", id);
			user.put("member_pw", password);
			MemberDto chkUser = memberService.login(user);
			System.out.println("회원탈퇴 회원 확인: "+chkUser);
			if(chkUser != null) {
				return "success";
			}else {
				return "fail";
			}
	}
	
	@ResponseBody
	@RequestMapping(value="/withdrawal.do",method=RequestMethod.POST)
	public String withdrawal(HttpServletRequest request, Model model){
			logger.info("withdrawal들어왔니");
			HttpSession session = request.getSession();
			String id = ((MemberDto) session.getAttribute("uid")).getMember_id();
			boolean iss = memberService.withdrawal(id);
			if(iss) {
				session.invalidate();
				return "success";
			}else {
				return "fail";
			}
	}
	
	@RequestMapping(value="/userUpdateForm.do", method=RequestMethod.GET)
	public String userUpdate(HttpServletRequest request, Model model) {
		logger.info("업데이트 포옴");
		HttpSession session = request.getSession();
		MemberDto userInfo = (MemberDto)session.getAttribute("uid");
		String id = userInfo.getMember_id();
		MemberDto member = memberService.myPage(id);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String userBirth = dateFormat.format(member.getMember_birth());
		model.addAttribute("userInfo",member);
//		model.addAttribute("userBirth",userBirth);
		return "user/userUpdate";
	}

	@ResponseBody
	@RequestMapping(value="/idCheck.do",method= RequestMethod.POST)
	public boolean idCheck(Locale locale,HttpServletRequest request) {
		logger.info("아이디 중복 체크",locale);
		String id = request.getParameter("id");
		System.out.println("아이디: "+id);
		boolean check = memberService.idCheck(id);
		System.out.println("결과: "+check);
		return check;
	}
	
	@ResponseBody
	@RequestMapping(value="/phCheck.do",method= RequestMethod.POST)
	public boolean phCheck(Locale locale,HttpServletRequest request) {
		logger.info("전화번호 중복 체크",locale);
		String ph = request.getParameter("ph");
		System.out.println("전화번호: "+ph);
		boolean check = memberService.phCheck(ph);
		System.out.println("결과: "+check);
		return check;
	}
	
	@ResponseBody
	@RequestMapping(value="/msgCheck.do",method= RequestMethod.POST)
	public String msgCheck(Locale locale,HttpServletRequest request,HttpSession session) {
		MemberDto dto = (MemberDto) session.getAttribute("uid");
		if(dto!=null) {
			String id = dto.getMember_id(); 
			String msgCount = Integer.toString(messageService.msgTotalCount(id));
			return msgCount;
		}else {
			return null;
		}
	}
}
