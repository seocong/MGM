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
				private Date rcDate;
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
				private float time_1f;
				private float time_2f;
				private float time_3f;
				private float time_4f;
				private float time_5f;
				private float time_6f;
				private float time_7f;
				private float time_8f;
				private float time_9f;
				private float time_10f;
				private float time_11f;
				private float time_12f;
				private float passTime_1f;
				private float passTime_2f;
				private float passTime_3f;
				private float passTime_4f;
				private float passTime_5f;
				private float passTime_6f;
				private float passTime_7f;
				private float passTime_8f;
				private float passTime_9f;
				private float passTime_10f;
				private String passrankS1f;
				private String passrankG8f_1c;
				private String passrankG6f_2c;
				private String passrankG4f_3c;
				private String passrankG3f_4c;
				private String passrankG2f;
				private String passrankG1f;
				public Date getRcDate() {
					return rcDate;
				}
				public void setRcDate(Date rcDate) {
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
				public float getTime_1f() {
					return time_1f;
				}
				public void setTime_1f(float time_1f) {
					this.time_1f = time_1f;
				}
				public float getTime_2f() {
					return time_2f;
				}
				public void setTime_2f(float time_2f) {
					this.time_2f = time_2f;
				}
				public float getTime_3f() {
					return time_3f;
				}
				public void setTime_3f(float time_3f) {
					this.time_3f = time_3f;
				}
				public float getTime_4f() {
					return time_4f;
				}
				public void setTime_4f(float time_4f) {
					this.time_4f = time_4f;
				}
				public float getTime_5f() {
					return time_5f;
				}
				public void setTime_5f(float time_5f) {
					this.time_5f = time_5f;
				}
				public float getTime_6f() {
					return time_6f;
				}
				public void setTime_6f(float time_6f) {
					this.time_6f = time_6f;
				}
				public float getTime_7f() {
					return time_7f;
				}
				public void setTime_7f(float time_7f) {
					this.time_7f = time_7f;
				}
				public float getTime_8f() {
					return time_8f;
				}
				public void setTime_8f(float time_8f) {
					this.time_8f = time_8f;
				}
				public float getTime_9f() {
					return time_9f;
				}
				public void setTime_9f(float time_9f) {
					this.time_9f = time_9f;
				}
				public float getTime_10f() {
					return time_10f;
				}
				public void setTime_10f(float time_10f) {
					this.time_10f = time_10f;
				}
				public float getTime_11f() {
					return time_11f;
				}
				public void setTime_11f(float time_11f) {
					this.time_11f = time_11f;
				}
				public float getTime_12f() {
					return time_12f;
				}
				public void setTime_12f(float time_12f) {
					this.time_12f = time_12f;
				}
				public float getPassTime_1f() {
					return passTime_1f;
				}
				public void setPassTime_1f(float passTime_1f) {
					this.passTime_1f = passTime_1f;
				}
				public float getPassTime_2f() {
					return passTime_2f;
				}
				public void setPassTime_2f(float passTime_2f) {
					this.passTime_2f = passTime_2f;
				}
				public float getPassTime_3f() {
					return passTime_3f;
				}
				public void setPassTime_3f(float passTime_3f) {
					this.passTime_3f = passTime_3f;
				}
				public float getPassTime_4f() {
					return passTime_4f;
				}
				public void setPassTime_4f(float passTime_4f) {
					this.passTime_4f = passTime_4f;
				}
				public float getPassTime_5f() {
					return passTime_5f;
				}
				public void setPassTime_5f(float passTime_5f) {
					this.passTime_5f = passTime_5f;
				}
				public float getPassTime_6f() {
					return passTime_6f;
				}
				public void setPassTime_6f(float passTime_6f) {
					this.passTime_6f = passTime_6f;
				}
				public float getPassTime_7f() {
					return passTime_7f;
				}
				public void setPassTime_7f(float passTime_7f) {
					this.passTime_7f = passTime_7f;
				}
				public float getPassTime_8f() {
					return passTime_8f;
				}
				public void setPassTime_8f(float passTime_8f) {
					this.passTime_8f = passTime_8f;
				}
				public float getPassTime_9f() {
					return passTime_9f;
				}
				public void setPassTime_9f(float passTime_9f) {
					this.passTime_9f = passTime_9f;
				}
				public float getPassTime_10f() {
					return passTime_10f;
				}
				public void setPassTime_10f(float passTime_10f) {
					this.passTime_10f = passTime_10f;
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
