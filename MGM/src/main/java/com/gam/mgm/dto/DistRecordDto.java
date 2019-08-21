package com.gam.mgm.dto;

public class DistRecordDto {
	private int rcDist;
	private int totalRace;
	private int ord1st;
	private int ord2nd;
	private int ord3nd;
	private String record;
	private String avgRecord;
	private String odds1;
	private String odds2;
	private String odds3;
	private int chulNo;
	private String jkNo;
	private String jkName;
	private String wgBudam;
	public DistRecordDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistRecordDto(int rcDist, int totalRace, int ord1st, int ord2nd, int ord3nd, String record, String avgRecord,
			String odds1, String odds2, String odds3, int chulNo, String jkNo, String jkName, String wgBudam) {
		super();
		this.rcDist = rcDist;
		this.totalRace = totalRace;
		this.ord1st = ord1st;
		this.ord2nd = ord2nd;
		this.ord3nd = ord3nd;
		this.record = record;
		this.avgRecord = avgRecord;
		this.odds1 = odds1;
		this.odds2 = odds2;
		this.odds3 = odds3;
		this.chulNo = chulNo;
		this.jkNo = jkNo;
		this.jkName = jkName;
		this.wgBudam = wgBudam;
	}

	@Override
	public String toString() {
		return "DistRecordDto [rcDist=" + rcDist + ", totalRace=" + totalRace + ", ord1st=" + ord1st + ", ord2nd="
				+ ord2nd + ", ord3nd=" + ord3nd + ", record=" + record + ", avgRecord=" + avgRecord + ", odds1=" + odds1
				+ ", odds2=" + odds2 + ", odds3=" + odds3 + ", chulNo=" + chulNo + ", jkNo=" + jkNo + ", jkName="
				+ jkName + ", wgBudam=" + wgBudam + "]";
	}



	public String getOdds1() {
		return odds1;
	}

	public void setOdds1(String odds1) {
		this.odds1 = odds1;
	}

	public String getOdds2() {
		return odds2;
	}

	public void setOdds2(String odds2) {
		this.odds2 = odds2;
	}

	public String getOdds3() {
		return odds3;
	}

	public void setOdds3(String odds3) {
		this.odds3 = odds3;
	}

	public int getRcDist() {
		return rcDist;
	}
	public void setRcDist(int rcDist) {
		this.rcDist = rcDist;
	}
	public int getTotalRace() {
		return totalRace;
	}
	public void setTotalRace(int totalRace) {
		this.totalRace = totalRace;
	}
	public int getOrd1st() {
		return ord1st;
	}
	public void setOrd1st(int ord1st) {
		this.ord1st = ord1st;
	}
	public int getOrd2nd() {
		return ord2nd;
	}
	public void setOrd2nd(int ord2nd) {
		this.ord2nd = ord2nd;
	}
	public int getOrd3nd() {
		return ord3nd;
	}
	public void setOrd3nd(int ord3nd) {
		this.ord3nd = ord3nd;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getAvgRecord() {
		return avgRecord;
	}
	public void setAvgRecord(String avgRecord) {
		this.avgRecord = avgRecord;
	}



	public int getChulNo() {
		return chulNo;
	}



	public void setChulNo(int chulNo) {
		this.chulNo = chulNo;
	}



	public String getJkNo() {
		return jkNo;
	}



	public void setJkNo(String jkNo) {
		this.jkNo = jkNo;
	}



	public String getJkName() {
		return jkName;
	}



	public void setJkName(String jkName) {
		this.jkName = jkName;
	}



	public String getWgBudam() {
		return wgBudam;
	}



	public void setWgBudam(String wgBudam) {
		this.wgBudam = wgBudam;
	}
	
}
