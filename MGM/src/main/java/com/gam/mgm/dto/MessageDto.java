package com.gam.mgm.dto;

import java.util.Date;

public class MessageDto {
	private int message_seq;
	private String message_title;
	private String message_contents;
	private Date message_regdate;
	private String message_read;
	private String message_delflag;
	public MessageDto(int message_seq, String message_title, String message_contents, Date message_regdate,
			String message_read, String message_delflag, String message_sender, String messagge_receiver) {
		super();
		this.message_seq = message_seq;
		this.message_title = message_title;
		this.message_contents = message_contents;
		this.message_regdate = message_regdate;
		this.message_read = message_read;
		this.message_delflag = message_delflag;
		this.message_sender = message_sender;
		this.messagge_receiver = messagge_receiver;
	}
	@Override
	public String toString() {
		return "MessageDto [message_seq=" + message_seq + ", message_title=" + message_title + ", message_contents="
				+ message_contents + ", message_regdate=" + message_regdate + ", message_read=" + message_read
				+ ", message_delflag=" + message_delflag + ", message_sender=" + message_sender + ", messagge_receiver="
				+ messagge_receiver + "]";
	}
	public String getMessage_delflag() {
		return message_delflag;
	}
	public void setMessage_delflag(String message_delflag) {
		this.message_delflag = message_delflag;
	}
	private String message_sender;
	private String messagge_receiver;
	public int getMessage_seq() {
		return message_seq;
	}
	public void setMessage_seq(int message_seq) {
		this.message_seq = message_seq;
	}
	public String getMessage_title() {
		return message_title;
	}
	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}
	public String getMessage_contents() {
		return message_contents;
	}
	public void setMessage_contents(String message_contents) {
		this.message_contents = message_contents;
	}
	public Date getMessage_regdate() {
		return message_regdate;
	}
	public void setMessage_regdate(Date message_regdate) {
		this.message_regdate = message_regdate;
	}
	public String getMessage_read() {
		return message_read;
	}
	public void setMessage_read(String message_read) {
		this.message_read = message_read;
	}
	public String getMessage_sender() {
		return message_sender;
	}
	public void setMessage_sender(String message_sender) {
		this.message_sender = message_sender;
	}
	public String getMessagge_receiver() {
		return messagge_receiver;
	}
	public void setMessagge_receiver(String messagge_receiver) {
		this.messagge_receiver = messagge_receiver;
	}
	
}
