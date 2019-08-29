package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;


import com.gam.mgm.dto.YoutubeDto;
import com.gam.mgm.dto.YtCommentDto;

public interface IChannelDao {

	public int selectTotalPaging();

	public List<YoutubeDto> getAllList(Map<String, Object> map);

	public boolean ytInsert(Map<String, Object> map);

	public List<YtCommentDto> replyList(int ytNum);

	public YoutubeDto getYoutube(int ytNum);

	public boolean ytCommentInsert(Map<String, Object> map);

	

}
