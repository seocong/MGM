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
	public MemberDto login(Map<String,String> uid) {
		return sqlSession.selectOne(namespace+"login",uid);
	}
	@Override
	public MemberDto myPage(String uid) {
		return sqlSession.selectOne(namespace+"mypage",uid);
	}
	@Override
	public boolean withdrawal(String uid) {
		int success = sqlSession.update(namespace+"withdrawal",uid);
		return success>0?true:false;
	}
	@Override
	public boolean idCheck(String id) {
		int check = sqlSession.selectOne(namespace+"idCheck",id);
		return check==0?true:false;
	}
	@Override
	public boolean phCheck(String ph) {
		int check = sqlSession.selectOne(namespace+"phCheck",ph);
		return check==0?true:false;
	}
	@Override
	public MemberDto updateSearch(String id) {
		return sqlSession.selectOne(namespace+"updateSearch",id);
	}
}
