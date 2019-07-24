package com.gam.mgm;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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

import com.gam.mgm.dto.RacePlanDto;
import com.gam.mgm.dto.RacePlanitemDto;
import com.gam.mgm.service.IRacePlanService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SEOController {
	
	private static final Logger logger = LoggerFactory.getLogger(SEOController.class);
	@Autowired
	private IRacePlanService racePlanService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws URISyntaxException 
	 */
	@RequestMapping(value = "/apitest.do", method = RequestMethod.GET)
	public void home(Locale locale, Model model)  throws IOException, URISyntaxException {
		logger.info("apitest controller {}.");
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API72/racePlan"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("meet","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*시행경마장구분(1:서울 2:제주 3:부산)*/
        urlBuilder.append("&" + URLEncoder.encode("rc_date","UTF-8") + "=" + URLEncoder.encode("20180826", "UTF-8")); /*경주일(YYYYMMDD형식)*/
        urlBuilder.append("&" + URLEncoder.encode("rc_month","UTF-8") + "=" + URLEncoder.encode("201808", "UTF-8")); /*경주월(YYYYMM)형식*/
        urlBuilder.append("&" + URLEncoder.encode("rc_year","UTF-8") + "=" + URLEncoder.encode("2018", "UTF-8")); /*경주년도(YYYY)형식*/
        URI url = new URI(urlBuilder.toString());
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        RacePlanDto raceplan = restTemplate.getForObject(url,RacePlanDto.class);
        List<RacePlanitemDto> items = raceplan.getBody().getItems();
        System.out.println(items);
        for(RacePlanitemDto item : items) {
        	int i=1;
        	boolean iss = racePlanService.racePlanInput(item);
        	if(iss) {
            	System.out.println("성공성공 "+i);
            }else {
            	System.out.println("실패실패 "+i);
            }
        	i++;
        }	
        
        
        
        
    }
	
}
