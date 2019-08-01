package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.JockeyDto;

public interface IJockeyService {
	
	public boolean jkInsert(JockeyDto jokeyDto);

	public boolean jkDel(int jk_meet);
	
	public List<JockeyDto> getAllList(int jk_meet);
}
