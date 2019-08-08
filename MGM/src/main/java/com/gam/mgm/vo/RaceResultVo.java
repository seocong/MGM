package com.gam.mgm.vo;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceResultVo {
	private Header header;
	private Body body;
	@XmlRootElement(name="header")
	public static class Header{
		private int resultCode;
		private String resultMsg;
		public int getResultCode() {
			return resultCode;
		}
		public void setResultCode(int resultCode) {
			this.resultCode = resultCode;
		}
		public String getResultMsg() {
			return resultMsg;
		}
		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
	}

	@XmlRootElement(name="body")
	public static class Body{

		private List<Item> items;
		
		@XmlElementWrapper(name="items")
		@XmlElement(name="item")
		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}
			@XmlRootElement(name="item")
			@XmlAccessorType(XmlAccessType.FIELD)
			public static class Item{  
				private String rcDate;  
				private int rcNo;
				private String hrNo;
				private String hrName;  
				private int ord;  
				private int chulNo;  
				private String wgBudam;  
				private String wgHr;  
				private float rcTime;  
				private String diffUnit;  
				private int ordS1f;  
				private int g8f_1c;  
				private int g6f_2c;  
				private int g4f_3c;  
				private int g3f_4c;  
				private int g2f;  
				private int ordG1f;  
				private float rcTimeS1f;  
				private float rcTime_1c;  
				private float rcTime_2c;  
				private float rcTime_3c;  
				private float rcTime_4c;  
				private float rcTimeG3f;  
				private float rcTimeG2f;  
				private float rcTimeG1f;  
				private float winOdds;  
				private float plcOdds;
				private String trName;
				private String trNo;
				private String owName;
				private String owNo;
				private String jkName;
				private String jkNo;
				private int rating;
				public String getRcDate() {
					return rcDate;
				}
				public void setRcDate(String rcDate) {
					this.rcDate = rcDate;
				}
				public int getRcNo() {
					return rcNo;
				}
				public void setRcNo(int rcNo) {
					this.rcNo = rcNo;
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
				public int getOrd() {
					return ord;
				}
				public void setOrd(int ord) {
					this.ord = ord;
				}
				public int getChulNo() {
					return chulNo;
				}
				public void setChulNo(int chulNo) {
					this.chulNo = chulNo;
				}
				public String getWgBudam() {
					return wgBudam;
				}
				public void setWgBudam(String wgBudam) {
					this.wgBudam = wgBudam;
				}
				public String getWgHr() {
					return wgHr;
				}
				public void setWgHr(String wgHr) {
					this.wgHr = wgHr;
				}
				public float getRcTime() {
					return rcTime;
				}
				public void setRcTime(float rcTime) {
					this.rcTime = rcTime;
				}
				public String getDiffUnit() {
					return diffUnit;
				}
				public void setDiffUnit(String diffUnit) {
					this.diffUnit = diffUnit;
				}
				public int getOrdS1f() {
					return ordS1f;
				}
				public void setOrdS1f(int ordS1f) {
					this.ordS1f = ordS1f;
				}
				public int getG8f_1c() {
					return g8f_1c;
				}
				public void setG8f_1c(int g8f_1c) {
					this.g8f_1c = g8f_1c;
				}
				public int getG6f_2c() {
					return g6f_2c;
				}
				public void setG6f_2c(int g6f_2c) {
					this.g6f_2c = g6f_2c;
				}
				public int getG4f_3c() {
					return g4f_3c;
				}
				public void setG4f_3c(int g4f_3c) {
					this.g4f_3c = g4f_3c;
				}
				public int getG3f_4c() {
					return g3f_4c;
				}
				public void setG3f_4c(int g3f_4c) {
					this.g3f_4c = g3f_4c;
				}
				public int getG2f() {
					return g2f;
				}
				public void setG2f(int g2f) {
					this.g2f = g2f;
				}
				public int getOrdG1f() {
					return ordG1f;
				}
				public void setOrdG1f(int ordG1f) {
					this.ordG1f = ordG1f;
				}
				public float getRcTimeS1f() {
					return rcTimeS1f;
				}
				public void setRcTimeS1f(float rcTimeS1f) {
					this.rcTimeS1f = rcTimeS1f;
				}
				public float getRcTime_1c() {
					return rcTime_1c;
				}
				public void setRcTime_1c(float rcTime_1c) {
					this.rcTime_1c = rcTime_1c;
				}
				public float getRcTime_2c() {
					return rcTime_2c;
				}
				public void setRcTime_2c(float rcTime_2c) {
					this.rcTime_2c = rcTime_2c;
				}
				public float getRcTime_3c() {
					return rcTime_3c;
				}
				public void setRcTime_3c(float rcTime_3c) {
					this.rcTime_3c = rcTime_3c;
				}
				public float getRcTime_4c() {
					return rcTime_4c;
				}
				public void setRcTime_4c(float rcTime_4c) {
					this.rcTime_4c = rcTime_4c;
				}
				public float getRcTimeG3f() {
					return rcTimeG3f;
				}
				public void setRcTimeG3f(float rcTimeG3f) {
					this.rcTimeG3f = rcTimeG3f;
				}
				public float getRcTimeG2f() {
					return rcTimeG2f;
				}
				public void setRcTimeG2f(float rcTimeG2f) {
					this.rcTimeG2f = rcTimeG2f;
				}
				public float getRcTimeG1f() {
					return rcTimeG1f;
				}
				public void setRcTimeG1f(float rcTimeG1f) {
					this.rcTimeG1f = rcTimeG1f;
				}
				public float getWinOdds() {
					return winOdds;
				}
				public void setWinOdds(float winOdds) {
					this.winOdds = winOdds;
				}
				public float getPlcOdds() {
					return plcOdds;
				}
				public void setPlcOdds(float plcOdds) {
					this.plcOdds = plcOdds;
				}
				public String getTrName() {
					return trName;
				}
				public void setTrName(String trName) {
					this.trName = trName;
				}
				public String getOwName() {
					return owName;
				}
				public void setOwName(String owName) {
					this.owName = owName;
				}
				public String getJkName() {
					return jkName;
				}
				public void setJkName(String jkName) {
					this.jkName = jkName;
				}
				public int getRating() {
					return rating;
				}
				public void setRating(int rating) {
					this.rating = rating;
				}
				public String getTrNo() {
					return trNo;
				}
				public void setTrNo(String trNo) {
					this.trNo = trNo;
				}
				public String getOwNo() {
					return owNo;
				}
				public void setOwNo(String owNo) {
					this.owNo = owNo;
				}
				public String getJkNo() {
					return jkNo;
				}
				public void setJkNo(String jkNo) {
					this.jkNo = jkNo;
				}
				
			}
		}



	public Header getHeader() {
		return header;
	}


	public void setHeader(Header header) {
		this.header = header;
	}


	public Body getBody() {
		return body;
	}


	public void setBody(Body body) {
		this.body = body;
	}
}
