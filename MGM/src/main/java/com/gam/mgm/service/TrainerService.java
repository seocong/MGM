package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.ITrainerDao;
import com.gam.mgm.dto.TrainerDto;

@Service
public class TrainerService implements ITrainerService {
	@Autowired
	private ITrainerDao trainerDao;

	@Override
	public boolean trInsert(TrainerDto trainerDto) {
		return trainerDao.trInsert(trainerDto);
	}
}
