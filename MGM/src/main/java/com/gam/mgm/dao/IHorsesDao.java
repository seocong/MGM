package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.DistRecordDto;
import com.gam.mgm.dto.HorsePrizeDto;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.RecordInfoDto;

public interface IHorsesDao {
	public boolean hrInsert(HorsesDto horsesDto);

	public boolean hrDel(int hr_meet);
	
	public List<HorsesDto> getAllList(int hr_meet);

	List<String> hrList(int meet);

	public boolean hrInfoUpdate(HorsesDto rsMap);

	public HrCountDto getCnt(int hr_meet);

	public HrCountDto getJeju();

	public List<HorsesDto> partList(Map<String, Object> map);

	public List<HorsesDto> getRankList(Map<String, Object> map);
	
	public boolean hrAddInfoUpdate(HorsesDto ai);

	public HorsesDto getHorseDetail(Map<String, Object> map);

	public List<HorsesDto> getOwnerList(Map<String, Object> map);
	
	public List<RecordInfoDto> recordInfo(String hrno);
	
	public HorsePrizeDto getPrize(String hr_no);
	
	public List<DistRecordDto> distRecord(String hr_no);
	
	public List<DistRecordDto> chulNoRecord(String hr_no);
	
	public List<DistRecordDto> jkRecord(String hr_no);
	
	public List<DistRecordDto> wgBudamRecord(String hr_no);
}
