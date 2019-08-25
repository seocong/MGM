package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.ChampionDto;
import com.gam.mgm.dto.JockeyDto;
import com.gam.mgm.dto.RaceTotalPrizeDto;
import com.gam.mgm.dto.RecordInfoDto;

@Repository
public class JockeyDao implements IJockeyDao{
	private String namespace = "com.gam.jockey.";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public boolean jkInsert(JockeyDto jockeyDto) {
		int cnt = sqlSession.insert(namespace+"jkinsert", jockeyDto);
		return cnt>0?true:false;
	}
	
	@Override
	public boolean jkDel(int jk_meet) {
		int cnt = sqlSession.delete(namespace+"jkdel",jk_meet);
		return cnt>0?true:false;
	}

	@Override
	public List<JockeyDto> getAllList(int jk_meet) {
		return sqlSession.selectList(namespace+"getList",jk_meet);
	}

	@Override
	public JockeyDto getKisu(String jk_no) {		
		return sqlSession.selectOne(namespace+"getkisu", jk_no);
	}

	@Override
	public boolean jkUpdate(String jkno) {
		int rs = sqlSession.update(namespace+"jkUpdate");
		return rs>0?true:false;
	}

	@Override
	public List<RecordInfoDto> recordInfo(String jk_no) {
		return sqlSession.selectList(namespace+"recordInfo",jk_no);
	}
	
	@Override
	public List<RaceTotalPrizeDto> rtPrize(String jk_no){
		return sqlSession.selectList(namespace+"rtPrize",jk_no);
	}

	@Override
	public List<ChampionDto> selChampion(String jk_name) {
		return sqlSession.selectList(namespace+"selChampion",jk_name);
	}

	@Override
	public boolean meetDel(int meet) {
		return sqlSession.delete(namespace+"meetDel",meet)>0?true:false;
	}
}
