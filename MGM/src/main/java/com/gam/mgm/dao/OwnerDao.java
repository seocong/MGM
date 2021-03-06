package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.MonthlyPrizeDto;
import com.gam.mgm.dto.OwnerDto;
import com.gam.mgm.dto.RecordInfoDto;

@Repository
public class OwnerDao implements IOwnerDao{
	private String namespace = "com.gam.owner.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public boolean owInsert(OwnerDto ownerDto) {
		int cnt = sqlSession.insert(namespace+"owinsert", ownerDto);
		return cnt>0?true:false;
	}
	
	@Override
	public boolean owDel(int ow_meet) {
		int cnt = sqlSession.delete(namespace+"owdel",ow_meet);
		return cnt>0?true:false;
	}

	@Override
	public List<OwnerDto> getAllList(int ow_meet) {
		return sqlSession.selectList(namespace+"getList",ow_meet);
	}

	@Override
	public List<OwnerDto> ownerSearch(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"ownerSearch",map);
	}

	@Override
	public OwnerDto getOwner(Map<String, Object> map) {
		return sqlSession.selectOne(namespace+"getowner",map);
	}

	@Override
	public MonthlyPrizeDto monthlyPrize(String hr_no) {
		return sqlSession.selectOne(namespace+"monthlyPrize",hr_no);
	}
	
	@Override
	public List<RecordInfoDto> recordInfo(String ow_no) {
		return sqlSession.selectList(namespace+"recordInfo",ow_no);
	}
}
