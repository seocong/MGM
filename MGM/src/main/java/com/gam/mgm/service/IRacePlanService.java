package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.RacePlanDto;

public interface IRacePlanService {

	public boolean rcPlanInsert(RacePlanDto raceplan);
	
	public boolean resetTable();
	
	public boolean resetSeq();

	public List<RacePlanDto> getList(int rp_meet);
}
