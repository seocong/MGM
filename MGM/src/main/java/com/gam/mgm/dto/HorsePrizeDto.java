package com.gam.mgm.dto;

public class HorsePrizeDto {
	private long totalPrize;
	private int yearPrize;
	private int sixMonthPrize;
	private int monthPrize;
	public HorsePrizeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HorsePrizeDto(long totalPrize, int yearPrize, int sixMonthPrize, int monthPrize) {
		super();
		this.totalPrize = totalPrize;
		this.yearPrize = yearPrize;
		this.sixMonthPrize = sixMonthPrize;
		this.monthPrize = monthPrize;
	}
	@Override
	public String toString() {
		return "HorsePrizeDto [totalPrize=" + totalPrize + ", yearPrize=" + yearPrize + ", sixMonthPrize="
				+ sixMonthPrize + ", MonthPrize=" + monthPrize + "]";
	}
	public long getTotalPrize() {
		return totalPrize;
	}
	public void setTotalPrize(long totalPrize) {
		this.totalPrize = totalPrize;
	}
	public int getYearPrize() {
		return yearPrize;
	}
	public void setYearPrize(int yearPrize) {
		this.yearPrize = yearPrize;
	}
	public int getSixMonthPrize() {
		return sixMonthPrize;
	}
	public void setSixMonthPrize(int sixMonthPrize) {
		this.sixMonthPrize = sixMonthPrize;
	}
	public int getMonthPrize() {
		return monthPrize;
	}
	public void setMonthPrize(int monthPrize) {
		this.monthPrize = monthPrize;
	}
	
}
