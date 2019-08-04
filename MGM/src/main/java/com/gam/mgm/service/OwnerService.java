package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IOwnerDao;
import com.gam.mgm.dto.OwnerDto;

@Service
public class OwnerService implements IOwnerService{
	@Autowired
	private IOwnerDao jokeyDao;
	@Override
	public boolean owInsert(OwnerDto ownerDto) {
		return jokeyDao.owInsert(ownerDto);
	}

	@Override
	public boolean owDel(int ow_meet) {
		return jokeyDao.owDel(ow_meet);
	}

	@Override
	public List<OwnerDto> getAllList(int ow_meet) {
		return jokeyDao.getAllList(ow_meet);
	}

}
