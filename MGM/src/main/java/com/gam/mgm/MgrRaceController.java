package com.gam.mgm;


import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.gam.mgm.service.IRaceService;
import com.gam.mgm.vo.RaceScheduleVo;
import com.gam.mgm.vo.RaceScheduleVo.Body.Item;
import com.gam.mgm.vo.RaceScheduleVo.Header;
import com.gam.utils.Util;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MgrRaceController {
	private static final Logger logger = LoggerFactory.getLogger(MgrRaceController.class);
	@Autowired
	private IRaceService raceService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws UnsupportedEncodingException 
	 * @throws URISyntaxException 
	 */	
	@RequestMapping(value="/rcSchedule.do", method=RequestMethod.GET)
	public String raceShcedule(Model model) throws UnsupportedEncodingException, URISyntaxException{
		logger.info("rsteststart");
		long start = System.currentTimeMillis();
		List<String> allDate = Util.eightWeeks();		
		for(int i=1;i<=3;i++) {
			for(String date:allDate) {
				StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API72/racePlan");
				urlBuilder.append("?"+URLEncoder.encode("ServiceKey","UTF-8")+"=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
				urlBuilder.append("&"+URLEncoder.encode("pageNo","UTF-8") +"="+ "1");
				urlBuilder.append("&"+URLEncoder.encode("numOfRows","UTF-8") +"="+ "100");
				urlBuilder.append("&"+URLEncoder.encode("meet","UTF-8") +"="+ i);
				urlBuilder.append("&"+URLEncoder.encode("rc_month","UTF-8") +"="+ date);
				URI url = new URI(urlBuilder.toString());
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceScheduleVo rcSchedule = restTemplate.getForObject(url,RaceScheduleVo.class);
				Header result = rcSchedule.getHeader();
				if(result.getResultCode()!=0) {
					System.out.println("result Code: "+result.getResultCode());
					System.out.println("result Message: "+result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
					model.addAttribute("msg","API 조회에 실패했습니다.");
					model.addAttribute("url","adminPage.do");
					return "Redirect";
				}else {
					List<Item> scheduleList = rcSchedule.getBody().getItems();
					Map<String,Object> scheduleMap = new HashMap<String,Object>();
					scheduleMap.put("schedulelist", scheduleList);
					int j=0;
					for(Item list:scheduleList) {
						j++;
						System.out.println(j+"번쨰: "+list.getAgeCond());
					}
					boolean isS = raceService.raceScheduleInput(scheduleMap);
					if(isS){
						System.out.println("schdule update success");
					}else {
						System.out.println("schedule update fail");
						if(raceService.raceSchAllDel()) {
							System.out.println("전체삭제완료");
							model.addAttribute("url","adminPage.do");
							model.addAttribute("msg","에러로 인해 DB초기화 다시 실행해주세요.");
							return "Redirect";
						}else {
							System.out.println("전체삭제 실패");
							model.addAttribute("url","adminPage.do");
							model.addAttribute("msg","DB문제 발생");
							return "Redirect";
						}
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("완료 시간: "+(end-start));
		model.addAttribute("url","adminPage.do");
		model.addAttribute("msg","출마표 등록 성공");
		return "Redirect";
	}
}
