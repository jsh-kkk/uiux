package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("[Before] 비지니스 로직 수행 전");
		
		Object returnObj = pjp.proceed();
		
		System.out.println("[After] 비지니스 로직 수행 후");

		return returnObj;
	}
}
