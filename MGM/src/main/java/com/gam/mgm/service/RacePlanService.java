package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRacePlanDao;
import com.gam.mgm.dto.RaceHistoryDto;
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

	@Override
	public int maxRcNo(Map<String, Object> map) {
		return rcPlanDao.maxRcNo(map);
	}

	@Override
	public List<RaceHistoryDto> racePlanCount(Map<String, Object> map) {
		return rcPlanDao.racePlanCount(map);
	}

	@Override
	public List<RaceHistoryDto> planList(Map<String, Object> map) {
		return rcPlanDao.planList(map);
	}

	@Override
	public List<RacePlanDto> selRcDate(int meet) {
		return rcPlanDao.selRcDate(meet);
	}

	@Override
	public String minDate(int meet) {
		return rcPlanDao.minDate(meet);
	}

}
