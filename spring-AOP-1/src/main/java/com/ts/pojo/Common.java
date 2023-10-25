package com.ts.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {

/*
	@Before("execution(public void *Method())")
	public void temp1() {
		System.out.println("--WELCOME--");
	}
	
	@After("execution(public void teacherMethod())")
	public void temp2() {
		System.out.println("--END--");
	}
*/	
	@Around("execution(public void teacherMethod())")
	public void temp3(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("--WELCOME--");
		pjp.proceed();
		System.out.println("--END--");
		
	}
	
}