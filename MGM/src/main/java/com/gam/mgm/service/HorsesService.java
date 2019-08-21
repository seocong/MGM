package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IHorsesDao;
import com.gam.mgm.dto.DistRecordDto;
import com.gam.mgm.dto.HorsePrizeDto;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.RecordInfoDto;

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

	@Override
	public List<HorsesDto> partList(Map<String, Object> map) {
		return horsesDao.partList(map);
	}

	@Override
	public List<HorsesDto> getRankList(Map<String, Object> map) {
		return horsesDao.getRankList(map);
	}

	@Override
	public boolean hrAddInfoUpdate(HorsesDto ai) {
		return horsesDao.hrAddInfoUpdate(ai);
	}

	@Override
	public HorsesDto getHorseDetail(Map<String, Object> map) {
		return horsesDao.getHorseDetail(map);
	}

	@Override
	public List<HorsesDto> getOwnerList(Map<String, Object> map) {
		return horsesDao.getOwnerList(map);
	}

	@Override
	public List<RecordInfoDto> recordInfo(String hrno) {
		return horsesDao.recordInfo(hrno);
	}

	@Override
	public HorsePrizeDto getPrize(String hr_no) {
		return horsesDao.getPrize(hr_no);
	}

	@Override
	public List<DistRecordDto> distRecord(String hr_no) {
		return horsesDao.distRecord(hr_no);
	}

	@Override
	public List<DistRecordDto> chulNoRecord(String hr_no) {
		return horsesDao.chulNoRecord(hr_no);
	}

	@Override
	public List<DistRecordDto> jkRecord(String hr_no) {
		return horsesDao.jkRecord(hr_no);
	}

	@Override
	public List<DistRecordDto> wgBudamRecord(String hr_no) {
		return horsesDao.wgBudamRecord(hr_no);
	}

}
