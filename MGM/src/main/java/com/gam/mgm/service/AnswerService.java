package com.gam.mgm.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IAnswerDao;
import com.gam.mgm.dto.AnswerDto;

@Service
public class AnswerService implements IAnswerService{
	@Autowired
	private IAnswerDao answerDao;
	
	 @Override
	public int selectAnswerPaging() {
		return answerDao.selectAnswerPaging();
	}

	@Override
	public List<AnswerDto> getAllList(Map<String, Object> map) {
		return answerDao.getAllList(map);
	}
	
}
