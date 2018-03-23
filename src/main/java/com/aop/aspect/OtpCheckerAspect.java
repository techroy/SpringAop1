package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class OtpCheckerAspect {

	public void checkOtp(JoinPoint jp,int result){
		
		System.out.println("--------check otp--------");
		Object[] arr = jp.getArgs();

		for (Object obj : arr) {

			System.out.println(obj);
		}
		arr[0] = 500; 
		
		if(result<0){
			throw new  IllegalArgumentException("Invalid otp");
		}
	}
	
}
