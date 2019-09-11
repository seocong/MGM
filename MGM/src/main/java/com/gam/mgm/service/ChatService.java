package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IChatDao;
import com.gam.mgm.dto.ChatDto;

@Service
public class ChatService implements IChatService{
	@Autowired
	private IChatDao chatdao;
	@Override
	public List<ChatDto> chatlog() {
		return chatdao.chatlog();
	}

	@Override
	public boolean insertlog(ChatDto dto) {
		return chatdao.insertlog(dto);
	}

	@Override
	public boolean logdel() {
		return chatdao.logdel();
	}

	@Override
	public boolean logreset() {
		return chatdao.logreset();
	}
}
