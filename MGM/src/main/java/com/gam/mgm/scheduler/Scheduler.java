package com.gam.mgm.scheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gam.mgm.dto.TrainerDto;
import com.gam.mgm.service.ITrainerService;
import com.gam.utils.Util;

@Component
public class Scheduler {
	@Autowired
	private ITrainerService trainerService;
	
	/*@Scheduled(cron = "0 55 16 ? * SUN,THU")*/
	@Scheduled(cron = "0 19 05 ? * WED")
	public void trainers(){
		Calendar cal = Calendar.getInstance();
	 	int year = cal.get(Calendar.YEAR);
	 	int month = cal.get(Calendar.MONTH)+1;
	 	int date = cal.get(Calendar.DATE);
		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("date:"+date);
		
		String yyyyMMdd = year+Util.isTwo(String.valueOf(month))+date;
		System.out.println(yyyyMMdd);
		
		
		
		try {
			URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/trainer/20190725sdb3.txt");
		/*	URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/seoul/trainer/"+yyyyMMdd+"sdb3.txt");*/
			int tr_meet = 1;
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

							for (int i = 0; i < splitedStr.length; i++) {
								splitedStr[i] = splitedStr[i].trim();

							}
						
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
							}
						}
						reader.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/trainer/20190728pdb3.txt");
		/*	URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/busan/trainer/"+yyyyMMdd+"pdb3.txt");*/
			int tr_meet = 3;
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

							for (int i = 0; i < splitedStr.length; i++) {
								splitedStr[i] = splitedStr[i].trim();

							}
						
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
							}
						}
						reader.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/trainer/20190727cdb3.txt");
		/*	URL	url = new URL("http://race.kra.co.kr/dbdata/fileDownLoad.do?fn=internet/jeju/trainer/"+yyyyMMdd+"cdb3.txt");*/
			int tr_meet = 2;
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

							for (int i = 0; i < splitedStr.length; i++) {
								splitedStr[i] = splitedStr[i].trim();

							}
						
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
							}
						}
						reader.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//조교사 끝
		
		
		}

}
