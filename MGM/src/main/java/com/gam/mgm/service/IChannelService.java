package com.gam.mgm.service;

import java.util.List;
import java.util.Map;


import com.gam.mgm.dto.YoutubeDto;

public interface IChannelService {

	public int selectTotalPaging();

	public List<YoutubeDto> getAllList(Map<String, Object> map);

	public boolean ytInsert(Map<String, Object> map);

}
