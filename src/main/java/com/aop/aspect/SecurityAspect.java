package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

import com.aop.beans.AuthenticationMaanager;

public class SecurityAspect {

	private AuthenticationMaanager authenticationMaanager;

	public void setAuthenticationMaanager(AuthenticationMaanager authenticationMaanager) {
		this.authenticationMaanager = authenticationMaanager;
	}

	public void checkLogin(JoinPoint jp) throws IllegalAccessException {

		Object[] arr = jp.getArgs();

		for (Object obj : arr) {

			System.out.println(obj);
		}
		arr[0] = 500;

		boolean flag = authenticationMaanager.isAuthenticated();
		
		if(!flag){
			
			throw new IllegalAccessException("Not Authenticated user");
		}
	}
}
