package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import com.gam.mgm.dto.BoardDto;


public interface IBoardService {
	public List<BoardDto> getAllList(Map<String, Object> map);

	public int selectTotalPaging(String board_name);

	public boolean boardInsert(BoardDto boardDto);

	public BoardDto getBoard(int board_seq);

	public boolean readCount(int board_seq);
	
	public BoardDto getUpdateBoard(Map<String, Object> map);
}
