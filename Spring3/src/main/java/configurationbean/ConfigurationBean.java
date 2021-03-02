package configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.client.AljaHobby;
import com.study.client.Client;
import com.study.insa.Insa;

@Configuration //내가 환경설정 파일이다라고 알려줌!!
public class ConfigurationBean {
	
	/*
	 	xml > annotation > 자바
	 	
	 	환경설정 파일이 이것임 XML이 필요없어짐
	 	
	 	즉, 자바annotation은 applicationContext.xml -> configurationBean.java
	 	src폴더안에 패키지안에 .java만들면 됨
	 	기존 annotation은 주석을 달고 시작한다!!
	 	
	 */
	
	/*@Bean을 함으로써 빈객체로 정의됨*/
	@Bean 
	public Insa insaBean() {/*이름이 id개념=[객체명]*/
		return new Insa("홍길동");/*객체만들어+초기치주고 리턴*/
	}
	@Bean
	public Client clientBean() {
		return new Client(130,"이미래","축구");
	}
	@Bean
	public AljaHobby aljaBean() {
		return new AljaHobby(clientBean());
	}
	
}
