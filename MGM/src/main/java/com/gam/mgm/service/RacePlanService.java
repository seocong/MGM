package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRacePlanDao;
import com.gam.mgm.dto.RacePlanDto;

@Service
public class RacePlanService implements IRacePlanService {
	@Autowired
	private IRacePlanDao rcPlanDao;
	
	@Override
	public boolean rcPlanInsert(RacePlanDto raceplan) {
		return rcPlanDao.rcPlanInsert(raceplan);
	}

	@Override
	public boolean resetTable() {
		return rcPlanDao.resetTable();
	}

	@Override
	public boolean resetSeq() {
		// TODO Auto-generated method stub
		return rcPlanDao.resetSeq();
	}

}
