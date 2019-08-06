package com.gam.mgm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.service.ITrainerService;
@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private ITrainerService trainerService;
	@RequestMapping(value="/adminPage.do",method=RequestMethod.GET)
	public String adminPage(Model model) {
		return "Admin/AdTemp";
	}
	
	@RequestMapping(value="/championTest.do",method=RequestMethod.GET)
	public String ChampionList(HttpServletRequest request,Model model){
		System.out.println(request.getParameter("tr_name"));
		String tr_name=request.getParameter("tr_name");
		List<ChampionDto> list = trainerService.getChampionList(tr_name);
		model.addAttribute("champList",list);
		return "testpage";
	}
}
