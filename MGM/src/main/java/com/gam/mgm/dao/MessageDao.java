package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDao implements IMessageDao {
	private String namespace = "com.gam.Message.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
}
