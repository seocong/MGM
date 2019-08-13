package com.gam.mgm.service;

import com.gam.mgm.dto.RaceEntryDto;

public interface IRaceEntryService {
	public boolean rcEntryInsert(RaceEntryDto raceentry);

	public boolean resetTable();

	public boolean resetSeq();
}
