package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gam.mgm.dao.ICommentDao;
import com.gam.mgm.dto.CommentDto;

@Service
public class CommentService implements ICommentService {
	
	@Autowired
	   private ICommentDao commentDao;

	@Override
	public List<CommentDto> getAllReply(Map<String, Object> replyMap) {
		
		return commentDao.getAllReply(replyMap);
	}

	@Override
	public boolean insertReply(Map<String, Object> map) {
		
		return commentDao.insertReply(map);
	}
	
	
	@Transactional
	@Override
	public boolean insertAnsReply(CommentDto dto) {
		commentDao.replyBoardUpdate(dto.getComment_seq());
		System.out.println(dto.getComment_group());
		int cnt = commentDao.insertAnsReply(dto);
		return cnt>0?true:false;
	}

	@Override
	public boolean push(CommentDto commentDto) {
		return commentDao.push(commentDto);
	}

	@Override
	public boolean ansdel(int comment_seq) {
		return commentDao.ansdel(comment_seq);
	}
}
