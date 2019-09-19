package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IRaceDao;
import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceRefreeDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.vo.RaceRefreeVo;
import com.gam.mgm.vo.RaceSectionRecordVo;
import com.gam.mgm.vo.RaceSummaryResultVo;

@Service
public class RaceService implements IRaceService{
	@Autowired
	private IRaceDao raceDao;

	@Override
	public boolean raceScheduleInput(Map<String,Object> raceSchedule) {
		return raceDao.raceScheduleInput(raceSchedule);
	}

	@Override
	public boolean raceSchAllDel() {
		return raceDao.raceSchAllDel();
	}

	@Override
	public boolean raceResultInput(RaceResultDto rsDto) {
		// TODO Auto-generated method stub
		return raceDao.raceResultInput(rsDto);
	}
	//경주개요
	@Override
	public boolean raceInfoInput(RaceInfoDto riDto) {
		return raceDao.raceInfoInput(riDto);
	}

	@Override
	public List<RaceInfoDto> getCntList(Map<String, Object> map) {
		return raceDao.getCntList(map);
	}

	@Override
	public int getAllCnt(int ri_meet) {
		return raceDao.getAllCnt(ri_meet);
	}

	@Override
	public RaceInfoDto getRiDetail(Map<String, Object> map) {
		return raceDao.getRiDetail(map);
	}

	@Override
	public List<RaceResultDto> getRrDetail(Map<String, Object> map) {
		return raceDao.getRrDetail(map);
	}

	@Override
	public List<RaceInfoDto> getRacePaging(Map<String, Object> map) {
		return raceDao.getRacePaging(map);
	}

	@Override
	public boolean raceInfoUpdate1(RaceSummaryResultVo.Body.Item riDto) {
		return raceDao.raceInfoUpdate1(riDto);
	}

	@Override
	public boolean raceInfoUpdate2(RaceSectionRecordVo.Body.Item riDto) {
		// TODO Auto-generated method stub
		return raceDao.raceInfoUpdate2(riDto);
	}

	@Override
	public boolean refreeInsert(RaceRefreeVo.Body.Item rfDto) {
		return raceDao.refreeInsert(rfDto);
	}

	@Override
	public List<RaceRefreeDto> selRefree(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return raceDao.selRefree(map);
	}

	@Override
	public boolean rcResultDel(int meet) {
		// TODO Auto-generated method stub
		return raceDao.rcResultDel(meet);
	}

	@Override
	public boolean rcInfoDel(int meet) {
		return raceDao.rcInfoDel(meet);
	}

	@Override
	public String maxDate(int meet) {
		return raceDao.maxDate(meet);
	}

	@Override
	public List<Map<String, String>> mainInfo(Map<String, String> map) {
		return raceDao.mainInfo(map);
	}

	@Override
	public List<String> mainInfoDate() {
		return raceDao.mainInfoDate();
	}
	
	
}
