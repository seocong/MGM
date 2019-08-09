package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IJockeyDao;
import com.gam.mgm.dto.JockeyDto;
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
	public List<RecordInfoDto> recordInfo(String jkno) {
		return jokeyDao.recordInfo(jkno);
	}
}
