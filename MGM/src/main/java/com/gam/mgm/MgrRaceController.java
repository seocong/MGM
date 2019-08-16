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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

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
import com.gam.mgm.dto.RaceEntryDto;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RacePlanDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IOwnerService;
import com.gam.mgm.service.IRaceEntryService;
import com.gam.mgm.service.IRacePlanService;
import com.gam.mgm.service.IRaceService;
import com.gam.mgm.service.ITrainerService;
import com.gam.mgm.vo.HorsesVo;
import com.gam.mgm.vo.HrAddInfoVo;
import com.gam.mgm.vo.JockeyVo;
import com.gam.mgm.vo.OwnerVo;
import com.gam.mgm.vo.RaceEntryVo;
import com.gam.mgm.vo.RaceInfoVo;
import com.gam.mgm.vo.RacePlanVo;
import com.gam.mgm.vo.RaceRefreeVo;
import com.gam.mgm.vo.RaceResultVo;
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
	@Autowired
	private IRacePlanService racePlanService;
	@Autowired
	private IRaceEntryService raceEntryService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws URISyntaxException
	 */

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
		boolean isDel = trainerService.trDel();
		boolean resetSeq = trainerService.resetSeq();
		if (isDel && resetSeq) {
			System.out.println("초기화되었습니다");
		} else {
			System.out.println("초기화실패하였습니다");
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
				boolean isDel = jockeyService.jkDel(jk_meet);
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

	// 경주마 업데이트
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
									//									hrDto.setRhrRegDt1(item.getRhrRegDt1());
									//									hrDto.setAuctionMon(item.getAuctionMon());
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
						int date = Integer.parseInt(item.getRcDate());
						if (date > beforeMonth) {
							raceRsDto.setRr_meet(meet);
							try {
								raceRsDto.setRr_rcDate(fmt.parse(item.getRcDate()));
							} catch (ParseException e) {
								System.out.println("raceResult parseException!!!!!");
								e.printStackTrace();
							}
							raceRsDto.setRr_rcNo(item.getRcNo());
							raceRsDto.setRr_hrNo(item.getHrNo());
							raceRsDto.setRr_hrName(item.getHrName());
							raceRsDto.setRr_ord(item.getOrd());
							raceRsDto.setRr_chulNo(item.getChulNo());
							raceRsDto.setRr_wgBudam(item.getWgBudam());
							raceRsDto.setRr_wgHr(item.getWgHr());
							raceRsDto.setRr_rcTime(Util.time(item.getRcTime()));
							raceRsDto.setRr_diffUnit(item.getDiffUnit());
							raceRsDto.setRr_ordS1f(item.getOrdS1f());
							raceRsDto.setRr_g8f_1c(item.getG8f_1c());
							raceRsDto.setRr_g6f_2c(item.getG6f_2c());
							raceRsDto.setRr_g4f_3c(item.getG4f_3c());
							raceRsDto.setRr_g3f_4c(item.getG3f_4c());
							raceRsDto.setRr_g2f(item.getG2f());
							raceRsDto.setRr_ordG1f(item.getOrdG1f());
							raceRsDto.setRr_rcTimeS1f(Util.time(item.getRcTimeS1f()));
							raceRsDto.setRr_rcTime_1c(Util.time(item.getRcTime_1c()));
							raceRsDto.setRr_rcTime_2c(Util.time(item.getRcTime_2c()));
							raceRsDto.setRr_rcTime_3c(Util.time(item.getRcTime_3c()));
							raceRsDto.setRr_rcTime_4c(Util.time(item.getRcTime_4c()));
							raceRsDto.setRr_rcTimeG3f(Util.time(item.getRcTimeG3f()));
							raceRsDto.setRr_rcTimeG2f(Util.time(item.getRcTimeG2f()));
							raceRsDto.setRr_rcTimeG1f(Util.time(item.getRcTimeG1f()));
							raceRsDto.setRr_winOdds(item.getWinOdds());
							raceRsDto.setRr_plcOdds(item.getPlcOdds());
							raceRsDto.setRr_trName(item.getTrName());
							raceRsDto.setRr_owName(item.getOwName());
							raceRsDto.setRr_jkName(item.getJkName());
							raceRsDto.setRr_rating(item.getRating());
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
		URI url2 = null;
		URI url3 = null;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		List<Integer> year = new ArrayList<Integer>();
		year.add(cal.get(Calendar.YEAR));
		cal.add(Calendar.YEAR,-1);
		year.add(cal.get(Calendar.YEAR));
		int beforeMonth = Integer.parseInt(fmt.format(cal.getTime()));
		System.out.println(beforeMonth);
		for (int meet = 1; meet <= 3; meet++) {
			int pageNo = 1;
			for(int yearLoop:year){
				BB: while (true) {
					//경주개요
					try {
						StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API3/raceInfo");
						urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
						+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
						urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
						urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
						urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
						urlBuilder.append("&" + URLEncoder.encode("rc_year", "UTF-8") + "=" + yearLoop);
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
						System.out.println("배열길이" + resultList.size());
						if (resultList.size() != 0) {
							for (RaceInfoVo.Body.Item item : resultList) {
								if (Integer.parseInt(item.getRcDate()) >= beforeMonth) {
									RaceInfoDto rcInfoDto = new RaceInfoDto();
									rcInfoDto.setRi_meet(meet);
									try {
										rcInfoDto.setRi_rcDate(fmt.parse(item.getRcDate()));
									} catch (ParseException e) {
										System.out.println("raceInfo parseException!!!!!");
										e.printStackTrace();
									}
									rcInfoDto.setRi_rcNo(item.getRcNo());
									rcInfoDto.setRi_ilsu(item.getIlsu());
									rcInfoDto.setRi_rcDist(item.getRcDist());
									rcInfoDto.setRi_rank(item.getRank());
									rcInfoDto.setRi_budam(item.getBudam());
									rcInfoDto.setRi_rcName(item.getRcName());
									rcInfoDto.setRi_ageCond(item.getAgeCond());
									rcInfoDto.setRi_weather(item.getWeather());
									rcInfoDto.setRi_track(item.getTrack());
									rcInfoDto.setRi_chaksun1(item.getChaksun1());
									rcInfoDto.setRi_chaksun2(item.getChaksun2());
									rcInfoDto.setRi_chaksun3(item.getChaksun3());
									rcInfoDto.setRi_chaksun4(item.getChaksun4());
									rcInfoDto.setRi_chaksun5(item.getChaksun5());
									rcInfoDto.setRi_winAmt(item.getWinAmt());
									rcInfoDto.setRi_plcAmt(item.getPlcAmt());
									rcInfoDto.setRi_qnlAmt(item.getQnlAmt());
									rcInfoDto.setRi_exaAmt(item.getExaAmt());
									rcInfoDto.setRi_qplAmt(item.getQplAmt());
									rcInfoDto.setRi_tlaAmt(item.getTlaAmt());
									rcInfoDto.setRi_triAmt(item.getTriAmt());
									rcInfoDto.setRi_totalAmt(item.getTotalAmt());
									raceService.raceInfoInput(rcInfoDto);
								} else {
									pageNo=1;
									break BB;
								}
							}
							pageNo++;
						} else {
							System.out.println("불러올 정보가 없습니다.");
							pageNo=1;
							break BB;
						}
					}
				}
			CC: while (true) {
				//경주개요
				//경주 요약성적표
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API34/raceSummaryResult");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					urlBuilder.append("&" + URLEncoder.encode("rc_year", "UTF-8") + "=" + yearLoop);
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
					System.out.println("배열길이" + resultList.size());
					if (resultList.size() != 0) {
						for (RaceSummaryResultVo.Body.Item item : resultList) {
							if (Integer.parseInt(item.getRcDate()) >= beforeMonth) {
								item.setMeet(meet);
								raceService.raceInfoUpdate1(item);
							} else {
								pageNo=1;
								break CC;
							}
						}
						pageNo++;
					} else {
						System.out.println("불러올 정보가 없습니다.");
						pageNo=1;
						break CC;
					}
				}
			}
				DD: while (true) {
					//경주개요
					//경주 구간별 통과순위
					try {
						StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API6/raceDetailSectionRecord");
						urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
						+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
						urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
						urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
						urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
						urlBuilder.append("&" + URLEncoder.encode("rc_year", "UTF-8") + "=" + yearLoop);
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
						System.out.println("배열길이" + resultList.size());
						if (resultList.size() != 0) {
							for (RaceSectionRecordVo.Body.Item item : resultList) {
								if (Integer.parseInt(item.getRcDate()) >= beforeMonth) {
									item.setMeet(meet);
									raceService.raceInfoUpdate2(item);
								} else {
									pageNo=1;
									break DD;
								}
							}
							pageNo++;
						} else {
							System.out.println("불러올 정보가 없습니다.");
							pageNo=1;
							break DD;
						}
					}
				}
			DD: while (true) {
				//경주개요
				//심판정보
				try {
					StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551015/API7/raceRefereeDetails");
					urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + pageNo);
					urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					urlBuilder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					urlBuilder.append("&" + URLEncoder.encode("rc_year", "UTF-8") + "=" + yearLoop);
					url = new URI(urlBuilder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RaceRefreeVo rcResult = restTemplate.getForObject(url, RaceRefreeVo.class);
				RaceRefreeVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<RaceRefreeVo.Body.Item> resultList = rcResult.getBody().getItems();
					System.out.println("배열길이" + resultList.size());
					if (resultList.size() != 0) {
						for (RaceRefreeVo.Body.Item item : resultList) {
							if (Integer.parseInt(item.getRcDate()) >= beforeMonth) {
								item.setMeet(meet);
								raceService.refreeInsert(item);
							} else {
								pageNo=1;
								break DD;
							}
						}
						pageNo++;
					} else {
						System.out.println("불러올 정보가 없습니다.");
						pageNo=1;
						break DD;
					}
				}
			}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("Msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	//출마표 등록
	@RequestMapping(value = "/rcPlanInput.do", method = RequestMethod.GET)
	public String rcPlanInput(Model model) throws ParseException {
		URI url =null;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		RacePlanDto rcPlDto = new RacePlanDto();
		Calendar cal = Calendar.getInstance();
		long start = System.currentTimeMillis();
		int first = 0;
		int second = 0;
		boolean resetTable = racePlanService.resetTable();
		if(resetTable) {
			boolean resetSeq = racePlanService.resetSeq();
			if(resetSeq) {
				System.out.println("seq초기화");
				System.out.println("테이블 초기화 성공");
			}else {
				System.out.println("seq초기화 실패");
			}
		}else {
			System.out.println("테이블 초기화 실패");
		}
		for(int meet=1;meet<=3;meet++){
			switch(meet) {
			case 1:
				cal.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
				first = Integer.parseInt(fmt.format(cal.getTime()));
				cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
				cal.add(Calendar.DATE,7);
				second = Integer.parseInt(fmt.format(cal.getTime()));
				break;
			case 2:
				cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
				first = Integer.parseInt(fmt.format(cal.getTime()));
				cal.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
				cal.add(Calendar.DATE,7);
				second = Integer.parseInt(fmt.format(cal.getTime()));
				break;
			case 3:
				cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
				first = Integer.parseInt(fmt.format(cal.getTime()));
				cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
				cal.add(Calendar.DATE,7);
				second = Integer.parseInt(fmt.format(cal.getTime()));
				break;
			}
			System.out.println("first: "+first);
			System.out.println("second: "+second);
			int[] dateLoop = new int[] {first, second};
			for(int i=0;i<2;i++) {
				try {
					StringBuilder builder = new StringBuilder("http://apis.data.go.kr/B551015/API26/entrySheet");
					builder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "="
							+ "emflkTpia4VRlESSmKr8tGZbjCeJO%2Fn2263wtUm6OFA%2FTkX06rfsrQOR%2Bu5aECgJ%2B%2BciVWIRU5EaZG1kRFJfoQ%3D%3D");
					builder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + 1);
					builder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + "999");
					builder.append("&" + URLEncoder.encode("meet", "UTF-8") + "=" + meet);
					builder.append("&" + URLEncoder.encode("rc_date","UTF-8") + "=" + dateLoop[i]);
					url = new URI(builder.toString());
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException uriE) {
					uriE.printStackTrace();
				}
				System.out.println(url);
				RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
				RacePlanVo rcResult = restTemplate.getForObject(url, RacePlanVo.class);
				RacePlanVo.Header result = rcResult.getHeader();
				if (result.getResultCode() != 0) {
					System.out.println("result Code: " + result.getResultCode());
					System.out.println("result Message: " + result.getResultMsg());
					System.out.println("{RaceSchedule Info error}");
				} else {
					List<RacePlanVo.Body.Item> resultList = rcResult.getBody().getItems();
					if(resultList.size()==0) {
						first=first-7;
						second=second-7;
						dateLoop = new int[] {first,second};
						i--;
					}else {
						for (RacePlanVo.Body.Item item : resultList) {
							rcPlDto.setRp_meet(meet);
							rcPlDto.setRp_rcDate(fmt.parse(item.getRcDate()));
							rcPlDto.setRp_rcDay(item.getRcDay().substring(0,1));
							rcPlDto.setRp_rcNo(item.getRcNo());
							rcPlDto.setRp_chulNo(item.getChulNo());
							rcPlDto.setRp_hrName(item.getHrName());
							rcPlDto.setRp_hrNo(item.getHrNo());
							rcPlDto.setRp_prd(item.getPrd());
							rcPlDto.setRp_sex(item.getSex());
							rcPlDto.setRp_age(item.getAge());
							rcPlDto.setRp_wgBudam(item.getWgBudam());
							rcPlDto.setRp_rating(item.getRating());
							rcPlDto.setRp_jkName(item.getJkName());
							rcPlDto.setRp_jkNo(item.getJkNo());
							rcPlDto.setRp_trName(item.getTrName());
							rcPlDto.setRp_trNo(item.getTrNo());
							rcPlDto.setRp_owName(item.getOwName());
							rcPlDto.setRp_owNo(item.getOwNo());
							rcPlDto.setRp_ilsu(item.getIlsu());
							rcPlDto.setRp_rcDist(item.getRcDist());
							rcPlDto.setRp_dusu(item.getDusu());
							rcPlDto.setRp_rank(item.getRank());
							rcPlDto.setRp_prizeCond(item.getPrizeCond());
							rcPlDto.setRp_ageCond(item.getAgeCond());
							rcPlDto.setRp_stTime(item.getStTime().substring(4));
							rcPlDto.setRp_budam(item.getBudam());
							rcPlDto.setRp_rcName(item.getRcName());
							rcPlDto.setRp_chaksun1(item.getChaksun1());
							rcPlDto.setRp_chaksun2(item.getChaksun2());
							rcPlDto.setRp_chaksun3(item.getChaksun3());
							rcPlDto.setRp_chaksun4(item.getChaksun4());
							rcPlDto.setRp_chaksun5(item.getChaksun5());
							racePlanService.rcPlanInsert(rcPlDto);
						}
					}
				}
			}
			cal.add(Calendar.DATE,-7);
		}
		long end = System.currentTimeMillis();
		System.out.println("시간: " + ((end - start) / 1000) + "초");
		model.addAttribute("msg", "메소드 종료");
		return "forward:/adminPage.do";
	}

	//출전마 등록정보 등록
	@RequestMapping(value = "/rcEntryInput.do", method = RequestMethod.GET)
	public String rcEntryInput(Model model) throws ParseException {
		long start = System.currentTimeMillis();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		int today = Integer.parseInt(fmt.format(cal.getTime()));
		URI url2 = null;
		boolean resetTable = raceEntryService.resetTable();
		if(resetTable) {
			boolean resetSeq = raceEntryService.resetSeq();
			if(resetSeq) {
				System.out.println("seq초기화");
				System.out.println("테이블 초기화 성공");
			}else {
				System.out.println("seq초기화 실패");
			}
		}else {
			System.out.println("테이블 초기화 실패");
		}
		for (int meet = 1; meet <= 3; meet++) {
			int pageNo = 1;
			try {
				StringBuilder builder = new StringBuilder("http://apis.data.go.kr/B551015/API23/entryRaceHorse");
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
			RaceEntryVo rcResult = restTemplate.getForObject(url2, RaceEntryVo.class);
			RaceEntryVo.Header result = rcResult.getHeader();
			if (result.getResultCode() != 0) {
				System.out.println("result Code: " + result.getResultCode());
				System.out.println("result Message: " + result.getResultMsg());
				System.out.println("{RaceSchedule Info error}");
			} else {
				List<RaceEntryVo.Body.Item> resultList = rcResult.getBody().getItems();
				if (resultList.size() != 0) {
					RaceEntryDto entryDto = new RaceEntryDto();
					for (RaceEntryVo.Body.Item item : resultList) {
						if(Integer.parseInt(item.getPgDate())>today) {
							entryDto.setRe_meet(meet);
							entryDto.setRe_pgDate(fmt.parse(item.getPgDate()));
							entryDto.setRe_pgNo(item.getPgNo());
							entryDto.setRe_rcName(item.getRcName());
							entryDto.setRe_rank(item.getRank());
							entryDto.setRe_rcDist(item.getRcDist());
							entryDto.setRe_budam(item.getBudam());
							entryDto.setRe_prizeCond(item.getPrizeCond());
							entryDto.setRe_ageCond(item.getAgeCond());
							entryDto.setRe_chaksun1(item.getChaksun1());
							entryDto.setRe_chaksun2(item.getChaksun2());
							entryDto.setRe_chaksun3(item.getChaksun3());
							entryDto.setRe_chaksun4(item.getChaksun4());
							entryDto.setRe_chaksun5(item.getChaksun5());
							entryDto.setRe_enNo(item.getEnNo());
							entryDto.setRe_recentRating(item.getRecentRating());
							entryDto.setRe_hrName(item.getHrName());
							entryDto.setRe_hrNo(item.getHrNo());
							entryDto.setRe_name(item.getName());
							entryDto.setRe_sex(item.getSex());
							entryDto.setRe_age(item.getAge());
							entryDto.setRe_trName(item.getTrName());
							entryDto.setRe_trNo(item.getTrNo());
							entryDto.setRe_owName(item.getOwName());
							entryDto.setRe_owNo(item.getOwNo());
							entryDto.setRe_rcCntY(item.getRcCntY());
							entryDto.setRe_calPrize_6m(item.getCalPrize_6m());
							entryDto.setRe_calPrizeY(item.getCalPrizeY());
							entryDto.setRe_chaksunT(item.getChaksunT());
							raceEntryService.rcEntryInsert(entryDto);
						}
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

}
