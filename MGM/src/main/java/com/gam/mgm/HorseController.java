package com.gam.mgm;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.dto.RecordInfoDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.paging.PageMaker;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IOwnerService;
import com.gam.mgm.service.IRaceService;
import com.gam.mgm.service.ITrainerService;
import com.gam.utils.Util;


@Controller
public class HorseController {

	private static final Logger logger = LoggerFactory.getLogger(HorseController.class);
	@Autowired
	private ITrainerService trainerService;
	@Autowired
	private IJockeyService jockeyService;
	@Autowired
	private IHorsesService horsesService;
	@Autowired
	private IOwnerService ownerService;
	@Autowired
	private IRaceService raceService;
	
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
	public String jokyoDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("조교사상세정보", locale);	
		String tr_no = request.getParameter("tr_no");
		TrainerDto trDto = trainerService.getJokyo(tr_no);
		System.out.println("기수명: "+trDto.getTr_name());
		List<RecordInfoDto> riDto = trainerService.recordInfo(tr_no);
		System.out.println("ridto 확인: "+riDto.size());
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
		int hr_part = trDto.getTr_part();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hr_part", hr_part);
		map.put("hr_meet", tr_meet);
		List<HorsesDto> horseList = horsesService.partList(map);
		model.addAttribute("trDto",trDto);
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		model.addAttribute("yearWin",yearWin);
		model.addAttribute("yearPass",yearPass);
		model.addAttribute("tr_meet",tr_meet);
		model.addAttribute("horseList",horseList);	
		model.addAttribute("record",riDto);
		/*model.addAttribute("list",list);*/
		return "HorseInfo/JokyoDetail";
	}
	
	@RequestMapping(value="/jockeyInfo.do",method=RequestMethod.GET)
	public String jockeyInfo(Locale locale, HttpServletRequest request,Model model){
		logger.info("기수정보", locale);
		int jk_meet = Integer.parseInt(request.getParameter("jk_meet"));
		List<JockeyDto> list = jockeyService.getAllList(jk_meet);
		model.addAttribute("list", list);	
		model.addAttribute("jk_meet", jk_meet);	
		return "HorseInfo/JockeyInfo";
	}
	
	@RequestMapping(value="/jockeyDetail.do",method=RequestMethod.GET)
	public String jockeyDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("기수상세정보", locale);	
		String jk_no = request.getParameter("jk_no");
		System.out.println("jk_no: "+jk_no);
		JockeyDto jkDto = jockeyService.getKisu(jk_no);
		int ord1cntt =jkDto.getJk_ord1CntT();
		int rccntt = jkDto.getJk_rcCntT();
		String totalWin = Util.round(ord1cntt, rccntt);//승률구하기 
		System.out.println("totalWin:"+totalWin);
		int ord2cntt = jkDto.getJk_ord2CntT();
		String pass = Util.round(ord1cntt+ord2cntt, rccntt);//복승률 구하기
		System.out.println(pass);
		int ord1cnty =jkDto.getJk_ord1CntY();
		int rccnty = jkDto.getJk_rcCntY();
		String yearWin = Util.round(ord1cnty, rccnty);//1년승률구하기
		System.out.println("yearWin:"+yearWin);
		int ord2cnty = jkDto.getJk_ord2CntY();
		String yearPass = Util.round(ord1cnty+ord2cnty, rccnty);//1년복승률 구하기
		System.out.println("yearPass:"+yearPass);
		int jk_meet = jkDto.getJk_meet();
		/*List<ChampionDto> list = trainerService.getChampionList(tr_name);*/
		//위탁관리 말필도 리스트 SELECT후 반환 (경주마테이블에서 가져오면 될듯)
		model.addAttribute("jkDto",jkDto);
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		model.addAttribute("yearWin",yearWin);
		model.addAttribute("yearPass",yearPass);
		model.addAttribute("jk_meet",jk_meet);
		/*model.addAttribute("list",list);*/
		return "HorseInfo/JockeyDetail";
	}
	
	@RequestMapping(value="/horseInfo.do",method=RequestMethod.GET)
	public String horseInfo(Locale locale, HttpServletRequest request,Model model){
		logger.info("경주마정보", locale);
		int hr_meet = Integer.parseInt(request.getParameter("hr_meet"));
		if(hr_meet==2) {
			HrCountDto hrCnt = horsesService.getJeju();
			int totalHan= hrCnt.getForeign1()+hrCnt.getForeign2()+hrCnt.getForeign3()+hrCnt.getForeign4();
			int totalJe = hrCnt.getDomestic1()+hrCnt.getDomestic2()+hrCnt.getDomestic3()+hrCnt.getDomestic4()+hrCnt.getDomestic5()+hrCnt.getDomestic6()+hrCnt.getYetDomestic();
			int total = totalHan+totalJe;
			model.addAttribute("totalHan", totalHan);
			model.addAttribute("totalJe", totalJe);
			model.addAttribute("total", total);
			model.addAttribute("hrCnt", hrCnt);
		}else {
			HrCountDto hrCnt = horsesService.getCnt(hr_meet);
			int totalForeign = hrCnt.getForeign1()+hrCnt.getForeign2()+hrCnt.getForeign3()+hrCnt.getForeign4()+hrCnt.getYetForeign();
			int totalDomestick = hrCnt.getDomestic1()+hrCnt.getDomestic2()+hrCnt.getDomestic3()+hrCnt.getDomestic4()+hrCnt.getDomestic5()+hrCnt.getDomestic6()+hrCnt.getYetDomestic();
			int total = totalForeign+totalDomestick;
			model.addAttribute("totalForeign", totalForeign); 
			model.addAttribute("totalDomestick", totalDomestick); 
			model.addAttribute("total", total); 
			model.addAttribute("hrCnt", hrCnt); 
		}		
		model.addAttribute("hr_meet", hr_meet);
		return "HorseInfo/HorseInfo";
	}
	@RequestMapping(value="/horseInfoList.do",method=RequestMethod.GET)
	public String horseInfoList(Locale locale, HttpServletRequest request,Model model){
		logger.info("경주마리스트", locale);
		int hr_meet = Integer.parseInt(request.getParameter("hr_meet"));
		String hr_rank = request.getParameter("hr_rank");
		System.out.println("hr_rank:"+hr_rank);
		if(hr_meet==2) {
			HrCountDto hrCnt = horsesService.getJeju();
			int totalHan= hrCnt.getForeign1()+hrCnt.getForeign2()+hrCnt.getForeign3()+hrCnt.getForeign4();
			int totalJe = hrCnt.getDomestic1()+hrCnt.getDomestic2()+hrCnt.getDomestic3()+hrCnt.getDomestic4()+hrCnt.getDomestic5()+hrCnt.getDomestic6()+hrCnt.getYetDomestic();
			int total = totalHan+totalJe;
			model.addAttribute("totalHan", totalHan);
			model.addAttribute("totalJe", totalJe);
			model.addAttribute("total", total);
			model.addAttribute("hrCnt", hrCnt);
		}else {
			HrCountDto hrCnt = horsesService.getCnt(hr_meet);
			int totalForeign = hrCnt.getForeign1()+hrCnt.getForeign2()+hrCnt.getForeign3()+hrCnt.getForeign4()+hrCnt.getYetForeign();
			int totalDomestick = hrCnt.getDomestic1()+hrCnt.getDomestic2()+hrCnt.getDomestic3()+hrCnt.getDomestic4()+hrCnt.getDomestic5()+hrCnt.getDomestic6()+hrCnt.getYetDomestic();
			int total = totalForeign+totalDomestick;
			model.addAttribute("totalForeign", totalForeign); 
			model.addAttribute("totalDomestick", totalDomestick); 
			model.addAttribute("total", total); 
			model.addAttribute("hrCnt", hrCnt); 
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hr_rank", hr_rank);
		map.put("hr_meet", hr_meet);
		List<HorsesDto> rankList = horsesService.getRankList(map);
		System.out.println("rankList:"+rankList);
		model.addAttribute("hr_meet", hr_meet);	
		model.addAttribute("rankList", rankList);	
		return "HorseInfo/HorseInfoList";
	}
	
	@RequestMapping(value="/horseDetail.do",method=RequestMethod.GET)
	public String horseDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("경주마상세보기", locale);
		int hr_meet = Integer.parseInt(request.getParameter("hr_meet"));
		String hr_htName = request.getParameter("hr_htName");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hr_htName", hr_htName);
		map.put("hr_meet", hr_meet);
		HorsesDto hrDto = horsesService.getHorseDetail(map);
		int ord1cntt =hrDto.getHr_ord1CntT();
		int rccntt = hrDto.getHr_rcCntT();
		String totalWin = Util.round(ord1cntt, rccntt);//승률구하기 
		System.out.println("totalWin:"+totalWin);
		int ord2cntt = hrDto.getHr_ord2CntT();
		String pass = Util.round(ord1cntt+ord2cntt, rccntt);//복승률 구하기
		model.addAttribute("hr_meet", hr_meet);	
		model.addAttribute("hrDto", hrDto);	
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		return "HorseInfo/HorseDetail";
	}
	
	
	@RequestMapping(value="/ownerInfo.do",method=RequestMethod.GET)
	public String ownerInfo(Locale locale, HttpServletRequest request,Model model){
		logger.info("마주리스트", locale);
		int ow_meet = Integer.parseInt(request.getParameter("ow_meet"));
		List<OwnerDto> owDto = ownerService.getAllList(ow_meet);
		System.out.println("owDto:"+owDto);
		model.addAttribute("owDto", owDto);
		model.addAttribute("ow_meet", ow_meet);
		return "HorseInfo/OwnerInfo";
	}
	
	@RequestMapping(value="/ownerDetail.do",method=RequestMethod.GET)
	public String ownerDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("마주상세보기", locale);
		int ow_meet = Integer.parseInt(request.getParameter("ow_meet"));
		String ow_name = request.getParameter("ow_name");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ow_meet", ow_meet);
		map.put("ow_name", ow_name);
		OwnerDto owDto = ownerService.getOwner(map);
		List<HorsesDto> hrDto = horsesService.getOwnerList(map);
		model.addAttribute("owDto", owDto);
		model.addAttribute("ow_meet", ow_meet);
		model.addAttribute("hrDto", hrDto);
		//대상경주,최근경주성적 
		return "HorseInfo/OwnerDetail";
		
		}
	
	@RequestMapping(value="/recordInfo.do",method=RequestMethod.GET)
	public String recordInfo(Locale locale, HttpServletRequest request,Model model){
		logger.info("경주성적표", locale);
		int ri_meet = Integer.parseInt(request.getParameter("ri_meet"));
		PageMaker pagemaker = new PageMaker();
		String pagenum = request.getParameter("pagenum");
		String contentnum = request.getParameter("contentnum");
		int cpagenum = Integer.parseInt(pagenum);
		int ccontentnum = Integer.parseInt(contentnum);
		pagemaker.setTotalcount(raceService.getAllCnt(ri_meet));
		pagemaker.setPagenum(cpagenum-1);	
		pagemaker.setContentnum(ccontentnum);
		pagemaker.setCurrentblock(cpagenum);
		pagemaker.setLastblock(pagemaker.getTotalcount());			
		pagemaker.prevnext(cpagenum); 
		pagemaker.setStartPage(pagemaker.getCurrentblock());
		pagemaker.setEndPage(pagemaker.getLastblock(), pagemaker.getCurrentblock());
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pagenum", pagemaker.getPagenum()*10);
		map.put("contentnum", pagemaker.getContentnum());
		map.put("ri_meet",ri_meet);
		List<RaceInfoDto> riDto = raceService.getCntList(map);
		System.out.println("riDto:"+riDto);
		model.addAttribute("riDto", riDto);
		model.addAttribute("ri_meet", ri_meet);
		model.addAttribute("page", pagemaker);
		return "HorseInfo/RecordInfo";
	}	
	
	@RequestMapping(value="/recordDetail.do",method=RequestMethod.GET)
	public String recordDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("경주상세성적표", locale);
		SimpleDateFormat fmt= new SimpleDateFormat("yyyyMMdd");
		int ri_meet = Integer.parseInt(request.getParameter("ri_meet"));
		int ri_rcDate = Integer.parseInt(request.getParameter("ri_rcDate"));
		System.out.println(ri_rcDate);
		int ri_rcNo = Integer.parseInt(request.getParameter("ri_rcNo"));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ri_meet", ri_meet);
		map.put("ri_rcDate", ri_rcDate);
		map.put("ri_rcNo",ri_rcNo);
		List<RaceInfoDto> list = raceService.getRacePaging(map);
		System.out.println("list:"+list);
		RaceInfoDto riDto = raceService.getRiDetail(map);
		List<RaceResultDto> rrList = raceService.getRrDetail(map);
		
		model.addAttribute("riDto", riDto);
		model.addAttribute("rrList", rrList);
		model.addAttribute("ri_meet", ri_meet);
		model.addAttribute("list", list);
		return "HorseInfo/RecordDetail";
	}
		
}
