package com.gam.mgm.dto;

import java.util.Date;

public class PointDto {
	private int point_seq;
	private String point_title;
	private String point_id;
	private String point_sign;
	private int point_price;
	private Date point_regdate;
	public PointDto(int point_seq, String point_title, String point_id, String point_sign, int point_price,
			Date point_regdate) {
		super();
		this.point_seq = point_seq;
		this.point_title = point_title;
		this.point_id = point_id;
		this.point_sign = point_sign;
		this.point_price = point_price;
		this.point_regdate = point_regdate;
	}
	public int getPoint_seq() {
		return point_seq;
	}
	public void setPoint_seq(int point_seq) {
		this.point_seq = point_seq;
	}
	public String getPoint_title() {
		return point_title;
	}
	public void setPoint_title(String point_title) {
		this.point_title = point_title;
	}
	public String getPoint_id() {
		return point_id;
	}
	public void setPoint_id(String point_id) {
		this.point_id = point_id;
	}
	public String getPoint_sign() {
		return point_sign;
	}
	public void setPoint_sign(String point_sign) {
		this.point_sign = point_sign;
	}
	public int getPoint_price() {
		return point_price;
	}
	public void setPoint_price(int point_price) {
		this.point_price = point_price;
	}
	public Date getPoint_regdate() {
		return point_regdate;
	}
	public void setPoint_regdate(Date point_regdate) {
		this.point_regdate = point_regdate;
	}
	@Override
	public String toString() {
		return "PointDto [point_seq=" + point_seq + ", point_title=" + point_title + ", point_id=" + point_id
				+ ", point_sign=" + point_sign + ", point_price=" + point_price + ", point_regdate=" + point_regdate
				+ "]";
	}
	
}
