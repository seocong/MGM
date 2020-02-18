package com.gam.mgm.dto;

import java.util.Date;

public class MiniRaceDto {
	private int mi_time;
	private Date mi_date;
	private int mi_num1;
	private int mi_num2;
	private int mi_num3;
	private int mi_num4;
	private int mi_num5;
	private int mi_num6;
	
	
	public MiniRaceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MiniRaceDto(int mi_time, Date mi_date, int mi_num1, int mi_num2, int mi_num3, int mi_num4, int mi_num5,
			int mi_num6) {
		super();
		this.mi_time = mi_time;
		this.mi_date = mi_date;
		this.mi_num1 = mi_num1;
		this.mi_num2 = mi_num2;
		this.mi_num3 = mi_num3;
		this.mi_num4 = mi_num4;
		this.mi_num5 = mi_num5;
		this.mi_num6 = mi_num6;
	}
	@Override
	public String toString() {
		return "MiniRaceDto [mi_time=" + mi_time + ", mi_date=" + mi_date + ", mi_num1=" + mi_num1 + ", mi_num2=" + mi_num2
				+ ", mi_num3=" + mi_num3 + ", mi_num4=" + mi_num4 + ", mi_num5=" + mi_num5 + ", mi_num6=" + mi_num6 + "]";
	}
	public int getMi_time() {
		return mi_time;
	}
	public void setMi_time(int mi_time) {
		this.mi_time = mi_time;
	}
	public Date getMi_date() {
		return mi_date;
	}
	public void setMi_date(Date mi_date) {
		this.mi_date = mi_date;
	}
	public int getMi_num1() {
		return mi_num1;
	}
	public void setMi_num1(int mi_num1) {
		this.mi_num1 = mi_num1;
	}
	public int getMi_num2() {
		return mi_num2;
	}
	public void setMi_num2(int mi_num2) {
		this.mi_num2 = mi_num2;
	}
	public int getMi_num3() {
		return mi_num3;
	}
	public void setMi_num3(int mi_num3) {
		this.mi_num3 = mi_num3;
	}
	public int getMi_num4() {
		return mi_num4;
	}
	public void setMi_num4(int mi_num4) {
		this.mi_num4 = mi_num4;
	}
	public int getMi_num5() {
		return mi_num5;
	}
	public void setMi_num5(int mi_num5) {
		this.mi_num5 = mi_num5;
	}
	public int getMi_num6() {
		return mi_num6;
	}
	public void setMi_num6(int mi_num6) {
		this.mi_num6 = mi_num6;
	}
	
	
}
