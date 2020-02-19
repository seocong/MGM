package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.MonthlyPrizeDto;
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.RecordInfoDto;

public interface IOwnerService {
	
	public boolean owInsert(OwnerDto ownerDto);

	public boolean owDel(int ow_meet);
	
	public List<OwnerDto> getAllList(int ow_meet);
	
	//마주검색
	public List<OwnerDto> ownerSearch(Map<String,Object> map);

	public OwnerDto getOwner(Map<String, Object> map);
	
	public MonthlyPrizeDto monthlyPrize(String hr_no);
	
	public List<RecordInfoDto> recordInfo(String ow_no);
}
