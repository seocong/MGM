package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRacePlanDao;
import com.gam.mgm.dto.RacePlanDto;

@Service
public class RacePlanService implements IRacePlanService {
	@Autowired
	private IRacePlanDao rcPlanDao;
	
	@Override
	public boolean rcPlanInsert(RacePlanDto raceplan) {
		return rcPlanDao.rcPlanInsert(raceplan);
	}

	@Override
	public boolean resetTable() {
		return rcPlanDao.resetTable();
	}

	@Override
	public boolean resetSeq() {
		// TODO Auto-generated method stub
		return rcPlanDao.resetSeq();
	}

	@Override
	public List<RacePlanDto> getList(int rp_meet) {
		return rcPlanDao.getList(rp_meet);
	}

	@Override
	public RacePlanDto getDetail(Map<String, Object> map) {
		return rcPlanDao.getDetail(map);
	}

	@Override
	public List<RacePlanDto> getDetailList(Map<String, Object> map) {
		return rcPlanDao.getDetailList(map);
	}

	@Override
	public List<RacePlanDto> roundlist(Map<String, Object> map) {
		return rcPlanDao.roundlist(map);
	}

}
