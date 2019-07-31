package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.TrainerDto;

public interface ITrainerService {

	public boolean trInsert(TrainerDto trainerDto);

	public boolean trDel(int tr_meet);

	public List<TrainerDto> getAllList(int tr_meet);
	
}
