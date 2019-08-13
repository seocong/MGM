package com.gam.mgm.dao;

import com.gam.mgm.dto.RacePlanDto;

public interface IRacePlanDao {
	
	public boolean rcPlanInsert(RacePlanDto raceplan);
	
	public boolean resetTable();
	
	public boolean resetSeq();
}
