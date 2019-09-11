package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.PointDto;

public interface IPointService {
	public boolean insertPoint(PointDto pointDto);
	public List<PointDto> selectPoint(Map<String,Object> map);
	public int pointCount(String id);
	public int addPoint(String id);
}
