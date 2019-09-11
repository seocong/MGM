package com.gam.mgm.dto;

import java.sql.Timestamp;

public class ChatDto {
	private int chat_seq;
	private String chat_id;
	private String chat_content;
	private String chat_time;
	public ChatDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChatDto(int chat_seq, String chat_id, String chat_content, String chat_time) {
		super();
		this.chat_seq = chat_seq;
		this.chat_id = chat_id;
		this.chat_content = chat_content;
		this.chat_time = chat_time;
	}
	@Override
	public String toString() {
		return "ChatDto [chat_seq=" + chat_seq + ", chat_id=" + chat_id + ", chat_content=" + chat_content
				+ ", chat_time=" + chat_time + "]";
	}
	public int getChat_seq() {
		return chat_seq;
	}
	public void setChat_seq(int chat_seq) {
		this.chat_seq = chat_seq;
	}
	public String getChat_id() {
		return chat_id;
	}
	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}
	public String getChat_content() {
		return chat_content;
	}
	public void setChat_content(String chat_content) {
		this.chat_content = chat_content;
	}
	public String getChat_time() {
		return chat_time;
	}
	public void setChat_time(String chat_time) {
		this.chat_time = chat_time;
	}
	
}
