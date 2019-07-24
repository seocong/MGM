package com.gam.mgm.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public boolean ansupdate(AnswerDto dto) {
		return answerDao.ansupdate(dto);
	}

	@Override
	public boolean ansdelete(int answerboard_seq) {
		return answerDao.ansdelete(answerboard_seq);
	}
	
	@Transactional
	@Override
	public boolean ansinsertReply(Map<String, Object> map) {
		answerDao.ansReplyUpdate((int) map.get("seq"));
		System.out.println("seq                                                        :"+(int) map.get("seq"));
		int cnt = answerDao.ansinsertReply(map);
		return cnt>0?true:false;
	}
	
}
