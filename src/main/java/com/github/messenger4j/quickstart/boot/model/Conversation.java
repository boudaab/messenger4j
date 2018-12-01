package com.github.messenger4j.quickstart.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conversation {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	LocalDate timestamp = LocalDate.now();
	String psid;
	int noeud;
	String response;
	
	
	public Conversation() {
	}
		
	public Conversation(String psid, int noeud, String response) {
		this.psid = psid;
		this.noeud = noeud;
		this.response = response;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPsid() {
		return psid;
	}
	public void setPsid(String psid) {
		this.psid = psid;
	}
	public int getNoeud() {
		return noeud;
	}
	public void setNoeud(int noeud) {
		this.noeud = noeud;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Conversation [id=" + id + ", timestamp=" + timestamp + ", psid=" + psid + ", noeud=" + noeud
				+ ", response=" + response + "]";
	}
	
	
	 
}
