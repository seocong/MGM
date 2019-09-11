package com.gam.mgm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.ChatDto;

@Repository
public class ChatDao implements IChatDao{
	private String namespace="com.gam.mgm.chat.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public List<ChatDto> chatlog() {
		return sqlSession.selectList(namespace+"chatlog");
	}
	@Override
	public boolean insertlog(ChatDto dto) {
		int is = sqlSession.insert(namespace+"insertlog",dto);
		return is>0?true:false;
	}
	@Override
	public boolean logdel() {
		int is = sqlSession.delete(namespace+"logdel");
		return is>0?true:false;
	}
	@Override
	public boolean logreset() {
		int is = sqlSession.update(namespace+"logreset");
		return is==0?true:false;
	} 
}
