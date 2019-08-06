package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IJockeyDao;
import com.gam.mgm.dto.JockeyDto;

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
	public JockeyDto getKisu(String jk_name) {
		return jokeyDao.getKisu(jk_name);
	}

	@Override
	public boolean jkUpdate(int jkno) {
		return jokeyDao.jkUpdate(jkno);
	}
}
