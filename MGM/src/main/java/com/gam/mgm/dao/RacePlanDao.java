package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RacePlanitemDto;

@Repository
public class RacePlanDao implements IRacePlanDao{
	private String namespace = "com.gam.race.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public boolean racePlanInput(RacePlanitemDto racePlans) {
		return sqlSession.insert(namespace+"raceplan",racePlans)>0?true:false;
	}

}
