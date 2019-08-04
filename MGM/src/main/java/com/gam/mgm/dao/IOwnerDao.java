package com.gam.mgm.dao;

import java.util.List;

import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.OwnerDto;

public interface IOwnerDao {
	public boolean owInsert(OwnerDto ownerDto);

	public boolean owDel(int ow_meet);
	
	public List<OwnerDto> getAllList(int ow_meet);
}
