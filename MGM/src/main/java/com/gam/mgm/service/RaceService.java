package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRaceDao;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;

@Service
public class RaceService implements IRaceService{
	@Autowired
	private IRaceDao raceDao;

	@Override
	public boolean raceScheduleInput(Map<String,Object> raceSchedule) {
		return raceDao.raceScheduleInput(raceSchedule);
	}

	@Override
	public boolean raceSchAllDel() {
		return raceDao.raceSchAllDel();
	}

	@Override
	public boolean raceResultInput(RaceResultDto rsDto) {
		// TODO Auto-generated method stub
		return raceDao.raceResultInput(rsDto);
	}
	//경주개요
	@Override
	public boolean raceInfoInput(RaceInfoDto riDto) {
		return raceDao.raceInfoInput(riDto);
	}

	@Override
	public List<RaceInfoDto> getCntList(Map<String, Object> map) {
		return raceDao.getCntList(map);
	}

	@Override
	public int getAllCnt(int ri_meet) {
		return raceDao.getAllCnt(ri_meet);
	}

	@Override
	public RaceInfoDto getRiDetail(Map<String, Object> map) {
		return raceDao.getRiDetail(map);
	}

	@Override
	public List<RaceResultDto> getRrDetail(Map<String, Object> map) {
		return raceDao.getRrDetail(map);
	}
	
	
}
