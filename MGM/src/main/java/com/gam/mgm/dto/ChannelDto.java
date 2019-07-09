package com.gam.mgm.dto;

import java.util.Date;

public class ChannelDto {
	private int channelboard_seq ;
	private int channelboard_group ;
	private int channelboard_step ;
	private String channelboard_title;
	private String channelboard_contents;
	private String channelboard_writer;
	private int channelboard_readcount;
	private Date channelboard_regdate;
	private String channelboard_delflag;
	
	
	public ChannelDto(int channelboard_seq, int channelboard_group, int channelboard_step, String channelboard_title, String channelboard_contents,
			String channelboard_writer, int channelboard_readcount, Date channelboard_regdate, String channelboard_delflag) {
		super();
		this.channelboard_seq = channelboard_seq;
		this.channelboard_group = channelboard_group;
		this.channelboard_step = channelboard_step;
		this.channelboard_title = channelboard_title;
		this.channelboard_contents = channelboard_contents;
		this.channelboard_writer = channelboard_writer;
		this.channelboard_readcount = channelboard_readcount;
		this.channelboard_regdate = channelboard_regdate;
		this.channelboard_delflag = channelboard_delflag;
	}


	public int getChannelboard_seq() {
		return channelboard_seq;
	}


	public void setChannelboard_seq(int channelboard_seq) {
		this.channelboard_seq = channelboard_seq;
	}


	public int getChannelboard_group() {
		return channelboard_group;
	}


	public void setChannelboard_group(int channelboard_group) {
		this.channelboard_group = channelboard_group;
	}


	public int getChannelboard_step() {
		return channelboard_step;
	}


	public void setChannelboard_step(int channelboard_step) {
		this.channelboard_step = channelboard_step;
	}


	public String getChannelboard_title() {
		return channelboard_title;
	}


	public void setChannelboard_title(String channelboard_title) {
		this.channelboard_title = channelboard_title;
	}


	public String getChannelboard_contents() {
		return channelboard_contents;
	}


	public void setChannelboard_contents(String channelboard_contents) {
		this.channelboard_contents = channelboard_contents;
	}


	public String getChannelboard_writer() {
		return channelboard_writer;
	}


	public void setChannelboard_writer(String channelboard_writer) {
		this.channelboard_writer = channelboard_writer;
	}


	public int getChannelboard_readcount() {
		return channelboard_readcount;
	}


	public void setChannelboard_readcount(int channelboard_readcount) {
		this.channelboard_readcount = channelboard_readcount;
	}


	public Date getChannelboard_regdate() {
		return channelboard_regdate;
	}


	public void setChannelboard_regdate(Date channelboard_regdate) {
		this.channelboard_regdate = channelboard_regdate;
	}


	public String getChannelboard_delflag() {
		return channelboard_delflag;
	}


	public void setChannelboard_delflag(String channelboard_delflag) {
		this.channelboard_delflag = channelboard_delflag;
	}


	@Override
	public String toString() {
		return "channelboardDto [channelboard_seq=" + channelboard_seq + ", channelboard_group=" + channelboard_group + ", channelboard_step=" + channelboard_step
				+ ", channelboard_title=" + channelboard_title + ", channelboard_contents=" + channelboard_contents + ", channelboard_writer=" + channelboard_writer
				+ ", channelboard_readcount=" + channelboard_readcount + ", channelboard_regdate=" + channelboard_regdate + ", channelboard_delflag="
				+ channelboard_delflag + "]";
	}

}
