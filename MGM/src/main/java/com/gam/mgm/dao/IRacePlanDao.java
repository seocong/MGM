package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.RaceHistoryDto;
import com.gam.mgm.dto.RacePlanDto;

public interface IRacePlanDao {

	public boolean rcPlanInsert(RacePlanDto raceplan);

	public boolean resetTable();

	public boolean resetSeq();

	public List<RacePlanDto> getList(int rp_meet);

	public RacePlanDto getDetail(Map<String, Object> map);

	public List<RacePlanDto> getDetailList(Map<String, Object> map);

	public List<RacePlanDto> roundlist(Map<String, Object> map);

	public int maxRcNo(Map<String,Object> map);

	public List<RaceHistoryDto> racePlanCount(Map<String,Object> map);

	public List<RaceHistoryDto> planList(Map<String,Object> map);
	
	public List<RacePlanDto> selRcDate(int meet);
}
