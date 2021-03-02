package com.study.insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Insa {
	
	@Autowired @Value("홍길동") /*name에다가 매핑할껀데 초기치는 홍길동이란 뜻*/
	private String name;
	@Autowired @Value("23")
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	


	public String insaGo(String str1) {
		return this.name+"님\n"+str1+"\n나이는"+age+"이군요";
	}
}
