package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IOwnerDao;
import com.gam.mgm.dto.OwnerDto;

@Service
public class OwnerService implements IOwnerService{
	@Autowired
	private IOwnerDao ownerDao;
	@Override
	public boolean owInsert(OwnerDto ownerDto) {
		return ownerDao.owInsert(ownerDto);
	}

	@Override
	public boolean owDel(int ow_meet) {
		return ownerDao.owDel(ow_meet);
	}

	@Override
	public List<OwnerDto> getAllList(int ow_meet) {
		return ownerDao.getAllList(ow_meet);
	}

	@Override
	public OwnerDto getOwner(Map<String, Object> map) {
		return ownerDao.getOwner(map);
	}

	

}
