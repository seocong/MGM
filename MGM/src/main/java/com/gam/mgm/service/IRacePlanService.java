package com.gam.mgm.service;

import com.gam.mgm.dto.RacePlanDto;

public interface IRacePlanService {

	public boolean rcPlanInsert(RacePlanDto raceplan);
	
	public boolean resetTable();
	
	public boolean resetSeq();
}
