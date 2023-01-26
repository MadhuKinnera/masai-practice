package com.day4.q3;

public class Account {
	String accountNum;
	double Balance;
	
	
	
	public Account(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		Balance = balance;
	}

	void deposit(int amount) {
		this.Balance+=amount;
		System.out.println("Deposit Success "+amount);
		
	}
	
	double withdrawl(int amount) throws InsufficentFundsException{
		if(amount<this.Balance) {
			this.Balance-=amount;
			System.out.println("WIthdrawl Success "+amount);
		}
		else {
			InsufficentFundsException ife = new InsufficentFundsException("Not Sufficient Funds "+this.Balance);
			throw ife;
		}
		
		return this.Balance;
		
	}

}
