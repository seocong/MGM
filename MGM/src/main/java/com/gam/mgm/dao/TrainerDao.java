package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.RaceTotalPrizeDto;
import com.gam.mgm.dto.RecordInfoDto;
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
	public boolean trDel() {
		int cnt = sqlSession.delete(namespace+"trdel");
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
	public TrainerDto getJokyo(String tr_no) {
		return sqlSession.selectOne(namespace+"getjokyo", tr_no);
	}
	
	@Override
	public boolean trUpdate(String trno) {
		int rs = sqlSession.update(namespace+"trUpdate");
		return rs>0?true:false;
	}
	
	@Override
	public List<RecordInfoDto> recordInfo(String tr_no) {
		return sqlSession.selectList(namespace+"recordInfo",tr_no);
	}
	
	@Override
	public List<RaceTotalPrizeDto> rtPrize(String tr_no){
		return sqlSession.selectList(namespace+"rtPrize",tr_no);
	}

	@Override
	public boolean resetSeq() {
		return sqlSession.update(namespace+"resetSeq")>0?true:false;
	}

	@Override
	public boolean meetDel(int meet) {
		return sqlSession.delete(namespace+"meetDel",meet)>0?true:false;
	}
}
