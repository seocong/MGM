package com.gam.mgm.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
		BCryptPasswordEncoder scpwd = new BCryptPasswordEncoder();
		//암호화 전 패스워드를 꺼내서 암호화
		String pw = scpwd.encode(dto.getMember_pw());
		//암호화 후 다시 dto에 저장
		dto.setMember_pw(pw);
		System.out.println(dto.getMember_pw());
		return memberDao.signUp(dto);
	}

	@Override
	public Map<String,Object> login(Map<String,String> uid) {
		Map<String,Object> loginMap = new HashMap<String,Object>();
		BCryptPasswordEncoder scpwd = new BCryptPasswordEncoder();
		String rawPassword = uid.get("member_pw");
		MemberDto dto = memberDao.login(uid);
		boolean idChk = memberDao.idCheck(uid.get("member_id"));
		System.out.println("idChk");
		if(idChk) {
			loginMap.put("msg","아이디를 다시 확인해주세요.");
			loginMap.put("dto",null);
		}else {
			String encodedPassword = dto.getMember_pw();
			if(scpwd.matches(rawPassword, encodedPassword)){
				loginMap.put("dto",dto);
			}else {
				loginMap.put("msg","비밀번호가 틀렸습니다.");
				loginMap.put("dto",null);
			}
		}
		return loginMap;
	}
	@Override
	public MemberDto myPage(String uid) {
		MemberDto mypageInfo = memberDao.myPage(uid);
		return mypageInfo;
	}
	@Override
	public boolean withdrawal(String uid) {
		return memberDao.withdrawal(uid);
	}

	@Override
	public boolean idCheck(String id) {
		return memberDao.idCheck(id);
	}

	@Override
	public boolean phCheck(String ph) {
		return memberDao.phCheck(ph);
	}

	@Override
	public MemberDto updateSearch(String id) {
		return memberDao.updateSearch(id);
	}
	
}
