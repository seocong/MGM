package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.AnswerDto;

public interface IAnswerService {

	int selectAnswerPaging();

	List<AnswerDto> getAllList(Map<String, Object> map);

}
