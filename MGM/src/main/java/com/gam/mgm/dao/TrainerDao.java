package com.gam.mgm.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.TrainerDto;

@Repository
public class TrainerDao implements ITrainerDao {
	private String namespace = "com.gam.trainer.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	 
	@Override
	public boolean trInsert(TrainerDto trainerDto) {
		int cnt = sqlSession.insert(namespace+"trinsert", trainerDto);
		return cnt>0?true:false;
	}

	@Override
	public boolean trDel(int tr_meet) {
		int cnt = sqlSession.insert(namespace+"trdel",tr_meet);
		return cnt>0?true:false;
	}

	@Override
	public List<TrainerDto> getAllList(int tr_meet) {
		return sqlSession.selectList(namespace+"getList",tr_meet);
	}
	
	@Override
	public List<ChampionDto> getChampionList(String tr_name){
		return sqlSession.selectList(namespace+"trChampionList",tr_name);
	}

	@Override
	public TrainerDto getJokyo(String tr_name) {
		return sqlSession.selectOne(namespace+"getjokyo", tr_name);
	}
}
