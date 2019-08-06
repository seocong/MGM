package com.gam.mgm.dto;

public class RecordInfoDto {
	private int rcDate; //경주일자
	private int rcNo; //경주번호
	private int meet; //경주지역
	private String ranks; //순위
	private int hrCount; //경주마 수
	private int rcDist; // 경주거리
	private String rcName; //경기 종류(경주이름)
	private float wgBudam; //부담 중량(메뉴 -> 중량)
	private String trName; //조교사명
	private String jkName; //기수명
	private String owName; //마주명
	private float rcTime; //
	private String wgHr;
	private int rating;
	private String track;
	
	public RecordInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecordInfoDto(int rcDate, int rcNo, int meet, String ranks, int rcDist, String rcName, float wgBudam,
			String trName, String jkName, String owName, float rcTime, String wgHr, int rating, String track,
			int hrCount) {
		super();
		this.rcDate = rcDate;
		this.rcNo = rcNo;
		this.meet = meet;
		this.ranks = ranks;
		this.rcDist = rcDist;
		this.rcName = rcName;
		this.wgBudam = wgBudam;
		this.trName = trName;
		this.jkName = jkName;
		this.owName = owName;
		this.rcTime = rcTime;
		this.wgHr = wgHr;
		this.rating = rating;
		this.track = track;
		this.hrCount = hrCount;
	}
	@Override
	public String toString() {
		return "RecordInfoDto [rcDate=" + rcDate + ", rcNo=" + rcNo + ", meet=" + meet + ", ranks=" + ranks
				+ ", rcDist=" + rcDist + ", rcName=" + rcName + ", wgBudam=" + wgBudam + ", trName=" + trName
				+ ", jkName=" + jkName + ", owName=" + owName + ", rcTime=" + rcTime + ", wgHr=" + wgHr + ", rating="
				+ rating + ", track=" + track + ", hrCount=" + hrCount + "]";
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
	public float getWgBudam() {
		return wgBudam;
	}
	public void setWgBudam(float wgBudam) {
		this.wgBudam = wgBudam;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
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
	public int getHrCount() {
		return hrCount;
	}
	public void setHrCount(int hrCount) {
		this.hrCount = hrCount;
	}
	
}
