package com.gam.mgm.dto;

import java.util.Date;

/*
 * 기수, 경주마, 조교사 디테일 페이지 경주기록 테이블 표시 내용
 */
public class RecordInfoDto {
	private String jkName;
	private String jkNo;
	private String owName;
	private String owNo;
	private String trName;
	private String trNo;
	private String hrName;
	private String hrNo;
	private Date rcDate;
	private int rcNo;
	private int meet;
	private String ranks;
	private int rcDist;
	private String rcName;
	private int ord;
	private int hrCount;
	private double rcTime;
	private String wgHr;
	private int rating;
	private String track;
	private double wgBudam;
	public RecordInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecordInfoDto(String jkName, String jkNo, String owName, String owNo, String trName, String trNo,
			String hrName, String hrNo, Date rcDate, int rcNo, int meet, String ranks, int rcDist, String rcName,
			int ord, int hrCount, double rcTime, String wgHr, int rating, String track, double wgBudam) {
		super();
		this.jkName = jkName;
		this.jkNo = jkNo;
		this.owName = owName;
		this.owNo = owNo;
		this.trName = trName;
		this.trNo = trNo;
		this.hrName = hrName;
		this.hrNo = hrNo;
		this.rcDate = rcDate;
		this.rcNo = rcNo;
		this.meet = meet;
		this.ranks = ranks;
		this.rcDist = rcDist;
		this.rcName = rcName;
		this.ord = ord;
		this.hrCount = hrCount;
		this.rcTime = rcTime;
		this.wgHr = wgHr;
		this.rating = rating;
		this.track = track;
		this.wgBudam = wgBudam;
	}
	@Override
	public String toString() {
		return "RecordInfoDto [jkName=" + jkName + ", jkNo=" + jkNo + ", owName=" + owName + ", owNo=" + owNo
				+ ", trName=" + trName + ", trNo=" + trNo + ", hrName=" + hrName + ", hrNo=" + hrNo + ", rcDate="
				+ rcDate + ", rcNo=" + rcNo + ", meet=" + meet + ", ranks=" + ranks + ", rcDist=" + rcDist + ", rcName="
				+ rcName + ", ord=" + ord + ", hrCount=" + hrCount + ", rcTime=" + rcTime + ", wgHr=" + wgHr
				+ ", rating=" + rating + ", track=" + track + ", wgBudam=" + wgBudam + "]";
	}
	public String getJkName() {
		return jkName;
	}
	public void setJkName(String jkName) {
		this.jkName = jkName;
	}
	public String getJkNo() {
		return jkNo;
	}
	public void setJkNo(String jkNo) {
		this.jkNo = jkNo;
	}
	public String getOwName() {
		return owName;
	}
	public void setOwName(String owName) {
		this.owName = owName;
	}
	public String getOwNo() {
		return owNo;
	}
	public void setOwNo(String owNo) {
		this.owNo = owNo;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getHrNo() {
		return hrNo;
	}
	public void setHrNo(String hrNo) {
		this.hrNo = hrNo;
	}
	public Date getRcDate() {
		return rcDate;
	}
	public void setRcDate(Date rcDate) {
		this.rcDate = rcDate;
	}
	public int getRcNo() {
		return rcNo;
	}
	public void setRcNo(int rcNo) {
		this.rcNo = rcNo;
	}
	public int getMeet() {
		return meet;
	}
	public void setMeet(int meet) {
		this.meet = meet;
	}
	public String getRanks() {
		return ranks;
	}
	public void setRanks(String ranks) {
		this.ranks = ranks;
	}
	public int getRcDist() {
		return rcDist;
	}
	public void setRcDist(int rcDist) {
		this.rcDist = rcDist;
	}
	public String getRcName() {
		return rcName;
	}
	public void setRcName(String rcName) {
		this.rcName = rcName;
	}
	public int getOrd() {
		return ord;
	}
	public void setOrd(int ord) {
		this.ord = ord;
	}
	public int getHrCount() {
		return hrCount;
	}
	public void setHrCount(int hrCount) {
		this.hrCount = hrCount;
	}
	public double getRcTime() {
		return rcTime;
	}
	public void setRcTime(double rcTime) {
		this.rcTime = rcTime;
	}
	public String getWgHr() {
		return wgHr;
	}
	public void setWgHr(String wgHr) {
		this.wgHr = wgHr;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public double getWgBudam() {
		return wgBudam;
	}
	public void setWgBudam(double wgBudam) {
		this.wgBudam = wgBudam;
	}
		
}
