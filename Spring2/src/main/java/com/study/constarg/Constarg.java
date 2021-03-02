package com.study.constarg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

import com.study.insa.Insa;
public class Constarg {
	/*
	 	객체인자전달
	 	...ref="" ==> p:insa-ref=""
	 	이것을 더 간단히
	 	
	 	@Autowired로 참조변수 mapping
	 	@Autowired가 insa객체필드에 초기치 주는 생성자, setter역할
	 	자동으로 bean을 찾아 injection
	 */
//		@Autowired @Qualifier("koobeok") /*둘다 같이 써줘야만 됨!!*/
		@Resource(name="insaBean") /*이름을 정해서 가져올수도 있음*/
		private Insa insa; /*insa객체가 필드명, 매핑*/
		
		public String kajaHello(String str1) {
		return insa.insaGo(str1);
			/*insa객체 mapping했기 때문에 사용가능*/
		}
}
