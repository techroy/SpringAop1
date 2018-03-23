package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationMaanager;
import com.aop.beans.LoanCalculator;

public class BeforeTest {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context.xml");
		LoanCalculator loanCalculator = ctx.getBean("loancalc",LoanCalculator.class);
		
		AuthenticationMaanager authenticationMaanager = ctx.getBean("authentmanager",AuthenticationMaanager.class);
		authenticationMaanager.authenticate("john","john123");
		int result = loanCalculator.calculate(300);
		System.out.println("result--"+result);

	}

}
