package com.day10.q3;

public class Bank {
	private Bank() {
		System.out.println("Inside Bank Constructor ...");
	}
	
	public static Bank getBankObj() {
		return new Bank();
	}

}
