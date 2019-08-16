package com.gam.mgm.vo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceRefreeVo {
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
				private int meet;
				private int rcNo;
				private String rcDate ;
				private String prGubun ;
				private int chulNo;
				private String prNo ;
				private String prName ;
				private String kind ;
				private String reason;
				private String stDate ;
				private String spDate ;
				private int fine;
				public int getMeet() {
					return meet;
				}
				public void setMeet(int meet) {
					this.meet = meet;
				}
				public int getRcNo() {
					return rcNo;
				}
				public void setRcNo(int rcNo) {
					this.rcNo = rcNo;
				}
				public String getRcDate() {
					return rcDate;
				}
				public void setRcDate(String rcDate) {
					this.rcDate = rcDate;
				}
				public String getPrGubun() {
					return prGubun;
				}
				public void setPrGubun(String prGubun) {
					this.prGubun = prGubun;
				}
				public int getChulNo() {
					return chulNo;
				}
				public void setChulNo(int chulNo) {
					this.chulNo = chulNo;
				}
				public String getPrNo() {
					return prNo;
				}
				public void setPrNo(String prNo) {
					this.prNo = prNo;
				}
				public String getPrName() {
					return prName;
				}
				public void setPrName(String prName) {
					this.prName = prName;
				}
				public String getKind() {
					return kind;
				}
				public void setKind(String kind) {
					this.kind = kind;
				}
				public String getReason() {
					return reason;
				}
				public void setReason(String reason) {
					this.reason = reason;
				}
				public String getStDate() {
					return stDate;
				}
				public void setStDate(String stDate) {
					this.stDate = stDate;
				}
				public String getSpDate() {
					return spDate;
				}
				public void setSpDate(String spDate) {
					this.spDate = spDate;
				}
				public int getFine() {
					return fine;
				}
				public void setFine(int fine) {
					this.fine = fine;
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
