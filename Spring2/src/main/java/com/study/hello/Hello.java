package com.study.hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.study.client.Client;
import com.study.constarg.Constarg;
import com.study.insa.Insa;

public class Hello {

	public static void main(String[] args) {

		String str1 = "오늘 날씨 어때요?";

		GenericXmlApplicationContext gxac1 = new 
				GenericXmlApplicationContext("applicationContext.xml");
		
		
		/*생성자를 이용한 방법*/
//		InsaCon insaCon1=gxac1.getBean("insaCon2", InsaCon.class);
//		System.out.println(insaCon1);
		
		
//		InsaConClass insaCon2=gxac1.getBean("insaCon3", InsaConClass.class);
//		System.out.println(insaCon2.insa());
	
//		InsaAnnotation insaA1=gxac1.getBean("insa10", InsaAnnotation.class);
//		System.out.println(insaA1.helloName(str1));
		
		/*Test*/
//		Client c1 = gxac1.getBean("client", Client.class);
//		c1.Who();
//		System.out.println(c1.Hobby());
		
		
		/*autowired 사용한 방법*/
//		Insa insa1 = gxac1.getBean("insaBean", Insa.class);
//		System.out.println(insa1.insaGo("Hello, Spring"));
		
		Constarg ca1=gxac1.getBean("conBean", Constarg.class);
		System.out.println(ca1.kajaHello("Hello, Spring"));
		
		
		gxac1.close();
		
	}

}
