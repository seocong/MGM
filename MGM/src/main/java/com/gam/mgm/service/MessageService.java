package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IMessageDao;
import com.gam.mgm.dto.MessageDto;

@Service
public class MessageService implements IMessageService{
	@Autowired
	private IMessageDao messageDao;

	@Override
	public List<MessageDto> msgList(Map<String,Object> map) {
		return messageDao.msgList(map);
	}
	@Override
	public double msgCount(String id) {
		return messageDao.msgCount(id);
	}
	@Override
	public List<MessageDto> msgSendList(Map<String,Object> map) {
		return messageDao.msgSendList(map);
	}
	@Override
	public double msgSendCount(String id) {
		return messageDao.msgSendCount(id);
	}
	@Override
	public boolean msgSend(MessageDto dto) {
		return messageDao.msgSend(dto);
	}

	@Override
	public MessageDto msgDetail(MessageDto dto) {
		return messageDao.msgDetail(dto);
	}

	@Override
	public boolean msgSDel(Map<String,String> map) {
		return messageDao.msgSDel(map);
	}

	@Override
	public boolean msgRDel(Map<String,String> map) {
		return messageDao.msgRDel(map);
	}

	@Override
	public boolean msgSRead(Map<String,String> map) {
		return messageDao.msgSRead(map);
	}

	@Override
	public boolean msgRRead(Map<String,String> map) {
		return messageDao.msgRRead(map);
	}
	@Override
	public int msgTotalCount(String id) {
		return messageDao.msgTotalCount(id);
	}
	
}
