package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;


import com.gam.mgm.dto.YoutubeDto;

public interface IChannelDao {

	public int selectTotalPaging();

	public List<YoutubeDto> getAllList(Map<String, Object> map);

	public boolean ytInsert(Map<String, Object> map);

}
