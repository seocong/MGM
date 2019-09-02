package com.gam.mgm.dao;



import java.util.Map;

import com.gam.mgm.dto.MemberDto;

public interface IMemberDao {
	//회원가입
	public boolean signUp(MemberDto dto);
	//로그인
	public MemberDto login(Map<String,String> uid);
	//마이페이지
	public MemberDto myPage(String uid);
	//회원탈퇴
	public boolean withdrawal(String uid);
	//중복체크
	public boolean idCheck(String id);
	public boolean phCheck(String ph);
	//회원 업데이트 검색
	public MemberDto updateSearch(String id);
}
