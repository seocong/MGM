package com.gam.mgm.vo;

import java.util.List;
import java.util.Map;

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
				private String ri_winChulNo;
				private String ri_winOdds;
				private String ri_plcChulNo;
				private String ri_plcOdds;
				private String ri_qnlChulNo;
				private String ri_qnlOdds;
				private String ri_exaChulNo;
				private String ri_exaOdds;
				private String ri_qplChulNo;
				private String ri_qplOdds;
				private String ri_tlaChulNo;
				private String ri_tlaOdds;
				private String ri_triChulNo;
				private String ri_triOdds;
				
				public String getRi_winChulNo() {
					return ri_winChulNo;
				}
				public void setRi_winChulNo(String ri_winChulNo) {
					this.ri_winChulNo = ri_winChulNo;
				}
				public String getRi_winOdds() {
					return ri_winOdds;
				}
				public void setRi_winOdds(String ri_winOdds) {
					this.ri_winOdds = ri_winOdds;
				}
				public String getRi_plcChulNo() {
					return ri_plcChulNo;
				}
				public void setRi_plcChulNo(String ri_plcChulNo) {
					this.ri_plcChulNo = ri_plcChulNo;
				}
				public String getRi_plcOdds() {
					return ri_plcOdds;
				}
				public void setRi_plcOdds(String ri_plcOdds) {
					this.ri_plcOdds = ri_plcOdds;
				}
				public String getRi_qnlChulNo() {
					return ri_qnlChulNo;
				}
				public void setRi_qnlChulNo(String ri_qnlChulNo) {
					this.ri_qnlChulNo = ri_qnlChulNo;
				}
				public String getRi_qnlOdds() {
					return ri_qnlOdds;
				}
				public void setRi_qnlOdds(String ri_qnlOdds) {
					this.ri_qnlOdds = ri_qnlOdds;
				}
				public String getRi_exaChulNo() {
					return ri_exaChulNo;
				}
				public void setRi_exaChulNo(String ri_exaChulNo) {
					this.ri_exaChulNo = ri_exaChulNo;
				}
				public String getRi_exaOdds() {
					return ri_exaOdds;
				}
				public void setRi_exaOdds(String ri_exaOdds) {
					this.ri_exaOdds = ri_exaOdds;
				}
				public String getRi_qplChulNo() {
					return ri_qplChulNo;
				}
				public void setRi_qplChulNo(String ri_qplChulNo) {
					this.ri_qplChulNo = ri_qplChulNo;
				}
				public String getRi_qplOdds() {
					return ri_qplOdds;
				}
				public void setRi_qplOdds(String ri_qplOdds) {
					this.ri_qplOdds = ri_qplOdds;
				}
				public String getRi_tlaChulNo() {
					return ri_tlaChulNo;
				}
				public void setRi_tlaChulNo(String ri_tlaChulNo) {
					this.ri_tlaChulNo = ri_tlaChulNo;
				}
				public String getRi_tlaOdds() {
					return ri_tlaOdds;
				}
				public void setRi_tlaOdds(String ri_tlaOdds) {
					this.ri_tlaOdds = ri_tlaOdds;
				}
				public String getRi_triChulNo() {
					return ri_triChulNo;
				}
				public void setRi_triChulNo(String ri_triChulNo) {
					this.ri_triChulNo = ri_triChulNo;
				}
				public String getRi_triOdds() {
					return ri_triOdds;
				}
				public void setRi_triOdds(String ri_triOdds) {
					this.ri_triOdds = ri_triOdds;
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
