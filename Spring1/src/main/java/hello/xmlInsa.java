package hello;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.study.classSetter.ClassSetter;
import com.study.classSetter.ClassSetter2;
import com.study.insa.Insa;

public class xmlInsa {
	public static void main(String[] args) {
		
		String str1 = "오늘 날씨 어때요?";

		GenericXmlApplicationContext gxac1 = new 
				GenericXmlApplicationContext("applicationContext.xml");
		
		
		
		/*가장 확실(bean이름, type)*/
//		Insa insa1=gxac1.getBean("insa1",Insa.class);
	
		/*Insa type에 접근 같은 인스턴스 일때 에러*/
//		Insa insa2=gxac1.getBean(Insa.class);
	
		/*bean객체 이름으로만 이경우 받는 bean타입으로 형변환(기본반환형 object)*/
//		Insa insa3=(Insa)gxac1.getBean("insa1");
		
//		System.out.println(insa1.insaGo(str1));
		
//		Insa insa4=gxac1.getBean("insa2",Insa.class);
//		System.out.println(insa4.insaGo(str1));
		
		
		/*객체참조변수를 이용한 방법*/
//		ClassSetter cs1 = gxac1.getBean("insa4",ClassSetter.class);
//		System.out.println(cs1.kajaHello(str1));
		
//		ClassSetter2 cs2 = gxac1.getBean("client4",ClassSetter2.class);
//		System.out.println(cs2.ClientView());
//		cs2.ClientHobby();
		
		
		
		
		
		
		
		gxac1.close();
	}
}
