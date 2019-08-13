package com.gam.mgm.dao;

import com.gam.mgm.dto.RaceEntryDto;

public interface IRaceEntryDao {
	public boolean rcEntryInsert(RaceEntryDto raceentry);

	public boolean resetTable();

	public boolean resetSeq();
}
