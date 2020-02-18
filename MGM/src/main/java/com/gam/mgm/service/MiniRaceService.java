package com.gam.mgm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.MiniRaceDao;
import com.gam.mgm.dto.MiniRaceDto;

@Service
public class MiniRaceService implements IMiniRaceService{
	@Autowired
	private MiniRaceDao miniRaceDao;

	@Override
	public MiniRaceDto latelyResult() {
		return miniRaceDao.latelyResult();
	}

	@Override
	public MiniRaceDto yearResult() {
		return miniRaceDao.yearResult();
	}

	@Override
	public MiniRaceDto weekResult() {
		return miniRaceDao.weekResult();
	}

	@Override
	public MiniRaceDto todayResult() {
		return miniRaceDao.todayResult();
	}

	@Override
	public boolean insertResult(Map<String, Integer> resultMap) {
		return miniRaceDao.insertResult(resultMap);
	}
}
