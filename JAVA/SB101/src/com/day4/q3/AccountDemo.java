package com.day4.q3;

public class AccountDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Application started....");
		
		Account madhu = new Account("228734989", 500);
		
		try {
			madhu.deposit(300);
			System.out.println("After Deposit bal is : "+madhu.Balance);
			madhu.withdrawl(1000);
			System.out.println("After Withdrawl bal is : "+madhu.Balance);
			
			
		}catch(InsufficentFundsException ife) {
			System.out.println(ife.getMessage());
		}
		
		
		
		System.out.println("Graceful Termination....");

	}

}
