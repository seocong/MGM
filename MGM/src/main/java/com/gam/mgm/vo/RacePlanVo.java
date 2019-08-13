package com.gam.mgm.vo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.gam.utils.Util;

@XmlRootElement(name="response")
public class RacePlanVo {
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
			private String meet;  
			private String rcDate;
			private String rcDay;
			private int rcNo;  
			private int chulNo; 
			private String hrName; 
			private String hrNo; 
			private String prd; 
			private String sex; 
			private String age; 
			private int wgBudam;
			private int rating;  
			private String jkName; 
			private String jkNo;	
			private String trName; 
			private String trNo; 
			private String owName; 
			private String owNo; 
			private int ilsu;  
			private int rcDist;  
			private int dusu; 
			private String rank;
			private String prizeCond; 
			private String ageCond; 
			private String stTime; 
			private String budam; 
			private String rcName; 
			private long chaksun1;
			private long chaksun2;
			private long chaksun3;
			private long chaksun4; 
			private long chaksun5;
			public String getMeet() {
				return meet;
			}
			public void setMeet(String meet) {
				this.meet = meet;
			}
			public String getRcDate() {
				return rcDate;
			}
			public void setRcDate(String rcDate) {
				this.rcDate = rcDate;
			}
			
			public String getRcDay() {
				return rcDay;
			}
			public void setRcDay(String rcDay) {
				this.rcDay = rcDay;
			}
			public int getRcNo() {
				return rcNo;
			}
			public void setRcNo(int rcNo) {
				this.rcNo = rcNo;
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
			public String getHrNo() {
				return hrNo;
			}
			public void setHrNo(String hrNo) {
				this.hrNo = hrNo;
			}
			public String getPrd() {
				return prd;
			}
			public void setPrd(String prd) {
				this.prd = prd;
			}
			public String getSex() {
				return sex;
			}
			public void setSex(String sex) {
				this.sex = sex;
			}
			public String getAge() {
				return age;
			}
			public void setAge(String age) {
				this.age = age;
			}
			public int getWgBudam() {
				return wgBudam;
			}
			public void setWgBudam(int wgBudam) {
				this.wgBudam = wgBudam;
			}
			public int getRating() {
				return rating;
			}
			public void setRating(int rating) {
				this.rating = rating;
			}
			public String getJkName() {
				return jkName;
			}
			public void setJkName(String jkName) {
				this.jkName = jkName;
			}
			public String getJkNo() {
				return jkNo;
			}
			public void setJkNo(String jkNo) {
				this.jkNo = jkNo;
			}
			public String getTrName() {
				return trName;
			}
			public void setTrName(String trName) {
				this.trName = trName;
			}
			public String getTrNo() {
				return trNo;
			}
			public void setTrNo(String trNo) {
				this.trNo = trNo;
			}
			public String getOwName() {
				return owName;
			}
			public void setOwName(String owName) {
				this.owName = owName;
			}
			public String getOwNo() {
				return owNo;
			}
			public void setOwNo(String owNo) {
				this.owNo = owNo;
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
			public int getDusu() {
				return dusu;
			}
			public void setDusu(int dusu) {
				this.dusu = dusu;
			}
			public String getRank() {
				return rank;
			}
			public void setRank(String rank) {
				this.rank = rank;
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
			public String getStTime() {
				return stTime;
			}
			public void setStTime(String stTime) {
				this.stTime = stTime;
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
			public long getChaksun1() {
				return chaksun1;
			}
			public void setChaksun1(long chaksun1) {
				this.chaksun1 = chaksun1;
			}
			public long getChaksun2() {
				return chaksun2;
			}
			public void setChaksun2(long chaksun2) {
				this.chaksun2 = chaksun2;
			}
			public long getChaksun3() {
				return chaksun3;
			}
			public void setChaksun3(long chaksun3) {
				this.chaksun3 = chaksun3;
			}
			public long getChaksun4() {
				return chaksun4;
			}
			public void setChaksun4(long chaksun4) {
				this.chaksun4 = chaksun4;
			}
			public long getChaksun5() {
				return chaksun5;
			}
			public void setChaksun5(long chaksun5) {
				this.chaksun5 = chaksun5;
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
