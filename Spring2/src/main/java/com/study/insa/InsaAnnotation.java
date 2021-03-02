package com.study.insa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*클래스위에 에노테이션 선언해야함*/
/*이 value값으로 나중에 다른곳에서 getBean할때 id값이 됨*/
@Component("insa10") /*== @Component(value="insa10")*/
public class InsaAnnotation { /*@Component는 XML 설정없이 자동 bean등록!!*/
	
	@Value("홍길동")/*프로퍼티값 xml에서 p:name="홍길동" 를 생략한것*/
	private String name;
	
	public String helloName(String str1) {
		return this.name + "님\n" + str1;
	}
	
}
