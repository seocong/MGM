package com.gam.mgm.dto;

public class RaceRefreeDto {
	private int rf_meet;
	private int rf_rcNo;
	private String rf_rcDate ;
	private String rf_prGubun ;
	private int rf_chulNo;
	private String rf_prNo ;
	private String rf_prName ;
	private String rf_kind ;
	private String rf_reason;
	private String rf_stDate ;
	private String rf_spDate ;
	private int rf_fine;
	public RaceRefreeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RaceRefreeDto(int rf_meet, int rf_rcNo, String rf_rcDate, String rf_prGubun, int rf_chulNo, String rf_prNo,
			String rf_prName, String rf_kind, String rf_reason, String rf_stDate, String rf_spDate, int rf_fine) {
		super();
		this.rf_meet = rf_meet;
		this.rf_rcNo = rf_rcNo;
		this.rf_rcDate = rf_rcDate;
		this.rf_prGubun = rf_prGubun;
		this.rf_chulNo = rf_chulNo;
		this.rf_prNo = rf_prNo;
		this.rf_prName = rf_prName;
		this.rf_kind = rf_kind;
		this.rf_reason = rf_reason;
		this.rf_stDate = rf_stDate;
		this.rf_spDate = rf_spDate;
		this.rf_fine = rf_fine;
	}
	@Override
	public String toString() {
		return "RaceRefreeDto [rf_meet=" + rf_meet + ", rf_rcNo=" + rf_rcNo + ", rf_rcDate=" + rf_rcDate
				+ ", rf_prGubun=" + rf_prGubun + ", rf_chulNo=" + rf_chulNo + ", rf_prNo=" + rf_prNo + ", rf_prName="
				+ rf_prName + ", rf_kind=" + rf_kind + ", rf_reason=" + rf_reason + ", rf_stDate=" + rf_stDate
				+ ", rf_spDate=" + rf_spDate + ", rf_fine=" + rf_fine + "]";
	}
	public int getRf_meet() {
		return rf_meet;
	}
	public void setRf_meet(int rf_meet) {
		this.rf_meet = rf_meet;
	}
	public int getRf_rcNo() {
		return rf_rcNo;
	}
	public void setRf_rcNo(int rf_rcNo) {
		this.rf_rcNo = rf_rcNo;
	}
	public String getRf_rcDate() {
		return rf_rcDate;
	}
	public void setRf_rcDate(String rf_rcDate) {
		this.rf_rcDate = rf_rcDate;
	}
	public String getRf_prGubun() {
		return rf_prGubun;
	}
	public void setRf_prGubun(String rf_prGubun) {
		this.rf_prGubun = rf_prGubun;
	}
	public int getRf_chulNo() {
		return rf_chulNo;
	}
	public void setRf_chulNo(int rf_chulNo) {
		this.rf_chulNo = rf_chulNo;
	}
	public String getRf_prNo() {
		return rf_prNo;
	}
	public void setRf_prNo(String rf_prNo) {
		this.rf_prNo = rf_prNo;
	}
	public String getRf_prName() {
		return rf_prName;
	}
	public void setRf_prName(String rf_prName) {
		this.rf_prName = rf_prName;
	}
	public String getRf_kind() {
		return rf_kind;
	}
	public void setRf_kind(String rf_kind) {
		this.rf_kind = rf_kind;
	}
	public String getRf_reason() {
		return rf_reason;
	}
	public void setRf_reason(String rf_reason) {
		this.rf_reason = rf_reason;
	}
	public String getRf_stDate() {
		return rf_stDate;
	}
	public void setRf_stDate(String rf_stDate) {
		this.rf_stDate = rf_stDate;
	}
	public String getRf_spDate() {
		return rf_spDate;
	}
	public void setRf_spDate(String rf_spDate) {
		this.rf_spDate = rf_spDate;
	}
	public int getRf_fine() {
		return rf_fine;
	}
	public void setRf_fine(int rf_fine) {
		this.rf_fine = rf_fine;
	}
	
}
