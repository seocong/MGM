package com.gam.mgm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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

import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.PointDto;
import com.gam.mgm.service.IMemberService;
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
	private IPointService pointService;
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
	public String signUp(HttpServletRequest request) {
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
		System.out.println("생년월일 찍어보기: "+birth);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
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
		}else {
			System.out.println("회원가입 실패");
		}
		return "redirect:main.do";
	}
	
	@RequestMapping(value="/mypage.do",method=RequestMethod.GET)
	public String mypage(HttpServletRequest request, Model model) {
		logger.info("mypage");
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("uid");
		String uid = member.getMember_id();
		MemberDto memberInfo = memberService.myPage(uid);
		model.addAttribute("memberInfo",memberInfo);
		return "user/myPage";
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
}
