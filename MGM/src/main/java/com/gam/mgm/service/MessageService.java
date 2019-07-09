package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IMessageDao;

@Service
public class MessageService implements IMessageService{
	@Autowired
	private IMessageDao messageDao;
}
