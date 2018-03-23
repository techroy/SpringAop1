package com.aop.beans;

public class AuthenticationMaanager {

	public boolean flag=false;
	
	public boolean authenticate(String userName,String password){
		
		
		if("john".equals(userName) && "john123".equals(password)){
			
			flag=true;
		
		}
		return flag;
		
	}
	
	public boolean isAuthenticated(){
		return flag;
	}
}
