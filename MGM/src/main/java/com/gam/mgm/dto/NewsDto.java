package com.gam.mgm.dto;

import java.util.Date;

public class NewsDto {
	private int news_seq ;
	private int news_group ;
	private int news_step ;
	private String news_title;
	private String news_contents;
	private String news_writer;
	private int news_readcount;
	private Date news_regdate;
	private String news_delflag;
	
	
	public NewsDto(int news_seq, int news_group, int news_step, String news_title, String news_contents,
			String news_writer, int news_readcount, Date news_regdate, String news_delflag) {
		super();
		this.news_seq = news_seq;
		this.news_group = news_group;
		this.news_step = news_step;
		this.news_title = news_title;
		this.news_contents = news_contents;
		this.news_writer = news_writer;
		this.news_readcount = news_readcount;
		this.news_regdate = news_regdate;
		this.news_delflag = news_delflag;
	}


	public int getNews_seq() {
		return news_seq;
	}


	public void setNews_seq(int news_seq) {
		this.news_seq = news_seq;
	}


	public int getNews_group() {
		return news_group;
	}


	public void setNews_group(int news_group) {
		this.news_group = news_group;
	}


	public int getNews_step() {
		return news_step;
	}


	public void setNews_step(int news_step) {
		this.news_step = news_step;
	}


	public String getNews_title() {
		return news_title;
	}


	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}


	public String getNews_contents() {
		return news_contents;
	}


	public void setNews_contents(String news_contents) {
		this.news_contents = news_contents;
	}


	public String getNews_writer() {
		return news_writer;
	}


	public void setNews_writer(String news_writer) {
		this.news_writer = news_writer;
	}


	public int getNews_readcount() {
		return news_readcount;
	}


	public void setNews_readcount(int news_readcount) {
		this.news_readcount = news_readcount;
	}


	public Date getNews_regdate() {
		return news_regdate;
	}


	public void setNews_regdate(Date news_regdate) {
		this.news_regdate = news_regdate;
	}


	public String getNews_delflag() {
		return news_delflag;
	}


	public void setNews_delflag(String news_delflag) {
		this.news_delflag = news_delflag;
	}


	@Override
	public String toString() {
		return "NewsDto [news_seq=" + news_seq + ", news_group=" + news_group + ", news_step=" + news_step
				+ ", news_title=" + news_title + ", news_contents=" + news_contents + ", news_writer=" + news_writer
				+ ", news_readcount=" + news_readcount + ", news_regdate=" + news_regdate + ", news_delflag="
				+ news_delflag + "]";
	}

}
