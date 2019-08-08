package com.gam.mgm.dto;
/*
 * 기수, 경주마, 조교사 디테일 페이지 경주기록 테이블 표시 내용
 */
public class RecordInfoDto {
	private String jkName;
	private String owName;
	private String trName;
	private String hrName;
	private int rcDate;
	private int rcNo;
	private int meet;
	private String ranks;
	private int rcDist;
	private String rcName;
	private int ord;
	private int hrCount;
	private float rcTime;
	private String wgHr;
	private int rating;
	private String track;
	private float wgBudam;
	public RecordInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RaceRecordDto [jkName=" + jkName + ", owName=" + owName + ", trName=" + trName + ", hrName=" + hrName
				+ ", rcDate=" + rcDate + ", rcNo=" + rcNo + ", meet=" + meet + ", ranks=" + ranks + ", rcDist=" + rcDist
				+ ", rcName=" + rcName + ", ord=" + ord + ", hrCount=" + hrCount + ", rcTime=" + rcTime + ", wgHr="
				+ wgHr + ", rating=" + rating + ", track=" + track + ", wgBudam=" + wgBudam + "]";
	}
	public RecordInfoDto(String jkName, String owName, String trName, String hrName, int rcDate, int rcNo, int meet,
			String ranks, int rcDist, String rcName, int ord, int hrCount, float rcTime, String wgHr, int rating,
			String track, float wgBudam) {
		super();
		this.jkName = jkName;
		this.owName = owName;
		this.trName = trName;
		this.hrName = hrName;
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
	public String getJkName() {
		return jkName;
	}
	public void setJkName(String jkName) {
		this.jkName = jkName;
	}
	public String getOwName() {
		return owName;
	}
	public void setOwName(String owName) {
		this.owName = owName;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public int getRcDate() {
		return rcDate;
	}
	public void setRcDate(int rcDate) {
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
	public float getRcTime() {
		return rcTime;
	}
	public void setRcTime(float rcTime) {
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
	public float getWgBudam() {
		return wgBudam;
	}
	public void setWgBudam(float wgBudam) {
		this.wgBudam = wgBudam;
	}
	
	
}
