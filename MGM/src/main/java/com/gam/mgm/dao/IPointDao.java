package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.PointDto;

public interface IPointDao {
	public boolean insertPoint(PointDto pointDto);
	public List<PointDto> selectPoint(Map<String,Object> map);
	public int pointCount(String id);
}
