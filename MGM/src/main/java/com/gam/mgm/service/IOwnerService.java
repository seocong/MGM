package com.gam.mgm.service;

import java.util.List;

import com.gam.mgm.dto.OwnerDto;

public interface IOwnerService {
	
	public boolean owInsert(OwnerDto ownerDto);

	public boolean owDel(int ow_meet);
	
	public List<OwnerDto> getAllList(int ow_meet);
}
