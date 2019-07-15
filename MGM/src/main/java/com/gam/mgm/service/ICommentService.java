package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.CommentDto;

public interface ICommentService {

	public List<CommentDto> getAllReply(Map<String, Object> replyMap);

	public boolean insertReply(Map<String, Object> map);

	public boolean insertAnsReply(CommentDto dto);

	public boolean push(CommentDto commentDto);

	public boolean ansdel(int comment_seq);

}
