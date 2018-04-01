package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationMaanager;
import com.aop.beans.MathBean;
import com.aop.beans.ThrowerBean;

public class AnnotationThrowerTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config/application-context-annotation.xml");

		ThrowerBean throwerBean = ctx.getBean("throwerbean",ThrowerBean.class);
		

		throwerBean.input(-19);


	}
}
