package com.mgr.login.vo;

public class LoginInfoVO {
	private String id;
	private String pw;
	private String name;
	

	public LoginInfoVO() {
		// TODO Auto-generated constructor stub
	}


	public LoginInfoVO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
