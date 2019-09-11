package com.gam.mgm;

import java.util.ArrayList;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.PointDto;
import com.gam.mgm.service.IBoardService;
import com.gam.mgm.service.IManagerService;
@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private IBoardService boardService;
	@Autowired
	private IManagerService mgrService;
	@RequestMapping(value="/adminPage.do",method=RequestMethod.GET)
	public String adminPage(Model model,HttpServletRequest request,Locale locale,HttpSession session) {
		logger.info("매니저 페이지 이동", locale);
		MemberDto admin = (MemberDto) session.getAttribute("uid");
		List<MemberDto> memberDto = new ArrayList<MemberDto>();
		List<BoardDto> boardDto = new ArrayList<BoardDto>();
		List<PointDto> pointDto = new ArrayList<PointDto>();
		Map<String, Object> map= new HashMap<String,Object>();
		System.out.println("id="+request.getParameter("searchId"));
		String id = null;
		if(request.getParameter("searchId")!=null && request.getParameter("searchId")!="") {
			id=request.getParameter("searchId");
		}
		map.put("id",id);
		int totalCount = 0;
		if(admin!=null) {
			try {
				if(admin.getMember_id().equals("admin")) {
					int pagenum = 0;
					if(request.getParameter("pagenum")!=null) {
						pagenum = Integer.parseInt(request.getParameter("pagenum"));
						if(pagenum<0) {
							pagenum=0;
						}
					}
					map.put("pagenum",pagenum*20);
					String div = null;
					if(request.getParameter("div")!=null) {
						div = request.getParameter("div");
						if(div.equals("member")) {
							totalCount = mgrService.memberCount(map);
							if(pagenum>totalCount/18) {
								pagenum=totalCount;
							}
							memberDto = mgrService.memberList(map);
							model.addAttribute("totalCount",totalCount);
							model.addAttribute("dto",memberDto);
						}else if(div.equals("board")) {
							totalCount = mgrService.boardCount(map);
							if(pagenum>totalCount/18) {
								pagenum=totalCount;
							}
							boardDto = mgrService.boardList(map);
							model.addAttribute("totalCount",totalCount);
							model.addAttribute("dto",boardDto);
						}else if(div.equals("point")) {
							totalCount = mgrService.pointCount(map);
							if(pagenum>totalCount/18) {
								pagenum=totalCount;
							}
							model.addAttribute("totalCount",totalCount);
							pointDto = mgrService.pointList(map);
							model.addAttribute("dto",pointDto);

						}else if(div.equals("reset")){
							model.addAttribute("divs",div);
							return "Admin/AdTemp";
						}else {
							div="member";
							totalCount = mgrService.memberCount(map);
							if(pagenum>totalCount/18) {
								pagenum=totalCount;
							}
							model.addAttribute("totalCount",totalCount);
							pointDto = mgrService.pointList(map);
							model.addAttribute("dto",memberDto);
						}
					}else{
						div="member";
						totalCount = mgrService.memberCount(map);
						if(pagenum>totalCount/18) {
							pagenum=totalCount;
						}
						model.addAttribute("totalCount",totalCount);
						memberDto = mgrService.memberList(map);
						model.addAttribute("dto",memberDto);
					}
					model.addAttribute("pagenum",pagenum);
					model.addAttribute("divs",div);
					model.addAttribute("searchId",id);
					return "Admin/AdTemp";
				}else{
					model.addAttribute("msg","잘못된 접근입니다.");
					model.addAttribute("url","main.do");
					return "Redirect";
				}
			}catch(Exception e) {
				e.printStackTrace();
				model.addAttribute("msg","오류가 발생했습니다. 다시 시도해주세요.");
				model.addAttribute("url","main.do");
				return "Redirect";
			}
		}else {
			model.addAttribute("msg","잘못된 접근입니다.");
			model.addAttribute("url","main.do");
			return "Redirect";
		}
	}
	@Transactional
	@RequestMapping(value="/managerDel.do",method=RequestMethod.POST)
	public String memberDel(HttpServletRequest request,Model model) {
		String divs = request.getParameter("divs");
		String[] delValues = request.getParameterValues("chkvalue");
		int success = 0;
		if(divs!=null && delValues!=null) {
			if(divs.equals("member")) {
				for(String id:delValues) {
					boolean is=mgrService.memberDel(id);
					if(is) {
						success++;
					}
				}
				if(delValues.length==success) {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","회원삭제에 성공했습니다."+"("+success+"명)");
					return "Redirect";
				}else {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","회원삭제 삭제 실패. 다시 시도해주세요.");
					return "Redirect";
				}
			}else if(divs.equals("board")) {
				for(String seq:delValues) {
					boolean is=mgrService.boardDel(Integer.parseInt(seq));
					if(is) {
						success++;
					}
				}
				if(delValues.length==success) {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","게시물 삭제에 성공했습니다."+"("+success+"개)");
					return "Redirect";
				}else {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","게시물 삭제 실패. 다시 시도해주세요.");
					return "Redirect";
				}
			}else if(divs.equals("point")) {
				for(String seq:delValues) {
					boolean is=mgrService.pointDel(Integer.parseInt(seq));
					if(is) {
						success++;
					}
				}
				if(delValues.length==success) {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","포인트 내역 삭제에 성공했습니다."+"("+success+"개)");
					return "Redirect";
				}else {
					model.addAttribute("url","adminPage.do");
					model.addAttribute("msg","포인트 내역 삭제 실패. 다시 시도해주세요.");
					return "Redirect";
				}
			}
		}else {
			model.addAttribute("url","adminPage.do");
			model.addAttribute("msg","오류가 발생했습니다. 다시 시도해주세요.");
			return "Redirect";
		}
		return null;
	}
	@RequestMapping(value="/searchId.do",method=RequestMethod.GET)
	public String searchId(HttpServletRequest request,Model model,HttpSession session){
		String searchId = request.getParameter("searchId");
		List<MemberDto> memberDto = new ArrayList<MemberDto>();
		List<BoardDto> boardDto = new ArrayList<BoardDto>();
		List<PointDto> pointDto = new ArrayList<PointDto>();
		String div = request.getParameter("div");
		String returnPage = null;
		MemberDto admin = (MemberDto) session.getAttribute("uid");
		Map<String, Object> map= new HashMap<String,Object>();
		String id = null;
		map.put("id",id);
		int totalCount = 0;
		if(admin!=null) {
			try {
				if(admin.getMember_id().equals("admin")) {
					int pagenum = 0;
					if(request.getParameter("pagenum")!=null) {
						pagenum = Integer.parseInt(request.getParameter("pagenum"));
						if(pagenum<0) {
							pagenum=0;
						}
						map.put("pagenum",pagenum*20);
						if(request.getParameter("div")!=null) {
							div = request.getParameter("div");
							if(div.equals("member")) {
								
							}else if(div.equals("board")) {
								
							}else if(div.equals("point")) {
								
							}else {
								model.addAttribute("url","adminPage.do");
								model.addAttribute("msg","오류가 발생했습니다. 다시 시도해주세요.");
							}
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
				model.addAttribute("url","adminPage.do");
				model.addAttribute("msg","오류가 발생했습니다. 다시 시도해주세요.");
				return "Redirect";
			}
		}
		
		return returnPage;
	}
	@RequestMapping(value="/pointplusOpen.do",method=RequestMethod.GET)
	public String pointplusOpen(){
		return "pointPlus";
	}
	@RequestMapping(value="/pointplus.do",method=RequestMethod.POST)
	public String pointPlus(HttpServletRequest request, Model model,HttpSession session){
		logger.info("포인트 추가 들어옴");
		MemberDto admin = (MemberDto) session.getAttribute("uid");
		String redirect= "user/closeRedirect";
		if(admin!=null) {
			try {
				if(admin.getMember_id().equals("admin")) {
					Map<String,Object> map = new HashMap<String,Object>();
					int point = Integer.parseInt(request.getParameter("point"));
					String reason = request.getParameter("reason");
					String sign = request.getParameter("sign");
					map.put("point",point);
					map.put("sign",sign);
					map.put("title",reason);
					int count=0;
					int fail = 0;
					if(request.getParameter("allMember")==null) {
						String id =request.getParameter("id");
						map.put("id",id);
						boolean is = mgrService.pointPlus(map);
						if(!is) {
							model.addAttribute("msg","error");
							return "user/closeRedirect";
						}else {
							return "user/closeRedirect";
						}
					}else{
						List<String> allId = mgrService.allMember();
						for(String id:allId) {
							map.put("id",id);
							boolean is = mgrService.pointPlus(map);
							if(is) {
								count++;
							}else{
								fail++;
							}
						}
						if(allId.size()==count){
							return "user/closeRedirect";
						}else {
							model.addAttribute("msg","실패: "+fail+"명");
						}
					}
				}else {
					model.addAttribute("msg","잘못된 접근입니다.");
				}
			}catch(Exception e) {
				e.printStackTrace();
				model.addAttribute("msg","error");			
				return redirect;
			}
		}else {
			model.addAttribute("msg","error");
		}
		return redirect;
	}
	//	@RequestMapping(value="/championTest.do",method=RequestMethod.GET)
	//	public String ChampionList(HttpServletRequest request,Model model){
	//		
	//		System.out.println(request.getParameter("tr_name"));
	//		String tr_name=request.getParameter("tr_name");
	//		List<ChampionDto> list = trainerService.getChampionList(tr_name);
	//		List<Integer> testList = new ArrayList<>();
	//		testList.add(1);
	//		testList.add(3);
	//		testList.add(5);
	//		testList.add(7);
	//		testList.add(9);
	//		testList.add(10);
	//		model.addAttribute("num",12);
	//		model.addAttribute("testList",testList);
	//		model.addAttribute("champList",list);
	//		return "testpage";
	//	}
}
