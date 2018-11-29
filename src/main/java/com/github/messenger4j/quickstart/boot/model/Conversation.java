package com.github.messenger4j.quickstart.boot.model;

public class Conversation {

	int id;
	String psid;
	int noeud;
	String response;
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
		return "Conversation [id=" + id + ", psid=" + psid + ", noeud=" + noeud + ", response=" + response + "]";
	}
	
	
	 
}
