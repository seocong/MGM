package com.gam.mgm.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.MemberDto;

@Repository
public class MemberDao implements IMemberDao {
	private String namespace = "com.gam.Member.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	 //회원가입
	@Override
	public boolean signUp(MemberDto dto) {
		int success = sqlSession.insert(namespace+"signup",dto);
		return success>0?true:false;
	}
	@Override
	public MemberDto login(Map<String,String> member) {
		return sqlSession.selectOne(namespace+"login",member);
	}
}
