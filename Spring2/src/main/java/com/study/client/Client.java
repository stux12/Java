package com.study.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*이름 설정을 안했을시에는 id값은 소문자 객체명이됨 client*/
@Component
public class Client {
	
	@Value("120")
	private	int id;
	@Value("김수빈")
	private String name;
	@Value("축구")
	private String hobby;
	
	public void Who() {
		System.out.println("사원의 id는 "+id+",사원이름은 "+name+" 이라는~~");
	}
	public String Hobby(){
		return "나의 취미는 "+hobby+"이야~~"; 
	}
}
