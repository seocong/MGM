package com.gam.mgm.vo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceSummaryResultVo {
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
				private int meet;
				private int rcNo;
				private String winChulNo;
				private String winOdds;
				private String plcChulNo;
				private String plcOdds;
				private String qnlChulNo;
				private String qnlOdds;
				private String exaChulNo;
				private String exaOdds;
				private String qplChulNo;
				private String qplOdds;
				private String tlaChulNo;
				private String tlaOdds;
				private String triChulNo;
				private String triOdds;
				
				public String getRcDate() {
					return rcDate;
				}
				public void setRcDate(String rcDate) {
					this.rcDate = rcDate;
				}
				public String getWinChulNo() {
					return winChulNo;
				}
				public void setWinChulNo(String winChulNo) {
					this.winChulNo = winChulNo;
				}
				public String getWinOdds() {
					return winOdds;
				}
				public void setWinOdds(String winOdds) {
					this.winOdds = winOdds;
				}
				public String getPlcChulNo() {
					return plcChulNo;
				}
				public void setPlcChulNo(String plcChulNo) {
					this.plcChulNo = plcChulNo;
				}
				public String getPlcOdds() {
					return plcOdds;
				}
				public void setPlcOdds(String plcOdds) {
					this.plcOdds = plcOdds;
				}
				public String getQnlChulNo() {
					return qnlChulNo;
				}
				public void setQnlChulNo(String qnlChulNo) {
					this.qnlChulNo = qnlChulNo;
				}
				public String getQnlOdds() {
					return qnlOdds;
				}
				public void setQnlOdds(String qnlOdds) {
					this.qnlOdds = qnlOdds;
				}
				public String getExaChulNo() {
					return exaChulNo;
				}
				public void setExaChulNo(String exaChulNo) {
					this.exaChulNo = exaChulNo;
				}
				public String getExaOdds() {
					return exaOdds;
				}
				public void setExaOdds(String exaOdds) {
					this.exaOdds = exaOdds;
				}
				public String getQplChulNo() {
					return qplChulNo;
				}
				public void setQplChulNo(String qplChulNo) {
					this.qplChulNo = qplChulNo;
				}
				public String getQplOdds() {
					return qplOdds;
				}
				public void setQplOdds(String qplOdds) {
					this.qplOdds = qplOdds;
				}
				public String getTlaChulNo() {
					return tlaChulNo;
				}
				public void setTlaChulNo(String tlaChulNo) {
					this.tlaChulNo = tlaChulNo;
				}
				public String getTlaOdds() {
					return tlaOdds;
				}
				public void setTlaOdds(String tlaOdds) {
					this.tlaOdds = tlaOdds;
				}
				public String getTriChulNo() {
					return triChulNo;
				}
				public void setTriChulNo(String triChulNo) {
					this.triChulNo = triChulNo;
				}
				public String getTriOdds() {
					return triOdds;
				}
				public void setTriOdds(String triOdds) {
					this.triOdds = triOdds;
				}
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
