package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.AnswerDto;

public interface IAnswerService {

	public int selectAnswerPaging();

	public List<AnswerDto> getAllList(Map<String, Object> map);

	public boolean ansinsert(AnswerDto dto);

	public String checkedMember(int answerboard_seq);

	public AnswerDto getAnsboard(int answerboard_seq);

	public boolean ansupdate(AnswerDto dto);

	public boolean ansdelete(int answerboard_seq);

	public boolean ansinsertReply(Map<String, Object> map);

}
