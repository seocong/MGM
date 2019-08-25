package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RaceTotalPrizeDto;
import com.gam.mgm.dto.RecordInfoDto;

public interface IJockeyDao {
	public boolean jkInsert(JockeyDto jokeyDto);

	public boolean jkDel(int jk_meet);
	
	public boolean meetDel(int meet);
	
	public List<JockeyDto> getAllList(int jk_meet);

	public JockeyDto getKisu(String jk_no);
	
	public boolean jkUpdate(String jkno);
	
	public List<RecordInfoDto> recordInfo(String jkno);
	
	public List<RaceTotalPrizeDto> rtPrize(String jk_no);
	
	public List<ChampionDto> selChampion(String jk_name);
}
