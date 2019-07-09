package com.gam.mgm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.BoardDto;
import com.gam.mgm.dto.PagingDto;

@Repository
public class BoardDao implements IBoardDao{
	private String namespace = "com.gam.mgm.board.";
	@Autowired
    private SqlSessionTemplate sqlSession;
 
  @Override
 public List<BoardDto> getAllList(Map<String, Object> map) {
    /* Map<String,Object> map = new HashMap<String,Object>();
 
      map.put("start",paging.getStart());
      System.out.println(paging.getStart());
       map.put("last",paging.getLast());
       System.out.println(paging.getLast());*/
     return sqlSession.selectList(namespace+"boardlist",map);
 }
  

    @Override
    public int selectTotalPaging(String board_name) {
       return sqlSession.selectOne(namespace+"selectTotalPaging",board_name);
    }


	@Override
	public boolean boardinsert(BoardDto boardDto) {
		int cnt = sqlSession.insert(namespace+"boardinsert", boardDto);
		return cnt>0?true:false;
	}


	@Override
	public BoardDto getBoard(int board_seq) {
		
		return sqlSession.selectOne(namespace+"boarddetail",board_seq);
	}


	@Override
	public boolean readCount(int board_seq) {
		int cnt = sqlSession.update(namespace+"readcount", board_seq);
		return cnt>0?true:false;
	}

}
