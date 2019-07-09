package com.gam.mgm;

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

import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.service.IMemberService;

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
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, Model model) {
		logger.info("LoginPost");
		HttpSession session = request.getSession();
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		Map<String,String> loginMap= new HashMap<String,String>();
		loginMap.put("member_id", request.getParameter("id"));
		loginMap.put("member_pw", request.getParameter("pw"));
		
		
		MemberDto memberDto = memberService.login(loginMap);
		session.setAttribute("uid", memberDto);
		System.out.println("로그인 아이디 확인: "+session.getAttribute("uid"));
		/*if(memberDto != null) {
			System.out.println("로그인 아이디: "+memberDto.getMember_id());
			
			model.addAttribute("msg", "로그인성공");
		}else {
			model.addAttribute("msg", "로그인실패");
		}*/
		return "redirect:main.do";
		
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
		member.setMember_id(request.getParameter("id"));
		member.setMember_pw(request.getParameter("pw"));
		member.setMember_address(request.getParameter("addr"));
		member.setMember_name(request.getParameter("name"));
		member.setMember_birth(request.getParameter("birth"));
		member.setMember_phnum(request.getParameter("phnum"));
		member.setMember_likeplace(request.getParameter("likeplace"));
		
		boolean success = memberService.signUp(member);
		if(success) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		return "user/login";
	}
}
