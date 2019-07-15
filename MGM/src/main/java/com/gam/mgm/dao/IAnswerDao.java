package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.AnswerDto;

public interface IAnswerDao {

	int selectAnswerPaging();

	List<AnswerDto> getAllList(Map<String, Object> map);

}
