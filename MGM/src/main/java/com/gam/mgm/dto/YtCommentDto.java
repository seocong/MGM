package com.gam.mgm.dto;

import java.util.Date;

public class YtCommentDto {
	private int ytSeq ;
	private int ytNum ;
	private int ytStep ;
	private String ytContents;
	private String ytWriter;
	private int ytDepth;
	private Date ytRegDate;
	private int ytDelflag;
	
	public YtCommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YtCommentDto(int ytSeq, int ytNum, int ytStep, String ytContents, String ytWriter, int ytDepth,
			Date ytRegDate, int ytDelflag) {
		super();
		this.ytSeq = ytSeq;
		this.ytNum = ytNum;
		this.ytStep = ytStep;
		this.ytContents = ytContents;
		this.ytWriter = ytWriter;
		this.ytDepth = ytDepth;
		this.ytRegDate = ytRegDate;
		this.ytDelflag = ytDelflag;
	}

	public int getYtSeq() {
		return ytSeq;
	}

	public void setYtSeq(int ytSeq) {
		this.ytSeq = ytSeq;
	}

	public int getYtNum() {
		return ytNum;
	}

	public void setYtNum(int ytNum) {
		this.ytNum = ytNum;
	}

	public int getYtStep() {
		return ytStep;
	}

	public void setYtStep(int ytStep) {
		this.ytStep = ytStep;
	}

	public String getYtContents() {
		return ytContents;
	}

	public void setYtContents(String ytContents) {
		this.ytContents = ytContents;
	}

	public String getYtWriter() {
		return ytWriter;
	}

	public void setYtWriter(String ytWriter) {
		this.ytWriter = ytWriter;
	}

	public int getYtDepth() {
		return ytDepth;
	}

	public void setYtDepth(int ytDepth) {
		this.ytDepth = ytDepth;
	}

	public Date getYtRegDate() {
		return ytRegDate;
	}

	public void setYtRegDate(Date ytRegDate) {
		this.ytRegDate = ytRegDate;
	}

	public int getYtDelflag() {
		return ytDelflag;
	}

	public void setYtDelflag(int ytDelflag) {
		this.ytDelflag = ytDelflag;
	}
	
	
	
	

}
