package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.gam.mgm.dto.YoutubeDto;
import com.gam.mgm.dto.YtCommentDto;

@Repository
public class ChannelDao  implements IChannelDao {
	private String namespace = "com.gam.Channel.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	@Override
	public int selectTotalPaging() {
		return sqlSession.selectOne(namespace+"cntPaging");
	}
	@Override
	public List<YoutubeDto> getAllList(Map<String, Object> map) {
		return sqlSession.selectList(namespace+"getList", map);
	}
	@Override
	public boolean ytInsert(Map<String, Object> map) {
		int cnt = sqlSession.insert(namespace+"ytInsert", map);
		return cnt>0?true:false;
	}
	@Override
	public List<YtCommentDto> replyList(int ytNum) {
		return sqlSession.selectList(namespace+"replylist", ytNum) ;
	}
	@Override
	public YoutubeDto getYoutube(int ytNum) {
		return sqlSession.selectOne(namespace+"getyoutube", ytNum);
	}
	@Override
	public boolean ytCommentInsert(Map<String, Object> map) {
		int cnt = sqlSession.insert(namespace+"ytComment", map);
		return cnt>0?true:false;
		 
	}
	
}
