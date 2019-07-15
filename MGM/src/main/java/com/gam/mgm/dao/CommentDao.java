package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.CommentDto;

@Repository
public class CommentDao implements ICommentDao {
	private String namespace = "com.gam.mgm.comment.";
	@Autowired
    private SqlSessionTemplate sqlSession;
	@Override
	public List<CommentDto> getAllReply(Map<String, Object> replyMap) {
		
		return sqlSession.selectList(namespace+"getallreply", replyMap);
	}
	@Override
	public boolean insertReply(Map<String, Object> map) {
		int cnt = sqlSession.insert(namespace+"insertreply", map);
		return cnt>0?true:false;
	}

	@Override
	public int insertAnsReply(CommentDto dto) {
		return sqlSession.insert(namespace+"insertAnsReply",dto);
		
	}
	@Override
	public int replyBoardUpdate(int comment_seq) {		
		return sqlSession.update(namespace+"replyupdate", comment_seq);
	}
	@Override
	public boolean push(CommentDto commentDto) {
		int cnt = sqlSession.update(namespace+"push",commentDto);
		return cnt>0?true:false;
	}
	@Override
	public boolean ansdel(int comment_seq) {
		int cnt = sqlSession.update(namespace+"ansdel",comment_seq);
		return cnt>0?true:false;
	}
}
