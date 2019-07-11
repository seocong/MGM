package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.PagingDto;

public interface IBoardDao {
	public List<BoardDto> getAllList(Map<String, Object> map);

	   public int selectTotalPaging(String board_name);

	public boolean boardinsert(BoardDto boardDto);

	public BoardDto getBoard(int board_seq);

	public boolean readCount(int board_seq);
	
	public BoardDto getUpdateBoard(Map<String, Object> map);
}
