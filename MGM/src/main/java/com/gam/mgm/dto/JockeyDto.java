package com.gam.mgm.dto;

public class JockeyDto {
	private int jk_seq;
	private String jk_name;
	private String jk_part;
	private String jk_birthday;
	private int jk_age;
	private String jk_debut;
	private int jk_wgPart;
	private int jk_wgOther;
	private int jk_rcCntT;
	private int jk_ord1CntT;
	private int jk_ord2CntT;
	private int jk_ord3CntT;
	private int jk_rcCntY;
	private int jk_ord1CntY;
	private int jk_ord2CntY;
	private int jk_ord3CntY;
	private int jk_meet;
	private String jk_profileImg;
	private String jk_clothesImg;
	public JockeyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JockeyDto(int jk_seq, String jk_name, String jk_part, String jk_birthday, int jk_age, String jk_debut,
			int jk_wgPart, int jk_wgOther, int jk_rcCntT, int jk_ord1CntT, int jk_ord2CntT, int jk_ord3CntT,
			int jk_rcCntY, int jk_ord1CntY, int jk_ord2CntY, int jk_ord3CntY, int jk_meet, String jk_profileImg, String jk_clothesImg) {
		super();
		this.jk_seq = jk_seq;
		this.jk_name = jk_name;
		this.jk_part = jk_part;
		this.jk_birthday = jk_birthday;
		this.jk_age = jk_age;
		this.jk_debut = jk_debut;
		this.jk_wgPart = jk_wgPart;
		this.jk_wgOther = jk_wgOther;
		this.jk_rcCntT = jk_rcCntT;
		this.jk_ord1CntT = jk_ord1CntT;
		this.jk_ord2CntT = jk_ord2CntT;
		this.jk_ord3CntT = jk_ord3CntT;
		this.jk_rcCntY = jk_rcCntY;
		this.jk_ord1CntY = jk_ord1CntY;
		this.jk_ord2CntY = jk_ord2CntY;
		this.jk_ord3CntY = jk_ord3CntY;
		this.jk_meet = jk_meet;
		this.jk_profileImg = jk_profileImg;
		this.jk_clothesImg = jk_clothesImg;
	}
	
	@Override
	public String toString() {
		return "JockeyDto [jk_seq=" + jk_seq + ", jk_name=" + jk_name + ", jk_part=" + jk_part + ", jk_birthday="
				+ jk_birthday + ", jk_age=" + jk_age + ", jk_debut=" + jk_debut + ", jk_wgPart=" + jk_wgPart
				+ ", jk_wgOther=" + jk_wgOther + ", jk_rcCntT=" + jk_rcCntT + ", jk_ord1CntT=" + jk_ord1CntT
				+ ", jk_ord2CntT=" + jk_ord2CntT + ", jk_ord3CntT=" + jk_ord3CntT + ", jk_rcCntY=" + jk_rcCntY
				+ ", jk_ord1CntY=" + jk_ord1CntY + ", jk_ord2CntY=" + jk_ord2CntY + ", jk_ord3CntY=" + jk_ord3CntY
				+ ", jk_meet=" + jk_meet + ", jk_profileImg=" + jk_profileImg + ", jk_clothesImg=" + jk_clothesImg
				+ "]";
	}
	public int getJk_seq() {
		return jk_seq;
	}
	public void setJk_seq(int jk_seq) {
		this.jk_seq = jk_seq;
	}
	public String getJk_name() {
		return jk_name;
	}
	public void setJk_name(String jk_name) {
		this.jk_name = jk_name;
	}
	public String getJk_part() {
		return jk_part;
	}
	public void setJk_part(String jk_part) {
		this.jk_part = jk_part;
	}
	public String getJk_birthday() {
		return jk_birthday;
	}
	public void setJk_birthday(String jk_birthday) {
		this.jk_birthday = jk_birthday;
	}
	public int getJk_age() {
		return jk_age;
	}
	public void setJk_age(int jk_age) {
		this.jk_age = jk_age;
	}
	public String getJk_debut() {
		return jk_debut;
	}
	public void setJk_debut(String jk_debut) {
		this.jk_debut = jk_debut;
	}
	public int getJk_wgPart() {
		return jk_wgPart;
	}
	public void setJk_wgPart(int jk_wgPart) {
		this.jk_wgPart = jk_wgPart;
	}
	public int getJk_wgOther() {
		return jk_wgOther;
	}
	public void setJk_wgOther(int jk_wgOther) {
		this.jk_wgOther = jk_wgOther;
	}
	public int getJk_rcCntT() {
		return jk_rcCntT;
	}
	public void setJk_rcCntT(int jk_rcCntT) {
		this.jk_rcCntT = jk_rcCntT;
	}
	public int getJk_ord1CntT() {
		return jk_ord1CntT;
	}
	public void setJk_ord1CntT(int jk_ord1CntT) {
		this.jk_ord1CntT = jk_ord1CntT;
	}
	public int getJk_ord2CntT() {
		return jk_ord2CntT;
	}
	public void setJk_ord2CntT(int jk_ord2CntT) {
		this.jk_ord2CntT = jk_ord2CntT;
	}
	public int getJk_ord3CntT() {
		return jk_ord3CntT;
	}
	public void setJk_ord3CntT(int jk_ord3CntT) {
		this.jk_ord3CntT = jk_ord3CntT;
	}
	public int getJk_rcCntY() {
		return jk_rcCntY;
	}
	public void setJk_rcCntY(int jk_rcCntY) {
		this.jk_rcCntY = jk_rcCntY;
	}
	public int getJk_ord1CntY() {
		return jk_ord1CntY;
	}
	public void setJk_ord1CntY(int jk_ord1CntY) {
		this.jk_ord1CntY = jk_ord1CntY;
	}
	public int getJk_ord2CntY() {
		return jk_ord2CntY;
	}
	public void setJk_ord2CntY(int jk_ord2CntY) {
		this.jk_ord2CntY = jk_ord2CntY;
	}
	public int getJk_ord3CntY() {
		return jk_ord3CntY;
	}
	public void setJk_ord3CntY(int jk_ord3CntY) {
		this.jk_ord3CntY = jk_ord3CntY;
	}
	public int getJk_meet() {
		return jk_meet;
	}
	public void setJk_meet(int jk_meet) {
		this.jk_meet = jk_meet;
	}
	public String getJk_profileImg() {
		return jk_profileImg;
	}
	public void setJk_profileImg(String jk_profileImg) {
		this.jk_profileImg = jk_profileImg;
	}
	public String getJk_clothesImg() {
		return jk_clothesImg;
	}
	public void setJk_clothesImg(String jk_clothesImg) {
		this.jk_clothesImg = jk_clothesImg;
	}
	
}
