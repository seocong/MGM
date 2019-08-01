package com.gam.mgm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.HorsesDto;
import com.gam.mgm.dto.TrainerDto;

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

}
