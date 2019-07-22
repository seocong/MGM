package com.gam.mgm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.PointDto;

@Repository
public class PointDao implements IPointDao {
	private String namespace = "com.gam.Point.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	@Override
	public boolean insertPoint(PointDto pointDto) {
			int success = sqlSession.insert(namespace+"insertPoint",pointDto);
		return success>0?true:false;
	}
	@Override
	public List<PointDto> selectPoint(String uid) {
		return sqlSession.selectList(namespace+"selectPoint",uid);
	}
}
