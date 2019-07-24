package com.gam.mgm.dto;

public class TrainerDto {
	private int tr_seq;
	private String tr_name;
	private int tr_part;
	private String tr_birth;
	private int tr_age;
	private String tr_stdate;
	private int tr_rccntt;
	private int tr_ord1cntt;
	private int tr_ord2cntt;
	private int tr_ord3cntt;
	private int tr_rccnty;
	private int tr_ord1cnty;
	private int tr_ord2cnty;
	private int tr_ord3cnty;
	private int tr_meet;
	
	
	public TrainerDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TrainerDto(int tr_seq, String tr_name, int tr_part, String tr_birth, int tr_age, String tr_stdate, int tr_rccntt,
			int tr_ord1cntt, int tr_ord2cntt, int tr_ord3cntt, int tr_rccnty, int tr_ord1cnty, int tr_ord2cnty,
			int tr_ord3cnty,int tr_meet) {
		super();
		this.tr_seq = tr_seq;
		this.tr_name = tr_name;
		this.tr_part = tr_part;
		this.tr_birth = tr_birth;
		this.tr_age = tr_age;
		this.tr_stdate = tr_stdate;
		this.tr_rccntt = tr_rccntt;
		this.tr_ord1cntt = tr_ord1cntt;
		this.tr_ord2cntt = tr_ord2cntt;
		this.tr_ord3cntt = tr_ord3cntt;
		this.tr_rccnty = tr_rccnty;
		this.tr_ord1cnty = tr_ord1cnty;
		this.tr_ord2cnty = tr_ord2cnty;
		this.tr_ord3cnty = tr_ord3cnty;
		this.tr_meet = tr_meet;
	}


	public int getTr_seq() {
		return tr_seq;
	}


	public void setTr_seq(int tr_seq) {
		this.tr_seq = tr_seq;
	}


	public String getTr_name() {
		return tr_name;
	}


	public void setTr_name(String tr_name) {
		this.tr_name = tr_name;
	}


	public int getTr_part() {
		return tr_part;
	}


	public void setTr_part(int tr_part) {
		this.tr_part = tr_part;
	}


	public String getTr_birth() {
		return tr_birth;
	}


	public void setTr_birth(String tr_birth) {
		this.tr_birth = tr_birth;
	}


	public int getTr_age() {
		return tr_age;
	}


	public void setTr_age(int tr_age) {
		this.tr_age = tr_age;
	}


	public String getTr_stdate() {
		return tr_stdate;
	}


	public void setTr_stdate(String tr_stdate) {
		this.tr_stdate = tr_stdate;
	}


	public int getTr_rccntt() {
		return tr_rccntt;
	}


	public void setTr_rccntt(int tr_rccntt) {
		this.tr_rccntt = tr_rccntt;
	}


	public int getTr_ord1cntt() {
		return tr_ord1cntt;
	}


	public void setTr_ord1cntt(int tr_ord1cntt) {
		this.tr_ord1cntt = tr_ord1cntt;
	}


	public int getTr_ord2cntt() {
		return tr_ord2cntt;
	}


	public void setTr_ord2cntt(int tr_ord2cntt) {
		this.tr_ord2cntt = tr_ord2cntt;
	}


	public int getTr_ord3cntt() {
		return tr_ord3cntt;
	}


	public void setTr_ord3cntt(int tr_ord3cntt) {
		this.tr_ord3cntt = tr_ord3cntt;
	}


	public int getTr_rccnty() {
		return tr_rccnty;
	}


	public void setTr_rccnty(int tr_rccnty) {
		this.tr_rccnty = tr_rccnty;
	}


	public int getTr_ord1cnty() {
		return tr_ord1cnty;
	}


	public void setTr_ord1cnty(int tr_ord1cnty) {
		this.tr_ord1cnty = tr_ord1cnty;
	}


	public int getTr_ord2cnty() {
		return tr_ord2cnty;
	}


	public void setTr_ord2cnty(int tr_ord2cnty) {
		this.tr_ord2cnty = tr_ord2cnty;
	}


	public int getTr_ord3cnty() {
		return tr_ord3cnty;
	}


	public void setTr_ord3cnty(int tr_ord3cnty) {
		this.tr_ord3cnty = tr_ord3cnty;
	}
	
	public int getTr_meet() {
		return tr_meet;
	}
	
	public void setTr_meet(int tr_meet) {
		this.tr_meet = tr_meet;
	}


	@Override
	public String toString() {
		return "TrainerDto [tr_seq=" + tr_seq + ", tr_name=" + tr_name + ", tr_part=" + tr_part + ", tr_birth="
				+ tr_birth + ", tr_age=" + tr_age + ", tr_stdate=" + tr_stdate + ", tr_rccntt=" + tr_rccntt
				+ ", tr_ord1cntt=" + tr_ord1cntt + ", tr_ord2cntt=" + tr_ord2cntt + ", tr_ord3cntt=" + tr_ord3cntt
				+ ", tr_rccnty=" + tr_rccnty + ", tr_ord1cnty=" + tr_ord1cnty + ", tr_ord2cnty=" + tr_ord2cnty
				+ ", tr_ord3cnty=" + tr_ord3cnty + ", tr_meet=" + tr_meet + "]";
	}
	
}
