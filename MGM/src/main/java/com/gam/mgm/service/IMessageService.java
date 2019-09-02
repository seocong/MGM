package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.MessageDto;

public interface IMessageService {
	//수신 메세지 목록
	public List<MessageDto> msgList(Map<String,Object> map);
	public double msgCount(String id);
	//발신 메세지 목록
	public List<MessageDto> msgSendList(Map<String,Object> map);
	public double msgSendCount(String id);
	//메세지 보내기
	public boolean msgSend(MessageDto dto);
	//수신 메세지 삭제
	public boolean msgSDel(Map<String,String> map);
	//발신 메세지 삭제
	public boolean msgRDel(Map<String,String> map);
	//수신 메세지 읽음
	public boolean msgSRead(Map<String,String> map);
	//발신 메세지 읽음
	public boolean msgRRead(Map<String,String> map);
	//메세지 상세보기
	public MessageDto msgDetail(MessageDto dto);
	//메세지 전체 카운트
	public int msgTotalCount(String id);
}
