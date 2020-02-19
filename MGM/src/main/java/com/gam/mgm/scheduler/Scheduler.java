package com.gam.mgm.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gam.mgm.UserController;
import com.gam.mgm.service.IChatService;

@Component
public class Scheduler {
	private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);
	@Autowired
	private IChatService chatService;
	/*@Scheduled(cron = "0 55 16 ? * SUN,THU")*/
////	@Scheduled(cron = "0 30 19 ? * WED,THU,SAT,SUN")
//	@Scheduled(cron = "0 25 22 ? * WED,THU,SAT,SUN")
//	public void basicInfo() {
//		InfoMethod info = new InfoMethod();
//		info.trainer();
//		info.jockey();
//		info.owner();
//		info.horses();
//	}
//	
////	@Scheduled(cron = "0 30 19 ? * WED,THU,SAT")
//	@Scheduled(cron = "0 28 22 ? * WED,THU,SAT")
//	public void raceEntry() {
//		System.out.println("출전등록마필");
//		InfoMethod info = new InfoMethod();
//		info.raceEntry();
//	}
//	
////	@Scheduled(cron = "0 30 16 ? * WED,THU")
//	@Scheduled(cron = "0 29 22 ? * WED,THU")
//	public void racePlan() {
//		System.out.println("출전상세정보");
//		InfoMethod info = new InfoMethod();
//		info.racePlan();
//	}
//	
////	@Scheduled(cron = "0 0 19 ? * FRI,SAT,SUN")
//	@Scheduled(cron = "0 30 22 ? * FRI,SAT,SUN")
//	public void raceresult() {
//		System.out.println("경주성적표");
//		InfoMethod info = new InfoMethod();
//		info.raceInfo();
//		info.raceResult();
//	}
	@Transactional
	@Scheduled(cron = "0 0 8 ? * *")
	public void chatReset() {
		System.out.println("채팅리셋");
		boolean is = chatService.logdel();
		boolean is2 = chatService.logreset();
		if(is&&is2) {
			System.out.println("채팅 삭제 완료");
		}else if(is&&!is2){
			logger.info("채팅 seq 리셋 실패");
		}else if(!is&&is2){
			logger.info("채팅 전체 삭제 실패");
		}
	}
}
