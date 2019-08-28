package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IChannelDao;
import com.gam.mgm.dto.YoutubeDto;


@Service
public class ChannelService implements IChannelService{
	@Autowired
	private IChannelDao channelDao;

	@Override
	public int selectTotalPaging() {
		return channelDao.selectTotalPaging();
	}

	@Override
	public List<YoutubeDto> getAllList(Map<String, Object> map) {
		return channelDao.getAllList(map);
	}

	@Override
	public boolean ytInsert(Map<String, Object> map) {
		return channelDao.ytInsert(map);
	}
}
