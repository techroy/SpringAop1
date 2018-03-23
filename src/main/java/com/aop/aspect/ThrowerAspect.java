package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class ThrowerAspect {

	public void log(JoinPoint jp,Exception e){
		
		System.out.println("Aspect----------->"+e);
	}
	
}
