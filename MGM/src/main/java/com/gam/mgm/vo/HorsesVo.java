package com.gam.mgm.vo;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class HorsesVo {
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
				@XmlElement(name="hrName")
				private String hr_htName;
				private String hrNo;
				@XmlElement(name="faHrName")
				private String hr_faHrName;
				@XmlElement(name="moHrName")
				private String hr_moHrName;
				@XmlElement(name="owName")
				private String hr_owName;
				@XmlElement(name="rcCntT")
				private int hr_rcCntT;
				@XmlElement(name="ord1CntT")
				private int hr_ord1CntT;
				@XmlElement(name="ord2CntT")
				private int hr_ord2CntT;
				@XmlElement(name="ord3CntT")
				private int hr_ord3CntT;
				@XmlElement(name="rcCntY")
				private int hr_rcCntY;
				@XmlElement(name="ord1CntY")
				private int hr_ord1CntY;
				@XmlElement(name="ord2CntY")
				private int hr_ord2CntY;
				@XmlElement(name="ord3CntY")
				private int hr_ord3CntY;
				@XmlElement(name="chaksunT")
				private int hr_chaksunT;
				@XmlElement(name="rating")
				private int hr_rating;
				@XmlElement(name="hrLastAmt")
				private int hr_hrLastAmt;
				private String rhrRegDt1; //경주마 등록일
				private String auctionMon; //최초 경매가
				public String getHr_htName() {
					return hr_htName;
				}
				public void setHr_htName(String hr_htName) {
					this.hr_htName = hr_htName;
				}
				public String getHrNo() {
					return hrNo;
				}
				public void setHrNo(String hrNo) {
					this.hrNo = hrNo;
				}
				public String getHr_faHrName() {
					return hr_faHrName;
				}
				public void setHr_faHrName(String hr_faHrName) {
					this.hr_faHrName = hr_faHrName;
				}
				public String getHr_moHrName() {
					return hr_moHrName;
				}
				public void setHr_moHrName(String hr_moHrName) {
					this.hr_moHrName = hr_moHrName;
				}
				public String getHr_owName() {
					return hr_owName;
				}
				public void setHr_owName(String hr_owName) {
					this.hr_owName = hr_owName;
				}
				public int getHr_rcCntT() {
					return hr_rcCntT;
				}
				public void setHr_rcCntT(int hr_rcCntT) {
					this.hr_rcCntT = hr_rcCntT;
				}
				public int getHr_ord1CntT() {
					return hr_ord1CntT;
				}
				public void setHr_ord1CntT(int hr_ord1CntT) {
					this.hr_ord1CntT = hr_ord1CntT;
				}
				public int getHr_ord2CntT() {
					return hr_ord2CntT;
				}
				public void setHr_ord2CntT(int hr_ord2CntT) {
					this.hr_ord2CntT = hr_ord2CntT;
				}
				public int getHr_ord3CntT() {
					return hr_ord3CntT;
				}
				public void setHr_ord3CntT(int hr_ord3CntT) {
					this.hr_ord3CntT = hr_ord3CntT;
				}
				public int getHr_rcCntY() {
					return hr_rcCntY;
				}
				public void setHr_rcCntY(int hr_rcCntY) {
					this.hr_rcCntY = hr_rcCntY;
				}
				public int getHr_ord1CntY() {
					return hr_ord1CntY;
				}
				public void setHr_ord1CntY(int hr_ord1CntY) {
					this.hr_ord1CntY = hr_ord1CntY;
				}
				public int getHr_ord2CntY() {
					return hr_ord2CntY;
				}
				public void setHr_ord2CntY(int hr_ord2CntY) {
					this.hr_ord2CntY = hr_ord2CntY;
				}
				public int getHr_ord3CntY() {
					return hr_ord3CntY;
				}
				public void setHr_ord3CntY(int hr_ord3CntY) {
					this.hr_ord3CntY = hr_ord3CntY;
				}
				public int getHr_chaksunT() {
					return hr_chaksunT;
				}
				public void setHr_chaksunT(int hr_chaksunT) {
					this.hr_chaksunT = hr_chaksunT;
				}
				public int getHr_rating() {
					return hr_rating;
				}
				public void setHr_rating(int hr_rating) {
					this.hr_rating = hr_rating;
				}
				public int getHr_hrLastAmt() {
					return hr_hrLastAmt;
				}
				public void setHr_hrLastAmt(int hr_hrLastAmt) {
					this.hr_hrLastAmt = hr_hrLastAmt;
				}
				public String getRhrRegDt1() {
					return rhrRegDt1;
				}
				public void setRhrRegDt1(String rhrRegDt1) {
					this.rhrRegDt1 = rhrRegDt1;
				}
				public String getAuctionMon() {
					return auctionMon;
				}
				public void setAuctionMon(String auctionMon) {
					this.auctionMon = auctionMon;
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
