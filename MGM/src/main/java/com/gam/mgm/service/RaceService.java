package com.gam.mgm.service;

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
	
	
}
