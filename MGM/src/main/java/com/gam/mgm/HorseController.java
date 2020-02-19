package com.gam.mgm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.DistRecordDto;
import com.gam.mgm.dto.HorsePrizeDto;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.MonthlyPrizeDto;
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.RaceEntryDto;
import com.gam.mgm.dto.RaceHistoryDto;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RacePlanDto;
import com.gam.mgm.dto.RaceRefreeDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.dto.RaceTotalPrizeDto;
import com.gam.mgm.dto.RecordInfoDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.paging.PageMaker;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IOwnerService;
import com.gam.mgm.service.IRaceEntryService;
import com.gam.mgm.service.IRacePlanService;
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
	@Autowired
	private IRacePlanService racePlanService;
	@Autowired
	private IRaceEntryService raceEntryService;
	
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
		List<RaceTotalPrizeDto> rtpDto = trainerService.rtPrize(tr_no);
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
		model.addAttribute("rtprize",rtpDto);
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
		List<RaceTotalPrizeDto> rtpDto = jockeyService.rtPrize(jk_no);
		List<RecordInfoDto> riDto = jockeyService.recordInfo(jk_no);
		String jk_name = jkDto.getJk_name(); //수정 요함. null point exeption
//		String meet=null;
		
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
		List<ChampionDto> chamDto = jockeyService.selChampion(jk_name);
		/*List<ChampionDto> list = trainerService.getChampionList(tr_name);*/
		//위탁관리 말필도 리스트 SELECT후 반환 (경주마테이블에서 가져오면 될듯)
		model.addAttribute("jkDto",jkDto);
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		model.addAttribute("yearWin",yearWin);
		model.addAttribute("yearPass",yearPass);
		model.addAttribute("jk_meet",jk_meet);
		model.addAttribute("record",riDto);
		model.addAttribute("rtprize",rtpDto);
		model.addAttribute("champion",chamDto);
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
		String hr_rank="";
		String hr_name ="";
		List<HorsesDto> rankList = null;
		map.put("hr_meet", hr_meet);
		if(request.getParameter("hr_rank")!=null) {
			hr_rank = request.getParameter("hr_rank");
			map.put("hr_rank", hr_rank);
			rankList = horsesService.getRankList(map);
		}else if(request.getParameter("hr_name")!=null) {
			hr_name = request.getParameter("hr_name");
			map.put("hr_name", hr_name);
			rankList = horsesService.getSearchList(map);
		}
		System.out.println("hr_rank:"+hr_rank);
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
		List<RecordInfoDto> recordInfo = horsesService.recordInfo(hrDto.getHr_no()); //경주기록
		System.out.println("recordInfo: "+recordInfo);
		HorsePrizeDto prize = horsesService.getPrize(hrDto.getHr_no()); //월별 수득상금
		List<DistRecordDto> distRecordList = horsesService.distRecord(hrDto.getHr_no());
		List<DistRecordDto> chulNoRecordList = horsesService.chulNoRecord(hrDto.getHr_no());
		List<DistRecordDto> wgBudamRecordList = horsesService.wgBudamRecord(hrDto.getHr_no());
		List<DistRecordDto> jkRecordList = horsesService.jkRecord(hrDto.getHr_no());
		for(DistRecordDto list:distRecordList) {
//			System.out.println(list.getOrd1st()+","+list.getOrd2nd()+","+list.getOrd3nd());
			list.setOdds1(Util.round(list.getOrd1st(),list.getTotalRace()));
			list.setOdds2(Util.round(list.getOrd1st()+list.getOrd2nd(),list.getTotalRace()));
			list.setOdds3(Util.round(list.getOrd1st()+list.getOrd2nd()+list.getOrd3nd(),list.getTotalRace()));
//			System.out.println(list.getOdds1()+","+list.getOdds2()+","+list.getOdds3());
			list.setRecord(Util.time(Double.parseDouble(list.getRecord())));
			list.setAvgRecord(Util.time(Double.parseDouble(list.getAvgRecord())));
		}
		model.addAttribute("hr_meet", hr_meet);	
		model.addAttribute("hrDto", hrDto);	
		model.addAttribute("totalWin",totalWin);
		model.addAttribute("pass",pass);
		model.addAttribute("recordInfo",recordInfo);
		model.addAttribute("prize",prize);
		model.addAttribute("distRecord",distRecordList);
		model.addAttribute("chulNoRecord",chulNoRecordList);
		model.addAttribute("jkNoRecord",jkRecordList);
		model.addAttribute("wgBudamNoRecord",wgBudamRecordList);
		return "HorseInfo/HorseDetail";
	}
	
