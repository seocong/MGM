package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.RecordInfoDto;
import com.gam.mgm.dto.TrainerDto;

public interface ITrainerDao {

	public boolean trInsert(TrainerDto trainerDto);

	public boolean trDel(int tr_meet);

	public List<TrainerDto> getAllList(int tr_meet);
	
	public List<ChampionDto> getChampionList(String tr_name);

	public TrainerDto getJokyo(String tr_no);
	
	public boolean trUpdate(String trno);
	
	public List<RecordInfoDto> recordInfo(String trno);
}
