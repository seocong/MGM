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
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IOwnerService;
import com.gam.mgm.service.IRaceService;
import com.gam.mgm.service.ITrainerService;
import com.gam.mgm.vo.HorsesVo;
import com.gam.mgm.vo.HrAddInfoVo;
import com.gam.mgm.vo.JockeyVo;
import com.gam.mgm.vo.OwnerVo;
import com.gam.mgm.vo.RaceInfoVo;
import com.gam.mgm.vo.RaceResultVo;
import com.gam.mgm.vo.RaceScheduleVo;
import com.gam.mgm.vo.RaceScheduleVo.Body.Item;
import com.gam.mgm.vo.RaceScheduleVo.Header;
import com.gam.mgm.vo.RaceSectionRecordVo;
import com.gam.mgm.vo.RaceSummaryResultVo;
import com.gam.mgm.vo.TrainerVo;
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
	@Autowired
	private IOwnerService owService;
	@Autowired
	private ITrainerService trainerService;

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws URISyntaxException
	 */
	@RequestMapping(value = "/rcSchedule.do", method = RequestMethod.GET)
	public String raceShcedule(Model model) throws UnsupportedEncodingException, URISyntaxException {
		logger.info("rsteststart");
		long start = System.currentTimeMillis();
		List<String> allDate = Util.eightWeeks();
		for (int i = 1; i <= 3; i++) {
			for (String date : allDate) {
				StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API72/racePlan");
				urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
				urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + "1");
				urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "100");
				urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + i);
				urlBuilder.append("&" + URLEncoder.encode("rc_month", "UTF-8") + "=" + date);
				URI url = new URI(urlBuilder.toString());
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceScheduleVo rcSchedule = restTemplate.getForObject(url, RaceScheduleVo.class);
				Header result = rcSchedule.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
					model.addAttribute("msg", "API 조회에 실패했습니다.");
					model.addAttribute("url", "adminPage.do");
					return "Redirect";
				} else {
					List<Item> scheduleList = rcSchedule.getBody().getItems();
					Map<String, Object> scheduleMap = new HashMap<String, Object>();
					scheduleMap.put("schedulelist", scheduleList);
					int j = 0;
					for (Item list : scheduleList) {
						j++;
						System.out.println(j + "번쨰: " + list.getAgeCond());
					}
					boolean isS = raceService.raceScheduleInput(scheduleMap);
					if (isS) {
						System.out.println("schdule update success");
					} else {
						System.out.println("schedule update fail");
						if (raceService.raceSchAllDel()) {
							System.out.println("전체삭제완료");
							model.addAttribute("url", "adminPage.do");
							model.addAttribute("msg", "에러로 인해 DB초기화 다시 실행해주세요.");
							return "Redirect";
						} else {
							System.out.println("전체삭제 실패");
							model.addAttribute("url", "adminPage.do");
							model.addAttribute("msg", "DB문제 발생");
							return "Redirect";
						}
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("완료 시간: " + (end - start));
		model.addAttribute("url", "adminPage.do");
		model.addAttribute("msg", "출마표 등록 성공");
		return "Redirect";
	}

	// 조교사 등록
	@RequestMapping(value = "/trainerInput.do", method = RequestMethod.GET)
	public String trainers(Model model) throws UnsupportedEncodingException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int today = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("year:" + year);
		System.out.println("month:" + month);
		System.out.println("date:" + date);
		System.out.println("today:" + today);
		String yyyyMMdd = fmt.format(cal.getTime());
		System.out.println(yyyyMMdd);
		String[] area = new String[2];
		String[] db = new String[2];
		if (today == 1) {
			area[0] = "seoul";
			area[1] = "busan";
			db[0] = "sdb3";
			db[1] = "pdb3";
		} else if (today == 4) {
			area[0] = "busan";
			db[0] = "pdb3";
		} else if (today == 5) {
			area[0] = "seoul";
			area[1] = "jeju";
			db[0] = "sdb3";
			db[1] = "cdb3";
		} else if (today == 7) {
			area[0] = "jeju";
			db[0] = "cdb3";
		}

		String[] link = new String[3];
		link[0] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/trainer/20190801sdb3.txt";
		link[1] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/trainer/20190731cdb3.txt";
		link[2] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/trainer/20190731pdb3.txt";
		for (int i = 0; i < link.length; i++) {
			try {
				URL url = new URL(link[i]);
				// URL url = new
				// URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/trainer/"+yyyyMMdd+db[i]+".txt");
				int tr_meet = i + 1; // 나중에 수정
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = trainerService.trDel(tr_meet);
				if (isDel) {
					System.out.println("초기화되었습니다");
				} else {
					System.out.println("초기화실패하였습니다");
				}
				// api

				StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API19/trainerInfo");
				urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
				urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + 1);
				urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
				urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + tr_meet);
				URI url2 = new URI(urlBuilder.toString());

				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				TrainerVo rcResult = restTemplate.getForObject(url2, TrainerVo.class);
				TrainerVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<TrainerVo.Body.Item> resultList = rcResult.getBody().getItems();
					String line = null;
					splitedStr = null;
					while ((line = reader.readLine()) != null) {
						if (line.contains("-") || line.contains("조교사명")) {
							System.out.println("나오지마라");
						} else {
							splitedStr = null;
							splitedStr = line.split("\\s+");

							for (int j = 0; j < splitedStr.length; j++) {
								splitedStr[j] = splitedStr[j].trim();
							}
							if (splitedStr.length != 1) {
								if (resultList.size() != 0) {
									for (Iterator<TrainerVo.Body.Item> trIt = resultList.iterator(); trIt.hasNext();) {
										TrainerVo.Body.Item val = trIt.next();
										System.out.println(val.getTrName() + ", " + val.getTrNo());
										if (val.getTrName().equals(splitedStr[0])) {
											TrainerDto trainerDto = new TrainerDto();
											trainerDto.setTr_name(splitedStr[0]);
											trainerDto.setTr_no(val.getTrNo());
											trainerDto.setTr_part(Integer.valueOf(splitedStr[1]));
											trainerDto.setTr_birth(splitedStr[2]);
											trainerDto.setTr_age(Integer.valueOf(splitedStr[3]));
											trainerDto.setTr_stdate(splitedStr[4]);
											trainerDto.setTr_rccntt(Integer.valueOf(splitedStr[5]));
											trainerDto.setTr_ord1cntt(Integer.valueOf(splitedStr[6]));
											trainerDto.setTr_ord2cntt(Integer.valueOf(splitedStr[7]));
											trainerDto.setTr_ord3cntt(Integer.valueOf(splitedStr[8]));
											trainerDto.setTr_rccnty(Integer.valueOf(splitedStr[9]));
											trainerDto.setTr_ord1cnty(Integer.valueOf(splitedStr[10]));
											trainerDto.setTr_ord2cnty(Integer.valueOf(splitedStr[11]));
											trainerDto.setTr_ord3cnty(Integer.valueOf(splitedStr[12]));
											trainerDto.setTr_meet(tr_meet);
											boolean isS = trainerService.trInsert(trainerDto);
											if (isS) {
												System.out.println("입력되었습니다.");
											} else {
												System.out.println("입력실패.");
											}
											trIt.remove();
										}
									}
								} else {
									System.out.println("api에 불려온 정보가 없습니다.");
								}
							} else {
								System.out.println("불러올 정보가 없습니다.");
							}
						}

					}
					reader.close();
				}
			} catch (FileNotFoundException fnf) {
				fnf.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException uriE) {
				uriE.printStackTrace();
			}
		}
		model.addAttribute("msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	// 기수 등록
	@RequestMapping(value = "/jockeyInput.do", method = RequestMethod.GET)
	public String jockey(Model model) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int today = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("year:" + year);
		System.out.println("month:" + month);
		System.out.println("date:" + date);
		System.out.println("today:" + today);
		String yyyyMMdd = fmt.format(cal.getTime());
		System.out.println(yyyyMMdd);
		String[] area = new String[2];
		String[] db = new String[2];
		if (today == 1) {
			area[0] = "seoul";
			area[1] = "busan";
			db[0] = "sdb2";
			db[1] = "pdb2";
		} else if (today == 4) {
			area[0] = "busan";
			db[0] = "pdb2";
		} else if (today == 5) {
			area[0] = "seoul";
			area[1] = "jeju";
			db[0] = "sdb2";
			db[1] = "cdb2";
		} else if (today == 7) {
			area[0] = "jeju";
			db[0] = "cdb2";
		}
		for (int i = 0; i < area.length; i++) {
			System.out.println("area: " + area[i]);
			System.out.println("db: " + db[i]);
		}
		String[] link = new String[3];
		link[0] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/jockey/20190801sdb2.txt";
		link[1] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/jockey/20190731cdb2.txt";
		link[2] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/jockey/20190731pdb2.txt";
		for (int i = 0; i < link.length; i++) {
			try {
				URL url = new URL(link[i]);
				// URL url = new
				// URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/trainer/"+yyyyMMdd+db[i]+".txt");
				int jk_meet = i + 1; // 나중에 수정
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = trainerService.trDel(jk_meet);
				if (isDel) {
					System.out.println("초기화되었습니다");
				} else {
					System.out.println("초기화실패하였습니다");
				}
				// api

				StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API12/jockeyInfo");
				urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
				urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + 1);
				urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
				urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + jk_meet);
				URI url2 = new URI(urlBuilder.toString());

				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				JockeyVo rcResult = restTemplate.getForObject(url2, JockeyVo.class);
				JockeyVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<JockeyVo.Body.Item> resultList = rcResult.getBody().getItems();
					String line = null;
					splitedStr = null;
					while ((line = reader.readLine()) != null) {
						if (line.contains("-") || line.contains("조교사명")) {
							System.out.println("나오지마라");
						} else {
							splitedStr = null;
							splitedStr = line.split("\\s+");

							for (int j = 0; j < splitedStr.length; j++) {
								splitedStr[j] = splitedStr[j].trim();
							}
							if (splitedStr.length != 1) {
								if (resultList.size() != 0) {
									for (Iterator<JockeyVo.Body.Item> trIt = resultList.iterator(); trIt.hasNext();) {
										JockeyVo.Body.Item val = trIt.next();
										if (val.getJkName().equals(splitedStr[0])) {
											JockeyDto jockeyDto = new JockeyDto();
											if (i != 1) {
												jockeyDto.setJk_name(splitedStr[0]);
												jockeyDto.setJk_no(val.getJkNo());
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
											} else {
												jockeyDto.setJk_name(splitedStr[0]);
												jockeyDto.setJk_no(val.getJkNo());
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
											}
											boolean isS = jockeyService.jkInsert(jockeyDto);
											trIt.remove();
										}
									}
								} else {
									System.out.println("api에 불려온 정보가 없습니다.");
								}
							} else {
								System.out.println("불러올 정보가 없습니다.");
							}
						}

					}
					reader.close();
				}
			} catch (FileNotFoundException fnf) {
				fnf.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException uriE) {
				uriE.printStackTrace();
			}
		}
		model.addAttribute("msg", "메소드종료");
		return "forward:adminPage.do";
	}

	// 말등록
	@RequestMapping(value = "/hrUpdate.do", method = RequestMethod.GET)
	public String hrUpdate(Model model) {
		long start = System.currentTimeMillis();
		URI url2 = null;
		HorsesDto hrDto = new HorsesDto();
		for (int meet = 1; meet <= 3; meet++) {
			boolean loop = true;
			int pageNo = 1;
			List<String> hrNameList = horsesService.hrList(meet);

			while (loop) {
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API8/raceHorseInfo");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url2 = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url2);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				HorsesVo rcResult = restTemplate.getForObject(url2, HorsesVo.class);
				HorsesVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<HorsesVo.Body.Item> resultList = rcResult.getBody().getItems();
					if (resultList.size() != 0) {
						for (HorsesVo.Body.Item item : resultList) {
							for (Iterator<String> hrIt = hrNameList.iterator(); hrIt.hasNext();) {
								String val = hrIt.next();
								if (val.equals(item.getHr_htName())) {
									hrDto.setHr_htName(item.getHr_htName());
									hrDto.setHr_no(item.getHrNo());
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
									hrDto.setRhrRegDt1(item.getRhrRegDt1());
									hrDto.setAuctionMon(item.getAuctionMon());
									horsesService.hrInfoUpdate(hrDto);
									hrIt.remove();
								}
							}
						}
						pageNo++;
					} else {
						loop = false;
						System.out.println("불러올 정보가 없습니다.");
					}
				}
			}

		}
		hrDto = new HorsesDto();
		for (int meet = 1; meet <= 3; meet++) {
			boolean loop = true;
			int pageNo = 1;
			List<String> hrNameList = horsesService.hrList(meet);
			while (loop) {
				try {
					StringBuilder urlBuilder = new StringBuilder(
							"http://apis.data.go.kr/B551015/API15/raceHorseResult");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url2 = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url2);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				HrAddInfoVo rcResult = restTemplate.getForObject(url2, HrAddInfoVo.class);
				HrAddInfoVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<HrAddInfoVo.Body.Item> resultList = rcResult.getBody().getItems();
					if (resultList.size() != 0) {
						for (HrAddInfoVo.Body.Item item : resultList) {
							for (Iterator<String> hrIt = hrNameList.iterator(); hrIt.hasNext();) {
								String val = hrIt.next();
								if (val.equals(item.getHrName())) {
									hrDto.setHr_htName(item.getHrName());
									hrDto.setDebut(item.getDebut());
									hrDto.setRecentRcDate(item.getRecentRcDate());
									horsesService.hrAddInfoUpdate(hrDto);
									hrIt.remove();
								}
							}
						}
						pageNo++;
					} else {
						loop = false;
						System.out.println("불러올 정보가 없습니다.");
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	// 마주 등록
	@RequestMapping(value = "/owInput.do", method = RequestMethod.GET)
	public String owInput(Model model) {
		long start = System.currentTimeMillis();
		URI url2 = null;
		for (int meet = 1; meet <= 3; meet++) {
			boolean loop = true;
			int pageNo = 1;
			try {
				StringBuilder builder = new StringBuilder("http://apis.data.go.kr/B551015/API14/horseOwnerInfo");
				builder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "="
						+ "emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
				builder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
				builder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
				builder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
				url2 = new URI(builder.toString());
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException uriE) {
				uriE.printStackTrace();
			}
			System.out.println(url2);
			RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
			OwnerVo rcResult = restTemplate.getForObject(url2, OwnerVo.class);
			OwnerVo.Header result = rcResult.getHeader();
			if (result.getResultCode() != 0) {
				System.out.println("result Code: " + result.getResultCode());
				System.out.println("result Message: " + result.getResultMsg());
				System.out.println("{RaceSchedule Info error}");
			} else {
				List<OwnerVo.Body.Item> resultList = rcResult.getBody().getItems();
				if (resultList.size() != 0) {
					OwnerDto owDto = new OwnerDto();
					for (OwnerVo.Body.Item item : resultList) {
						owDto.setOw_no(item.getOw_no());
						owDto.setOw_name(item.getOw_name());
						owDto.setOw_totHorses(item.getOw_totHorses());
						owDto.setOw_cancledHorses(item.getOw_cancledHorses());
						owDto.setOw_nowHorses(item.getOw_nowHorses());
						owDto.setOw_stDate(item.getOw_stDate());
						owDto.setOw_rcCntT(item.getOw_rcCntT());
						owDto.setOw_ord1CntT(item.getOw_ord1CntT());
						owDto.setOw_ord2CntT(item.getOw_ord2CntT());
						owDto.setOw_ord3CntT(item.getOw_ord3CntT());
						owDto.setOw_rcCntY(item.getOw_rcCntY());
						owDto.setOw_ord1CntY(item.getOw_ord1CntY());
						owDto.setOw_ord2CntY(item.getOw_ord2CntY());
						owDto.setOw_ord3CntY(item.getOw_ord3CntY());
						owDto.setOw_chaksunT(item.getOw_chaksunT());
						owDto.setOw_chaksunY(item.getOw_chaksunY());
						owDto.setOw_meet(meet);
						owService.owInsert(owDto);
					}
				} else {
					System.out.println("불러올 정보가 없습니다.");
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("msg", "메소드종료");
		return "forward:/adminPage.do";
	}

	// 경주기록 등록
	@RequestMapping(value = "/rcResultInput.do", method = RequestMethod.GET)
	public String rcResultInput(Model model) {
		RaceResultDto raceRsDto = new RaceResultDto();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -5);
		int month = cal.get(Calendar.MONTH) + 1;
		int beforeMonth = Integer.parseInt(fmt.format(cal.getTime()));
		System.out.println(month);
		System.out.println(beforeMonth);
		long start = System.currentTimeMillis();
		URI url2 = null;
		AA: for (int meet = 1; meet <= 3; meet++) {
			boolean loop = true;
			int pageNo = 1;
			BB: while (true) {
				try {
					StringBuilder builder = new StringBuilder("http://apis.data.go.kr/B551015/API4/raceResult");
					builder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "="
							+ "emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					builder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					builder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					builder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url2 = new URI(builder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url2);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceResultVo rcResult = restTemplate.getForObject(url2, RaceResultVo.class);
				RaceResultVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
					break AA;
				} else {
					List<RaceResultVo.Body.Item> resultList = rcResult.getBody().getItems();
					for (RaceResultVo.Body.Item item : resultList) {
						int date = Integer.parseInt(fmt.format(item.getRcDate()));
						if (date > beforeMonth) {
							raceRsDto.setRr_meet(meet);
							raceRsDto.setRr_rcDate(item.getRcDate());
							raceRsDto.setRr_rcNo(item.getRcNo());
							raceRsDto.setRr_hrNo(item.getHrNo());
							raceRsDto.setRr_hrName(item.getHrName());
							raceRsDto.setRr_ord(item.getOrd());
							raceRsDto.setRr_chulNo(item.getChulNo());
							raceRsDto.setRr_wgBudam(item.getWgBudam());
							raceRsDto.setRr_wgHr(item.getWgHr());
							raceRsDto.setRr_rcTime(item.getRcTime());
							raceRsDto.setRr_diffUnit(item.getDiffUnit());
							raceRsDto.setRr_ordS1f(item.getOrdS1f());
							raceRsDto.setRr_g8f_1c(item.getG8f_1c());
							raceRsDto.setRr_g6f_2c(item.getG6f_2c());
							raceRsDto.setRr_g4f_3c(item.getG4f_3c());
							raceRsDto.setRr_g3f_4c(item.getG3f_4c());
							raceRsDto.setRr_g2f(item.getG2f());
							raceRsDto.setRr_ordG1f(item.getOrdG1f());
							raceRsDto.setRr_rcTimeS1f(item.getRcTimeS1f());
							raceRsDto.setRr_rcTime_1c(item.getRcTime_1c());
							raceRsDto.setRr_rcTime_2c(item.getRcTime_2c());
							raceRsDto.setRr_rcTime_3c(item.getRcTime_3c());
							raceRsDto.setRr_rcTime_4c(item.getRcTime_4c());
							raceRsDto.setRr_rcTimeG3f(item.getRcTimeG3f());
							raceRsDto.setRr_rcTimeG2f(item.getRcTimeG2f());
							raceRsDto.setRr_rcTimeG1f(item.getRcTimeG1f());
							raceRsDto.setRr_winOdds(item.getWinOdds());
							raceRsDto.setRr_plcOdds(item.getPlcOdds());
							raceRsDto.setRr_trName(item.getTrName());
							raceRsDto.setRr_owName(item.getOwName());
							raceRsDto.setRr_jkName(item.getJkName());
							raceRsDto.setRr_rating(item.getRating());
							System.out.println(item.getTrNo() + ',' + item.getOwNo() + ',' + item.getJkNo());
							raceRsDto.setRr_trNo(item.getTrNo());
							raceRsDto.setRr_jkNo(item.getJkNo());
							raceRsDto.setRr_owNo(item.getOwNo());
							raceService.raceResultInput(raceRsDto);
						} else {
							break BB;
						}
					}
				}
				pageNo++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	// 경주마 등록
	@RequestMapping(value = "hrInset.do", method = RequestMethod.GET)
	public String hrInsert(Model model) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int today = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("year:" + year);
		System.out.println("month:" + month);
		System.out.println("date:" + date);
		System.out.println("today:" + today);
		String yyyyMMdd = fmt.format(cal.getTime());
		System.out.println(yyyyMMdd);
		String[] area = new String[2];
		String[] db = new String[2];
		if (today == 1) {
			area[0] = "seoul";
			area[1] = "busan";
			db[0] = "sdb1";
			db[1] = "pdb1";
		} else if (today == 4) {
			area[0] = "busan";
			db[0] = "pdb1";
		} else if (today == 5) {
			area[0] = "seoul";
			area[1] = "jeju";
			db[0] = "sdb1";
			db[1] = "cdb1";
		} else if (today == 7) {
			area[0] = "jeju";
			db[0] = "cdb1";
		}
		String[] link = new String[3];
		link[0] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/horse/20190801sdb1.txt";
		link[1] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/horse/20190731cdb1.txt";
		link[2] = "http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/horse/20190731pdb1.txt";
		for (int i = 0; i < link.length; i++) {
			try {
				URL url = new URL(link[i]);
				// URL url = new
				// URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/horse/"+yyyyMMdd+db[i]+".txt");
				int hr_meet = i + 1;
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = horsesService.hrDel(hr_meet);
				if (isDel) {
					System.out.println("초기화되었습니다");
				} else {
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;
				while ((line = reader.readLine()) != null) {
					if (line.contains("-") || line.contains("마명")) {
						System.out.println("나오지마라");
					} else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();
						}
						System.out.println("배열길이:" + splitedStr.length);
						if (splitedStr.length != 1) {
							HorsesDto horsesDto = new HorsesDto();
							horsesDto.setHr_htName(splitedStr[0]);
							horsesDto.setHr_name(splitedStr[1]);
							horsesDto.setHr_sex(splitedStr[2]);
							horsesDto.setHr_birthday(splitedStr[3]);
							horsesDto.setHr_age(Integer.valueOf(splitedStr[4]));
							horsesDto.setHr_rank(splitedStr[5]);
							horsesDto.setHr_part(Integer.valueOf(splitedStr[6]));
							horsesDto.setHr_trName(splitedStr[7]);
							horsesDto.setHr_meet(hr_meet);
							boolean isS = horsesService.hrInsert(horsesDto);
							if (isS) {
								System.out.println("입력되었습니다.");
							} else {
								System.out.println("입력실패.");
							}
						} else {
							System.out.println("불러올 정보가 없습니다.");
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
		model.addAttribute("msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	// 경주 개요 등록
	@RequestMapping(value = "/raceInfo.do", method = RequestMethod.GET)
	public String raceInfo(Model model) {
		long start = System.currentTimeMillis();
		URI url = null;
		RaceInfoDto rcInfoDto = new RaceInfoDto();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -1);
		int month = cal.get(Calendar.MONTH) + 1;
		int beforeMonth = Integer.parseInt(fmt.format(cal.getTime()));
		System.out.println(beforeMonth);
		List<RaceInfoVo.Body.Item> infoList = new ArrayList<RaceInfoVo.Body.Item>();
		List<RaceSummaryResultVo.Body.Item> infoList2 = new ArrayList<RaceSummaryResultVo.Body.Item>();
		List<RaceSectionRecordVo.Body.Item> infoList3 = new ArrayList<RaceSectionRecordVo.Body.Item>();
		for (int meet = 1; meet <= 3; meet++) {
			int pageNo = 1;
			BB: while (true) {
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API3/raceInfo");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceInfoVo rcResult = restTemplate.getForObject(url, RaceInfoVo.class);
				RaceInfoVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<RaceInfoVo.Body.Item> resultList = rcResult.getBody().getItems();
					if (resultList.size() != 0) {
						for (RaceInfoVo.Body.Item item : resultList) {
							if (Integer.parseInt(fmt.format(item.getRcDate())) >= beforeMonth) {
								infoList.add(item);
							} else {
								break BB;
							}
						}
						System.out.println("배열길이" + resultList.size());
						pageNo++;
					} else {
						System.out.println("불러올 정보가 없습니다.");
						break BB;
					}
				}
			}
			//경주 요약성적표
			BB: while (true) {
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API34/raceSummaryResult");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceSummaryResultVo rcResult = restTemplate.getForObject(url, RaceSummaryResultVo.class);
				RaceSummaryResultVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<RaceSummaryResultVo.Body.Item> resultList = rcResult.getBody().getItems();
					if (resultList.size() != 0) {
						for (RaceSummaryResultVo.Body.Item item : resultList) {
							if (Integer.parseInt(fmt.format(item.getRcDate())) >= beforeMonth) {
								infoList2.add(item);
							} else {
								break BB;
							}
						}
						System.out.println("배열길이" + resultList.size());
						pageNo++;
					} else {
						System.out.println("불러올 정보가 없습니다.");
						break BB;
					}
				}
			}
			BB: while (true) {
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API6/raceDetailSectionRecord");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					url = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceSectionRecordVo rcResult = restTemplate.getForObject(url, RaceSectionRecordVo.class);
				RaceSectionRecordVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<RaceSectionRecordVo.Body.Item> resultList = rcResult.getBody().getItems();
					if (resultList.size() != 0) {
						for (RaceSectionRecordVo.Body.Item item : resultList) {
							if (Integer.parseInt(fmt.format(item.getRcDate())) >= beforeMonth) {
								infoList3.add(item);
							} else {
								break BB;
							}
						}
						System.out.println("배열길이" + resultList.size());
						pageNo++;
					} else {
						System.out.println("불러올 정보가 없습니다.");
						break BB;
					}
				}
			}
			for (int l=0;l<infoList.size();l++) {
				rcInfoDto.setRi_meet(meet); rcInfoDto.setRi_rcDate(infoList.get(l).getRcDate());
				rcInfoDto.setRi_rcNo(infoList.get(l).getRcNo());
				rcInfoDto.setRi_ilsu(infoList.get(l).getIlsu());
				rcInfoDto.setRi_rcDist(infoList.get(l).getRcDist());
				rcInfoDto.setRi_rank(infoList.get(l).getRank());
				rcInfoDto.setRi_budam(infoList.get(l).getBudam());
				rcInfoDto.setRi_rcName(infoList.get(l).getRcName());
				rcInfoDto.setRi_ageCond(infoList.get(l).getAgeCond());
				rcInfoDto.setRi_weather(infoList.get(l).getWeather());
				rcInfoDto.setRi_track(infoList.get(l).getTrack());
				rcInfoDto.setRi_chaksun1(infoList.get(l).getChaksun1());
				rcInfoDto.setRi_chaksun2(infoList.get(l).getChaksun2());
				rcInfoDto.setRi_chaksun3(infoList.get(l).getChaksun3());
				rcInfoDto.setRi_chaksun4(infoList.get(l).getChaksun4());
				rcInfoDto.setRi_chaksun5(infoList.get(l).getChaksun5());
				rcInfoDto.setRi_winAmt(infoList.get(l).getWinAmt());
				rcInfoDto.setRi_plcAmt(infoList.get(l).getPlcAmt());
				rcInfoDto.setRi_qnlAmt(infoList.get(l).getQnlAmt());
				rcInfoDto.setRi_exaAmt(infoList.get(l).getExaAmt());
				rcInfoDto.setRi_qplAmt(infoList.get(l).getQplAmt());
				rcInfoDto.setRi_tlaAmt(infoList.get(l).getTlaAmt());
				rcInfoDto.setRi_triAmt(infoList.get(l).getTriAmt());
				rcInfoDto.setRi_totalAmt(infoList.get(l).getTotalAmt());
				rcInfoDto.setRi_winChulNo(infoList2.get(l).getWinChulNo());
				rcInfoDto.setRi_winOdds(infoList2.get(l).getWinOdds());
				rcInfoDto.setRi_plcChulNo(infoList2.get(l).getPlcChulNo());
				rcInfoDto.setRi_plcOdds(infoList2.get(l).getPlcOdds());
				rcInfoDto.setRi_qnlChulNo(infoList2.get(l).getQnlChulNo());
				rcInfoDto.setRi_qnlOdds(infoList2.get(l).getQnlOdds());
				rcInfoDto.setRi_exaChulNo(infoList2.get(l).getExaChulNo());
				rcInfoDto.setRi_exaOdds(infoList2.get(l).getExaOdds());
				rcInfoDto.setRi_qplChulNo(infoList2.get(l).getQplChulNo());
				rcInfoDto.setRi_qplOdds(infoList2.get(l).getQplOdds());
				rcInfoDto.setRi_tlaChulNo(infoList2.get(l).getTlaChulNo());
				rcInfoDto.setRi_tlaOdds(infoList2.get(l).getTlaOdds());
				rcInfoDto.setRi_triChulNo(infoList2.get(l).getTriChulNo());
				rcInfoDto.setRi_triOdds(infoList2.get(l).getTriOdds());
				rcInfoDto.setRi_dist_1f(infoList3.get(l).getDist_1f());
				rcInfoDto.setRi_dist_2f(infoList3.get(l).getDist_2f());
				rcInfoDto.setRi_dist_3f(infoList3.get(l).getDist_3f());
				rcInfoDto.setRi_dist_4f(infoList3.get(l).getDist_4f());
				rcInfoDto.setRi_dist_5f(infoList3.get(l).getDist_5f());
				rcInfoDto.setRi_dist_6f(infoList3.get(l).getDist_6f());
				rcInfoDto.setRi_dist_7f(infoList3.get(l).getDist_7f());
				rcInfoDto.setRi_dist_8f(infoList3.get(l).getDist_8f());
				rcInfoDto.setRi_dist_9f(infoList3.get(l).getDist_9f());
				rcInfoDto.setRi_dist_10f(infoList3.get(l).getDist_10f());
				rcInfoDto.setRi_time_1f(infoList3.get(l).getTime_1f());
				rcInfoDto.setRi_time_2f(infoList3.get(l).getTime_2f());
				rcInfoDto.setRi_time_3f(infoList3.get(l).getTime_3f());
				rcInfoDto.setRi_time_4f(infoList3.get(l).getTime_4f());
				rcInfoDto.setRi_time_5f(infoList3.get(l).getTime_5f());
				rcInfoDto.setRi_time_6f(infoList3.get(l).getTime_6f());
				rcInfoDto.setRi_time_7f(infoList3.get(l).getTime_7f());
				rcInfoDto.setRi_time_8f(infoList3.get(l).getTime_8f());
				rcInfoDto.setRi_time_9f(infoList3.get(l).getTime_9f());
				rcInfoDto.setRi_time_10f(infoList3.get(l).getTime_10f());
				rcInfoDto.setRi_time_11f(infoList3.get(l).getTime_11f());
				rcInfoDto.setRi_time_12f(infoList3.get(l).getTime_12f());
				rcInfoDto.setRi_passTime_1f(infoList3.get(l).getPassTime_1f());
				rcInfoDto.setRi_passTime_2f(infoList3.get(l).getPassTime_2f());
				rcInfoDto.setRi_passTime_3f(infoList3.get(l).getPassTime_3f());
				rcInfoDto.setRi_passTime_4f(infoList3.get(l).getPassTime_4f());
				rcInfoDto.setRi_passTime_5f(infoList3.get(l).getPassTime_5f());
				rcInfoDto.setRi_passTime_6f(infoList3.get(l).getPassTime_6f());
				rcInfoDto.setRi_passTime_7f(infoList3.get(l).getPassTime_7f());
				rcInfoDto.setRi_passTime_8f(infoList3.get(l).getPassTime_8f());
				rcInfoDto.setRi_passTime_9f(infoList3.get(l).getPassTime_9f());
				rcInfoDto.setRi_passTime_10f(infoList3.get(l).getPassTime_10f());
				rcInfoDto.setRi_passrankS1f(infoList3.get(l).getPassrankS1f());
				rcInfoDto.setRi_passrankG8f_1c(infoList3.get(l).getPassrankG8f_1c());
				rcInfoDto.setRi_passrankG6f_2c(infoList3.get(l).getPassrankG6f_2c());
				rcInfoDto.setRi_passrankG4f_3c(infoList3.get(l).getPassrankG4f_3c());
				rcInfoDto.setRi_passrankG3f_4c(infoList3.get(l).getPassrankG3f_4c());
				rcInfoDto.setRi_passrankG2f(infoList3.get(l).getPassrankG2f());
				rcInfoDto.setRi_passrankG1f(infoList3.get(l).getPassrankG1f());
			}
		}

		raceService.raceInfoInput(rcInfoDto);
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("Msg", "메소드 종료");
		return "forward:/adminPage.do";
	}
}
