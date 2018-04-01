package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aop.beans.AuthenticationMaanager;

@Component
@Aspect
public class AnnotationAspect extends ApplicationPointCut{

	
	@Autowired
	private AuthenticationMaanager authenticationManager; 
	
	

	@Around(value = "methodPointCut()")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("Metod execution starts here");

		Object obj = pjp.proceed();

		System.out.println("Method Execution ends here--->");
		return obj;
	}

	@Before(value="methodPointCut()")
	public void securityCheck(JoinPoint jp) throws IllegalAccessException {

		
		boolean flag = authenticationManager.isAuthenticated();

		if (!flag) {

			throw new IllegalAccessException("Not Authenticated user");
		}
	}
	
	@AfterReturning(value="methodPointCut()",returning="result")
	public void displayReturnValue(JoinPoint jp,int result){
		
		System.out.println("After Returning result--"+result);
	}
	
	@AfterThrowing(value="throwerPointCut()",throwing="e")
	public void throwerMethod(JoinPoint jp,Exception e){
	
		System.out.println("Aspect annotation----------->"+e);
	}
}
