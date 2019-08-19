package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.RaceEntryDto;

public interface IRaceEntryService {
	public boolean rcEntryInsert(RaceEntryDto raceentry);

	public boolean resetTable();

	public boolean resetSeq();

	public List<RaceEntryDto> getList(Map<String, Object> map);

	public int getAllCnt(int re_meet);

	public RaceEntryDto getDetail(Map<String, Object> map);

	public List<RaceEntryDto> getDetailList(Map<String, Object> map);
}
