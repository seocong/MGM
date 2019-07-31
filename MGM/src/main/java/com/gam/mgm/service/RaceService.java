package com.gam.mgm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRaceDao;

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
}
