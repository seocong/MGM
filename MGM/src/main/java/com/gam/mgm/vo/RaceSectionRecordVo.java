package com.gam.mgm.vo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RaceSectionRecordVo {
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
				private int meet;
				private int dist_1f;
				private int dist_2f;
				private int dist_3f;
				private int dist_4f;
				private int dist_5f;
				private int dist_6f;
				private int dist_7f;
				private int dist_8f;
				private int dist_9f;
				private int dist_10f;
				private double time_1f;
				private double time_2f;
				private double time_3f;
				private double time_4f;
				private double time_5f;
				private double time_6f;
				private double time_7f;
				private double time_8f;
				private double time_9f;
				private double time_10f;
				private double time_11f;
				private double time_12f;
				private double passtime_1f;
				private double passtime_2f;
				private double passtime_3f;
				private double passtime_4f;
				private double passtime_5f;
				private double passtime_6f;
				private double passtime_7f;
				private double passtime_8f;
				private double passtime_9f;
				private double passtime_10f;
				private String passrankS1f;
				private String passrankG8f_1c;
				private String passrankG6f_2c;
				private String passrankG4f_3c;
				private String passrankG3f_4c;
				private String passrankG2f;
				private String passrankG1f;
				public String getRcDate() {
					return rcDate;
				}
				public void setRcDate(String rcDate) {
					this.rcDate = rcDate;
				}
				public int getDist_1f() {
					return dist_1f;
				}
				public void setDist_1f(int dist_1f) {
					this.dist_1f = dist_1f;
				}
				public int getDist_2f() {
					return dist_2f;
				}
				public void setDist_2f(int dist_2f) {
					this.dist_2f = dist_2f;
				}
				public int getDist_3f() {
					return dist_3f;
				}
				public void setDist_3f(int dist_3f) {
					this.dist_3f = dist_3f;
				}
				public int getDist_4f() {
					return dist_4f;
				}
				public void setDist_4f(int dist_4f) {
					this.dist_4f = dist_4f;
				}
				public int getDist_5f() {
					return dist_5f;
				}
				public void setDist_5f(int dist_5f) {
					this.dist_5f = dist_5f;
				}
				public int getDist_6f() {
					return dist_6f;
				}
				public void setDist_6f(int dist_6f) {
					this.dist_6f = dist_6f;
				}
				public int getDist_7f() {
					return dist_7f;
				}
				public void setDist_7f(int dist_7f) {
					this.dist_7f = dist_7f;
				}
				public int getDist_8f() {
					return dist_8f;
				}
				public void setDist_8f(int dist_8f) {
					this.dist_8f = dist_8f;
				}
				public int getDist_9f() {
					return dist_9f;
				}
				public void setDist_9f(int dist_9f) {
					this.dist_9f = dist_9f;
				}
				public int getDist_10f() {
					return dist_10f;
				}
				public void setDist_10f(int dist_10f) {
					this.dist_10f = dist_10f;
				}
				public double getTime_1f() {
					return time_1f;
				}
				public void setTime_1f(double time_1f) {
					this.time_1f = time_1f;
				}
				public double getTime_2f() {
					return time_2f;
				}
				public void setTime_2f(double time_2f) {
					this.time_2f = time_2f;
				}
				public double getTime_3f() {
					return time_3f;
				}
				public void setTime_3f(double time_3f) {
					this.time_3f = time_3f;
				}
				public double getTime_4f() {
					return time_4f;
				}
				public void setTime_4f(double time_4f) {
					this.time_4f = time_4f;
				}
				public double getTime_5f() {
					return time_5f;
				}
				public void setTime_5f(double time_5f) {
					this.time_5f = time_5f;
				}
				public double getTime_6f() {
					return time_6f;
				}
				public void setTime_6f(double time_6f) {
					this.time_6f = time_6f;
				}
				public double getTime_7f() {
					return time_7f;
				}
				public void setTime_7f(double time_7f) {
					this.time_7f = time_7f;
				}
				public double getTime_8f() {
					return time_8f;
				}
				public void setTime_8f(double time_8f) {
					this.time_8f = time_8f;
				}
				public double getTime_9f() {
					return time_9f;
				}
				public void setTime_9f(double time_9f) {
					this.time_9f = time_9f;
				}
				public double getTime_10f() {
					return time_10f;
				}
				public void setTime_10f(double time_10f) {
					this.time_10f = time_10f;
				}
				public double getTime_11f() {
					return time_11f;
				}
				public void setTime_11f(double time_11f) {
					this.time_11f = time_11f;
				}
				public double getTime_12f() {
					return time_12f;
				}
				public void setTime_12f(double time_12f) {
					this.time_12f = time_12f;
				}
				public double getPasstime_1f() {
					return passtime_1f;
				}
				public void setPasstime_1f(double passtime_1f) {
					this.passtime_1f = passtime_1f;
				}
				public double getPasstime_2f() {
					return passtime_2f;
				}
				public void setPasstime_2f(double passtime_2f) {
					this.passtime_2f = passtime_2f;
				}
				public double getPasstime_3f() {
					return passtime_3f;
				}
				public void setPasstime_3f(double passtime_3f) {
					this.passtime_3f = passtime_3f;
				}
				public double getPasstime_4f() {
					return passtime_4f;
				}
				public void setPasstime_4f(double passtime_4f) {
					this.passtime_4f = passtime_4f;
				}
				public double getPasstime_5f() {
					return passtime_5f;
				}
				public void setPasstime_5f(double passtime_5f) {
					this.passtime_5f = passtime_5f;
				}
				public double getPasstime_6f() {
					return passtime_6f;
				}
				public void setPasstime_6f(double passtime_6f) {
					this.passtime_6f = passtime_6f;
				}
				public double getPasstime_7f() {
					return passtime_7f;
				}
				public void setPasstime_7f(double passtime_7f) {
					this.passtime_7f = passtime_7f;
				}
				public double getPasstime_8f() {
					return passtime_8f;
				}
				public void setPasstime_8f(double passtime_8f) {
					this.passtime_8f = passtime_8f;
				}
				public double getPasstime_9f() {
					return passtime_9f;
				}
				public void setPasstime_9f(double passtime_9f) {
					this.passtime_9f = passtime_9f;
				}
				public double getPasstime_10f() {
					return passtime_10f;
				}
				public void setPasstime_10f(double passtime_10f) {
					this.passtime_10f = passtime_10f;
				}
				public String getPassrankS1f() {
					return passrankS1f;
				}
				public void setPassrankS1f(String passrankS1f) {
					this.passrankS1f = passrankS1f;
				}
				public String getPassrankG8f_1c() {
					return passrankG8f_1c;
				}
				public void setPassrankG8f_1c(String passrankG8f_1c) {
					this.passrankG8f_1c = passrankG8f_1c;
				}
				public String getPassrankG6f_2c() {
					return passrankG6f_2c;
				}
				public void setPassrankG6f_2c(String passrankG6f_2c) {
					this.passrankG6f_2c = passrankG6f_2c;
				}
				public String getPassrankG4f_3c() {
					return passrankG4f_3c;
				}
				public void setPassrankG4f_3c(String passrankG4f_3c) {
					this.passrankG4f_3c = passrankG4f_3c;
				}
				public String getPassrankG3f_4c() {
					return passrankG3f_4c;
				}
				public void setPassrankG3f_4c(String passrankG3f_4c) {
					this.passrankG3f_4c = passrankG3f_4c;
				}
				public String getPassrankG2f() {
					return passrankG2f;
				}
				public void setPassrankG2f(String passrankG2f) {
					this.passrankG2f = passrankG2f;
				}
				public String getPassrankG1f() {
					return passrankG1f;
				}
				public void setPassrankG1f(String passrankG1f) {
					this.passrankG1f = passrankG1f;
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
