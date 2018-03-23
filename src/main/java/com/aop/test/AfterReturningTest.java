package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.LoanCalculator;
import com.aop.beans.Otpgenerator;

public class AfterReturningTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context.xml");
		Otpgenerator otpgenerator = ctx.getBean("otpbean",Otpgenerator.class);
		otpgenerator.generateOtp(200);

	}

}
