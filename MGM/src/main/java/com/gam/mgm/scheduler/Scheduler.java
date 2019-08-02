package com.gam.mgm.scheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.service.IHorsesService;
import com.gam.mgm.service.IJockeyService;
import com.gam.mgm.service.IOwnerService;
import com.gam.mgm.service.ITrainerService;
import com.gam.utils.Util;

@Component
public class Scheduler {
	@Autowired
	private ITrainerService trainerService;
	@Autowired
	private IHorsesService horsesService;
	@Autowired
	private IJockeyService jockeyService;
	@Autowired
	private IOwnerService ownerService;
	/*@Scheduled(cron = "0 55 16 ? * SUN,THU")*/
	@Scheduled(cron = "0 58 06 ? * FRI")
	public void trainers(){
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int date = cal.get(Calendar.DATE);
//		int today = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("year:"+year);
//		System.out.println("month:"+month);
//		System.out.println("date:"+date);
//		System.out.println("today:"+today);
//		String yyyyMMdd = fmt.format(cal.getTime());
//		System.out.println(yyyyMMdd);
//		String[] area = new String[2];
//		String[] db = new String[2];
//		if(today==1) {
//			area[0]="seoul";
//			area[1]="busan";
//			db[0]="sdb3";
//			db[1]="pdb3";
//		}else if(today==4) {
//			area[0]="busan";
//			db[0]="pdb3";
//		}else if(today==5) {
//			area[0]="seoul";
//			area[1]="jeju";
//			db[0]="sdb3";
//			db[1]="cdb3";
//		}else if(today==7) {
//			area[0]="jeju";
//			db[0]="cdb3";
//		}
//
//
//		for(int i=0;i<area.length;i++) {
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/trainer/20190801sdb3.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/trainer/"+yyyyMMdd+db[i]+".txt");
				int tr_meet = 1; //나중에 수정
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = trainerService.trDel(tr_meet);
				if(isDel) {
					System.out.println("초기화되었습니다");
				}else{
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;					
				while ((line = reader.readLine()) != null) {
					if(line.contains("-")||line.contains("조교사명")) {
						System.out.println("나오지마라");							
					}else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();
						}
						if(splitedStr.length !=1) {
							TrainerDto trainerDto = new TrainerDto();
							trainerDto.setTr_name(splitedStr[0]);
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
							trainerDto.setTr_meet(1);
							boolean isS = trainerService.trInsert(trainerDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
			
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/trainer/20190731pdb3.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/trainer/"+yyyyMMdd+db[i]+".txt");
				int tr_meet = 3; //나중에 수정
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = trainerService.trDel(tr_meet);
				if(isDel) {
					System.out.println("초기화되었습니다");
				}else{
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;					
				while ((line = reader.readLine()) != null) {
					if(line.contains("-")||line.contains("조교사명")) {
						System.out.println("나오지마라");							
					}else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();

						}
						if(splitedStr.length !=1) {
							TrainerDto trainerDto = new TrainerDto();
							trainerDto.setTr_name(splitedStr[0]);
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
							trainerDto.setTr_meet(3);
							boolean isS = trainerService.trInsert(trainerDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
			
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/trainer/20190731cdb3.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/trainer/"+yyyyMMdd+db[i]+".txt");
				int tr_meet = 2; //나중에 수정
				String[] splitedStr = null;
				URLConnection urlConn = url.openConnection();
				InputStream is = urlConn.getInputStream();
				System.out.println(is);
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
				System.out.println(reader);
				boolean isDel = trainerService.trDel(tr_meet);
				if(isDel) {
					System.out.println("초기화되었습니다");
				}else{
					System.out.println("초기화실패하였습니다");
				}
				String line = null;
				splitedStr = null;					
				while ((line = reader.readLine()) != null) {
					if(line.contains("-")||line.contains("조교사명")) {
						System.out.println("나오지마라");							
					}else {
						splitedStr = null;
						splitedStr = line.split("\\s+");

						for (int j = 0; j < splitedStr.length; j++) {
							splitedStr[j] = splitedStr[j].trim();

						}
						if(splitedStr.length !=1) {
							TrainerDto trainerDto = new TrainerDto();
							trainerDto.setTr_name(splitedStr[0]);
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
							trainerDto.setTr_meet(2);
							boolean isS = trainerService.trInsert(trainerDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
//		}
		//조교사 끝


	}

	//기수 정보
	@Scheduled(cron = "10 00 20 ? * FRI")
	public void jockeyInfo() {
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int date = cal.get(Calendar.DATE);
//		int today = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("year:"+year);
//		System.out.println("month:"+month);
//		System.out.println("date:"+date);
//		System.out.println("today:"+today);
//		String yyyyMMdd = fmt.format(cal.getTime());
//		System.out.println(yyyyMMdd);
//		String[] area = new String[2];
//		String[] db = new String[2];
//		if(today==1) {
//			area[0]="seoul";
//			area[1]="busan";
//			db[0]="sdb2";
//			db[1]="pdb2";
//		}else if(today==4) {
//			area[0]="busan";
//			db[0]="pdb2";
//		}else if(today==5) {
//			area[0]="seoul";
//			area[1]="jeju";
//			db[0]="sdb2";
//			db[1]="cdb2";
//		}else if(today==7) {
//			area[0]="jeju";
//			db[0]="cdb2";
//		}
//		for(int i=0;i<area.length;i++) {
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

	//경주마 정보
	@Scheduled(cron = "20 58 06 ? * FRI")
	public void horseInfo() {
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int date = cal.get(Calendar.DATE);
//		int today = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("year:"+year);
//		System.out.println("month:"+month);
//		System.out.println("date:"+date);
//		System.out.println("today:"+today);
//		String yyyyMMdd = fmt.format(cal.getTime());
//		System.out.println(yyyyMMdd);
//		String[] area = new String[2];
//		String[] db = new String[2];
//		if(today==1) {
//			area[0]="seoul";
//			area[1]="busan";
//			db[0]="sdb1";
//			db[1]="pdb1";
//		}else if(today==4) {
//			area[0]="busan";
//			db[0]="pdb1";
//		}else if(today==5) {
//			area[0]="seoul";
//			area[1]="jeju";
//			db[0]="sdb1";
//			db[1]="cdb1";
//		}else if(today==7) {
//			area[0]="jeju";
//			db[0]="cdb1";
//		}
//		for(int i=0;i<area.length;i++) {
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/horse/20190801sdb1.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/horse/"+yyyyMMdd+db[i]+".txt");
				int hr_meet = 1;
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
						}
						System.out.println("배열길이:"+splitedStr.length);
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
							horsesDto.setHr_meet(1);
							boolean isS = horsesService.hrInsert(horsesDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
//		}
			
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/horse/20190731pdb1.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/horse/"+yyyyMMdd+db[i]+".txt");
				int hr_meet = 3;
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
						}
						System.out.println("배열길이:"+splitedStr.length);
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
							horsesDto.setHr_meet(3);
							boolean isS = horsesService.hrInsert(horsesDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
			
			try {
				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/horse/20190731cdb1.txt");
//				URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/"+area[i]+"/horse/"+yyyyMMdd+db[i]+".txt");
				int hr_meet = 2;
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
						}
						System.out.println("배열길이:"+splitedStr.length);
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
							horsesDto.setHr_meet(2);
							boolean isS = horsesService.hrInsert(horsesDto);
							if(isS) {
								System.out.println("입력되었습니다.");
							}else {
								System.out.println("입력실패.");
							}
						}else {
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
	
	//마주정보
	@Scheduled(cron="30 45 08 ? * FRI")
	public void ownerInfo(){
	}		
}
