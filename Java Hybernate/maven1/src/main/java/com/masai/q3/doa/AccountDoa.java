package com.masai.q3.doa;

import com.masai.q3.entity.Account;

public interface AccountDoa {

	Account findById(int id);
	String save(Account account);
	String deleteAccountById(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);
}
