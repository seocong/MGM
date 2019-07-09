package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PointDao implements IPointDao {
	private String namespace = "com.gam.Point.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
}
