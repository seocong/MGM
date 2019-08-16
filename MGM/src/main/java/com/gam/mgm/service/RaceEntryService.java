package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<RaceEntryDto> getList(Map<String, Object> map) {
		return rcEntryDao.getList(map);
	}

	@Override
	public int getAllCnt(int re_meet) {
		return rcEntryDao.getAllCnt(re_meet);
	}

	@Override
	public RaceEntryDto getDetail(Map<String, Object> map) {
		return rcEntryDao.getDetail(map);
	}

	@Override
	public List<RaceEntryDto> getDetailList(Map<String, Object> map) {
		return rcEntryDao.getDetailList(map);
	}
}
