package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.PointDto;

public interface IPointDao {
	public boolean insertPoint(PointDto pointDto);
	public List<PointDto> selectPoint(String uid);
}
