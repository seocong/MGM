package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.ManagerDao;
import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.MemberDto;
import com.gam.mgm.dto.PointDto;

@Service
public class ManagerService implements IManagerService{
	@Autowired
	private ManagerDao managerDao;
	@Override
	public List<MemberDto> memberList(Map<String,Object> map) {
		return managerDao.memberList(map);
	}

	@Override
	public List<BoardDto> boardList(Map<String,Object> map) {
		return managerDao.boardList(map);
	}

	@Override
	public List<PointDto> pointList(Map<String,Object> map) {
		return managerDao.pointList(map);
	}

	@Override
	public List<PointDto> userPoint(Map<String, Object> map) {
		return managerDao.userPoint(map);
	}

	@Override
	public boolean pointPlus(Map<String, Object> map) {
		return managerDao.pointPlus(map);
	}

	@Override
	public boolean memberDel(String id) {
		return managerDao.memberDel(id);
	}

	@Override
	public boolean boardDel(int seq) {
		return managerDao.boardDel(seq);
	}

	@Override
	public int memberCount(Map<String,Object> map) {
		return managerDao.memberCount(map);
	}

	@Override
	public int boardCount(Map<String,Object> map) {
		return managerDao.boardCount(map);
	}

	@Override
	public int pointCount(Map<String,Object> map) {
		return managerDao.pointCount(map);
	}
	
	@Override
	public List<String> allMember(){
		return managerDao.allMember();
	}
	
	@Override
	public boolean pointDel(int seq) {
		return managerDao.pointDel(seq);
	}

}
