package com.gam.mgm.dto;

public class RaceResultDto {
	private int rr_meet;  
	private String rr_rcDate;  
	private int rr_rcNo;  
	private String rr_hrNo;
	private String rr_hrName;  
	private int rr_ord;  
	private int rr_chulNo;  
	private String rr_wgBudam;  
	private String rr_wgHr;  
	private float rr_rcTime;  
	private String rr_diffUnit;  
	private int rr_ordS1f;  
	private int rr_g8f_1c;  
	private int rr_g6f_2c;  
	private int rr_g4f_3c;  
	private int rr_g3f_4c;  
	private int rr_g2f;  
	private int rr_ordG1f;  
	private float rr_rcTimeS1f;  
	private float rr_rcTime_1c;  
	private float rr_rcTime_2c;  
	private float rr_rcTime_3c;  
	private float rr_rcTime_4c;  
	private float rr_rcTimeG3f;  
	private float rr_rcTimeG2f;  
	private float rr_rcTimeG1f;  
	private float rr_winOdds;  
	private float rr_plcOdds;
	private String rr_trName;
	private String rr_trNo;
	private String rr_owName;
	private String rr_owNo;
	private String rr_jkName;
	private String rr_jkNo;
	private int rr_rating;
	public RaceResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RaceResultDto(int rr_meet, String rr_rcDate, int rr_rcNo, String rr_hrNo, String rr_hrName, int rr_ord,
			int rr_chulNo, String rr_wgBudam, String rr_wgHr, float rr_rcTime, String rr_diffUnit, int rr_ordS1f,
			int rr_g8f_1c, int rr_g6f_2c, int rr_g4f_3c, int rr_g3f_4c, int rr_g2f, int rr_ordG1f, float rr_rcTimeS1f,
			float rr_rcTime_1c, float rr_rcTime_2c, float rr_rcTime_3c, float rr_rcTime_4c, float rr_rcTimeG3f,
			float rr_rcTimeG2f, float rr_rcTimeG1f, float rr_winOdds, float rr_plcOdds, String rr_trName,
			String rr_trNo, String rr_owName, String rr_owNo, String rr_jkName, String rr_jkNo, int rr_rating) {
		super();
		this.rr_meet = rr_meet;
		this.rr_rcDate = rr_rcDate;
		this.rr_rcNo = rr_rcNo;
		this.rr_hrNo = rr_hrNo;
		this.rr_hrName = rr_hrName;
		this.rr_ord = rr_ord;
		this.rr_chulNo = rr_chulNo;
		this.rr_wgBudam = rr_wgBudam;
		this.rr_wgHr = rr_wgHr;
		this.rr_rcTime = rr_rcTime;
		this.rr_diffUnit = rr_diffUnit;
		this.rr_ordS1f = rr_ordS1f;
		this.rr_g8f_1c = rr_g8f_1c;
		this.rr_g6f_2c = rr_g6f_2c;
		this.rr_g4f_3c = rr_g4f_3c;
		this.rr_g3f_4c = rr_g3f_4c;
		this.rr_g2f = rr_g2f;
		this.rr_ordG1f = rr_ordG1f;
		this.rr_rcTimeS1f = rr_rcTimeS1f;
		this.rr_rcTime_1c = rr_rcTime_1c;
		this.rr_rcTime_2c = rr_rcTime_2c;
		this.rr_rcTime_3c = rr_rcTime_3c;
		this.rr_rcTime_4c = rr_rcTime_4c;
		this.rr_rcTimeG3f = rr_rcTimeG3f;
		this.rr_rcTimeG2f = rr_rcTimeG2f;
		this.rr_rcTimeG1f = rr_rcTimeG1f;
		this.rr_winOdds = rr_winOdds;
		this.rr_plcOdds = rr_plcOdds;
		this.rr_trName = rr_trName;
		this.rr_trNo = rr_trNo;
		this.rr_owName = rr_owName;
		this.rr_owNo = rr_owNo;
		this.rr_jkName = rr_jkName;
		this.rr_jkNo = rr_jkNo;
		this.rr_rating = rr_rating;
	}
	@Override
	public String toString() {
		return "RaceResultDto [rr_meet=" + rr_meet + ", rr_rcDate=" + rr_rcDate + ", rr_rcNo=" + rr_rcNo + ", rr_hrNo="
				+ rr_hrNo + ", rr_hrName=" + rr_hrName + ", rr_ord=" + rr_ord + ", rr_chulNo=" + rr_chulNo
				+ ", rr_wgBudam=" + rr_wgBudam + ", rr_wgHr=" + rr_wgHr + ", rr_rcTime=" + rr_rcTime + ", rr_diffUnit="
				+ rr_diffUnit + ", rr_ordS1f=" + rr_ordS1f + ", rr_g8f_1c=" + rr_g8f_1c + ", rr_g6f_2c=" + rr_g6f_2c
				+ ", rr_g4f_3c=" + rr_g4f_3c + ", rr_g3f_4c=" + rr_g3f_4c + ", rr_g2f=" + rr_g2f + ", rr_ordG1f="
				+ rr_ordG1f + ", rr_rcTimeS1f=" + rr_rcTimeS1f + ", rr_rcTime_1c=" + rr_rcTime_1c + ", rr_rcTime_2c="
				+ rr_rcTime_2c + ", rr_rcTime_3c=" + rr_rcTime_3c + ", rr_rcTime_4c=" + rr_rcTime_4c + ", rr_rcTimeG3f="
				+ rr_rcTimeG3f + ", rr_rcTimeG2f=" + rr_rcTimeG2f + ", rr_rcTimeG1f=" + rr_rcTimeG1f + ", rr_winOdds="
				+ rr_winOdds + ", rr_plcOdds=" + rr_plcOdds + ", rr_trName=" + rr_trName + ", rr_trNo=" + rr_trNo
				+ ", rr_owName=" + rr_owName + ", rr_owNo=" + rr_owNo + ", rr_jkName=" + rr_jkName + ", rr_jkNo="
				+ rr_jkNo + ", rr_rating=" + rr_rating + "]";
	}
	public int getRr_meet() {
		return rr_meet;
	}
	public void setRr_meet(int rr_meet) {
		this.rr_meet = rr_meet;
	}
	public String getRr_rcDate() {
		return rr_rcDate;
	}
	public void setRr_rcDate(String rr_rcDate) {
		this.rr_rcDate = rr_rcDate;
	}
	public int getRr_rcNo() {
		return rr_rcNo;
	}
	public void setRr_rcNo(int rr_rcNo) {
		this.rr_rcNo = rr_rcNo;
	}
	public String getRr_hrNo() {
		return rr_hrNo;
	}
	public void setRr_hrNo(String rr_hrNo) {
		this.rr_hrNo = rr_hrNo;
	}
	public String getRr_hrName() {
		return rr_hrName;
	}
	public void setRr_hrName(String rr_hrName) {
		this.rr_hrName = rr_hrName;
	}
	public int getRr_ord() {
		return rr_ord;
	}
	public void setRr_ord(int rr_ord) {
		this.rr_ord = rr_ord;
	}
	public int getRr_chulNo() {
		return rr_chulNo;
	}
	public void setRr_chulNo(int rr_chulNo) {
		this.rr_chulNo = rr_chulNo;
	}
	public String getRr_wgBudam() {
		return rr_wgBudam;
	}
	public void setRr_wgBudam(String rr_wgBudam) {
		this.rr_wgBudam = rr_wgBudam;
	}
	public String getRr_wgHr() {
		return rr_wgHr;
	}
	public void setRr_wgHr(String rr_wgHr) {
		this.rr_wgHr = rr_wgHr;
	}
	public float getRr_rcTime() {
		return rr_rcTime;
	}
	public void setRr_rcTime(float rr_rcTime) {
		this.rr_rcTime = rr_rcTime;
	}
	public String getRr_diffUnit() {
		return rr_diffUnit;
	}
	public void setRr_diffUnit(String rr_diffUnit) {
		this.rr_diffUnit = rr_diffUnit;
	}
	public int getRr_ordS1f() {
		return rr_ordS1f;
	}
	public void setRr_ordS1f(int rr_ordS1f) {
		this.rr_ordS1f = rr_ordS1f;
	}
	public int getRr_g8f_1c() {
		return rr_g8f_1c;
	}
	public void setRr_g8f_1c(int rr_g8f_1c) {
		this.rr_g8f_1c = rr_g8f_1c;
	}
	public int getRr_g6f_2c() {
		return rr_g6f_2c;
	}
	public void setRr_g6f_2c(int rr_g6f_2c) {
		this.rr_g6f_2c = rr_g6f_2c;
	}
	public int getRr_g4f_3c() {
		return rr_g4f_3c;
	}
	public void setRr_g4f_3c(int rr_g4f_3c) {
		this.rr_g4f_3c = rr_g4f_3c;
	}
	public int getRr_g3f_4c() {
		return rr_g3f_4c;
	}
	public void setRr_g3f_4c(int rr_g3f_4c) {
		this.rr_g3f_4c = rr_g3f_4c;
	}
	public int getRr_g2f() {
		return rr_g2f;
	}
	public void setRr_g2f(int rr_g2f) {
		this.rr_g2f = rr_g2f;
	}
	public int getRr_ordG1f() {
		return rr_ordG1f;
	}
	public void setRr_ordG1f(int rr_ordG1f) {
		this.rr_ordG1f = rr_ordG1f;
	}
	public float getRr_rcTimeS1f() {
		return rr_rcTimeS1f;
	}
	public void setRr_rcTimeS1f(float rr_rcTimeS1f) {
		this.rr_rcTimeS1f = rr_rcTimeS1f;
	}
	public float getRr_rcTime_1c() {
		return rr_rcTime_1c;
	}
	public void setRr_rcTime_1c(float rr_rcTime_1c) {
		this.rr_rcTime_1c = rr_rcTime_1c;
	}
	public float getRr_rcTime_2c() {
		return rr_rcTime_2c;
	}
	public void setRr_rcTime_2c(float rr_rcTime_2c) {
		this.rr_rcTime_2c = rr_rcTime_2c;
	}
	public float getRr_rcTime_3c() {
		return rr_rcTime_3c;
	}
	public void setRr_rcTime_3c(float rr_rcTime_3c) {
		this.rr_rcTime_3c = rr_rcTime_3c;
	}
	public float getRr_rcTime_4c() {
		return rr_rcTime_4c;
	}
	public void setRr_rcTime_4c(float rr_rcTime_4c) {
		this.rr_rcTime_4c = rr_rcTime_4c;
	}
	public float getRr_rcTimeG3f() {
		return rr_rcTimeG3f;
	}
	public void setRr_rcTimeG3f(float rr_rcTimeG3f) {
		this.rr_rcTimeG3f = rr_rcTimeG3f;
	}
	public float getRr_rcTimeG2f() {
		return rr_rcTimeG2f;
	}
	public void setRr_rcTimeG2f(float rr_rcTimeG2f) {
		this.rr_rcTimeG2f = rr_rcTimeG2f;
	}
	public float getRr_rcTimeG1f() {
		return rr_rcTimeG1f;
	}
	public void setRr_rcTimeG1f(float rr_rcTimeG1f) {
		this.rr_rcTimeG1f = rr_rcTimeG1f;
	}
	public float getRr_winOdds() {
		return rr_winOdds;
	}
	public void setRr_winOdds(float rr_winOdds) {
		this.rr_winOdds = rr_winOdds;
	}
	public float getRr_plcOdds() {
		return rr_plcOdds;
	}
	public void setRr_plcOdds(float rr_plcOdds) {
		this.rr_plcOdds = rr_plcOdds;
	}
	public String getRr_trName() {
		return rr_trName;
	}
	public void setRr_trName(String rr_trName) {
		this.rr_trName = rr_trName;
	}
	public String getRr_trNo() {
		return rr_trNo;
	}
	public void setRr_trNo(String rr_trNo) {
		this.rr_trNo = rr_trNo;
	}
	public String getRr_owName() {
		return rr_owName;
	}
	public void setRr_owName(String rr_owName) {
		this.rr_owName = rr_owName;
	}
	public String getRr_owNo() {
		return rr_owNo;
	}
	public void setRr_owNo(String rr_owNo) {
		this.rr_owNo = rr_owNo;
	}
	public String getRr_jkName() {
		return rr_jkName;
	}
	public void setRr_jkName(String rr_jkName) {
		this.rr_jkName = rr_jkName;
	}
	public String getRr_jkNo() {
		return rr_jkNo;
	}
	public void setRr_jkNo(String rr_jkNo) {
		this.rr_jkNo = rr_jkNo;
	}
	public int getRr_rating() {
		return rr_rating;
	}
	public void setRr_rating(int rr_rating) {
		this.rr_rating = rr_rating;
	}
	
	

}
