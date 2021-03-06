package com.gam.mgm.dto;

public class OwnerDto {
	private int ow_seq;
	private String ow_no;
	private String ow_name;
	private int ow_totHorses;
	private int ow_cancledHorses;
	private int ow_nowHorses;
	private String ow_stDate;
	private int ow_rcCntT;
	private int ow_ord1CntT;
	private int ow_ord2CntT;
	private int ow_ord3CntT;
	private int ow_rcCntY;
	private int ow_ord1CntY;
	private int ow_ord2CntY;
	private int ow_ord3CntY;
	private long ow_chaksunY;
	private long ow_chaksunT;
	private int ow_meet;
	public OwnerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OwnerDto(int ow_seq, String ow_no, String ow_name, int ow_totHorses, int ow_cancledHorses, int ow_nowHorses,
			String ow_stDate, int ow_rcCntT, int ow_ord1CntT, int ow_ord2CntT, int ow_ord3CntT, int ow_rcCntY,
			int ow_ord1CntY, int ow_ord2CntY, int ow_ord3CntY, long ow_chaksunY, long ow_chaksunT, int ow_meet) {
		super();
		this.ow_seq = ow_seq;
		this.ow_no = ow_no;
		this.ow_name = ow_name;
		this.ow_totHorses = ow_totHorses;
		this.ow_cancledHorses = ow_cancledHorses;
		this.ow_nowHorses = ow_nowHorses;
		this.ow_stDate = ow_stDate;
		this.ow_rcCntT = ow_rcCntT;
		this.ow_ord1CntT = ow_ord1CntT;
		this.ow_ord2CntT = ow_ord2CntT;
		this.ow_ord3CntT = ow_ord3CntT;
		this.ow_rcCntY = ow_rcCntY;
		this.ow_ord1CntY = ow_ord1CntY;
		this.ow_ord2CntY = ow_ord2CntY;
		this.ow_ord3CntY = ow_ord3CntY;
		this.ow_chaksunY = ow_chaksunY;
		this.ow_chaksunT = ow_chaksunT;
		this.ow_meet = ow_meet;
	}
	@Override
	public String toString() {
		return "OwnerDto [ow_seq=" + ow_seq + ", ow_no=" + ow_no + ", ow_name=" + ow_name + ", ow_totHorses="
				+ ow_totHorses + ", ow_cancledHorses=" + ow_cancledHorses + ", ow_nowHorses=" + ow_nowHorses
				+ ", ow_stDate=" + ow_stDate + ", ow_rcCntT=" + ow_rcCntT + ", ow_ord1CntT=" + ow_ord1CntT
				+ ", ow_ord2CntT=" + ow_ord2CntT + ", ow_ord3CntT=" + ow_ord3CntT + ", ow_rcCntY=" + ow_rcCntY
				+ ", ow_ord1CntY=" + ow_ord1CntY + ", ow_ord2CntY=" + ow_ord2CntY + ", ow_ord3CntY=" + ow_ord3CntY
				+ ", ow_chaksunY=" + ow_chaksunY + ", ow_chaksunT=" + ow_chaksunT + ", ow_meet=" + ow_meet + "]";
	}
	public int getOw_seq() {
		return ow_seq;
	}
	public void setOw_seq(int ow_seq) {
		this.ow_seq = ow_seq;
	}
	public String getOw_no() {
		return ow_no;
	}
	public void setOw_no(String ow_no) {
		this.ow_no = ow_no;
	}
	public String getOw_name() {
		return ow_name;
	}
	public void setOw_name(String ow_name) {
		this.ow_name = ow_name;
	}
	public int getOw_totHorses() {
		return ow_totHorses;
	}
	public void setOw_totHorses(int ow_totHorses) {
		this.ow_totHorses = ow_totHorses;
	}
	public int getOw_cancledHorses() {
		return ow_cancledHorses;
	}
	public void setOw_cancledHorses(int ow_cancledHorses) {
		this.ow_cancledHorses = ow_cancledHorses;
	}
	public int getOw_nowHorses() {
		return ow_nowHorses;
	}
	public void setOw_nowHorses(int ow_nowHorses) {
		this.ow_nowHorses = ow_nowHorses;
	}
	public String getOw_stDate() {
		return ow_stDate;
	}
	public void setOw_stDate(String ow_stDate) {
		this.ow_stDate = ow_stDate;
	}
	public int getOw_rcCntT() {
		return ow_rcCntT;
	}
	public void setOw_rcCntT(int ow_rcCntT) {
		this.ow_rcCntT = ow_rcCntT;
	}
	public int getOw_ord1CntT() {
		return ow_ord1CntT;
	}
	public void setOw_ord1CntT(int ow_ord1CntT) {
		this.ow_ord1CntT = ow_ord1CntT;
	}
	public int getOw_ord2CntT() {
		return ow_ord2CntT;
	}
	public void setOw_ord2CntT(int ow_ord2CntT) {
		this.ow_ord2CntT = ow_ord2CntT;
	}
	public int getOw_ord3CntT() {
		return ow_ord3CntT;
	}
	public void setOw_ord3CntT(int ow_ord3CntT) {
		this.ow_ord3CntT = ow_ord3CntT;
	}
	public int getOw_rcCntY() {
		return ow_rcCntY;
	}
	public void setOw_rcCntY(int ow_rcCntY) {
		this.ow_rcCntY = ow_rcCntY;
	}
	public int getOw_ord1CntY() {
		return ow_ord1CntY;
	}
	public void setOw_ord1CntY(int ow_ord1CntY) {
		this.ow_ord1CntY = ow_ord1CntY;
	}
	public int getOw_ord2CntY() {
		return ow_ord2CntY;
	}
	public void setOw_ord2CntY(int ow_ord2CntY) {
		this.ow_ord2CntY = ow_ord2CntY;
	}
	public int getOw_ord3CntY() {
		return ow_ord3CntY;
	}
	public void setOw_ord3CntY(int ow_ord3CntY) {
		this.ow_ord3CntY = ow_ord3CntY;
	}
	public long getOw_chaksunY() {
		return ow_chaksunY;
	}
	public void setOw_chaksunY(long ow_chaksunY) {
		this.ow_chaksunY = ow_chaksunY;
	}
	public long getOw_chaksunT() {
		return ow_chaksunT;
	}
	public void setOw_chaksunT(long ow_chaksunT) {
		this.ow_chaksunT = ow_chaksunT;
	}
	public int getOw_meet() {
		return ow_meet;
	}
	public void setOw_meet(int ow_meet) {
		this.ow_meet = ow_meet;
	}
	
}
