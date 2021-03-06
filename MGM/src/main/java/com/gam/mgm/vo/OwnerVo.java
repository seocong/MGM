package com.gam.mgm.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class OwnerVo {
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
				@XmlElement(name="owNo")
				private String ow_no;
				@XmlElement(name="owName")
				private String ow_name;
				@XmlElement(name="totHorses")
				private int ow_totHorses;
				@XmlElement(name="cancledHorses")
				private int ow_cancledHorses;
				@XmlElement(name="ownerHorses")
				private int ow_nowHorses;
				@XmlElement(name="stDate")
				private String ow_stDate;
				@XmlElement(name="rcCntT")
				private int ow_rcCntT;
				@XmlElement(name="ord1CntT")
				private int ow_ord1CntT;
				@XmlElement(name="ord2CntT")
				private int ow_ord2CntT;
				@XmlElement(name="ord3CntT")
				private int ow_ord3CntT;
				@XmlElement(name="rcCntY")
				private int ow_rcCntY;
				@XmlElement(name="ord1CntY")
				private int ow_ord1CntY;
				@XmlElement(name="ord2CntY")
				private int ow_ord2CntY;
				@XmlElement(name="ord3CntY")
				private int ow_ord3CntY;
				@XmlElement(name="chaksunY")
				private long ow_chaksunY;
				@XmlElement(name="chaksunT")
				private long ow_chaksunT;
				public String getOw_name() {
					return ow_name;
				}
				public void setOw_name(String ow_name) {
					this.ow_name = ow_name;
				}
				public int getOw_totHorses() {
					return ow_totHorses;
				}
				public void setOw_totHorses(int ow_totHorses) {
					this.ow_totHorses = ow_totHorses;
				}
				public int getOw_cancledHorses() {
					return ow_cancledHorses;
				}
				public void setOw_cancledHorses(int ow_cancledHorses) {
					this.ow_cancledHorses = ow_cancledHorses;
				}
				public int getOw_nowHorses() {
					return ow_nowHorses;
				}
				public void setOw_nowHorses(int ow_nowHorses) {
					this.ow_nowHorses = ow_nowHorses;
				}
				public String getOw_stDate() {
					return ow_stDate;
				}
				public void setOw_stDate(String ow_stDate) {
					this.ow_stDate = ow_stDate;
				}
				public int getOw_rcCntT() {
					return ow_rcCntT;
				}
				public void setOw_rcCntT(int ow_rcCntT) {
					this.ow_rcCntT = ow_rcCntT;
				}
				public int getOw_rcCntY() {
					return ow_rcCntY;
				}
				public void setOw_rcCntY(int ow_rcCntY) {
					this.ow_rcCntY = ow_rcCntY;
				}
				public long getOw_chaksunY() {
					return ow_chaksunY;
				}
				public void setOw_chaksunY(long ow_chaksunY) {
					this.ow_chaksunY = ow_chaksunY;
				}
				public long getOw_chaksunT() {
					return ow_chaksunT;
				}
				public void setOw_chaksunT(long ow_chaksunT) {
					this.ow_chaksunT = ow_chaksunT;
				}
				public String getOw_no() {
					return ow_no;
				}
				public void setOw_no(String ow_no) {
					this.ow_no = ow_no;
				}
				public int getOw_ord1CntT() {
					return ow_ord1CntT;
				}
				public void setOw_ord1CntT(int ow_ord1CntT) {
					this.ow_ord1CntT = ow_ord1CntT;
				}
				public int getOw_ord2CntT() {
					return ow_ord2CntT;
				}
				public void setOw_ord2CntT(int ow_ord2CntT) {
					this.ow_ord2CntT = ow_ord2CntT;
				}
				public int getOw_ord3CntT() {
					return ow_ord3CntT;
				}
				public void setOw_ord3CntT(int ow_ord3CntT) {
					this.ow_ord3CntT = ow_ord3CntT;
				}
				public int getOw_ord1CntY() {
					return ow_ord1CntY;
				}
				public void setOw_ord1CntY(int ow_ord1CntY) {
					this.ow_ord1CntY = ow_ord1CntY;
				}
				public int getOw_ord2CntY() {
					return ow_ord2CntY;
				}
				public void setOw_ord2CntY(int ow_ord2CntY) {
					this.ow_ord2CntY = ow_ord2CntY;
				}
				public int getOw_ord3CntY() {
					return ow_ord3CntY;
				}
				public void setOw_ord3CntY(int ow_ord3CntY) {
					this.ow_ord3CntY = ow_ord3CntY;
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
