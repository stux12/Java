package com.study.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.helloProcess.HelloProcess;

public class Hello {

	public static void main(String[] args) {

		
		/*
		 	드라이브 하는 핵심처리 전에 공통기능으로 보안처리를 하는 프로그램을 AOP로 작성하시오
		 */
		
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("aopxml1.xml");
		
		HelloProcess hp1 = ac1.getBean("helloProcessBean",HelloProcess.class);
		/* 이 아래 메소드가 가동하기 전에(before) 공통이 가동됨 */
		hp1.kajaDrive();
		hp1.kajaTravel();
		
		((AbstractApplicationContext) ac1).close();
		
		
		
	}

}
