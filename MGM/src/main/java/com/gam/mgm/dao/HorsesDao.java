package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.DistRecordDto;
import com.gam.mgm.dto.HorsePrizeDto;
import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.HrCountDto;
import com.gam.mgm.dto.RecordInfoDto;

@Repository
public class HorsesDao implements IHorsesDao{
	private String namespace = "com.gam.horses.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public boolean hrInsert(HorsesDto horsesDto) {
		int cnt = sqlSession.insert(namespace+"hrinsert", horsesDto);
		return cnt>0?true:false;
	}

	@Override
	public boolean hrDel(int hr_meet) {
		int cnt = sqlSession.delete(namespace+"hrdel",hr_meet);
		return cnt>0?true:false;
	}

	@Override
	public List<HorsesDto> getAllList(int hr_meet) {
		return sqlSession.selectList(namespace+"getList",hr_meet);
	}
	
	@Override
	public List<String> hrList(int meet){
		return sqlSession.selectList(namespace+"hrList",meet);
	}
	
	@Override
	public boolean hrInfoUpdate(HorsesDto rsMap){
		int rs = sqlSession.update(namespace+"hrInfoUpdate",rsMap);
		return rs>0?true:false;
	}

	@Override
	public HrCountDto getCnt(int hr_meet) {
		return sqlSession.selectOne(namespace+"getCount", hr_meet);
	}

	@Override
	public HrCountDto getJeju() {
		return sqlSession.selectOne(namespace+"getjeju");
	}

	@Override
	public List<HorsesDto> partList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"horseList",map);
	}

	@Override
	public List<HorsesDto> getRankList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"rankList",map);
	}
	//마명검색
	@Override
	public List<HorsesDto> getSearchList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"horseSearch",map);
	}
	
	@Override
	public boolean hrAddInfoUpdate(HorsesDto ai) {
		int rs = sqlSession.update(namespace+"addInfo",ai);
		return rs>0?true:false;
	}

	@Override
	public HorsesDto getHorseDetail(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"getDetail",map);
	}

	@Override
	public List<HorsesDto> getOwnerList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getownerlist",map);
	}
	
	@Override
	public List<RecordInfoDto> recordInfo(String hr_no) {
		return sqlSession.selectList(namespace+"recordInfo",hr_no);
	}
	
	@Override
	public HorsePrizeDto getPrize(String hr_no) {
		return sqlSession.selectOne(namespace+"getPrize",hr_no);
	}

	@Override
	public List<DistRecordDto> distRecord(String hr_no) {
		return sqlSession.selectList(namespace+"distRecord",hr_no);
	}

	@Override
	public List<DistRecordDto> chulNoRecord(String hr_no) {
		return sqlSession.selectList(namespace+"chulNoRecord",hr_no);
	}

	@Override
	public List<DistRecordDto> jkRecord(String hr_no) {
		return sqlSession.selectList(namespace+"jkRecord",hr_no);
	}

	@Override
	public List<DistRecordDto> wgBudamRecord(String hr_no) {
		return sqlSession.selectList(namespace+"wgBudamRecord",hr_no);
	}

	
}
