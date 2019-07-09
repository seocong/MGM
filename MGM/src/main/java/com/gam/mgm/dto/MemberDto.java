package com.gam.mgm.dto;

public class MemberDto {
	private String member_id;
	private String member_pw;
	private String member_address;
	private String member_name;
	private String member_birth;
	private String member_phnum;
	private String member_likeplace;
	private String member_delflag;
	private int member_point;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(String member_id, String member_pw, String member_address, String member_name, String member_birth,
			String member_phnum, String member_likeplace, String member_delflag) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_address = member_address;
		this.member_name = member_name;
		this.member_birth = member_birth;
		this.member_phnum = member_phnum;
		this.member_likeplace = member_likeplace;
		this.member_delflag = member_delflag;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_phnum() {
		return member_phnum;
	}
	public void setMember_phnum(String member_phnum) {
		this.member_phnum = member_phnum;
	}
	public String getMember_likeplace() {
		return member_likeplace;
	}
	public void setMember_likeplace(String member_likeplace) {
		this.member_likeplace = member_likeplace;
	}
	public String getMember_delflag() {
		return member_delflag;
	}
	public void setMember_delflag(String member_delflag) {
		this.member_delflag = member_delflag;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	@Override
	public String toString() {
		return "MemberDto [member_id=" + member_id + ", member_pw=" + member_pw + ", member_address=" + member_address
				+ ", member_name=" + member_name + ", member_birth=" + member_birth + ", member_phnum=" + member_phnum
				+ ", member_likeplace=" + member_likeplace + ", member_delflag=" + member_delflag + ", member_point="
				+ member_point + "]";
	}
	
}
