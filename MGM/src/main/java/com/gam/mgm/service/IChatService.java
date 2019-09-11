package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.ChatDto;

public interface IChatService {
	public List<ChatDto> chatlog();
	public boolean insertlog(ChatDto dto);
	public boolean logdel();
	public boolean logreset();
}
