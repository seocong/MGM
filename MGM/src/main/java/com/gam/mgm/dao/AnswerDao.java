package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDao  implements IAnswerDao {
	private String namespace = "com.gam.Answer.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;

}
