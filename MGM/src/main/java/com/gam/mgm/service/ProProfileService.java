package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.ProProfileDao;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.ProProfileDto;

@Service
public class ProProfileService implements IProProfileService{
	@Autowired
	private ProProfileDao profileDao;
	@Override
	public List<ProProfileDto> proSimple() {
		// TODO Auto-generated method stub
		return profileDao.proSimple();
	}

	@Override
	public ProProfileDto proDetail(String id) {
		// TODO Auto-generated method stub
		return profileDao.proDetail(id);
	}
	
}
