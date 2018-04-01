package com.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public abstract class ApplicationPointCut {

	@Pointcut(value = "execution(* com.aop.beans.MathBean.add(..))")
	public void methodPointCut() {

	}
	
	@Pointcut(value = "execution(* com.aop.beans.ThrowerBean.input(..))")
	public void throwerPointCut() {

	}
}
