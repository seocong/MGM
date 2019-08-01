package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.TrainerDto;

public interface IHorsesDao {
	public boolean hrInsert(HorsesDto horsesDto);

	public boolean hrDel(int hr_meet);
	
	public List<HorsesDto> getAllList(int hr_meet);
}
