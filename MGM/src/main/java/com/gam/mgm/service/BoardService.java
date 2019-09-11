package com.gam.mgm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.IBoardDao;
import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.PagingDto;

@Service
public class BoardService implements IBoardService{
	@Autowired
	private IBoardDao boardDao;

	@Override
	public List<BoardDto> getAllList(Map<String, Object> map) {
		return boardDao.getAllList(map);
	}

	@Override
	public int selectTotalPaging(String board_name) {
		return boardDao.selectTotalPaging(board_name);
	}

	@Override
	public boolean boardInsert(BoardDto boardDto) {

		return boardDao.boardinsert(boardDto);
	}

	@Override
	public BoardDto getBoard(int board_seq) {

		return boardDao.getBoard(board_seq);
	}

	@Override
	public boolean readCount(int board_seq) {

		return boardDao.readCount(board_seq);
	}
	@Override
	public BoardDto getUpdateBoard(Map<String, Object> map) {		
		return boardDao.getUpdateBoard(map);
	}

	@Override
	public boolean push(BoardDto boardDto) {

		return boardDao.push(boardDto);
	}

	@Override
	public boolean delete(int board_seq) {

		return boardDao.delete(board_seq);
	}

	@Override
	public List<BoardDto> myPost(Map<String,Object> map){
		return boardDao.myPost(map);
	}

	@Override
	public int myPostCount(String id) {
		return boardDao.myPostCount(id);
	}
	
	@Override
	public int pushCheck(Map<String, Object> map) {
		return boardDao.pushCheck(map);
	}

	@Override
	public List<BoardDto> getPopList() {
		return boardDao.getPopList();
	}

	@Override
	public List<BoardDto> getFreeList() {
		return boardDao.getFreeList();
	}

	@Override
	public List<BoardDto> getFunList() {
		return boardDao.getFunList();
	}

	@Override
	public List<BoardDto> getAlertList() {
		return boardDao.getAlertList();
	}
}
