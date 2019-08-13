package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RacePlanDto;

@Repository
public class RacePlanDao implements IRacePlanDao{
	private String namespace = "com.gam.racePlan.";
	@Autowired
	SqlSessionTemplate sqlSession;
	@Override
	public boolean rcPlanInsert(RacePlanDto raceplan) {
		int isS = sqlSession.insert(namespace+"rcPlanInsert",raceplan);
		return isS>0?true:false;
	}

	@Override
	public boolean resetTable() {
		return sqlSession.delete(namespace+"resetTable")>0?true:false;
	}

	@Override
	public boolean resetSeq() {
		return sqlSession.update(namespace+"resetSeq")>0?true:false;
	}
}
