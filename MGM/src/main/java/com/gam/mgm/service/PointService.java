package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<PointDto> selectPoint(Map<String, Object> map) {
		return pointDao.selectPoint(map);
	}

	@Override
	public int pointCount(String id) {
		return pointDao.pointCount(id);
	}	
}
