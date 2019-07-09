package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IChannelDao;

@Service
public class ChannelService implements IChannelService{
	@Autowired
	private IChannelDao channelDao;
}
