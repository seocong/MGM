package com.gam.mgm.service;

import java.util.Map;

import com.gam.mgm.dto.MemberDto;

public interface IMemberService {
	//회원가입
	public boolean signUp(MemberDto dto);
	//로그인
	public Map<String,Object> login(Map<String,String> uid);
	//마이페이지
	public MemberDto myPage(String id);
	//회원탈퇴
	public boolean withdrawal(String uid);
	//아이디 중복 체크
	public boolean idCheck(String id);
	
	public boolean phCheck(String ph);
	
	//회원 업데이트 검색
	public MemberDto updateSearch(String id);
}
