package com.github.messenger4j.quickstart.boot.model;

public class Message {
	private String message_auto;
	private int message_id;
	private String phone;
	private String object;
	private String message;

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageId() {
		return message_id;
	}
	public void setMessageId(int messageId) {
		this.message_id = messageId;
	}
	
	public String getMessage_auto() {
		return message_auto;
	}
	public void setMessage_auto(String message_auto) {
		this.message_auto = message_auto;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	@Override
	public String toString() {
		return "Message [message_auto=" + message_auto + ", message_id=" + message_id + ", phone=" + phone + ", object="
				+ object + ", message=" + message + "]";
	}
	
}
