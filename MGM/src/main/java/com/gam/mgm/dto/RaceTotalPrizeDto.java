package com.gam.mgm.dto;
/*
 * 조교사, 기수 등 디테일 페이지 6개월 성적 및 총 월별 상금목록
 */
public class RaceTotalPrizeDto {
	private String raceMonth;
	private int totalCount;
	private int ord1Count;
	private int ord2Count;
	private int totalPrize;
	public RaceTotalPrizeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RaceTotalPrizeDto(String raceMonth, int totalCount, int ord1Count, int ord2Count, int totalPrize) {
		super();
		this.raceMonth = raceMonth;
		this.totalCount = totalCount;
		this.ord1Count = ord1Count;
		this.ord2Count = ord2Count;
		this.totalPrize = totalPrize;
	}
	@Override
	public String toString() {
		return "RaceTotalPrizeDto [raceMonth=" + raceMonth + ", totalCount=" + totalCount + ", ord1Count=" + ord1Count
				+ ", ord2Count=" + ord2Count + ", totalPrize=" + totalPrize + "]";
	}
	public String getRaceMonth() {
		return raceMonth;
	}
	public void setRaceMonth(String raceMonth) {
		this.raceMonth = raceMonth;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getOrd1Count() {
		return ord1Count;
	}
	public void setOrd1Count(int ord1Count) {
		this.ord1Count = ord1Count;
	}
	public int getOrd2Count() {
		return ord2Count;
	}
	public void setOrd2Count(int ord2Count) {
		this.ord2Count = ord2Count;
	}
	public int getTotalPrize() {
		return totalPrize;
	}
	public void setTotalPrize(int totalPrize) {
		this.totalPrize = totalPrize;
	}
	
	
}
