package com.gam.mgm.dto;

import java.util.Date;

public class CommentDto {
	private int comment_seq;
	private int comment_group;
	private int comment_step;
	private int comment_depth;
	private String comment_contents;
	private String comment_writer;
	private Date comment_regdate;
	private String comment_delflag;
	private String comment_recommender;
	private int comment_pushnum;
	private String comment_name;
	
	public CommentDto() {
		super();
	}
	
	public CommentDto(int comment_seq, int comment_group, int comment_step, int comment_depth, String comment_contents,
			String comment_writer, Date comment_regdate, String comment_delflag, String comment_recommender,
			int comment_pushnum, String comment_name) {
		super();
		this.comment_seq = comment_seq;
		this.comment_group = comment_group;
		this.comment_step = comment_step;
		this.comment_depth = comment_depth;
		this.comment_contents = comment_contents;
		this.comment_writer = comment_writer;
		this.comment_regdate = comment_regdate;
		this.comment_delflag = comment_delflag;
		this.comment_recommender = comment_recommender;
		this.comment_pushnum = comment_pushnum;
		this.comment_name = comment_name;
	}

	public int getComment_seq() {
		return comment_seq;
	}

	public void setComment_seq(int comment_seq) {
		this.comment_seq = comment_seq;
	}

	public int getComment_group() {
		return comment_group;
	}

	public void setComment_group(int comment_group) {
		this.comment_group = comment_group;
	}

	public int getComment_step() {
		return comment_step;
	}

	public void setComment_step(int comment_step) {
		this.comment_step = comment_step;
	}

	public int getComment_depth() {
		return comment_depth;
	}

	public void setComment_depth(int comment_depth) {
		this.comment_depth = comment_depth;
	}

	public String getComment_contents() {
		return comment_contents;
	}

	public void setComment_contents(String comment_contents) {
		this.comment_contents = comment_contents;
	}

	public String getComment_writer() {
		return comment_writer;
	}

	public void setComment_writer(String comment_writer) {
		this.comment_writer = comment_writer;
	}

	public Date getComment_regdate() {
		return comment_regdate;
	}

	public void setComment_regdate(Date comment_regdate) {
		this.comment_regdate = comment_regdate;
	}

	public String getComment_delflag() {
		return comment_delflag;
	}

	public void setComment_delflag(String comment_delflag) {
		this.comment_delflag = comment_delflag;
	}

	public String getComment_recommender() {
		return comment_recommender;
	}

	public void setComment_recommender(String comment_recommender) {
		this.comment_recommender = comment_recommender;
	}

	public int getComment_pushnum() {
		return comment_pushnum;
	}

	public void setComment_pushnum(int comment_pushnum) {
		this.comment_pushnum = comment_pushnum;
	}

	public String getComment_name() {
		return comment_name;
	}

	public void setComment_name(String comment_name) {
		this.comment_name = comment_name;
	}

	@Override
	public String toString() {
		return "CommentDto [comment_seq=" + comment_seq + ", comment_group=" + comment_group + ", comment_step="
				+ comment_step + ", comment_depth=" + comment_depth + ", comment_contents=" + comment_contents
				+ ", comment_writer=" + comment_writer + ", comment_regdate=" + comment_regdate + ", comment_delflag="
				+ comment_delflag + ", comment_recommender=" + comment_recommender + ", comment_pushnum="
				+ comment_pushnum + ", comment_name=" + comment_name + "]";
	}


	
}
