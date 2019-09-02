package com.gam.mgm.dto;

import java.util.Date;
import java.util.List;

public class MemberDto {
	private String member_id;
	private String member_pw;
	private String member_address;
	private String member_name;
	private Date member_birth;
	private String member_phnum;
	private String member_delflag;
	
	private int member_point;
	private int message_count;
	private Date member_regdate;
	private int board_count;
	private List<PointDto> pointDto;
	private int msgCount;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(String member_id, String member_pw, String member_address, String member_name, Date member_birth,
			String member_phnum, String member_delflag, int member_point, int message_count, Date member_regdate,
			int board_count, List<PointDto> pointDto, int msgCount) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_address = member_address;
		this.member_name = member_name;
		this.member_birth = member_birth;
		this.member_phnum = member_phnum;
		this.member_delflag = member_delflag;
		this.member_point = member_point;
		this.message_count = message_count;
		this.member_regdate = member_regdate;
		this.board_count = board_count;
		this.pointDto = pointDto;
		this.msgCount = msgCount;
	}
	@Override
	public String toString() {
		return "MemberDto [member_id=" + member_id + ", member_pw=" + member_pw + ", member_address=" + member_address
				+ ", member_name=" + member_name + ", member_birth=" + member_birth + ", member_phnum=" + member_phnum
				+ ", member_delflag=" + member_delflag + ", member_point=" + member_point + ", message_count="
				+ message_count + ", member_regdate=" + member_regdate + ", board_count=" + board_count + ", pointDto="
				+ pointDto + ", msgCount=" + msgCount + "]";
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
	public Date getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Date member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_phnum() {
		return member_phnum;
	}
	public void setMember_phnum(String member_phnum) {
		this.member_phnum = member_phnum;
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
	public int getMessage_count() {
		return message_count;
	}
	public void setMessage_count(int message_count) {
		this.message_count = message_count;
	}
	public Date getMember_regdate() {
		return member_regdate;
	}
	public void setMember_regdate(Date member_regdate) {
		this.member_regdate = member_regdate;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public List<PointDto> getPointDto() {
		return pointDto;
	}
	public void setPointDto(List<PointDto> pointDto) {
		this.pointDto = pointDto;
	}
	public int getMsgCount() {
		return msgCount;
	}
	public void setMsgCount(int msgCount) {
		this.msgCount = msgCount;
	}
	
}
	