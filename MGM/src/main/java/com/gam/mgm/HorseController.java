package com.gam.mgm;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.service.ITrainerService;


@Controller
public class HorseController {

	private static final Logger logger = LoggerFactory.getLogger(HorseController.class);
	@Autowired
	private ITrainerService trainerService;
	
	
	@RequestMapping(value = "/jokyoInfo.do", method = RequestMethod.GET)
	public String jokyoInfo(Locale locale, Model model,HttpServletRequest request) {
		logger.info("조교사정보", locale);	
		int tr_meet = Integer.parseInt(request.getParameter("tr_meet"));
		System.out.println("tr_meet:"+tr_meet);
		List<TrainerDto> list = trainerService.getAllList(tr_meet);
		model.addAttribute("list", list);	
		model.addAttribute("tr_meet", tr_meet);	
		return "HorseInfo/JokyoInfo";
	}
	
	@RequestMapping(value="/jokyoDetail.do",method=RequestMethod.GET)
	public String ChampionList(Locale locale, HttpServletRequest request,Model model){
		System.out.println(request.getParameter("tr_name"));
		String tr_name=request.getParameter("tr_name");
		TrainerDto trDto = trainerService.getJokyo(tr_name);		
		/*List<ChampionDto> list = trainerService.getChampionList(tr_name);*/
		model.addAttribute("trDto",trDto);
		/*model.addAttribute("champList",list);*/
		return "testpage";
	}
	
	
}
