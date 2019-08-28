package com.gam.mgm.dto;

public class YoutubeDto {
	private int ytNum;
	private String ytAddress;
	private String ytTitle;
	
	
	
	public YoutubeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YoutubeDto(int ytNum, String ytAddress, String ytTitle) {
		super();
		this.ytNum = ytNum;
		this.ytAddress = ytAddress;
		this.ytTitle = ytTitle;
	}

	public int getYtNum() {
		return ytNum;
	}

	public void setYtNum(int ytNum) {
		this.ytNum = ytNum;
	}

	public String getYtAddress() {
		return ytAddress;
	}

	public void setYtAddress(String ytAddress) {
		this.ytAddress = ytAddress;
	}

	public String getYtTitle() {
		return ytTitle;
	}

	public void setYtTitle(String ytTitle) {
		this.ytTitle = ytTitle;
	}
	
	
}
