package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RecordInfoDto;

public interface IJockeyDao {
	public boolean jkInsert(JockeyDto jokeyDto);

	public boolean jkDel(int jk_meet);
	
	public List<JockeyDto> getAllList(int jk_meet);

	public JockeyDto getKisu(String jk_no);
	
	public boolean jkUpdate(String jkno);
	
	public List<RecordInfoDto> recordInfo(String jkno);
}
