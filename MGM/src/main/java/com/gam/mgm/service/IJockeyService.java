package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RecordInfoDto;

public interface IJockeyService {
	
	public boolean jkInsert(JockeyDto jokeyDto);

	public boolean jkDel(int jk_meet);
	
	public List<JockeyDto> getAllList(int jk_meet);

	public JockeyDto getKisu(String jk_name);
	
	public boolean jkUpdate(int jkno);
	
	public List<RecordInfoDto> recordInfo(int jkno);
}
