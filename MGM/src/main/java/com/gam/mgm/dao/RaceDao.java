package com.gam.mgm.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceResultDto;

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
	@Override
	public boolean raceResultInput(RaceResultDto rsDto) {
		boolean rs = sqlSession.insert(namespace+"rcResultInsert",rsDto)>0?true:false;
		return rs;
	}
	@Override
	public boolean raceInfoInput(RaceInfoDto riDto) {
		boolean rs = sqlSession.insert(namespace+"rcInfoInsert",riDto)>0?true:false;
		return rs;
	}
	
}
