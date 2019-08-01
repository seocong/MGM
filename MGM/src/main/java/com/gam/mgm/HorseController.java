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
import com.gam.utils.Util;


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
		logger.info("조교사상세정보", locale);	
		System.out.println("tr_name:"+request.getParameter("tr_name"));
		String tr_name=request.getParameter("tr_name");
		TrainerDto trDto = trainerService.getJokyo(tr_name);
		int ord1cntt =trDto.getTr_ord1cntt();
		int rccntt = trDto.getTr_rccntt();
		String totalWin = Util.round(ord1cntt, rccntt);//승률구하기 
		System.out.println("totalWin:"+totalWin);
		int ord2cntt = trDto.getTr_ord2cntt();
		String pass = Util.round(ord1cntt+ord2cntt, rccntt);//복승률 구하기
		System.out.println(pass);
		int ord1cnty =trDto.getTr_ord1cnty();
		int rccnty = trDto.getTr_rccnty();
		String yearWin = Util.round(ord1cnty, rccnty);//1년승률구하기
		System.out.println("yearWin:"+yearWin);
		int ord2cnty = trDto.getTr_ord2cnty();
		String yearPass = Util.round(ord1cnty+ord2cnty, rccnty);//1년복승률 구하기
		System.out.println("yearPass:"+yearPass);
		int tr_meet = trDto.getTr_meet();
		/*List<ChampionDto> list = trainerService.getChampionList(tr_name);*/
		//위탁관리 말필도 리스트 SELECT후 반환 (경주마테이블에서 가져오면 될듯)
		model.addAttribute("trDto",trDto);
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		model.addAttribute("yearWin",yearWin);
		model.addAttribute("yearPass",yearPass);
		model.addAttribute("tr_meet",tr_meet);
		
		/*model.addAttribute("list",list);*/
		return "HorseInfo/JokyoDetail";
	}
	
	
	
}
