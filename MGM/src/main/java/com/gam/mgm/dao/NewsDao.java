package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NewsDao implements INewsDao {
	private String namespace = "com.gam.News.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
}
