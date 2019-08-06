package com.gam.mgm.service;

import java.util.Map;

import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;

public interface IRaceService {
	public boolean raceScheduleInput(Map<String,Object> raceSchedule);
	public boolean raceSchAllDel();
	public boolean raceResultInput(RaceResultDto rsDto);
	//경주개요
	public boolean raceInfoInput(RaceInfoDto riDto);
}
