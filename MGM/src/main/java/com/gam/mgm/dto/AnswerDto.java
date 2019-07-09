package com.gam.mgm.dto;

import java.util.Date;

public class AnswerDto {
	private int answerboard_seq ;
	private int answerboard_group ;
	private int answerboard_step ;
	private String answerboard_title;
	private String answerboard_contents;
	private String answerboard_writer;
	private int answerboard_readcount;
	private Date answerboard_regdate;
	private String answerboard_delflag;
	
	
	public  AnswerDto(int answerboard_seq, int answerboard_group, int answerboard_step, String answerboard_title, String answerboard_contents,
			String answerboard_writer, int answerboard_readcount, Date answerboard_regdate, String answerboard_delflag) {
		super();
		this.answerboard_seq = answerboard_seq;
		this.answerboard_group = answerboard_group;
		this.answerboard_step = answerboard_step;
		this.answerboard_title = answerboard_title;
		this.answerboard_contents = answerboard_contents;
		this.answerboard_writer = answerboard_writer;
		this.answerboard_readcount = answerboard_readcount;
		this.answerboard_regdate = answerboard_regdate;
		this.answerboard_delflag = answerboard_delflag;
	}


	public int getAnswerboard_seq() {
		return answerboard_seq;
	}


	public void setAnswerboard_seq(int answerboard_seq) {
		this.answerboard_seq = answerboard_seq;
	}


	public int getAnswerboard_group() {
		return answerboard_group;
	}


	public void setAnswerboard_group(int answerboard_group) {
		this.answerboard_group = answerboard_group;
	}


	public int getAnswerboard_step() {
		return answerboard_step;
	}


	public void setAnswerboard_step(int answerboard_step) {
		this.answerboard_step = answerboard_step;
	}


	public String getAnswerboard_title() {
		return answerboard_title;
	}


	public void setAnswerboard_title(String answerboard_title) {
		this.answerboard_title = answerboard_title;
	}


	public String getAnswerboard_contents() {
		return answerboard_contents;
	}


	public void setAnswerboard_contents(String answerboard_contents) {
		this.answerboard_contents = answerboard_contents;
	}


	public String getAnswerboard_writer() {
		return answerboard_writer;
	}


	public void setAnswerboard_writer(String answerboard_writer) {
		this.answerboard_writer = answerboard_writer;
	}


	public int getAnswerboard_readcount() {
		return answerboard_readcount;
	}


	public void setAnswerboard_readcount(int answerboard_readcount) {
		this.answerboard_readcount = answerboard_readcount;
	}


	public Date getAnswerboard_regdate() {
		return answerboard_regdate;
	}


	public void setAnswerboard_regdate(Date answerboard_regdate) {
		this.answerboard_regdate = answerboard_regdate;
	}


	public String getAnswerboard_delflag() {
		return answerboard_delflag;
	}


	public void setAnswerboard_delflag(String answerboard_delflag) {
		this.answerboard_delflag = answerboard_delflag;
	}


	@Override
	public String toString() {
		return "answerboardDto [answerboard_seq=" + answerboard_seq + ", answerboard_group=" + answerboard_group + ", answerboard_step=" + answerboard_step
				+ ", answerboard_title=" + answerboard_title + ", answerboard_contents=" + answerboard_contents + ", answerboard_writer=" + answerboard_writer
				+ ", answerboard_readcount=" + answerboard_readcount + ", answerboard_regdate=" + answerboard_regdate + ", answerboard_delflag="
				+ answerboard_delflag + "]";
	}

}
