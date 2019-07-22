package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IPointDao;
import com.gam.mgm.dto.PointDto;

@Service
public class PointService implements IPointService{
	@Autowired
	private IPointDao pointDao;

	@Override
	public boolean insertPoint(PointDto pointDto) {
		return pointDao.insertPoint(pointDto);
	}	
}
