package com.gam.mgm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IMemberDao;
import com.gam.mgm.dto.MemberDto;

@Service
public class MemeberService implements IMemberService{
	@Autowired
	private IMemberDao memberDao;

	@Override
	public boolean signUp(MemberDto dto) {
		return memberDao.signUp(dto);
	}

	@Override
	public MemberDto login(Map<String, String> member) {
		return memberDao.login(member);
	}
	
	
}
