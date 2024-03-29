package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.AnswerDto;

public interface IAnswerDao {

	public int selectAnswerPaging();

	public List<AnswerDto> getAllList(Map<String, Object> map);

	public boolean ansinsert(AnswerDto dto);

	public String checkedMember(int answerboard_seq);

	public AnswerDto getAnsboard(int answerboard_seq);

	public boolean ansupdate(AnswerDto dto);

	public boolean ansdelete(int answerboard_seq);

	public int ansinsertReply(Map<String, Object> map);

	public int ansReplyUpdate(int seq);

}
