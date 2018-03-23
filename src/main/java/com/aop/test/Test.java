package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.MathBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context.xml");

		MathBean mathBean = ctx.getBean("math",MathBean.class);
		
		System.out.println(mathBean.getClass().getName());
		
		int result = mathBean.add(3,9);
		
		System.out.println("sum=="+result);
		
	}

}
