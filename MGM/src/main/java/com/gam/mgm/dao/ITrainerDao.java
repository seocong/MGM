package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.TrainerDto;

public interface ITrainerDao {

	public boolean trInsert(TrainerDto trainerDto);

	public boolean trDel(int tr_meet);

	public List<TrainerDto> getAllList(int tr_meet);

}
