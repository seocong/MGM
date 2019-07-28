package com.gam.mgm.service;

import com.gam.mgm.dto.TrainerDto;

public interface ITrainerService {

	public boolean trInsert(TrainerDto trainerDto);

	public boolean trDel();
	
}
