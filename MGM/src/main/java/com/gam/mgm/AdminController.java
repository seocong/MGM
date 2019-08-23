package com.gam.mgm;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.service.ITrainerService;
import com.gam.mgm.vo.RaceResultVo;
import com.gam.utils.Util;
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
		List<Integer> testList = new ArrayList<>();
		testList.add(1);
		testList.add(3);
		testList.add(5);
		testList.add(7);
		testList.add(9);
		testList.add(10);
		model.addAttribute("num",12);
		model.addAttribute("testList",testList);
		model.addAttribute("champList",list);
		return "testpage";
	}
}
