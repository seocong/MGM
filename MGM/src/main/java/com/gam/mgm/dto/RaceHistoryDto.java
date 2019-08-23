package com.gam.mgm.dto;

public class RaceHistoryDto {
	private int rcNo;
	private String objNo;
	private String objName;
	private int chulNo;
	private String hrName;
	private int part;
	private String fusion;
	public RaceHistoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RaceHistoryDto(int rcNo, String objNo, String objName, int chulNo, String hrName, int part, String fusion) {
		super();
		this.rcNo = rcNo;
		this.objNo = objNo;
		this.objName = objName;
		this.chulNo = chulNo;
		this.hrName = hrName;
		this.part = part;
		this.fusion = fusion;
	}
	@Override
	public String toString() {
		return "RaceHistoryDto [rcNo=" + rcNo + ", objNo=" + objNo + ", objName=" + objName + ", chulNo=" + chulNo
				+ ", hrName=" + hrName + ", part=" + part + ", fusion=" + fusion + "]";
	}
	public int getRcNo() {
		return rcNo;
	}
	public void setRcNo(int rcNo) {
		this.rcNo = rcNo;
	}
	public String getObjNo() {
		return objNo;
	}
	public void setObjNo(String objNo) {
		this.objNo = objNo;
	}
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public int getChulNo() {
		return chulNo;
	}
	public void setChulNo(int chulNo) {
		this.chulNo = chulNo;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public int getPart() {
		return part;
	}
	public void setPart(int part) {
		this.part = part;
	}
	public String getFusion() {
		return fusion;
	}
	public void setFusion(String fusion) {
		this.fusion = fusion;
	}

}
