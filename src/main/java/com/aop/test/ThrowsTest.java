package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationMaanager;
import com.aop.beans.LoanCalculator;
import com.aop.beans.ThrowerBean;

public class ThrowsTest {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context.xml");
	
		ThrowerBean throwerBean = (ThrowerBean)ctx.getBean("throwerbean");
		throwerBean.input(-200);
	}

}
