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

	public boolean push(BoardDto boardDto);

	public boolean delete(int board_seq);

	public int pushCheck(Map<String, Object> map);

	public List<BoardDto> getPopList();

	public List<BoardDto> getFreeList();

	public List<BoardDto> getFunList();

	public List<BoardDto> getAlertList();

	
}
