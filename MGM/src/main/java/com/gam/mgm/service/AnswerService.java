package com.gam.mgm.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IAnswerDao;

@Service
public class AnswerService implements IAnswerService{
	@Autowired
	private IAnswerDao answerDao;
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	
}
