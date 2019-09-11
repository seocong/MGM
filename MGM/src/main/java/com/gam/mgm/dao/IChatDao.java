package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.ChatDto;

public interface IChatDao {
	public List<ChatDto> chatlog();
	public boolean insertlog(ChatDto dto);
	public boolean logdel();
	public boolean logreset();
}
