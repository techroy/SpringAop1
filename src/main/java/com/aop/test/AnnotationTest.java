package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationMaanager;
import com.aop.beans.MathBean;

public class AnnotationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context-annotation.xml");

		MathBean mathBean = ctx.getBean("math", MathBean.class);
		
		AuthenticationMaanager authenticationMaanager = ctx.getBean("authentication",AuthenticationMaanager.class);
		authenticationMaanager.authenticate("john","john123");

		
		System.out.println(mathBean.add(3,10));

	}
}
