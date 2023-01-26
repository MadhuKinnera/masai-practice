package com.day4.q3;

public class InsufficentFundsException extends RuntimeException{
	public InsufficentFundsException() {
	   super("Insufficient Funds Found");
	}
	
	public InsufficentFundsException(String msg){
		super(msg);
	}

}
