package com.study.client;


//이름 설정을 안했을시에는 id값은 소문자 객체명이됨 client
public class Client {
	
	private	int id;
	private String name;
	private String hobby;
	
	
	
	public Client(int id, String name, String hobby) {
		this.id = id;
		this.name = name;
		this.hobby = hobby;
	}
	public void Who() {
		System.out.println("사원의 id는 "+id+",사원이름은 "+name+" 이라는~~");
	}
	public void Hobby(){
		System.out.println("나의 취미는 "+hobby+"이야~~");  
	}
}
