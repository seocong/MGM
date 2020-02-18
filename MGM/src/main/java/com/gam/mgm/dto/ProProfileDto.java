package com.gam.mgm.dto;

public class ProProfileDto {
	private String pro_id;
	private String pro_name;
	private String pro_simple;
	private String pro_detail;
	public ProProfileDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProProfileDto(String pro_id, String pro_simple, String pro_detail,String pro_name) {
		super();
		this.pro_id = pro_id;
		this.pro_simple = pro_simple;
		this.pro_detail = pro_detail;
		this.pro_name = pro_name;
	}
	@Override
	public String toString() {
		return "ProProfileDto [pro_id=" + pro_id + ", pro_simple=" + pro_simple + ", pro_detail=" + pro_detail + ", pro_detail=" + pro_detail + "]";
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_simple() {
		return pro_simple;
	}
	public void setPro_simple(String pro_simple) {
		this.pro_simple = pro_simple;
	}
	public String getPro_detail() {
		return pro_detail;
	}
	public void setPro_detail(String pro_detail) {
		this.pro_detail = pro_detail;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	
}
