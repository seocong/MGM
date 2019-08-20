package com.gam.mgm.dto;

public class MonthlyPrizeDto {
	private String hrNo;
	private String hrName;
	private int result1;
	private int result2;
	private int result3;
	private int result4;
	private int result5;
	private int result6;
	public MonthlyPrizeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonthlyPrizeDto(String hrNo, String hrName, int result1, int result2, int result3, int result4, int result5,
			int result6) {
		super();
		this.hrNo = hrNo;
		this.hrName = hrName;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
		this.result4 = result4;
		this.result5 = result5;
		this.result6 = result6;
	}
	@Override
	public String toString() {
		return "MonthlyPrizeDto [hrNo=" + hrNo + ", hrName=" + hrName + ", result1=" + result1 + ", result2=" + result2
				+ ", result3=" + result3 + ", result4=" + result4 + ", result5=" + result5 + ", result6=" + result6
				+ "]";
	}
	public String getHrNo() {
		return hrNo;
	}
	public void setHrNo(String hrNo) {
		this.hrNo = hrNo;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public int getResult1() {
		return result1;
	}
	public void setResult1(int result1) {
		this.result1 = result1;
	}
	public int getResult2() {
		return result2;
	}
	public void setResult2(int result2) {
		this.result2 = result2;
	}
	public int getResult3() {
		return result3;
	}
	public void setResult3(int result3) {
		this.result3 = result3;
	}
	public int getResult4() {
		return result4;
	}
	public void setResult4(int result4) {
		this.result4 = result4;
	}
	public int getResult5() {
		return result5;
	}
	public void setResult5(int result5) {
		this.result5 = result5;
	}
	public int getResult6() {
		return result6;
	}
	public void setResult6(int result6) {
		this.result6 = result6;
	}
	
}
