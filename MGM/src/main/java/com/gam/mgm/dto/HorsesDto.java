package com.gam.mgm.dto;

public class HorsesDto {
	private int hr_seq;
	private String hr_no;//마번
	private String hr_htName;	//말이름
	private String hr_name; // 말 출신 국가
	private String hr_sex; //성별
	private String hr_birthday; //생일
	private int hr_age; //나이
	private String hr_rank; //등급
	private int hr_part;	//조
	private String hr_trName; //조교사명
	private String hr_owName; //마주명
	private String hr_faHrName; //아빠
	private String hr_moHrName; //엄마
	private int hr_rcCntT; //총출전
	private int hr_ord1CntT; //통산 1착 횟수
	private int hr_ord2CntT; //2착
	private int hr_ord3CntT; //3착
	private int hr_rcCntY; //최근 1년출전 
	private int hr_ord1CntY;// 최근 1년 1착
	private int hr_ord2CntY;//2착
	private int hr_ord3CntY;//3착
	private int hr_chaksunT; //총수득 상금
	private int hr_rating; //레이팅
	private int hr_hrLastAmt; //최근 거래가
	private int hr_meet; //경기장
	private String debut; //데뷔일
	private String recentRcDate; //최근 경주일
	private String rhrRegDt1; //경주마 등록일
	private String auctionMon; //최초 경매가
	public HorsesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HorsesDto(int hr_seq, String hr_no, String hr_htName, String hr_name, String hr_sex, String hr_birthday,
			int hr_age, String hr_rank, int hr_part, String hr_trName, String hr_owName, String hr_faHrName,
			String hr_moHrName, int hr_rcCntT, int hr_ord1CntT, int hr_ord2CntT, int hr_ord3CntT, int hr_rcCntY,
			int hr_ord1CntY, int hr_ord2CntY, int hr_ord3CntY, int hr_chaksunT, int hr_rating, int hr_hrLastAmt,
			int hr_meet, String debut, String recentRcDate, String rhrRegDt1, String auctionMon) {
		super();
		this.hr_seq = hr_seq;
		this.hr_no = hr_no;
		this.hr_htName = hr_htName;
		this.hr_name = hr_name;
		this.hr_sex = hr_sex;
		this.hr_birthday = hr_birthday;
		this.hr_age = hr_age;
		this.hr_rank = hr_rank;
		this.hr_part = hr_part;
		this.hr_trName = hr_trName;
		this.hr_owName = hr_owName;
		this.hr_faHrName = hr_faHrName;
		this.hr_moHrName = hr_moHrName;
		this.hr_rcCntT = hr_rcCntT;
		this.hr_ord1CntT = hr_ord1CntT;
		this.hr_ord2CntT = hr_ord2CntT;
		this.hr_ord3CntT = hr_ord3CntT;
		this.hr_rcCntY = hr_rcCntY;
		this.hr_ord1CntY = hr_ord1CntY;
		this.hr_ord2CntY = hr_ord2CntY;
		this.hr_ord3CntY = hr_ord3CntY;
		this.hr_chaksunT = hr_chaksunT;
		this.hr_rating = hr_rating;
		this.hr_hrLastAmt = hr_hrLastAmt;
		this.hr_meet = hr_meet;
		this.debut = debut;
		this.recentRcDate = recentRcDate;
		this.rhrRegDt1 = rhrRegDt1;
		this.auctionMon = auctionMon;
	}
	@Override
	public String toString() {
		return "HorsesDto [hr_seq=" + hr_seq + ", hr_no=" + hr_no + ", hr_htName=" + hr_htName + ", hr_name=" + hr_name
				+ ", hr_sex=" + hr_sex + ", hr_birthday=" + hr_birthday + ", hr_age=" + hr_age + ", hr_rank=" + hr_rank
				+ ", hr_part=" + hr_part + ", hr_trName=" + hr_trName + ", hr_owName=" + hr_owName + ", hr_faHrName="
				+ hr_faHrName + ", hr_moHrName=" + hr_moHrName + ", hr_rcCntT=" + hr_rcCntT + ", hr_ord1CntT="
				+ hr_ord1CntT + ", hr_ord2CntT=" + hr_ord2CntT + ", hr_ord3CntT=" + hr_ord3CntT + ", hr_rcCntY="
				+ hr_rcCntY + ", hr_ord1CntY=" + hr_ord1CntY + ", hr_ord2CntY=" + hr_ord2CntY + ", hr_ord3CntY="
				+ hr_ord3CntY + ", hr_chaksunT=" + hr_chaksunT + ", hr_rating=" + hr_rating + ", hr_hrLastAmt="
				+ hr_hrLastAmt + ", hr_meet=" + hr_meet + ", debut=" + debut + ", recentRcDate=" + recentRcDate
				+ ", rhrRegDt1=" + rhrRegDt1 + ", auctionMon=" + auctionMon + "]";
	}
	public int getHr_seq() {
		return hr_seq;
	}
	public void setHr_seq(int hr_seq) {
		this.hr_seq = hr_seq;
	}
	public String getHr_no() {
		return hr_no;
	}
	public void setHr_no(String hr_no) {
		this.hr_no = hr_no;
	}
	public String getHr_htName() {
		return hr_htName;
	}
	public void setHr_htName(String hr_htName) {
		this.hr_htName = hr_htName;
	}
	public String getHr_name() {
		return hr_name;
	}
	public void setHr_name(String hr_name) {
		this.hr_name = hr_name;
	}
	public String getHr_sex() {
		return hr_sex;
	}
	public void setHr_sex(String hr_sex) {
		this.hr_sex = hr_sex;
	}
	public String getHr_birthday() {
		return hr_birthday;
	}
	public void setHr_birthday(String hr_birthday) {
		this.hr_birthday = hr_birthday;
	}
	public int getHr_age() {
		return hr_age;
	}
	public void setHr_age(int hr_age) {
		this.hr_age = hr_age;
	}
	public String getHr_rank() {
		return hr_rank;
	}
	public void setHr_rank(String hr_rank) {
		this.hr_rank = hr_rank;
	}
	public int getHr_part() {
		return hr_part;
	}
	public void setHr_part(int hr_part) {
		this.hr_part = hr_part;
	}
	public String getHr_trName() {
		return hr_trName;
	}
	public void setHr_trName(String hr_trName) {
		this.hr_trName = hr_trName;
	}
	public String getHr_owName() {
		return hr_owName;
	}
	public void setHr_owName(String hr_owName) {
		this.hr_owName = hr_owName;
	}
	public String getHr_faHrName() {
		return hr_faHrName;
	}
	public void setHr_faHrName(String hr_faHrName) {
		this.hr_faHrName = hr_faHrName;
	}
	public String getHr_moHrName() {
		return hr_moHrName;
	}
	public void setHr_moHrName(String hr_moHrName) {
		this.hr_moHrName = hr_moHrName;
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
	public int getHr_chaksunT() {
		return hr_chaksunT;
	}
	public void setHr_chaksunT(int hr_chaksunT) {
		this.hr_chaksunT = hr_chaksunT;
	}
	public int getHr_rating() {
		return hr_rating;
	}
	public void setHr_rating(int hr_rating) {
		this.hr_rating = hr_rating;
	}
	public int getHr_hrLastAmt() {
		return hr_hrLastAmt;
	}
	public void setHr_hrLastAmt(int hr_hrLastAmt) {
		this.hr_hrLastAmt = hr_hrLastAmt;
	}
	public int getHr_meet() {
		return hr_meet;
	}
	public void setHr_meet(int hr_meet) {
		this.hr_meet = hr_meet;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getRecentRcDate() {
		return recentRcDate;
	}
	public void setRecentRcDate(String recentRcDate) {
		this.recentRcDate = recentRcDate;
	}
	public String getRhrRegDt1() {
		return rhrRegDt1;
	}
	public void setRhrRegDt1(String rhrRegDt1) {
		this.rhrRegDt1 = rhrRegDt1;
	}
	public String getAuctionMon() {
		return auctionMon;
	}
	public void setAuctionMon(String auctionMon) {
		this.auctionMon = auctionMon;
	}
	
	
	
	
}
