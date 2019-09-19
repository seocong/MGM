package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RaceInfoDto;
import com.gam.mgm.dto.RaceRefreeDto;
import com.gam.mgm.dto.RaceResultDto;
import com.gam.mgm.vo.RaceRefreeVo;
import com.gam.mgm.vo.RaceSectionRecordVo;
import com.gam.mgm.vo.RaceSummaryResultVo;

@Repository
public class RaceDao implements IRaceDao{
	private String namespace = "com.gam.race.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public boolean raceScheduleInput(Map<String,Object> raceSchedule) {
		return sqlSession.insert(namespace+"schInsert",raceSchedule)>0?true:false;
	}
	@Override
	public boolean raceSchAllDel() {
		return sqlSession.delete(namespace+"scheduleAllDel")>0?true:false;
	}
	@Override
	public boolean raceResultInput(RaceResultDto rsDto) {
		boolean rs = sqlSession.insert(namespace+"rcResultInsert",rsDto)>0?true:false;
		return rs;
	}
	@Override
	public boolean raceInfoInput(RaceInfoDto riDto) {
		boolean rs = sqlSession.insert(namespace+"rcInfoInsert",riDto)>0?true:false;
		return rs;
	}
	@Override
	public List<RaceInfoDto> getCntList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getCntList", map);
	}
	@Override
	public int getAllCnt(int ri_meet) {
		return sqlSession.selectOne(namespace+"getAllCount", ri_meet);
	}
	@Override
	public RaceInfoDto getRiDetail(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"getridetail", map);
	}
	@Override
	public List<RaceResultDto> getRrDetail(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getrrdetail", map);
	}
	@Override
	public List<RaceInfoDto> getRacePaging(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getracepaging", map);
	}
	@Override
	public boolean raceInfoUpdate1(RaceSummaryResultVo.Body.Item riDto) {
		int rs = sqlSession.update(namespace+"raceInfoUpdate1", riDto);
		return rs>0?true:false;
	}
	@Override
	public boolean raceInfoUpdate2(RaceSectionRecordVo.Body.Item riDto) {
		int rs = sqlSession.update(namespace+"raceInfoUpdate2", riDto);
		return rs>0?true:false;
	}
	
	@Override
	public boolean refreeInsert(RaceRefreeVo.Body.Item rfDto) {
		int rs = sqlSession.insert(namespace+"refreeInsert",rfDto);
		return rs>0?true:false;
	}
	@Override
	public List<RaceRefreeDto> selRefree(Map<String,Object> map){
		return sqlSession.selectList(namespace+"selRefree",map);
	}
	@Override
	public boolean rcResultDel(int meet) {
		return sqlSession.delete(namespace+"rcResultDel",meet)>0?true:false;
	}
	@Override
	public boolean rcInfoDel(int meet) {
		return sqlSession.delete(namespace+"rcInfoDel",meet)>0?true:false;
	}
	@Override
	public String maxDate(int meet) {
		return sqlSession.selectOne(namespace+"maxDate",meet);
	}
	@Override
	public List<Map<String, String>> mainInfo(Map<String, String> map) {
		return sqlSession.selectList(namespace+"mainInfo",map);
	}
	@Override
	public List<String> mainInfoDate() {
		return sqlSession.selectList(namespace+"mainInfoDate");
	}
}
