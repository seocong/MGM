package com.gam.mgm.dto;

import java.util.Date;

public class BoardDto {
	private int board_seq ;
	private int board_group ;
	private int board_step ;
	private String board_title;
	private String board_contents;
	private String board_writer;
	private int board_readcount;
	private Date board_regdate;
	private String board_delflag;
	private String board_recommender;
	private int board_pushnum;
	private String board_name;
	
	public BoardDto() {
		super();
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public int getBoard_group() {
		return board_group;
	}

	public void setBoard_group(int board_group) {
		this.board_group = board_group;
	}

	public int getBoard_step() {
		return board_step;
	}

	public void setBoard_step(int board_step) {
		this.board_step = board_step;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_contents() {
		return board_contents;
	}

	public void setBoard_contents(String board_contents) {
		this.board_contents = board_contents;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public int getBoard_readcount() {
		return board_readcount;
	}

	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}

	public Date getBoard_regdate() {
		return board_regdate;
	}

	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}

	public String getBoard_delflag() {
		return board_delflag;
	}

	public void setBoard_delflag(String board_delflag) {
		this.board_delflag = board_delflag;
	}

	public String getBoard_recommender() {
		return board_recommender;
	}

	public void setBoard_recommender(String board_recommender) {
		this.board_recommender = board_recommender;
	}

	public int getBoard_pushnum() {
		return board_pushnum;
	}

	public void setBoard_pushnum(int board_pushnum) {
		this.board_pushnum = board_pushnum;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	@Override
	public String toString() {
		return "BoardDto [board_seq=" + board_seq + ", board_group=" + board_group + ", board_step=" + board_step
				+ ", board_title=" + board_title + ", board_contents=" + board_contents + ", board_writer="
				+ board_writer + ", board_readcount=" + board_readcount + ", board_regdate=" + board_regdate
				+ ", board_delflag=" + board_delflag + ", board_recommender=" + board_recommender + ", board_pushnum="
				+ board_pushnum + ", board_name=" + board_name + "]";
	}

	public BoardDto(int board_seq, int board_group, int board_step, String board_title, String board_contents,
			String board_writer, int board_readcount, Date board_regdate, String board_delflag,
			String board_recommender, int board_pushnum, String board_name) {
		super();
		this.board_seq = board_seq;
		this.board_group = board_group;
		this.board_step = board_step;
		this.board_title = board_title;
		this.board_contents = board_contents;
		this.board_writer = board_writer;
		this.board_readcount = board_readcount;
		this.board_regdate = board_regdate;
		this.board_delflag = board_delflag;
		this.board_recommender = board_recommender;
		this.board_pushnum = board_pushnum;
		this.board_name = board_name;
	}
	
}
	