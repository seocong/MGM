package com.gam.mgm.dao;

import java.util.Map;

import com.gam.mgm.dto.MiniRaceDto;

public interface IMiniRaceDao {
	public MiniRaceDto latelyResult();
	public MiniRaceDto yearResult();
	public MiniRaceDto weekResult();
	public MiniRaceDto todayResult();
	public boolean insertResult(Map<String,Integer> resultMap);
}
