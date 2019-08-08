package com.gam.mgm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RecordInfoDto;

@Repository
public class JockeyDao implements IJockeyDao{
	private String namespace = "com.gam.jockey.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public boolean jkInsert(JockeyDto jockeyDto) {
		int cnt = sqlSession.insert(namespace+"jkinsert", jockeyDto);
		return cnt>0?true:false;
	}
	
	@Override
	public boolean jkDel(int jk_meet) {
		int cnt = sqlSession.delete(namespace+"jkdel",jk_meet);
		return cnt>0?true:false;
	}

	@Override
	public List<JockeyDto> getAllList(int jk_meet) {
		return sqlSession.selectList(namespace+"getList",jk_meet);
	}

	@Override
	public JockeyDto getKisu(String jk_name) {		
		return sqlSession.selectOne(namespace+"getkisu", jk_name);
	}

	@Override
	public boolean jkUpdate(int jkno) {
		int rs = sqlSession.update(namespace+"jkUpdate");
		return rs>0?true:false;
	}

	@Override
	public List<RecordInfoDto> recordInfo(int jkno) {
		return sqlSession.selectList(namespace+"recordInfo",jkno);
	}
}
