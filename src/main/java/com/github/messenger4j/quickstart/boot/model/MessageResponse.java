package com.github.messenger4j.quickstart.boot.model;

public class MessageResponse {
	boolean error;
	int code;
	String libelle;
	Message message;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MessageResponse [error=" + error + ", code=" + code + ", libelle=" + libelle + ", message=" + message
				+ "]";
	}
	
	
}
