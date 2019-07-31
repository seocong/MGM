package com.gam.mgm.vo;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceScheduleVo {
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
	public Body getBody() {
		return body;
	}

	public void setBody(Body boay) {
		this.body = boay;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	@XmlRootElement(name="body")
	public static class Body{
		
		private List<Body.Item> items;
		@XmlElementWrapper(name="items")
		@XmlElement(name="item")
		public List<Body.Item> getItems() {
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
			private String meet;				
			private String schStTime;				
			private String rank;				
			private int rcDist;				
			private String budam;				
			private String rcName;				
			private String prizeCond;
			private String ageCond;
			private int chaksun1;
			private int chaksun2;
			private int chaksun3;
			private int chaksun4;
			private int chaksun5;
			private int chulNo;
			private String hrName;
			private int wgBudam;

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
			public String getMeet() {
				return meet;
			}
			public void setMeet(String meet) {
				this.meet = meet;
			}
			public String getSchStTime() {
				return schStTime;
			}
			public void setSchStTime(String schStTime) {
				this.schStTime = schStTime;
			}
			public String getRank() {
				return rank;
			}
			public void setRank(String rank) {
				this.rank = rank;
			}
			public int getRcDist() {
				return rcDist;
			}
			public void setRcDist(int rcDist) {
				this.rcDist = rcDist;
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
			public String getPrizeCond() {
				return prizeCond;
			}
			public void setPrizeCond(String prizeCond) {
				this.prizeCond = prizeCond;
			}
			public String getAgeCond() {
				return ageCond;
			}
			public void setAgeCond(String ageCond) {
				this.ageCond = ageCond;
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
			public int getWgBudam() {
				return wgBudam;
			}
			public void setWgBudam(int wgBudam) {
				this.wgBudam = wgBudam;
			}

		}
	}
}
