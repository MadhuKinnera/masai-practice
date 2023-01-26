package com.masai.day6.q4;

import java.util.Objects;

public class BankAccount {

	private String name;
	private Integer accountNumber;
	private Integer amount;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BankAccount(String name, Integer accountNumber, Integer amount) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}



	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, amount, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(amount, other.amount)
				&& Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	
	
	
}
