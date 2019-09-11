package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.PointDto;

@Repository
public class ManagerDao implements IManagerDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="com.gam.mgm.manager.";
	@Override
	public List<MemberDto> memberList(Map<String,Object> map) {
		return sqlSession.selectList(namespace+"memberList",map);
	}
	@Override
	public List<BoardDto> boardList(Map<String,Object> map) {
		return sqlSession.selectList(namespace+"boardList",map);
	}
	@Override
	public List<PointDto> pointList(Map<String,Object> map) {
		return sqlSession.selectList(namespace+"pointList",map);
	}
	@Override
	public List<PointDto> userPoint(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"userPoint",map);
	}
	@Override
	public boolean pointPlus(Map<String, Object> map) {
		int is = sqlSession.insert(namespace+"pointPlus",map);
		return is>0?true:false;
	}
	@Override
	public boolean memberDel(String id) {
		int is = sqlSession.update(namespace+"memberDel",id);
		return is>0?true:false;
	}
	@Override
	public boolean boardDel(int seq) {
		int is = sqlSession.update(namespace+"boardDel",seq);
		return is>0?true:false;
	}
	@Override
	public boolean pointDel(int seq) {
		int is = sqlSession.update(namespace+"pointDel",seq);
		return is>0?true:false;
	}
	@Override
	public int memberCount(Map<String,Object> map) {
		return sqlSession.selectOne(namespace+"memberCount",map);
	}
	@Override
	public int boardCount(Map<String,Object> map) {
		return sqlSession.selectOne(namespace+"boardCount",map);
	}
	@Override
	public int pointCount(Map<String,Object> map) {
		return sqlSession.selectOne(namespace+"pointCount",map);
	}
	@Override
	public List<String> allMember(){
		return sqlSession.selectList(namespace+"allMember");
	}
}
