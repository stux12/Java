package com.study.client;

public class Client2 {
	private int id;
	private String name;
	private String hobby;

	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String View() {
		return "사원의 id는 "+id+", 사원이름은 "+name+" 이라는";
	}
	public void Hobby() {
		System.out.println("나의 취미는 "+hobby+"이야~~");
	}
}
