package com.gam.mgm.dto;

import java.util.Date;


public class RacePlanDto {
	private int rp_meet;  
	private Date rp_rcDate;
	private String rp_rcDay;//요일
	private int rp_rcNo;  
	private int rp_chulNo; //출주번호
	private String rp_hrName; 
	private String rp_hrNo; 
	private String rp_prd; //산지
	private String rp_sex; 
	private String rp_age; 
	private int rp_wgBudam; //경주마 부담중량
	private int rp_rating;  //레이팅
	private String rp_jkName; 
	private String rp_jkNo;	
	private String rp_trName; 
	private String rp_trNo; 
	private String rp_owName; 
	private String rp_owNo; 
	private int rp_ilsu;  //경기일수
	private int rp_rcDist;   //경주거리
	private int rp_dusu;  //두수
	private String rp_rank; //등급조건
	private String rp_prizeCond; //상금조건
	private String rp_ageCond; //연령조건
	private String rp_stTime; //경기시간
	private String rp_budam; //부담구분
	private String rp_rcName; //경주명
	private long rp_chaksun1;
	private long rp_chaksun2;
	private long rp_chaksun3;
	private long rp_chaksun4; 
	private long rp_chaksun5;
	private int hr_rcCntT;
	private int hr_ord1CntT;
	private int hr_ord2CntT;
	private int hr_ord3CntT;
	private int hr_rcCntY;
	private int hr_ord1CntY;
	private int hr_ord2CntY;
	private int hr_ord3CntY;
	private String totalWinT;//통산전적 승률
	private String win1T;//통산전적 복승률
	private String win2T;//통산전적 연승률
	private String totalWinY;//1년전적 승률
	private String win1Y;//통산전적 복승률
	private String win2Y;//통산전적 연승률
	public RacePlanDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RacePlanDto(int rp_meet, Date rp_rcDate, String rp_rcDay, int rp_rcNo, int rp_chulNo, String rp_hrName,
			String rp_hrNo, String rp_prd, String rp_sex, String rp_age, int rp_wgBudam, int rp_rating,
			String rp_jkName, String rp_jkNo, String rp_trName, String rp_trNo, String rp_owName, String rp_owNo,
			int rp_ilsu, int rp_rcDist, int rp_dusu, String rp_rank, String rp_prizeCond, String rp_ageCond,
			String rp_stTime, String rp_budam, String rp_rcName, long rp_chaksun1, long rp_chaksun2, long rp_chaksun3,
			long rp_chaksun4, long rp_chaksun5, int hr_rcCntT, int hr_ord1CntT, int hr_ord2CntT, int hr_ord3CntT,
			int hr_rcCntY, int hr_ord1CntY, int hr_ord2CntY, int hr_ord3CntY, String totalWinT, String win1t,
			String win2t, String totalWinY, String win1y, String win2y) {
		super();
		this.rp_meet = rp_meet;
		this.rp_rcDate = rp_rcDate;
		this.rp_rcDay = rp_rcDay;
		this.rp_rcNo = rp_rcNo;
		this.rp_chulNo = rp_chulNo;
		this.rp_hrName = rp_hrName;
		this.rp_hrNo = rp_hrNo;
		this.rp_prd = rp_prd;
		this.rp_sex = rp_sex;
		this.rp_age = rp_age;
		this.rp_wgBudam = rp_wgBudam;
		this.rp_rating = rp_rating;
		this.rp_jkName = rp_jkName;
		this.rp_jkNo = rp_jkNo;
		this.rp_trName = rp_trName;
		this.rp_trNo = rp_trNo;
		this.rp_owName = rp_owName;
		this.rp_owNo = rp_owNo;
		this.rp_ilsu = rp_ilsu;
		this.rp_rcDist = rp_rcDist;
		this.rp_dusu = rp_dusu;
		this.rp_rank = rp_rank;
		this.rp_prizeCond = rp_prizeCond;
		this.rp_ageCond = rp_ageCond;
		this.rp_stTime = rp_stTime;
		this.rp_budam = rp_budam;
		this.rp_rcName = rp_rcName;
		this.rp_chaksun1 = rp_chaksun1;
		this.rp_chaksun2 = rp_chaksun2;
		this.rp_chaksun3 = rp_chaksun3;
		this.rp_chaksun4 = rp_chaksun4;
		this.rp_chaksun5 = rp_chaksun5;
		this.hr_rcCntT = hr_rcCntT;
		this.hr_ord1CntT = hr_ord1CntT;
		this.hr_ord2CntT = hr_ord2CntT;
		this.hr_ord3CntT = hr_ord3CntT;
		this.hr_rcCntY = hr_rcCntY;
		this.hr_ord1CntY = hr_ord1CntY;
		this.hr_ord2CntY = hr_ord2CntY;
		this.hr_ord3CntY = hr_ord3CntY;
		this.totalWinT = totalWinT;
		win1T = win1t;
		win2T = win2t;
		this.totalWinY = totalWinY;
		win1Y = win1y;
		win2Y = win2y;
	}
	@Override
	public String toString() {
		return "RacePlanDto [rp_meet=" + rp_meet + ", rp_rcDate=" + rp_rcDate + ", rp_rcDay=" + rp_rcDay + ", rp_rcNo="
				+ rp_rcNo + ", rp_chulNo=" + rp_chulNo + ", rp_hrName=" + rp_hrName + ", rp_hrNo=" + rp_hrNo
				+ ", rp_prd=" + rp_prd + ", rp_sex=" + rp_sex + ", rp_age=" + rp_age + ", rp_wgBudam=" + rp_wgBudam
				+ ", rp_rating=" + rp_rating + ", rp_jkName=" + rp_jkName + ", rp_jkNo=" + rp_jkNo + ", rp_trName="
				+ rp_trName + ", rp_trNo=" + rp_trNo + ", rp_owName=" + rp_owName + ", rp_owNo=" + rp_owNo
				+ ", rp_ilsu=" + rp_ilsu + ", rp_rcDist=" + rp_rcDist + ", rp_dusu=" + rp_dusu + ", rp_rank=" + rp_rank
				+ ", rp_prizeCond=" + rp_prizeCond + ", rp_ageCond=" + rp_ageCond + ", rp_stTime=" + rp_stTime
				+ ", rp_budam=" + rp_budam + ", rp_rcName=" + rp_rcName + ", rp_chaksun1=" + rp_chaksun1
				+ ", rp_chaksun2=" + rp_chaksun2 + ", rp_chaksun3=" + rp_chaksun3 + ", rp_chaksun4=" + rp_chaksun4
				+ ", rp_chaksun5=" + rp_chaksun5 + ", hr_rcCntT=" + hr_rcCntT + ", hr_ord1CntT=" + hr_ord1CntT
				+ ", hr_ord2CntT=" + hr_ord2CntT + ", hr_ord3CntT=" + hr_ord3CntT + ", hr_rcCntY=" + hr_rcCntY
				+ ", hr_ord1CntY=" + hr_ord1CntY + ", hr_ord2CntY=" + hr_ord2CntY + ", hr_ord3CntY=" + hr_ord3CntY
				+ ", totalWinT=" + totalWinT + ", win1T=" + win1T + ", win2T=" + win2T + ", totalWinY=" + totalWinY
				+ ", win1Y=" + win1Y + ", win2Y=" + win2Y + "]";
	}
	public int getRp_meet() {
		return rp_meet;
	}
	public void setRp_meet(int rp_meet) {
		this.rp_meet = rp_meet;
	}
	public Date getRp_rcDate() {
		return rp_rcDate;
	}
	public void setRp_rcDate(Date rp_rcDate) {
		this.rp_rcDate = rp_rcDate;
	}
	public String getRp_rcDay() {
		return rp_rcDay;
	}
	public void setRp_rcDay(String rp_rcDay) {
		this.rp_rcDay = rp_rcDay;
	}
	public int getRp_rcNo() {
		return rp_rcNo;
	}
	public void setRp_rcNo(int rp_rcNo) {
		this.rp_rcNo = rp_rcNo;
	}
	public int getRp_chulNo() {
		return rp_chulNo;
	}
	public void setRp_chulNo(int rp_chulNo) {
		this.rp_chulNo = rp_chulNo;
	}
	public String getRp_hrName() {
		return rp_hrName;
	}
	public void setRp_hrName(String rp_hrName) {
		this.rp_hrName = rp_hrName;
	}
	public String getRp_hrNo() {
		return rp_hrNo;
	}
	public void setRp_hrNo(String rp_hrNo) {
		this.rp_hrNo = rp_hrNo;
	}
	public String getRp_prd() {
		return rp_prd;
	}
	public void setRp_prd(String rp_prd) {
		this.rp_prd = rp_prd;
	}
	public String getRp_sex() {
		return rp_sex;
	}
	public void setRp_sex(String rp_sex) {
		this.rp_sex = rp_sex;
	}
	public String getRp_age() {
		return rp_age;
	}
	public void setRp_age(String rp_age) {
		this.rp_age = rp_age;
	}
	public int getRp_wgBudam() {
		return rp_wgBudam;
	}
	public void setRp_wgBudam(int rp_wgBudam) {
		this.rp_wgBudam = rp_wgBudam;
	}
	public int getRp_rating() {
		return rp_rating;
	}
	public void setRp_rating(int rp_rating) {
		this.rp_rating = rp_rating;
	}
	public String getRp_jkName() {
		return rp_jkName;
	}
	public void setRp_jkName(String rp_jkName) {
		this.rp_jkName = rp_jkName;
	}
	public String getRp_jkNo() {
		return rp_jkNo;
	}
	public void setRp_jkNo(String rp_jkNo) {
		this.rp_jkNo = rp_jkNo;
	}
	public String getRp_trName() {
		return rp_trName;
	}
	public void setRp_trName(String rp_trName) {
		this.rp_trName = rp_trName;
	}
	public String getRp_trNo() {
		return rp_trNo;
	}
	public void setRp_trNo(String rp_trNo) {
		this.rp_trNo = rp_trNo;
	}
	public String getRp_owName() {
		return rp_owName;
	}
	public void setRp_owName(String rp_owName) {
		this.rp_owName = rp_owName;
	}
	public String getRp_owNo() {
		return rp_owNo;
	}
	public void setRp_owNo(String rp_owNo) {
		this.rp_owNo = rp_owNo;
	}
	public int getRp_ilsu() {
		return rp_ilsu;
	}
	public void setRp_ilsu(int rp_ilsu) {
		this.rp_ilsu = rp_ilsu;
	}
	public int getRp_rcDist() {
		return rp_rcDist;
	}
	public void setRp_rcDist(int rp_rcDist) {
		this.rp_rcDist = rp_rcDist;
	}
	public int getRp_dusu() {
		return rp_dusu;
	}
	public void setRp_dusu(int rp_dusu) {
		this.rp_dusu = rp_dusu;
	}
	public String getRp_rank() {
		return rp_rank;
	}
	public void setRp_rank(String rp_rank) {
		this.rp_rank = rp_rank;
	}
	public String getRp_prizeCond() {
		return rp_prizeCond;
	}
	public void setRp_prizeCond(String rp_prizeCond) {
		this.rp_prizeCond = rp_prizeCond;
	}
	public String getRp_ageCond() {
		return rp_ageCond;
	}
	public void setRp_ageCond(String rp_ageCond) {
		this.rp_ageCond = rp_ageCond;
	}
	public String getRp_stTime() {
		return rp_stTime;
	}
	public void setRp_stTime(String rp_stTime) {
		this.rp_stTime = rp_stTime;
	}
	public String getRp_budam() {
		return rp_budam;
	}
	public void setRp_budam(String rp_budam) {
		this.rp_budam = rp_budam;
	}
	public String getRp_rcName() {
		return rp_rcName;
	}
	public void setRp_rcName(String rp_rcName) {
		this.rp_rcName = rp_rcName;
	}
	public long getRp_chaksun1() {
		return rp_chaksun1;
	}
	public void setRp_chaksun1(long rp_chaksun1) {
		this.rp_chaksun1 = rp_chaksun1;
	}
	public long getRp_chaksun2() {
		return rp_chaksun2;
	}
	public void setRp_chaksun2(long rp_chaksun2) {
		this.rp_chaksun2 = rp_chaksun2;
	}
	public long getRp_chaksun3() {
		return rp_chaksun3;
	}
	public void setRp_chaksun3(long rp_chaksun3) {
		this.rp_chaksun3 = rp_chaksun3;
	}
	public long getRp_chaksun4() {
		return rp_chaksun4;
	}
	public void setRp_chaksun4(long rp_chaksun4) {
		this.rp_chaksun4 = rp_chaksun4;
	}
	public long getRp_chaksun5() {
		return rp_chaksun5;
	}
	public void setRp_chaksun5(long rp_chaksun5) {
		this.rp_chaksun5 = rp_chaksun5;
	}
	public int getHr_rcCntT() {
		return hr_rcCntT;
	}
	public void setHr_rcCntT(int hr_rcCntT) {
		this.hr_rcCntT = hr_rcCntT;
	}
	public int getHr_ord1CntT() {
		return hr_ord1CntT;
	}
	public void setHr_ord1CntT(int hr_ord1CntT) {
		this.hr_ord1CntT = hr_ord1CntT;
	}
	public int getHr_ord2CntT() {
		return hr_ord2CntT;
	}
	public void setHr_ord2CntT(int hr_ord2CntT) {
		this.hr_ord2CntT = hr_ord2CntT;
	}
	public int getHr_ord3CntT() {
		return hr_ord3CntT;
	}
	public void setHr_ord3CntT(int hr_ord3CntT) {
		this.hr_ord3CntT = hr_ord3CntT;
	}
	public int getHr_rcCntY() {
		return hr_rcCntY;
	}
	public void setHr_rcCntY(int hr_rcCntY) {
		this.hr_rcCntY = hr_rcCntY;
	}
	public int getHr_ord1CntY() {
		return hr_ord1CntY;
	}
	public void setHr_ord1CntY(int hr_ord1CntY) {
		this.hr_ord1CntY = hr_ord1CntY;
	}
	public int getHr_ord2CntY() {
		return hr_ord2CntY;
	}
	public void setHr_ord2CntY(int hr_ord2CntY) {
		this.hr_ord2CntY = hr_ord2CntY;
	}
	public int getHr_ord3CntY() {
		return hr_ord3CntY;
	}
	public void setHr_ord3CntY(int hr_ord3CntY) {
		this.hr_ord3CntY = hr_ord3CntY;
	}
	public String getTotalWinT() {
		return totalWinT;
	}
	public void setTotalWinT(String totalWinT) {
		this.totalWinT = totalWinT;
	}
	public String getWin1T() {
		return win1T;
	}
	public void setWin1T(String win1t) {
		win1T = win1t;
	}
	public String getWin2T() {
		return win2T;
	}
	public void setWin2T(String win2t) {
		win2T = win2t;
	}
	public String getTotalWinY() {
		return totalWinY;
	}
	public void setTotalWinY(String totalWinY) {
		this.totalWinY = totalWinY;
	}
	public String getWin1Y() {
		return win1Y;
	}
	public void setWin1Y(String win1y) {
		win1Y = win1y;
	}
	public String getWin2Y() {
		return win2Y;
	}
	public void setWin2Y(String win2y) {
		win2Y = win2y;
	}
	
	
}