//	//마명 검색
//	@RequestMapping(value="/horseSearch.do",method=RequestMethod.GET)
//	public String horseSearch(Locale locale, HttpServletRequest request,Model model){
//		logger.info("마명 검색", locale);
//		int ow_meet = Integer.parseInt(request.getParameter("ow_meet"));
//		List<OwnerDto> owDto = ownerService.getAllList(ow_meet);
//		System.out.println("owDto:"+owDto);
//		model.addAttribute("owDto", owDto);
//		model.addAttribute("ow_meet", ow_meet);
//		return "HorseInfo/OwnerInfo";
//	}
	
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
		int ow_no = Integer.parseInt(request.getParameter("ow_no"));//수정요함.number format exeption
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ow_meet", ow_meet);
		map.put("ow_no", ow_no);
		OwnerDto owDto = ownerService.getOwner(map);
		String ow_name=owDto.getOw_name();
		map.put("ow_name",ow_name);
		List<HorsesDto> hrDto = horsesService.getOwnerList(map);
		List<MonthlyPrizeDto> mothylPrizeList = new ArrayList<MonthlyPrizeDto>();
		for(HorsesDto loop:hrDto) {
			System.out.println("말번호: "+loop.getHr_no());
			MonthlyPrizeDto monthlyPrize = ownerService.monthlyPrize(loop.getHr_no());
			System.out.println(monthlyPrize);
			monthlyPrize.setHrNo(loop.getHr_no());
			monthlyPrize.setHrName(loop.getHr_htName());
			mothylPrizeList.add(monthlyPrize);
		}
		List<RecordInfoDto> recordInfo = ownerService.recordInfo(request.getParameter("ow_no"));
		model.addAttribute("owDto", owDto);
		model.addAttribute("ow_meet", ow_meet);
		model.addAttribute("hrDto", hrDto);
		model.addAttribute("monthlyPrize",mothylPrizeList);
		model.addAttribute("recordInfo",recordInfo);
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
	public String recordDetail(Locale locale, HttpServletRequest request,Model model) throws ParseException{
		logger.info("경주상세성적표", locale);
		SimpleDateFormat fmt= new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy.MM.dd");
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
		for(int i=0;i<rrList.size();i++) {
			rrList.get(i).setRr_rcTime(Util.time(Double.parseDouble(rrList.get(i).getRr_rcTime())));
		}
		List<RaceRefreeDto> refreeList = raceService.selRefree(map);
		for(RaceRefreeDto refree:refreeList) {
			if(refree.getRf_stDate().equals("-")) {
				refree.setRf_stDate(null);
				refree.setRf_spDate(null);
			}else {
				refree.setRf_stDate(fmt2.format(fmt.parse(refree.getRf_stDate())));
				refree.setRf_spDate(fmt2.format(fmt.parse(refree.getRf_spDate())));
			}
		}
		model.addAttribute("riDto", riDto);
		model.addAttribute("rrList", rrList);
		model.addAttribute("ri_meet", ri_meet);
		model.addAttribute("list", list);
		model.addAttribute("refreeList",refreeList);
		return "HorseInfo/RecordDetail";
	}

	@RequestMapping(value="/racingInfo.do",method=RequestMethod.GET)
	public String raceInfo(Locale locale, HttpServletRequest request,Model model){
		logger.info("출전표리스트", locale);
		int rp_meet = Integer.parseInt(request.getParameter("rp_meet"));
		List<RacePlanDto> list = racePlanService.getList(rp_meet);
		model.addAttribute("list", list);
		model.addAttribute("rp_meet", rp_meet);
		return "HorseInfo/RacingInfo";		
	}
	
	@RequestMapping(value="/racingDetail.do",method=RequestMethod.GET)
	public String raceDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("출전상세정보", locale);
		int rp_meet = Integer.parseInt(request.getParameter("rp_meet"));
		int rp_rcNo = Integer.parseInt(request.getParameter("rp_rcNo"));
		int rp_rcDate = Integer.parseInt(request.getParameter("rp_rcDate"));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rp_meet", rp_meet);
		map.put("rp_rcDate", rp_rcDate);
		map.put("rp_rcNo",rp_rcNo);
		List<RacePlanDto> roundlist = racePlanService.roundlist(map);
		RacePlanDto rpDto = racePlanService.getDetail(map);
		List<RacePlanDto> list = racePlanService.getDetailList(map);
		for(RacePlanDto rounds:list) {
			rounds.getHr_rcCntT();
			rounds.getHr_ord1CntT();
			rounds.getHr_ord2CntT();
			rounds.getHr_ord3CntT();
			rounds.getHr_rcCntY();
			rounds.getHr_ord1CntY();
			rounds.getHr_ord2CntY();
			rounds.getHr_ord3CntY();
			rounds.setTotalWinT(Util.round(rounds.getHr_ord1CntT(), rounds.getHr_rcCntT()));
			rounds.setWin1T(Util.round(rounds.getHr_ord1CntT()+rounds.getHr_ord2CntT(),rounds.getHr_rcCntT()));
			rounds.setWin2T(Util.round(rounds.getHr_ord1CntT()+rounds.getHr_ord2CntT()+rounds.getHr_ord3CntT(),rounds.getHr_rcCntT()));
			rounds.setTotalWinY(Util.round(rounds.getHr_ord1CntY(), rounds.getHr_rcCntY()));
			rounds.setWin1Y(Util.round(rounds.getHr_ord1CntY()+rounds.getHr_ord2CntY(),rounds.getHr_rcCntY()));
			rounds.setWin2Y(Util.round(rounds.getHr_ord1CntY()+rounds.getHr_ord2CntY()+rounds.getHr_ord3CntY(),rounds.getHr_rcCntY()));
		}
		//마주명, 기수명 등 넘어오는 데이터 확인 for문
