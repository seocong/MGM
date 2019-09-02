package com.gam.mgm.dto;

import java.util.Date;

public class MessageDto {
	private int message_seq;
	private String message_content;
	private Date message_regdate;
	private String message_rRead;
	private String message_sRead;
	private String message_rDelflag;
	private String message_SDelflag;
	private String message_sender;
	private String message_receiver;
	public MessageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageDto(int message_seq, String message_content, Date message_regdate, String message_rRead,
			String message_sRead, String message_rDelflag, String message_SDelflag, String message_sender,
			String message_receiver) {
		super();
		this.message_seq = message_seq;
		this.message_content = message_content;
		this.message_regdate = message_regdate;
		this.message_rRead = message_rRead;
		this.message_sRead = message_sRead;
		this.message_rDelflag = message_rDelflag;
		this.message_SDelflag = message_SDelflag;
		this.message_sender = message_sender;
		this.message_receiver = message_receiver;
	}
	@Override
	public String toString() {
		return "MessageDto [message_seq=" + message_seq + ", message_content=" + message_content
				+ ", message_regdate=" + message_regdate + ", message_rRead=" + message_rRead + ", message_sRead="
				+ message_sRead + ", message_rDelflag=" + message_rDelflag + ", message_SDelflag=" + message_SDelflag
				+ ", message_sender=" + message_sender + ", message_receiver=" + message_receiver + "]";
	}
	public int getMessage_seq() {
		return message_seq;
	}
	public void setMessage_seq(int message_seq) {
		this.message_seq = message_seq;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	public Date getMessage_regdate() {
		return message_regdate;
	}
	public void setMessage_regdate(Date message_regdate) {
		this.message_regdate = message_regdate;
	}
	public String getMessage_rRead() {
		return message_rRead;
	}
	public void setMessage_rRead(String message_rRead) {
		this.message_rRead = message_rRead;
	}
	public String getMessage_sRead() {
		return message_sRead;
	}
	public void setMessage_sRead(String message_sRead) {
		this.message_sRead = message_sRead;
	}
	public String getMessage_rDelflag() {
		return message_rDelflag;
	}
	public void setMessage_rDelflag(String message_rDelflag) {
		this.message_rDelflag = message_rDelflag;
	}
	public String getMessage_SDelflag() {
		return message_SDelflag;
	}
	public void setMessage_SDelflag(String message_SDelflag) {
		this.message_SDelflag = message_SDelflag;
	}
	public String getMessage_sender() {
		return message_sender;
	}
	public void setMessage_sender(String message_sender) {
		this.message_sender = message_sender;
	}
	public String getMessage_receiver() {
		return message_receiver;
	}
	public void setMessage_receiver(String message_receiver) {
		this.message_receiver = message_receiver;
	}
	
}
