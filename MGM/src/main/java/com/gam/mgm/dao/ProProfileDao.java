package com.gam.mgm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.ProProfileDto;

@Repository
public class ProProfileDao implements IProProfileDao {
	private String namespace = "com.gam.Pro.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	@Override
	public List<ProProfileDto> proSimple(){
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"proSimple");
	}
	@Override
	public ProProfileDto proDetail(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"proDetail");
	}
}
