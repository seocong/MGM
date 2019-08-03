package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IHorsesDao;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.TrainerDto;

@Service
public class HorsesService implements IHorsesService{
	@Autowired
	private IHorsesDao horsesDao;
	@Override
	public boolean hrInsert(HorsesDto horsesDto) {
		return horsesDao.hrInsert(horsesDto);
	}

	@Override
	public boolean hrDel(int hr_meet) {
		return horsesDao.hrDel(hr_meet);
	}

	@Override
	public List<HorsesDto> getAllList(int hr_meet) {
		return horsesDao.getAllList(hr_meet);
	}

	@Override
	public List<String> hrList(int meet) {
		return horsesDao.hrList(meet);
	}

	@Override
	public boolean hrInfoUpdate(HorsesDto rsMap) {
		return horsesDao.hrInfoUpdate(rsMap);
	}

	@Override
	public HrCountDto getCnt(int hr_meet) {		
		return horsesDao.getCnt(hr_meet);
	}

	@Override
	public HrCountDto getJeju() {
		return horsesDao.getJeju();
	}

}
