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

	@Override
	public boolean ansinsert(AnswerDto dto) {
		return answerDao.ansinsert(dto);
	}

	@Override
	public String checkedMember(int answerboard_seq) {
		return answerDao.checkedMember(answerboard_seq);
	}

	@Override
	public AnswerDto getAnsboard(int answerboard_seq) {
		return answerDao.getAnsboard(answerboard_seq);
	}
	
}
