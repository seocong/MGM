package com.gam.mgm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelDao  implements IChannelDao {
	private String namespace = "com.gam.Channel.";
	 @Autowired
	   private SqlSessionTemplate sqlSession;
}
