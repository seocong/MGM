package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IJockeyDao;
import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RaceTotalPrizeDto;
import com.gam.mgm.dto.RecordInfoDto;

@Service
public class JockeyService implements IJockeyService{
	@Autowired
	private IJockeyDao jokeyDao;
	@Override
	public boolean jkInsert(JockeyDto jokeyDto) {
		return jokeyDao.jkInsert(jokeyDto);
	}

	@Override
	public boolean jkDel(int jk_meet) {
		return jokeyDao.jkDel(jk_meet);
	}

	@Override
	public List<JockeyDto> getAllList(int jk_meet) {
		return jokeyDao.getAllList(jk_meet);
	}

	@Override
	public JockeyDto getKisu(String jk_no) {
		return jokeyDao.getKisu(jk_no);
	}

	@Override
	public boolean jkUpdate(String jkno) {
		return jokeyDao.jkUpdate(jkno);
	}

	@Override
	public List<RecordInfoDto> recordInfo(String jk_no) {
		return jokeyDao.recordInfo(jk_no);
	}
	
	@Override
	public List<RaceTotalPrizeDto> rtPrize(String jk_no){
		return jokeyDao.rtPrize(jk_no);
	}

	@Override
	public List<ChampionDto> selChampion(String jk_name) {
		// TODO Auto-generated method stub
		return jokeyDao.selChampion(jk_name);
	}

	@Override
	public boolean meetDel(int meet) {
		return jokeyDao.meetDel(meet);
	}
}
