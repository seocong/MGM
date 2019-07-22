package com.gam.mgm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IMemberDao;
import com.gam.mgm.dao.IPointDao;
import com.gam.mgm.dto.MemberDto;

@Service
public class MemeberService implements IMemberService{
	@Autowired
	private IMemberDao memberDao;
	@Autowired
	private IPointDao pointDao;
	@Override
	public boolean signUp(MemberDto dto) {
		return memberDao.signUp(dto);
	}

	@Override
	public MemberDto login(Map<String,String> uid) {
		return memberDao.login(uid);
	}
	@Override
	public MemberDto myPage(String uid) {
		MemberDto mypageInfo = memberDao.myPage(uid);
		mypageInfo.setPointDto(pointDao.selectPoint(uid));
		return mypageInfo;
	}
	@Override
	public boolean withdrawal(String uid) {
		return memberDao.withdrawal(uid);
	}
	
}
