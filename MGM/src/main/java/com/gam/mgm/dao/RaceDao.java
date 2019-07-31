package com.gam.mgm.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RaceDao implements IRaceDao{
	private String namespace = "com.gam.race.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public boolean raceScheduleInput(Map<String,Object> raceSchedule) {
		return sqlSession.insert(namespace+"schInsert",raceSchedule)>0?true:false;
	}
	@Override
	public boolean raceSchAllDel() {
		return sqlSession.delete(namespace+"scheduleAllDel")>0?true:false;
	}
}
