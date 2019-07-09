package com.gam.mgm.service;

import java.util.Map;

import com.gam.mgm.dto.MemberDto;

public interface IMemberService {
	//회원가입
	public boolean signUp(MemberDto dto);
	//로그인
	public MemberDto login(Map<String,String> member);
}
