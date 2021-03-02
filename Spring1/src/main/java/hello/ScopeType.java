package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.bangka.Bangka1;
import com.study.bangka.Bangka2;
import com.study.bangka.Lotto;
import com.study.classSetter.ClassSetter;
import com.study.client.client;
import com.study.insa.Insa;

public class ScopeType  {
	public static void main(String[] args) {
		/*web-inf밑 lib안에 파일 들어있어야 import가능
		스프링은 pojo기반
		bean : spring이 관리하는 인스턴스
		ApplicationContext = bean container = bean을 관리*/
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*저 applicationContext.xml로부터 값을 받아와서 그것을 사용함*/
		
		
		
		/*Bean객체 생성및 초기화 제거등을 관리*/
//		Bangka1 b1 = (Bangka1)ac1.getBean("bankbean1");
//		Bangka2 b2 = (Bangka2)ac1.getBean("bankbean2");
//		Bangka2 b5 = (Bangka2)ac1.getBean("bankbean2");

//		b1.bangkabangka1("홍길동");

		
//		Bangka1 b3 = (Bangka1)ac1.getBean("bankbean1");
//		b3.bangkabangka1("성춘향");
		
		/*이 둘은 같은객체 singleton
		문제점 : 따로 출력은 문제없으나 동시출력할때 문제가 됨!!*/
//		System.out.println(b1+","+b3);
		
		/*prototype으로 해두면 다른 객체로 각각 객체생성*/
//		System.out.println(b2+","+b5);
		
		/*xml에서 singleton으로 각각 bean객체를 생성하면 다른 객체로 인식됨
		하지만 다시 자바에서 객체를 두개이상 만들어내면 singleton으로서 하나의 객체로 만들어짐*/
//		Bangka1 b4 = (Bangka1)ac1.getBean("bankbean3");
//		System.out.println(b4);
		/*.equals를하던 ==을하던 다른객체라서 값이 다름*/
//		if(b1.equals(b4)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("같지않음");
//		}
		
		/*singleton방식으로 할경우 이렇게 하나하나로 찍어내야함*/
//		client c1 = (client)ac1.getBean("client1");
		
		/*방법1*/
//		c1.setId(3);
//		c1.setIrum("연수");
//		System.out.println(c1);
//		c1.setId(5);
//		c1.setIrum("태식");
//		System.out.print(c1);
//		System.out.println(c1);
//		System.out.print(c1);
//		System.out.print(c1);
//		c1.setId(7);
//		c1.setIrum("수빈");
//		System.out.println(c1);
		
		/*방법2*/
//		c1.clientJoin(3, "연수");
//		System.out.println(c1);
//		c1.clientJoin(5, "태식");
//		System.out.print(c1);
//		System.out.println(c1);
//		System.out.print(c1);
//		System.out.print(c1);
//		c1.clientJoin(7, "수빈");
//		System.out.println(c1);
		
		/*prototype사용시*/
//		client c2 = (client)ac1.getBean("client2");
//		client c3 = (client)ac1.getBean("client2");
//		client c4 = (client)ac1.getBean("client2");
//		c2.clientJoin(3, "연수");
//		c3.clientJoin(5, "태식");
//		c4.clientJoin(7, "수빈");
//		System.out.println(c2+",\n"+c3+",\n"+c4);
		
//		Lotto l1 = (Lotto)ac1.getBean("Lotto");
//		l1.GoGo();
		
		ClassSetter cs1 = (ClassSetter)ac1.getBean("insa4");
		cs1.getInsa();
		cs1.kajaHello("");
	
	}
}
