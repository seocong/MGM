package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.AnswerDto;

public interface IAnswerDao {

	public int selectAnswerPaging();

	public List<AnswerDto> getAllList(Map<String, Object> map);

	public boolean ansinsert(AnswerDto dto);

}
