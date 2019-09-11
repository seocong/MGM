package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.PointDto;

public interface IManagerDao {
	public List<MemberDto> memberList(Map<String,Object> map);
	public int memberCount(Map<String,Object> map);
	public List<BoardDto> boardList(Map<String,Object> map);
	public int boardCount(Map<String,Object> map);
	public List<PointDto> pointList(Map<String,Object> map);
	public int pointCount(Map<String,Object> map);
	public List<PointDto> userPoint(Map<String,Object> map);
	public boolean pointPlus(Map<String,Object> map);
	public boolean memberDel(String id);
	public boolean boardDel(int seq);
	public List<String> allMember();
	public boolean pointDel(int seq);
}
