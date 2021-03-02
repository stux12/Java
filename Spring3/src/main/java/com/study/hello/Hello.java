package com.study.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.client.Client;
import com.study.insa.Insa;

import configurationbean.ConfigurationBean;

public class Hello {

	public static void main(String[] args) {

		String str1 = "Hello, Spring";

		/*.java를 불러오기 위해선 AnnotationConfig이걸 사용해야함*/
		ApplicationContext ac1 = 
				new AnnotationConfigApplicationContext(ConfigurationBean.class);
													/*ConfigurationBean.java를 불러오기 위해*/

//		Insa insa1 = ac1.getBean("insaBean", Insa.class);
//		System.out.println(insa1.insaGo(str1));
		
		Client client1 = ac1.getBean("clientBean", Client.class);
		client1.Who();
		System.out.println(client1.Hobby());
		
		
		
		
	}

}
