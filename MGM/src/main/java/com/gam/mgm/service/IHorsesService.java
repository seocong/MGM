package com.gam.mgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gam.mgm.dao.IHorsesDao;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.TrainerDto;

public interface IHorsesService {
	
	public boolean hrInsert(HorsesDto horsesDto);

	public boolean hrDel(int hr_meet);
	
	public List<HorsesDto> getAllList(int hr_meet);
}
