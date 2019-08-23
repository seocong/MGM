package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.RaceHistoryDto;
import com.gam.mgm.dto.RacePlanDto;

@Repository
public class RacePlanDao implements IRacePlanDao{
	private String namespace = "com.gam.racePlan.";
	@Autowired
	SqlSessionTemplate sqlSession;
	@Override
	public boolean rcPlanInsert(RacePlanDto raceplan) {
		int isS = sqlSession.insert(namespace+"rcPlanInsert",raceplan);
		return isS>0?true:false;
	}

	@Override
	public boolean resetTable() {
		return sqlSession.delete(namespace+"resetTable")>0?true:false;
	}

	@Override
	public boolean resetSeq() {
		return sqlSession.update(namespace+"resetSeq")>0?true:false;
	}

	@Override
	public List<RacePlanDto> getList(int rp_meet) {
		return sqlSession.selectList(namespace+"getlist", rp_meet);
	}

	@Override
	public RacePlanDto getDetail(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"getDetail", map);
	}

	@Override
	public List<RacePlanDto> getDetailList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getdetaillist", map);
	}

	@Override
	public List<RacePlanDto> roundlist(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"roundlist", map);
	}

	@Override
	public int maxRcNo(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"maxRcNo",map);
	}

	@Override
	public List<RaceHistoryDto> racePlanCount(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"racePlanCount",map);
	}

	@Override
	public List<RaceHistoryDto> planList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"planList",map);
	}

	@Override
	public List<RacePlanDto> selRcDate(int meet) {
		return sqlSession.selectList(namespace+"selRcDate",meet);
	}
}
