package com.gam.mgm.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	/*@Scheduled(cron = "0 55 16 ? * SUN,THU")*/
	@Scheduled(cron = "0 30 19 ? * WED,THU,SAT,SUN")
	public void basicInfo() {
		InfoMethod info = new InfoMethod();
		info.trainer();
		info.jockey();
		info.owner();
		info.horses();
	}
	
	@Scheduled(cron = "0 30 19 ? * WED,THU,SAT")
	public void raceEntry() {
		System.out.println("출전등록마필");
		InfoMethod info = new InfoMethod();
		info.raceEntry();
	}
	
	@Scheduled(cron = "0 30 16 ? * WED,THU")
	public void racePlan() {
		System.out.println("출전상세정보");
		InfoMethod info = new InfoMethod();
		info.racePlan();
	}
	
	@Scheduled(cron = "0 0 19 ? * FRI,SAT,SUN")
	public void raceresult() {
		System.out.println("경주성적표");
		InfoMethod info = new InfoMethod();
		info.raceInfo();
		info.raceResult();
	}
}
