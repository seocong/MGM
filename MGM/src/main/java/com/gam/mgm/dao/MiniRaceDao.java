package com.gam.mgm.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.MiniRaceDto;

@Repository
public class MiniRaceDao implements IMiniRaceDao{
	private String namespace = "com.gam.mgm.minirace.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public MiniRaceDto latelyResult() {
		return sqlSession.selectOne(namespace+"latelyResult");
	}
	@Override
	public MiniRaceDto yearResult() {
		return sqlSession.selectOne(namespace+"yearResult");
	}
	@Override
	public MiniRaceDto weekResult() {
		return sqlSession.selectOne(namespace+"weekResult");
	}
	@Override
	public MiniRaceDto todayResult() {
		return sqlSession.selectOne(namespace+"todayResult");
	}
	@Override
	public boolean insertResult(Map<String, Integer> resultMap) {
		int is = sqlSession.insert(namespace+"insertResult",resultMap);
		return is>0?true:false;
	}
}