//		for(RacePlanDto list2:list) {
//			System.out.println(list2);
//		}
		model.addAttribute("roundlist", roundlist);
		model.addAttribute("list", list);
		model.addAttribute("rp_meet", rp_meet);
		model.addAttribute("rpDto", rpDto);
		return "HorseInfo/RacingDetail";		
	}
	
	@RequestMapping(value="/racingHistory.do",method=RequestMethod.GET)
	public String raceHistory(Locale locale, HttpServletRequest request,Model model){
		logger.info("출전내역", locale);
		Map<String,Object> map = new HashMap<String,Object>();
		int meet = Integer.parseInt(request.getParameter("meet"));
		List<RacePlanDto> dateList = racePlanService.selRcDate(meet);
		String rcDate = null;
		if(request.getParameter("rcDate") == null) {
			rcDate = racePlanService.minDate(meet);
		}else {
			rcDate = request.getParameter("rcDate");
		}
		map.put("rcMeet",meet);
		map.put("rcDate",rcDate);
		map.put("object",request.getParameter("object"));
		int maxNo = racePlanService.maxRcNo(map);
		List<List<RaceHistoryDto>> planListList = new ArrayList<List<RaceHistoryDto>>();
		List<RaceHistoryDto> objCount = racePlanService.racePlanCount(map);

		List<RaceHistoryDto> planList = racePlanService.planList(map);
		for(RaceHistoryDto jk:objCount) {
			List<Integer> chkNo	= new ArrayList<Integer>();
			for(int i=1;i<=maxNo;i++) {
				chkNo.add(i);
			}
			for(int i=1;i<=maxNo;i++) {
				for(int j=0;j<planList.size();j++) {
					if(jk.getObjName().equals(planList.get(j).getObjName()) && i==planList.get(j).getRcNo()) {
						for(int k=0;k<chkNo.size();k++) {
							if(chkNo.get(k) == planList.get(j).getRcNo()) {
								chkNo.remove(k);
							}
						}
					}
				}
			}
			for(int loop:chkNo) {
				RaceHistoryDto addDto = new RaceHistoryDto();
				addDto.setRcNo(loop);
				addDto.setObjName(jk.getObjName());
				addDto.setChulNo("0");
				planList.add(addDto);
			}
		}
		//리스트 확인 
		for(RaceHistoryDto jk:objCount) {
			System.out.println("기수명: "+jk.getObjName()+"[");
			for(int i=0;i<planList.size();i++){
				if(jk.getObjName().equals(planList.get(i).getObjName())) {
					System.out.println("raceNo: "+planList.get(i).getRcNo()+"/"+"chulNo: "+planList.get(i).getChulNo());
				}
			}
			System.out.println("]");
		}
		
		System.out.println("listsize: "+planList.size());
		model.addAttribute("maxNo",maxNo);
		model.addAttribute("objCount",objCount);
		model.addAttribute("planList",planList);
		model.addAttribute("dateList",dateList);
		model.addAttribute("selDate",request.getParameter("rcDate"));
		model.addAttribute("object",request.getParameter("object"));
		model.addAttribute("planListList",planListList);
		return "HorseInfo/RacingHistory";		
	}
	
	@RequestMapping(value="/raceoperView.do",method=RequestMethod.GET)
	public String raceoperView(Locale locale, HttpServletRequest request,Model model){
		logger.info("경마시행개요", locale);
		return "HorseInfo/RaceoperView";		
	}
	
	@RequestMapping(value="/racingEntryInfo.do",method=RequestMethod.GET)
	public String racingEntry(Locale locale, HttpServletRequest request,Model model){
		logger.info("출전등록현황", locale);
		int re_meet = Integer.parseInt(request.getParameter("re_meet"));
		PageMaker pagemaker = new PageMaker();
		String pagenum = request.getParameter("pagenum");
		String contentnum = request.getParameter("contentnum");
		int cpagenum = Integer.parseInt(pagenum);
		int ccontentnum = Integer.parseInt(contentnum);
		pagemaker.setTotalcount(raceEntryService.getAllCnt(re_meet));
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
		map.put("re_meet",re_meet);
		List<RaceEntryDto> list = raceEntryService.getList(map);
		model.addAttribute("list", list);
		model.addAttribute("re_meet", re_meet);
		model.addAttribute("page", pagemaker);
		return "HorseInfo/RacingEntryInfo";		
	}
	@RequestMapping(value="/racingEntryDetail.do",method=RequestMethod.GET)
	public String racingEntryDetail(Locale locale, HttpServletRequest request,Model model){
		logger.info("출전등록현황 상세보기", locale);
		int re_meet = Integer.parseInt(request.getParameter("re_meet"));
		int re_pgDate = Integer.parseInt(request.getParameter("re_pgDate"));
		int re_pgNo = Integer.parseInt(request.getParameter("re_pgNo"));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("re_meet", re_meet);
		map.put("re_pgDate", re_pgDate);
		map.put("re_pgNo",re_pgNo);
		RaceEntryDto reDto = raceEntryService.getDetail(map);
		List<RaceEntryDto> list = raceEntryService.getDetailList(map);
		model.addAttribute("list", list);
		model.addAttribute("re_meet", re_meet);
		model.addAttribute("reDto", reDto);
		return "HorseInfo/RacingEntryDetail";		
	}
}
