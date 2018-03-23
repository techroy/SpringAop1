package com.aop.beans;

public class ThrowerBean {

	public void input(int number){
		
		
		
		if(number<0){
			
			throw new IllegalArgumentException();
		}
	}
	
}
