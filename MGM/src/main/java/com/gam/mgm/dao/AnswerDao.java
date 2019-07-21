package com.gam.mgm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gam.mgm.dto.AnswerDto;

@Repository
public class AnswerDao  implements IAnswerDao {
	private String namespace = "com.gam.Answer.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
	 
	 @Override
		public int selectAnswerPaging() {		
			return sqlSession.selectOne(namespace+"selectAnswerPaging");
		}

	@Override
	public List<AnswerDto> getAllList(Map<String, Object> map) {		
		return sqlSession.selectList(namespace+"getAnswerList", map);
	}

	@Override
	public boolean ansinsert(AnswerDto dto) {
		int cnt = sqlSession.insert(namespace+"ansinsert", dto);
		return cnt>0?true:false;
	}

	@Override
	public String checkedMember(int answerboard_seq) {
		return sqlSession.selectOne(namespace+"checkedMember", answerboard_seq);
	}

	@Override
	public AnswerDto getAnsboard(int answerboard_seq) {
		return sqlSession.selectOne(namespace+"getAnsboard", answerboard_seq);
	}

}
