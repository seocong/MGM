package com.gam.mgm.dto;

public class ChampionDto {
	private String rc_name;
	private String rc_date;
	private String hr_rank;
	private int rc_dist;
	private String hr_name;
	private int hr_birth;
	private String hr_sex;
	private String hr_fname;//부마명
	private String hr_mname;//모마명
	private int rc_chaksun;
	private String js_name;
	private String tr_name;
	private String meet;
	@Override
	public String toString() {
		return "CampionDto [rc_name=" + rc_name + ", rc_date=" + rc_date + ", hr_rank=" + hr_rank + ", rc_dist="
				+ rc_dist + ", hr_name=" + hr_name + ", hr_birth=" + hr_birth + ", hr_sex=" + hr_sex + ", hr_fname="
				+ hr_fname + ", hr_mname=" + hr_mname + ", rc_chaksun=" + rc_chaksun + ", js_name=" + js_name
				+ ", tr_name=" + tr_name + ", meet=" + meet + "]";
	}
	public String getRc_name() {
		return rc_name;
	}
	public void setRc_name(String rc_name) {
		this.rc_name = rc_name;
	}
	public String getRc_date() {
		return rc_date;
	}
	public void setRc_date(String rc_date) {
		this.rc_date = rc_date;
	}
	public String getHr_rank() {
		return hr_rank;
	}
	public void setHr_rank(String hr_rank) {
		this.hr_rank = hr_rank;
	}
	public int getRc_dist() {
		return rc_dist;
	}
	public void setRc_dist(int rc_dist) {
		this.rc_dist = rc_dist;
	}
	public String getHr_name() {
		return hr_name;
	}
	public void setHr_name(String hr_name) {
		this.hr_name = hr_name;
	}
	public int getHr_birth() {
		return hr_birth;
	}
	public void setHr_birth(int hr_birth) {
		this.hr_birth = hr_birth;
	}
	public String getHr_sex() {
		return hr_sex;
	}
	public void setHr_sex(String hr_sex) {
		this.hr_sex = hr_sex;
	}
	public String getHr_fname() {
		return hr_fname;
	}
	public void setHr_fname(String hr_fname) {
		this.hr_fname = hr_fname;
	}
	public String getHr_mname() {
		return hr_mname;
	}
	public void setHr_mname(String hr_mname) {
		this.hr_mname = hr_mname;
	}
	public int getRc_chaksun() {
		return rc_chaksun;
	}
	public void setRc_chaksun(int rc_chaksun) {
		this.rc_chaksun = rc_chaksun;
	}
	public String getJs_name() {
		return js_name;
	}
	public void setJs_name(String js_name) {
		this.js_name = js_name;
	}
	public String getTr_name() {
		return tr_name;
	}
	public void setTr_name(String tr_name) {
		this.tr_name = tr_name;
	}
	public String getMeet() {
		return meet;
	}
	public void setMeet(String meet) {
		this.meet = meet;
	}
	public ChampionDto(String rc_name, String rc_date, String hr_rank, int rc_dist, String hr_name, int hr_birth,
			String hr_sex, String hr_fname, String hr_mname, int rc_chaksun, String js_name, String tr_name,
			String meet) {
		super();
		this.rc_name = rc_name;
		this.rc_date = rc_date;
		this.hr_rank = hr_rank;
		this.rc_dist = rc_dist;
		this.hr_name = hr_name;
		this.hr_birth = hr_birth;
		this.hr_sex = hr_sex;
		this.hr_fname = hr_fname;
		this.hr_mname = hr_mname;
		this.rc_chaksun = rc_chaksun;
		this.js_name = js_name;
		this.tr_name = tr_name;
		this.meet = meet;
	}
	public ChampionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
