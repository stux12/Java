package com.study.client;

public class client {

	private int id;
	private String irum;
	
	
	
	public void clientJoin(int id, String irum) {
		this.id = id;
		this.irum = irum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	@Override
	public String toString() {
		return "사원의 id는"+id+",사원이름은"+irum+"이라는~~~";
	}
	
	
	
}
