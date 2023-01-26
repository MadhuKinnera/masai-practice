package com.masai.service;

import java.util.List;

import com.masai.dto.AccountDTO;
import com.masai.exception.AccountException;
import com.masai.model.Account;

public interface AccountService {
	
	public Account registerAccount(Account emp)throws AccountException;
	
	public Account getAccountById(Integer empId)throws AccountException;
	
	public List<Account> getAllAccountDetails()throws AccountException;
	
	public Account deleteAccountById(Integer empId)throws AccountException;
	
	public Account loginAccount(String email, String password)throws AccountException;
	
	public List<Account> getAccountDetailsByAddress(String address)throws AccountException;
	
	public Account updateAccount(Account emp)throws AccountException;
	
	public String getNameAndAddressOfEmplyeeById(Integer empId)throws AccountException;
	
	public List<AccountDTO> getNameAddressSalaryOfAllAccount()throws AccountException;

}
