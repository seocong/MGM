package com.gam.mgm.vo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceEntryVo {
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
			private int meet ;
			private String pgDate;
			private int pgNo ;
			private String rcName;
			private String rank;
			private int rcDist;
			private String budam;
			private String prizeCond;
			private String ageCond;
			private long chaksun1;
			private long chaksun2;
			private long chaksun3;
			private long chaksun4;
			private long chaksun5;
			private int enNo;
			private int recentRating;
			private String hrName;
			private String hrNo;
			private String name;
			private String sex;
			private String age;
			private String trName;
			private String trNo;
			private String owName;
			private String owNo;
			private int rcCntY;
			private long calPrize_6m;
			private long calPrizeY;
			private long chaksunT;
			public int getMeet() {
				return meet;
			}
			public void setMeet(int meet) {
				this.meet = meet;
			}
			public String getPgDate() {
				return pgDate;
			}
			public void setPgDate(String pgDate) {
				this.pgDate = pgDate;
			}
			public int getPgNo() {
				return pgNo;
			}
			public void setPgNo(int pgNo) {
				this.pgNo = pgNo;
			}
			public String getRcName() {
				return rcName;
			}
			public void setRcName(String rcName) {
				this.rcName = rcName;
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
			public int getEnNo() {
				return enNo;
			}
			public void setEnNo(int enNo) {
				this.enNo = enNo;
			}
			public int getRecentRating() {
				return recentRating;
			}
			public void setRecentRating(int recentRating) {
				this.recentRating = recentRating;
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
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
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
			public int getRcCntY() {
				return rcCntY;
			}
			public void setRcCntY(int rcCntY) {
				this.rcCntY = rcCntY;
			}
			public long getCalPrize_6m() {
				return calPrize_6m;
			}
			public void setCalPrize_6m(long calPrize_6m) {
				this.calPrize_6m = calPrize_6m;
			}
			public long getCalPrizeY() {
				return calPrizeY;
			}
			public void setCalPrizeY(long calPrizeY) {
				this.calPrizeY = calPrizeY;
			}
			public long getChaksunT() {
				return chaksunT;
			}
			public void setChaksunT(long chaksunT) {
				this.chaksunT = chaksunT;
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
