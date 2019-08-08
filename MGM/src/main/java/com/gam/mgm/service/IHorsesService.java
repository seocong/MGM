package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.gam.mgm.dao.IHorsesDao;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.RecordInfoDto;
import com.gam.mgm.dto.TrainerDto;

public interface IHorsesService {
	
	public boolean hrInsert(HorsesDto horsesDto);

	public boolean hrDel(int hr_meet);
	
	public List<HorsesDto> getAllList(int hr_meet);
	
	List<String> hrList(int meet);
	
	boolean hrInfoUpdate(HorsesDto rsMap);

	public HrCountDto getCnt(int hr_meet);

	public HrCountDto getJeju();

	public List<HorsesDto> partList(Map<String, Object> map);

	public List<HorsesDto> getRankList(Map<String, Object> map);
	
	public boolean hrAddInfoUpdate(HorsesDto ai);

	public HorsesDto getHorseDetail(Map<String, Object> map);

	public List<HorsesDto> getOwnerList(Map<String, Object> map);
	
	public List<RecordInfoDto> recordInfo(int hrno);
}
