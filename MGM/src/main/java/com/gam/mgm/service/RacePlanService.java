package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRacePlanDao;
import com.gam.mgm.dto.RacePlanitemDto;

@Service
public class RacePlanService implements IRacePlanService{
	@Autowired
	private IRacePlanDao racePlanDao;

	@Override
	public boolean racePlanInput(RacePlanitemDto racePlans) {
		return racePlanDao.racePlanInput(racePlans);
	}
}
