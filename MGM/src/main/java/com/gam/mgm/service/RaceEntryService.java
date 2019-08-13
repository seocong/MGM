package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRaceEntryDao;
import com.gam.mgm.dto.RaceEntryDto;
@Service
public class RaceEntryService implements IRaceEntryService{
	@Autowired
	private IRaceEntryDao rcEntryDao;
	
	@Override
	public boolean rcEntryInsert(RaceEntryDto raceentry) {
		return rcEntryDao.rcEntryInsert(raceentry);
	}

	@Override
	public boolean resetTable() {
		return rcEntryDao.resetTable();
	}

	@Override
	public boolean resetSeq() {
		// TODO Auto-generated method stub
		return rcEntryDao.resetSeq();
	}
}
