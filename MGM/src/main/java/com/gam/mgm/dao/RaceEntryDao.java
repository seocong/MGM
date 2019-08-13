package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RaceEntryDto;
@Repository
public class RaceEntryDao implements IRaceEntryDao{
	private String namespace = "com.gam.raceEntry.";
	@Autowired
	SqlSessionTemplate sqlSession;
	@Override
	public boolean rcEntryInsert(RaceEntryDto raceentry) {
		int isS = sqlSession.insert(namespace+"rcEntryInsert",raceentry);
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
