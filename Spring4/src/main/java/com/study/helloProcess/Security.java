package com.study.helloProcess;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/* 이걸 써줘야지 이 객체를 Aspect화 시킴 */
@Aspect
public class Security {

	
	
	/* Pointcut은 메소드를 적용시키는것 
	 * helloProcess에 있는 kajadrive,kajatraval 메소드가 수행되면 여기로옴
	 */
	@Pointcut("execution(* com.study.helloProcess..*())")
	/* 아무것도 없는 그냥 Pointcut을 하기위한 메소드 */
	private void mukja() {
	}

	/* before mukja()관련 핵심로직인 drive,traval메소드가 수행되면 그전에!! 수행 */
	@Before("mukja()")
	/* aspect 처리를 위한 메소드 */
	public void goSecurity() {
		System.out.println("공통 : 여기는 보안 처리 중~~");
	}
	
	@Pointcut("execution(* com.study.helloProcess..*())")
	private void gamehaja() {
	}
	
	@After("gamehaja()")
	public void goSecurity2() {
		System.out.println("공통 : 여기는 핵심로직 후 보안 처리 중~~");
	}
	
}

/*
 	aspectjre가 없으면 에러남!!
 */
