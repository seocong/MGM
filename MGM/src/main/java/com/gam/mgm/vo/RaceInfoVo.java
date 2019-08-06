package com.gam.mgm.vo;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceInfoVo {
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
				private int ilsu;
				private int rcDist;
				private String rank;
				private String budam;
				private String rcName;
				private String ageCond;
				private String weather;
				private String track;
				private int chaksun1;
				private int chaksun2;
				private int chaksun3;
				private int chaksun4;
				private int chaksun5;
				private long winAmt;
				private long plcAmt;
				private long qnlAmt;
				private long exaAmt;
				private long qplAmt;
				private long tlaAmt;
				private long triAmt;
				private long totalAmt;
				
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
				public int getIlsu() {
					return ilsu;
				}
				public void setIlsu(int ilsu) {
					this.ilsu = ilsu;
				}
				public int getRcDist() {
					return rcDist;
				}
				public void setRcDist(int rcDist) {
					this.rcDist = rcDist;
				}
				public String getRank() {
					return rank;
				}
				public void setRank(String rank) {
					this.rank = rank;
				}
				public String getBudam() {
					return budam;
				}
				public void setBudam(String budam) {
					this.budam = budam;
				}
				public String getRcName() {
					return rcName;
				}
				public void setRcName(String rcName) {
					this.rcName = rcName;
				}
				public String getAgeCond() {
					return ageCond;
				}
				public void setAgeCond(String ageCond) {
					this.ageCond = ageCond;
				}
				public String getWeather() {
					return weather;
				}
				public void setWeather(String weather) {
					this.weather = weather;
				}
				public String getTrack() {
					return track;
				}
				public void setTrack(String track) {
					this.track = track;
				}
				public int getChaksun1() {
					return chaksun1;
				}
				public void setChaksun1(int chaksun1) {
					this.chaksun1 = chaksun1;
				}
				public int getChaksun2() {
					return chaksun2;
				}
				public void setChaksun2(int chaksun2) {
					this.chaksun2 = chaksun2;
				}
				public int getChaksun3() {
					return chaksun3;
				}
				public void setChaksun3(int chaksun3) {
					this.chaksun3 = chaksun3;
				}
				public int getChaksun4() {
					return chaksun4;
				}
				public void setChaksun4(int chaksun4) {
					this.chaksun4 = chaksun4;
				}
				public int getChaksun5() {
					return chaksun5;
				}
				public void setChaksun5(int chaksun5) {
					this.chaksun5 = chaksun5;
				}
				public long getWinAmt() {
					return winAmt;
				}
				public void setWinAmt(long winAmt) {
					this.winAmt = winAmt;
				}
				public long getPlcAmt() {
					return plcAmt;
				}
				public void setPlcAmt(long plcAmt) {
					this.plcAmt = plcAmt;
				}
				public long getQnlAmt() {
					return qnlAmt;
				}
				public void setQnlAmt(long qnlAmt) {
					this.qnlAmt = qnlAmt;
				}
				public long getExaAmt() {
					return exaAmt;
				}
				public void setExaAmt(long exaAmt) {
					this.exaAmt = exaAmt;
				}
				public long getQplAmt() {
					return qplAmt;
				}
				public void setQplAmt(long qplAmt) {
					this.qplAmt = qplAmt;
				}
				public long getTlaAmt() {
					return tlaAmt;
				}
				public void setTlaAmt(long tlaAmt) {
					this.tlaAmt = tlaAmt;
				}
				public long getTriAmt() {
					return triAmt;
				}
				public void setTriAmt(long triAmt) {
					this.triAmt = triAmt;
				}
				public long getTotalAmt() {
					return totalAmt;
				}
				public void setTotalAmt(long totalAmt) {
					this.totalAmt = totalAmt;
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
