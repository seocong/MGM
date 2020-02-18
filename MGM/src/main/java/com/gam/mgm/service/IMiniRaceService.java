package com.gam.mgm.service;

import java.util.Map;

import com.gam.mgm.dto.MiniRaceDto;

public interface IMiniRaceService {
	public MiniRaceDto latelyResult();
	public MiniRaceDto yearResult();
	public MiniRaceDto weekResult();
	public MiniRaceDto todayResult();
	public boolean insertResult(Map<String,Integer> resultMap);
}
