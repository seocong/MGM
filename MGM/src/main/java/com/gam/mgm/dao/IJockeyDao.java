package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.JockeyDto;

public interface IJockeyDao {
	public boolean jkInsert(JockeyDto jokeyDto);

	public boolean jkDel(int jk_meet);
	
	public List<JockeyDto> getAllList(int jk_meet);

	public JockeyDto getKisu(String jk_name);
}
