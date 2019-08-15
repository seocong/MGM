package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.RacePlanDto;

public interface IRacePlanDao {
	
	public boolean rcPlanInsert(RacePlanDto raceplan);
	
	public boolean resetTable();
	
	public boolean resetSeq();

	public List<RacePlanDto> getList(int rp_meet);
}
