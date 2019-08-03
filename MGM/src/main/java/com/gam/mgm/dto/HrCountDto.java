package com.gam.mgm.dto;

public class HrCountDto {
 private int foreign1;
 private int foreign2;
 private int foreign3;
 private int foreign4;
 private int yetForeign;
 private int domestic1;
 private int domestic2;
 private int domestic3;
 private int domestic4;
 private int domestic5;
 private int domestic6;
 private int yetDomestic;
 
public HrCountDto() {
	super();
	// TODO Auto-generated constructor stub
}
public HrCountDto(int foreign1, int foreign2, int foreign3, int foreign4, int yetForeign, int domestic1,
		int domestic2, int domestic3, int domestic4, int domestic5, int domestic6, int yetDomestic) {
	super();
	this.foreign1 = foreign1;
	this.foreign2 = foreign2;
	this.foreign3 = foreign3;
	this.foreign4 = foreign4;
	this.yetForeign = yetForeign;
	this.domestic1 = domestic1;
	this.domestic2 = domestic2;
	this.domestic3 = domestic3;
	this.domestic4 = domestic4;
	this.domestic5 = domestic5;
	this.domestic6 = domestic6;
	this.yetDomestic = yetDomestic;
}
public int getForeign1() {
	return foreign1;
}
public void setForeign1(int foreign1) {
	this.foreign1 = foreign1;
}
public int getForeign2() {
	return foreign2;
}
public void setForeign2(int foreign2) {
	this.foreign2 = foreign2;
}
public int getForeign3() {
	return foreign3;
}
public void setForeign3(int foreign3) {
	this.foreign3 = foreign3;
}
public int getForeign4() {
	return foreign4;
}
public void setForeign4(int foreign4) {
	this.foreign4 = foreign4;
}

public int getYetForeign() {
	return yetForeign;
}
public void setYetForeign(int yetForeign) {
	this.yetForeign = yetForeign;
}
public int getDomestic1() {
	return domestic1;
}
public void setDomestic1(int domestic1) {
	this.domestic1 = domestic1;
}
public int getDomestic2() {
	return domestic2;
}
public void setDomestic2(int domestic2) {
	this.domestic2 = domestic2;
}
public int getDomestic3() {
	return domestic3;
}
public void setDomestic3(int domestic3) {
	this.domestic3 = domestic3;
}
public int getDomestic4() {
	return domestic4;
}
public void setDomestic4(int domestic4) {
	this.domestic4 = domestic4;
}
public int getDomestic5() {
	return domestic5;
}
public void setDomestic5(int domestic5) {
	this.domestic5 = domestic5;
}
public int getDomestic6() {
	return domestic6;
}
public void setDomestic6(int domestic6) {
	this.domestic6 = domestic6;
}
public int getYetDomestic() {
	return yetDomestic;
}
public void setYetDomestic(int yetDomestic) {
	this.yetDomestic = yetDomestic;
}
@Override
public String toString() {
	return "HrCountDto [foreign1=" + foreign1 + ", foreign2=" + foreign2 + ", foreign3=" + foreign3 + ", foreign4="
			+ foreign4 + ", YetForeign=" + yetForeign + ", domestic1=" + domestic1
			+ ", domestic2=" + domestic2 + ", domestic3=" + domestic3 + ", domestic4=" + domestic4 + ", domestic5="
			+ domestic5 + ", domestic6=" + domestic6 + ", YetDomestic=" + yetDomestic + "]";
}

}
