package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {

	public Object log(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("Metod execution starts here");

		Object[] arr = pjp.getArgs();
		
		arr[1]=20;

		for (Object ob : arr) {

			System.out.println(ob);
		}
		
		
		Object ret = pjp.proceed(arr);
		
		//Object ret=0;
		
		int result=(Integer)ret+100;

		System.out.println("Method Execution ends here--->" + ret);

		return result;
	}

}
