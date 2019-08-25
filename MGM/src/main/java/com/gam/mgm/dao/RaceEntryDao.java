package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

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
	public boolean resetTable(int meet) {
		return sqlSession.delete(namespace+"resetTable",meet)>0?true:false;
	}

	@Override
	public boolean resetSeq() {
		return sqlSession.update(namespace+"resetSeq")>0?true:false;
	}

	@Override
	public List<RaceEntryDto> getList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getlist", map);
	}

	@Override
	public int getAllCnt(int re_meet) {
		return sqlSession.selectOne(namespace+"getCnt", re_meet);
	}

	@Override
	public RaceEntryDto getDetail(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"getDetail", map);
	}

	@Override
	public List<RaceEntryDto> getDetailList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getDetailList", map);
	}
}
