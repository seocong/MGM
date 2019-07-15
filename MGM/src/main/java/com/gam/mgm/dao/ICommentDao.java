package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.CommentDto;

public interface ICommentDao {

	public List<CommentDto> getAllReply(Map<String, Object> replyMap);

	public boolean insertReply(Map<String, Object> map);

	public int insertAnsReply(CommentDto dto);

	public int replyBoardUpdate(int comment_seq);

	public boolean push(CommentDto commentDto);

	public boolean ansdel(int comment_seq);

}
