package com.hydroponicwebsite.exception;

public class AdminException extends RuntimeException {

	public AdminException (){
		
	}
	
   public AdminException (String msg){
		super(msg);
	}
}
