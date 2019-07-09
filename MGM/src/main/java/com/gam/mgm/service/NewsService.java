package com.gam.mgm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gam.mgm.dao.INewsDao;

@Service
public class NewsService implements INewsService{
	@Autowired
	private INewsDao newsDao;
}
