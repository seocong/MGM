package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gam.mgm.dao.IChannelDao;
import com.gam.mgm.dto.YoutubeDto;
import com.gam.mgm.dto.YtCommentDto;


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

	@Override
	public List<YtCommentDto> replyList(int ytNum) {
		return channelDao.replyList(ytNum);
	}

	@Override
	public YoutubeDto getYoutube(int ytNum) {
		return channelDao.getYoutube(ytNum);
	}

	@Override
	public boolean ytCommentInsert(Map<String, Object> map) {
		return channelDao.ytCommentInsert(map);
	}
	
}
