package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.ITrainerDao;
import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.RecordInfoDto;
import com.gam.mgm.dto.TrainerDto;

@Service
public class TrainerService implements ITrainerService {
	@Autowired
	private ITrainerDao trainerDao;

	@Override
	public boolean trInsert(TrainerDto trainerDto) {
		return trainerDao.trInsert(trainerDto);
	}

	@Override
	public boolean trDel(int tr_meet) {
		return trainerDao.trDel(tr_meet);
	}

	@Override
	public List<TrainerDto> getAllList(int tr_meet) {
		return trainerDao.getAllList(tr_meet);
	}
	
	@Override
	public List<ChampionDto> getChampionList(String tr_name){
		return trainerDao.getChampionList(tr_name);
	}

	@Override
	public TrainerDto getJokyo(String tr_no) {
		return trainerDao.getJokyo(tr_no);
	}
	
	@Override
	public boolean trUpdate(String trno) {
		return trainerDao.trUpdate(trno);
	}
	
	@Override
	public List<RecordInfoDto> recordInfo(String trno) {
		return trainerDao.recordInfo(trno);
	}
}
