package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.MessageDto;

@Repository
public class MessageDao implements IMessageDao {
	private String namespace = "com.gam.Message.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	@Override
	public List<MessageDto> msgList(Map<String,Object> map) {
		return sqlSession.selectList(namespace+"msgList",map);
	}
	@Override
	public int msgCount(String id) {
		return sqlSession.selectOne(namespace+"msgCount",id);
	}
	@Override
	public List<MessageDto> msgSendList(Map<String,Object> map) {
		return sqlSession.selectList(namespace+"msgSendList",map);
	}
	@Override
	public int msgSendCount(String id) {
		return sqlSession.selectOne(namespace+"msgSendCount",id);
	}
	@Override
	public boolean msgSend(MessageDto dto) {
		int isS = sqlSession.insert(namespace+"msgSend",dto);
		return isS>0?true:false;
	}
	
	@Override
	public MessageDto msgDetail(MessageDto dto) {
		return sqlSession.selectOne(namespace+"msgDetail",dto);
	}
	@Override
	public boolean msgSDel(Map<String,String> map) {
		int isS = sqlSession.update(namespace+"msgSDel",map);
		return isS>0?true:false;
	}
	@Override
	public boolean msgRDel(Map<String,String> map) {
		int isS = sqlSession.update(namespace+"msgRDel",map);
		return isS>0?true:false;
	}
	@Override
	public boolean msgSRead(Map<String,String> map) {
		int isS = sqlSession.update(namespace+"msgSRead",map);
		return isS>0?true:false;
	}
	@Override
	public boolean msgRRead(Map<String,String> map) {
		int isS = sqlSession.update(namespace+"msgRRead",map);
		return isS>0?true:false;
	}
	@Override
	public int msgTotalCount(String id) {
		return sqlSession.selectOne(namespace+"msgTotalCount",id);
	}
}
