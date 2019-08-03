package com.gam.mgm;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
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

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IRaceService;
import com.gam.mgm.vo.RaceResultVo;
import com.gam.mgm.vo.RaceResultVo.ResultHeader;
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
	@Autowired 
	private IJockeyService jockeyService;
	@Autowired
	private IHorsesService horsesService;
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

	/*@RequestMapping(value="/raceResult.do",method=RequestMethod.GET)
	public String raceResult(Model model) throws UnsupportedEncodingException, URISyntaxException {
		logger.info("rsteststart");
		long start = System.currentTimeMillis();
		List<String> hrList = horsesService.hrList();
		System.out.println(hrList);
		for(String list:hrList) {

			StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API8/raceHorseInfo");
			urlBuilder.append("?"+URLEncoder.encode("ServiceKey","UTF-8")+"=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
			urlBuilder.append("&"+URLEncoder.encode("pageNo","UTF-8") +"="+ "1");
			urlBuilder.append("&"+URLEncoder.encode("numOfRows","UTF-8") +"="+ "10");
			urlBuilder.append("&"+URLEncoder.encode("hr_name","UTF-8") +"="+ list);
			URI url = new URI(urlBuilder.toString());
			System.out.println(url);
			RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
			RaceResultVo rcResult = restTemplate.getForObject(url,RaceResultVo.class);
			ResultHeader result = rcResult.getHeader();
			if(result.getResultCode()!=0) {
				System.out.println("result Code: "+result.getResultCode());
				System.out.println("result Message: "+result.getResultMsg());
				System.out.println("{RaceSchedule Info error}");
				model.addAttribute("msg","API 조회에 실패했습니다.");
				model.addAttribute("url","adminPage.do");
				return "Redirect";
			}else {
				RaceResultVo.ResultBody.Items.Item resultList = rcResult.getBody().getItems().getItem();
				resultList.setHr_htName(list);
				Map<String,Object> rsList = new HashMap<String,Object>();
				rsList.put("rslist", resultList);

				boolean isS = horsesService.hrInfoUpdate(rsList);
				if(isS){
					System.out.println("schdule update success");
				}else {
					System.out.println("schedule update fail");
				}
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("완료 시간: "+(end-start));
		model.addAttribute("url","adminPage.do");
		model.addAttribute("msg","출마표 등록 성공");
		return "Redirect";
	}*/

	@RequestMapping(value="/trainerInput",method=RequestMethod.GET)
	public String trainers(Model model) {

		return "Redirect";
	}

	@RequestMapping(value="/jockeyInput.do",method=RequestMethod.GET)
	public void jockey(Model model){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int today = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("date:"+date);
		System.out.println("today:"+today);
		String yyyyMMdd = fmt.format(cal.getTime());
		System.out.println(yyyyMMdd);
		String[] area = new String[2];
		String[] db = new String[2];
		if(today==1) {
			area[0]="seoul";
			area[1]="busan";
			db[0]="sdb2";
			db[1]="pdb2";
		}else if(today==4) {
			area[0]="busan";
			db[0]="pdb2";
		}else if(today==5) {
			area[0]="seoul";
			area[1]="jeju";
			db[0]="sdb2";
			db[1]="cdb2";
		}else if(today==7) {
			area[0]="jeju";
			db[0]="cdb2";
		}
		for(int i=0;i<area.length;i++) {
			System.out.println("area: "+area[i]);
			System.out.println("db: "+db[i]);
		}
		String[] link = new String[3];
		link[0] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/jockey/20190801sdb2.txt";
		link[1] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/jockey/20190731cdb2.txt";
		link[2] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/jockey/20190731pdb2.txt";
		for(int i=0;i<link.length;i++) {
			try {
				URL	url = new URL(link[i]);
				//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/jockey/"+yyyyMMdd+db[i]+".txt");
				System.out.println(url);
				int jk_meet = i+1;
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = jockeyService.jkDel(jk_meet);
				if(isDel) {
					System.out.println("초기화되었습니다");
				}else{
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;					
				while ((line = reader.readLine()) != null) {
					if(line.contains("-")||line.contains("기수명")) {
						System.out.println("나오지마라");							
					}else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();
							System.out.println(splitedStr[j]);
						}
						System.out.println("배열길이:"+splitedStr.length);
						if(i!=1) {
							if(splitedStr.length !=1) {
								System.out.println("서울, 부산 찍고");
								JockeyDto jockeyDto = new JockeyDto();
								jockeyDto.setJk_name(splitedStr[0]);
								jockeyDto.setJk_part(splitedStr[1]);
								jockeyDto.setJk_birthday(splitedStr[2]);
								jockeyDto.setJk_age(Integer.valueOf(splitedStr[3]));
								jockeyDto.setJk_debut(splitedStr[4]);
								jockeyDto.setJk_wgPart(Integer.valueOf(splitedStr[5]));
								jockeyDto.setJk_wgOther(Integer.valueOf(splitedStr[6]));	
								jockeyDto.setJk_rcCntT(Util.toString(splitedStr[7]));
								jockeyDto.setJk_ord1CntT(Integer.valueOf(splitedStr[8]));
								jockeyDto.setJk_ord2CntT(Integer.valueOf(splitedStr[9]));
								jockeyDto.setJk_ord3CntT(Integer.valueOf(splitedStr[10]));
								jockeyDto.setJk_rcCntY(Integer.valueOf(splitedStr[11]));
								jockeyDto.setJk_ord1CntT(Integer.valueOf(splitedStr[12]));
								jockeyDto.setJk_ord2CntY(Integer.valueOf(splitedStr[13]));
								jockeyDto.setJk_ord3CntY(Integer.valueOf(splitedStr[14]));
								jockeyDto.setJk_meet(jk_meet);
								boolean isS = jockeyService.jkInsert(jockeyDto);
								if(isS) {
									System.out.println("입력되었습니다.");
								}else {
									System.out.println("입력실패.");
								}
							}else{
								System.out.println("불러올 정보가 없습니다.");
							}
						}else {
							System.out.println("제주 찍기");
							if(splitedStr.length !=1) {
								JockeyDto jockeyDto = new JockeyDto();
								jockeyDto.setJk_name(splitedStr[0]);
								jockeyDto.setJk_part(splitedStr[1]);
								jockeyDto.setJk_birthday(splitedStr[2]);
								jockeyDto.setJk_age(Integer.valueOf(splitedStr[3]));
								jockeyDto.setJk_debut(splitedStr[4]);
								jockeyDto.setJk_rcCntT(Util.toString(splitedStr[5]));
								jockeyDto.setJk_ord1CntT(Integer.valueOf(splitedStr[6]));
								jockeyDto.setJk_ord2CntT(Integer.valueOf(splitedStr[7]));
								jockeyDto.setJk_ord3CntT(Integer.valueOf(splitedStr[8]));
								jockeyDto.setJk_rcCntY(Integer.valueOf(splitedStr[9]));
								jockeyDto.setJk_ord1CntT(Integer.valueOf(splitedStr[10]));
								jockeyDto.setJk_ord2CntY(Integer.valueOf(splitedStr[11]));
								jockeyDto.setJk_ord3CntY(Integer.valueOf(splitedStr[12]));
								jockeyDto.setJk_meet(jk_meet);
								boolean isS = jockeyService.jkInsert(jockeyDto);
								if(isS) {
									System.out.println("입력되었습니다.");
								}else {
									System.out.println("입력실패.");
								}
							}else{
								System.out.println("불러올 정보가 없습니다.");
							}
						}
					}
				}
				reader.close();
			} catch (FileNotFoundException fnf) {
				fnf.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	/*@RequestMapping(value="/horsesInput.do",method=RequestMethod.GET)
	public void horses(Model model){
		int count=0;
		String[] link = new String[3];
		link[0] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/horse/20190801sdb1.txt";
		link[1] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/horse/20190731cdb1.txt";
		link[2] ="http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/horse/20190731pdb1.txt";
		st:for(int i=0;i<link.length;i++) {
			try {
				URL	url = new URL(link[i]);
				//			URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/horse/"+yyyyMMdd+db[i]+".txt");
				int hr_meet = i+1;
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = horsesService.hrDel(hr_meet);
				if(isDel) {
					System.out.println("초기화되었습니다");
				}else{
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;					
				while ((line = reader.readLine()) != null) {
					if(line.contains("-")||line.contains("마명")) {
						System.out.println("나오지마라");							
					}else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();
							//System.out.println(splitedStr[j]);
						}
						System.out.println("배열길이:"+splitedStr.length);
						//말정보 등록
						StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API8/raceHorseInfo");
						urlBuilder.append("?"+URLEncoder.encode("ServiceKey","UTF-8")+"=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
						urlBuilder.append("&"+URLEncoder.encode("pageNo","UTF-8") +"="+ "1");
						urlBuilder.append("&"+URLEncoder.encode("numOfRows","UTF-8") +"="+ "10");
						urlBuilder.append("&"+URLEncoder.encode("hr_name","UTF-8") +"="+ splitedStr[0]);
						URI url2 = new URI(urlBuilder.toString());
						System.out.println(url2);
						RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
						RaceResultVo rcResult = restTemplate.getForObject(url2,RaceResultVo.class);
						ResultHeader result = rcResult.getHeader();
						if(result.getResultCode()!=0) {
							System.out.println("result Code: "+result.getResultCode());
							System.out.println("result Message: "+result.getResultMsg());
							System.out.println("{RaceSchedule Info error}");
						}else {
							RaceResultVo.ResultBody.Items.Item resultList = rcResult.getBody().getItems().getItem();
							if(resultList!=null) {
								if(splitedStr.length !=1) {
									HorsesDto horsesDto = new HorsesDto();
									horsesDto.setHr_htName(splitedStr[0]);
									horsesDto.setHr_name(splitedStr[1]);
									horsesDto.setHr_sex(splitedStr[2]);
									horsesDto.setHr_birthday(splitedStr[3]);
									horsesDto.setHr_age(Integer.valueOf(splitedStr[4]));
									horsesDto.setHr_rank(splitedStr[5]);
									horsesDto.setHr_part(Integer.valueOf(splitedStr[6]));
									horsesDto.setHr_trName(splitedStr[7]);
									horsesDto.setHr_owName(splitedStr[8]);
									horsesDto.setHr_meet(hr_meet);
									horsesDto.setHr_faHrName(resultList.getHr_faHrName());
									horsesDto.setHr_moHrName(resultList.getHr_moHrName());
									horsesDto.setHr_rcCntT(resultList.getHr_rcCntT());
									horsesDto.setHr_ord1CntT(resultList.getHr_ord1CntT());
									horsesDto.setHr_ord2CntT(resultList.getHr_ord2CntT());
									horsesDto.setHr_ord3CntT(resultList.getHr_ord3CntT());
									horsesDto.setHr_rcCntY(resultList.getHr_rcCntY());
									horsesDto.setHr_ord1CntY(resultList.getHr_ord1CntY());
									horsesDto.setHr_ord2CntY(resultList.getHr_ord2CntY());
									horsesDto.setHr_ord3CntY(resultList.getHr_ord3CntY());
									horsesDto.setHr_chaksunT(resultList.getHr_chaksunT());
									horsesDto.setHr_rating(resultList.getHr_rating());
									horsesDto.setHr_hrLastAmt(resultList.getHr_hrLastAmt());
									boolean isS = horsesService.hrInsert(horsesDto);
									if(isS) {
										System.out.println(splitedStr[0]+" 말 정보가 입력되었습니다.");
										count++;
									}else {
										System.out.println("입력실패.");
									}
								}else {
									System.out.println("불러올 정보가 없습니다.");
								}
							}
						}

					}
				}
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
				i=0;
				continue st;
			} 
		}
	}*/

	@RequestMapping(value="/hrUpdate.do",method=RequestMethod.GET)
	public void hrUpdate() {
		long start = System.currentTimeMillis();
		URI url2=null;
		for(int meet=1;meet<=3;meet++) {
			boolean loop = true;
			int pageNo=1;
			List<String> hrNameList = horsesService.hrList(meet);
			while(loop) {
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API8/raceHorseInfo");
					urlBuilder.append("?"+URLEncoder.encode("ServiceKey","UTF-8")+"=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&"+URLEncoder.encode("pageNo","UTF-8") +"="+ pageNo);
					urlBuilder.append("&"+URLEncoder.encode("numOfRows","UTF-8") +"="+ "999");
					urlBuilder.append("&"+URLEncoder.encode("meet","UTF-8") +"="+ meet);
					url2 = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch(URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url2);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceResultVo rcResult = restTemplate.getForObject(url2,RaceResultVo.class);
				ResultHeader result = rcResult.getHeader();
				if(result.getResultCode()!=0) {
					System.out.println("result Code: "+result.getResultCode());
					System.out.println("result Message: "+result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				}else {
					List<RaceResultVo.ResultBody.Item> resultList = rcResult.getBody().getItems();
					if(resultList.size()!=0) {
						HorsesDto hrDto = new HorsesDto();
						List<HorsesDto> hrList = new ArrayList<>();
						for(RaceResultVo.ResultBody.Item item:resultList) {
							for(Iterator<String> hrIt = hrNameList.iterator() ; hrIt.hasNext() ;) {
								String val = hrIt.next();
								if(val.equals(item.getHr_htName())) {
									System.out.println("이터레이터 들어옴");
									hrDto.setHr_htName(item.getHr_htName());
									hrDto.setHr_owName(item.getHr_owName());
									hrDto.setHr_faHrName(item.getHr_faHrName());
									hrDto.setHr_moHrName(item.getHr_moHrName());
									hrDto.setHr_rcCntT(item.getHr_rcCntT());
									hrDto.setHr_ord1CntT(item.getHr_ord1CntT());
									hrDto.setHr_ord2CntT(item.getHr_ord2CntT());
									hrDto.setHr_ord3CntT(item.getHr_ord3CntT());
									hrDto.setHr_rcCntY(item.getHr_rcCntY());
									hrDto.setHr_ord1CntY(item.getHr_ord1CntY());
									hrDto.setHr_ord2CntY(item.getHr_ord2CntY());
									hrDto.setHr_ord3CntY(item.getHr_ord3CntY());
									hrDto.setHr_chaksunT(item.getHr_chaksunT());
									hrDto.setHr_rating(item.getHr_rating());
									hrDto.setHr_hrLastAmt(item.getHr_hrLastAmt());
									hrList.add(hrDto);
									System.out.println("hrDto찍어보기: "+hrDto);
									horsesService.hrInfoUpdate(hrDto);
									hrIt.remove();
								}
							}
						}
						System.out.println(hrList.size());
						pageNo++;
					}else {
						loop=false;
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: "+((end-start)/1000)+"초");
	}
}
