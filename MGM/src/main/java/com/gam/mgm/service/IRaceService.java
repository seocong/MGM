package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceRefreeDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.vo.RaceRefreeVo;
import com.gam.mgm.vo.RaceSectionRecordVo;
import com.gam.mgm.vo.RaceSummaryResultVo;

public interface IRaceService {
	public boolean raceScheduleInput(Map<String,Object> raceSchedule);
	public boolean raceSchAllDel();
	public boolean raceResultInput(RaceResultDto rsDto);
	//경주개요
	public boolean raceInfoInput(RaceInfoDto riDto);
	public boolean raceInfoUpdate1(RaceSummaryResultVo.Body.Item riDto);
	public boolean raceInfoUpdate2(RaceSectionRecordVo.Body.Item riDto);
	public List<RaceInfoDto> getCntList(Map<String, Object> map);
	public int getAllCnt(int ri_meet);
	public RaceInfoDto getRiDetail(Map<String, Object> map);
	public List<RaceResultDto> getRrDetail(Map<String, Object> map);
	public List<RaceInfoDto> getRacePaging(Map<String, Object> map);
	public boolean refreeInsert(RaceRefreeVo.Body.Item rfDto);
	public List<RaceRefreeDto> selRefree(Map<String,Object> map);
	public boolean rcResultDel(int meet);
	public boolean rcInfoDel(int meet);
	public String maxDate(int meet);
	//main race info data
	public List<Map<String,String>> mainInfo(Map<String,String> map);
	//메인 경마정보 최신 날짜 3개 구하기
	public List<String> mainInfoDate();
}
