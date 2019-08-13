package com.gam.mgm.dto;

import java.util.Date;

public class RaceEntryDto {
	private int re_meet;
	private Date re_pgDate; //경주 예정일
	private int re_pgNo; //경주 예정번호
	private String re_rcName;
	private String re_rank;
	private int re_rcDist;
	private String re_budam; //부담구분
	private String re_prizeCond; //상금조건
	private String re_ageCond; //연령조건
	private long re_chaksun1;
	private long re_chaksun2;
	private long re_chaksun3;
	private long re_chaksun4;
	private long re_chaksun5;
	private int re_enNo; //경주마 등록번호
	private int re_recentRating; //레이팅
	private String re_hrName;
	private String re_hrNo;
	private String re_name; //경주마 산지
	private String re_sex;
	private String re_age;
	private String re_trName;
	private String re_trNo;
	private String re_owName;
	private String re_owNo;
	private int re_rcCntY; //1년 전적
	private long re_calPrize_6m; //최근 6개월 상금
	private long re_calPrizeY; //최근 1년상금
	private long re_chaksunT; //통산 상금
	public RaceEntryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RaceEntryDto(int re_meet, Date re_pgDate, int re_pgNo, String re_rcName, String re_rank, int re_rcDist,
			String re_budam, String re_prizeCond, String re_ageCond, long re_chaksun1, long re_chaksun2,
			long re_chaksun3, long re_chaksun4, long re_chaksun5, int re_enNo, int re_recentRating, String re_hrName,
			String re_hrNo, String re_name, String re_sex, String re_age, String re_trName, String re_trNo,
			String re_owName, String re_owNo, int re_rcCntY, long re_calPrize_6m, long re_calPrizeY, long re_chaksunT) {
		super();
		this.re_meet = re_meet;
		this.re_pgDate = re_pgDate;
		this.re_pgNo = re_pgNo;
		this.re_rcName = re_rcName;
		this.re_rank = re_rank;
		this.re_rcDist = re_rcDist;
		this.re_budam = re_budam;
		this.re_prizeCond = re_prizeCond;
		this.re_ageCond = re_ageCond;
		this.re_chaksun1 = re_chaksun1;
		this.re_chaksun2 = re_chaksun2;
		this.re_chaksun3 = re_chaksun3;
		this.re_chaksun4 = re_chaksun4;
		this.re_chaksun5 = re_chaksun5;
		this.re_enNo = re_enNo;
		this.re_recentRating = re_recentRating;
		this.re_hrName = re_hrName;
		this.re_hrNo = re_hrNo;
		this.re_name = re_name;
		this.re_sex = re_sex;
		this.re_age = re_age;
		this.re_trName = re_trName;
		this.re_trNo = re_trNo;
		this.re_owName = re_owName;
		this.re_owNo = re_owNo;
		this.re_rcCntY = re_rcCntY;
		this.re_calPrize_6m = re_calPrize_6m;
		this.re_calPrizeY = re_calPrizeY;
		this.re_chaksunT = re_chaksunT;
	}
	@Override
	public String toString() {
		return "RaceEntryDto [re_meet=" + re_meet + ", re_pgDate=" + re_pgDate + ", re_pgNo=" + re_pgNo + ", re_rcName="
				+ re_rcName + ", re_rank=" + re_rank + ", re_rcDist=" + re_rcDist + ", re_budam=" + re_budam
				+ ", re_prizeCond=" + re_prizeCond + ", re_ageCond=" + re_ageCond + ", re_chaksun1=" + re_chaksun1
				+ ", re_chaksun2=" + re_chaksun2 + ", re_chaksun3=" + re_chaksun3 + ", re_chaksun4=" + re_chaksun4
				+ ", re_chaksun5=" + re_chaksun5 + ", re_enNo=" + re_enNo + ", re_recentRating=" + re_recentRating
				+ ", re_hrName=" + re_hrName + ", re_hrNo=" + re_hrNo + ", re_name=" + re_name + ", re_sex=" + re_sex
				+ ", re_age=" + re_age + ", re_trName=" + re_trName + ", re_trNo=" + re_trNo + ", re_owName="
				+ re_owName + ", re_owNo=" + re_owNo + ", re_rcCntY=" + re_rcCntY + ", re_calPrize_6m=" + re_calPrize_6m
				+ ", re_calPrizeY=" + re_calPrizeY + ", re_chaksunT=" + re_chaksunT + "]";
	}
	public int getRe_meet() {
		return re_meet;
	}
	public void setRe_meet(int re_meet) {
		this.re_meet = re_meet;
	}
	public Date getRe_pgDate() {
		return re_pgDate;
	}
	public void setRe_pgDate(Date re_pgDate) {
		this.re_pgDate = re_pgDate;
	}
	public int getRe_pgNo() {
		return re_pgNo;
	}
	public void setRe_pgNo(int re_pgNo) {
		this.re_pgNo = re_pgNo;
	}
	public String getRe_rcName() {
		return re_rcName;
	}
	public void setRe_rcName(String re_rcName) {
		this.re_rcName = re_rcName;
	}
	public String getRe_rank() {
		return re_rank;
	}
	public void setRe_rank(String re_rank) {
		this.re_rank = re_rank;
	}
	public int getRe_rcDist() {
		return re_rcDist;
	}
	public void setRe_rcDist(int re_rcDist) {
		this.re_rcDist = re_rcDist;
	}
	public String getRe_budam() {
		return re_budam;
	}
	public void setRe_budam(String re_budam) {
		this.re_budam = re_budam;
	}
	public String getRe_prizeCond() {
		return re_prizeCond;
	}
	public void setRe_prizeCond(String re_prizeCond) {
		this.re_prizeCond = re_prizeCond;
	}
	public String getRe_ageCond() {
		return re_ageCond;
	}
	public void setRe_ageCond(String re_ageCond) {
		this.re_ageCond = re_ageCond;
	}
	public long getRe_chaksun1() {
		return re_chaksun1;
	}
	public void setRe_chaksun1(long re_chaksun1) {
		this.re_chaksun1 = re_chaksun1;
	}
	public long getRe_chaksun2() {
		return re_chaksun2;
	}
	public void setRe_chaksun2(long re_chaksun2) {
		this.re_chaksun2 = re_chaksun2;
	}
	public long getRe_chaksun3() {
		return re_chaksun3;
	}
	public void setRe_chaksun3(long re_chaksun3) {
		this.re_chaksun3 = re_chaksun3;
	}
	public long getRe_chaksun4() {
		return re_chaksun4;
	}
	public void setRe_chaksun4(long re_chaksun4) {
		this.re_chaksun4 = re_chaksun4;
	}
	public long getRe_chaksun5() {
		return re_chaksun5;
	}
	public void setRe_chaksun5(long re_chaksun5) {
		this.re_chaksun5 = re_chaksun5;
	}
	public int getRe_enNo() {
		return re_enNo;
	}
	public void setRe_enNo(int re_enNo) {
		this.re_enNo = re_enNo;
	}
	public int getRe_recentRating() {
		return re_recentRating;
	}
	public void setRe_recentRating(int re_recentRating) {
		this.re_recentRating = re_recentRating;
	}
	public String getRe_hrName() {
		return re_hrName;
	}
	public void setRe_hrName(String re_hrName) {
		this.re_hrName = re_hrName;
	}
	public String getRe_hrNo() {
		return re_hrNo;
	}
	public void setRe_hrNo(String re_hrNo) {
		this.re_hrNo = re_hrNo;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getRe_sex() {
		return re_sex;
	}
	public void setRe_sex(String re_sex) {
		this.re_sex = re_sex;
	}
	public String getRe_age() {
		return re_age;
	}
	public void setRe_age(String re_age) {
		this.re_age = re_age;
	}
	public String getRe_trName() {
		return re_trName;
	}
	public void setRe_trName(String re_trName) {
		this.re_trName = re_trName;
	}
	public String getRe_trNo() {
		return re_trNo;
	}
	public void setRe_trNo(String re_trNo) {
		this.re_trNo = re_trNo;
	}
	public String getRe_owName() {
		return re_owName;
	}
	public void setRe_owName(String re_owName) {
		this.re_owName = re_owName;
	}
	public String getRe_owNo() {
		return re_owNo;
	}
	public void setRe_owNo(String re_owNo) {
		this.re_owNo = re_owNo;
	}
	public int getRe_rcCntY() {
		return re_rcCntY;
	}
	public void setRe_rcCntY(int re_rcCntY) {
		this.re_rcCntY = re_rcCntY;
	}
	public long getRe_calPrize_6m() {
		return re_calPrize_6m;
	}
	public void setRe_calPrize_6m(long re_calPrize_6m) {
		this.re_calPrize_6m = re_calPrize_6m;
	}
	public long getRe_calPrizeY() {
		return re_calPrizeY;
	}
	public void setRe_calPrizeY(long re_calPrizeY) {
		this.re_calPrizeY = re_calPrizeY;
	}
	public long getRe_chaksunT() {
		return re_chaksunT;
	}
	public void setRe_chaksunT(long re_chaksunT) {
		this.re_chaksunT = re_chaksunT;
	}
	
}
