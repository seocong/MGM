package com.gam.mgm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class RacePlanitemDto{
	private String ageCond; //연령오픈	20
	private String budam;	//부담 구분	8
	private int buga1;	//1착 부가 상금	12
	private int buga2;	//2착 부가 상금	12
	private int buga3;	//3착 부가 상금	12
	private int chaksun1;	//1착 상금	12
	private int chaksun2;	//2착 상금	12
	private int chaksun3;	//3착 상금	12
	private int chaksun4;	//4착 상금	12
	private int chaksun5;	//5착 상금	12
	private int ilsu;	//경주 차수	3
	private String meet;	//시행경마장명	10
	@XmlElement(name="rank")
	private String ranks;	//등급조건	8
	private String rcDate;	//경주일자	10
	private int rcDist;		//경주거리	4
	private String rcName;	//경주명	50
	private int rcNo;	//경주번호	2
	private int schStTime;	//발주예정시간	4
	private int spRating;	//레이팅하한조건	6
	private int stRating;	//레이팅상한조건	6
	public String getAgeCond() {
		return ageCond;
	}
	public void setAgeCond(String ageCond) {
		this.ageCond = ageCond;
	}
	public String getBudam() {
		return budam;
	}
	public void setBudam(String budam) {
		this.budam = budam;
	}
	public int getBuga1() {
		return buga1;
	}
	public void setBuga1(int buga1) {
		this.buga1 = buga1;
	}
	public int getBuga2() {
		return buga2;
	}
	public void setBuga2(int buga2) {
		this.buga2 = buga2;
	}
	public int getBuga3() {
		return buga3;
	}
	public void setBuga3(int buga3) {
		this.buga3 = buga3;
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
	public String getRanks() {
		return ranks;
	}
	public void setRanks(String ranks) {
		this.ranks = ranks;
	}
	public String getRcDate() {
		return rcDate;
	}
	public void setRcDate(String rcDate) {
		this.rcDate = rcDate;
	}
	public int getRcDist() {
		return rcDist;
	}
	public void setRcDist(int rcDist) {
		this.rcDist = rcDist;
	}
	public String getRcName() {
		return rcName;
	}
	public void setRcName(String rcName) {
		this.rcName = rcName;
	}
	public int getRcNo() {
		return rcNo;
	}
	public void setRcNo(int rcNo) {
		this.rcNo = rcNo;
	}
	public int getSchStTime() {
		return schStTime;
	}
	public void setSchStTime(int schStTime) {
		this.schStTime = schStTime;
	}
	public int getSpRating() {
		return spRating;
	}
	public void setSpRating(int spRating) {
		this.spRating = spRating;
	}
	public int getStRating() {
		return stRating;
	}
	public void setStRating(int stRating) {
		this.stRating = stRating;
	}
}

