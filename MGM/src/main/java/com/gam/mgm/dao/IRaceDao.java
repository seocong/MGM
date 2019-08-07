package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;

public interface IRaceDao {
	public boolean raceScheduleInput(Map<String,Object> raceSchedule);
	public boolean raceSchAllDel();
	public boolean raceResultInput(RaceResultDto rsDto);
	//경주개요
	public boolean raceInfoInput(RaceInfoDto riDto);
	
	public List<RaceInfoDto> getCntList(Map<String, Object> map);
	
	public int getAllCnt(int ri_meet);
	
	public RaceInfoDto getRiDetail(Map<String, Object> map);
	
	public List<RaceResultDto> getRrDetail(Map<String, Object> map);
	
}
