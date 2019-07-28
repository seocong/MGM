package com.gam.mgm.dao;

import com.gam.mgm.dto.TrainerDto;

public interface ITrainerDao {

	public boolean trInsert(TrainerDto trainerDto);

	public boolean trDel();

}
