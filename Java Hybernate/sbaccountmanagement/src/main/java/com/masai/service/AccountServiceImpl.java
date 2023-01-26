package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.AccountDTO;
import com.masai.exception.AccountException;
import com.masai.model.Account;
import com.masai.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepo AccountRepo;
	

	@Override
	public Account registerAccount(Account acc) throws AccountException {
		Account Account = AccountRepo.save(acc);
		if(Account==null) 
			throw new AccountException("Registration Failed");
		else
			return Account;
	}

	@Override
	public Account getAccountById(Integer AccountNo) throws AccountException {
		Optional<Account> opt = AccountRepo.findById(AccountNo);
		if(opt.isPresent()) {
			return opt.get();
		}else 
			throw new AccountException("Account Not exist with AccountNo"+AccountNo);
	}

	@Override
	public List<Account> getAllAccountDetails() throws AccountException {
		List<Account> Accounts = AccountRepo.findAll();
		if(Accounts.isEmpty())
			throw new AccountException("Accounts Not Exist ");
		else
			return Accounts;
	}
	

	@Override
	public Account deleteAccountById(Integer AccountNo) throws AccountException {
		Optional<Account> opt = AccountRepo.findById(AccountNo);
		if(opt.isPresent()) {
			Account Account = opt.get();
			AccountRepo.delete(Account);
			return Account;
		}else
			throw new AccountException("Account Not Exist With AccountNo"+AccountNo+" to delete ");
		
	}

	@Override
	public Account loginAccount(String email, String password) throws AccountException {
		Account Account = AccountRepo.loginAccount(email, password);
		if(Account==null) 
			throw new AccountException("Account Not Found : Login Failed");
		else
			return Account;
	}

	@Override
	public List<Account> getAccountDetailsByAddress(String address) throws AccountException {
		List<Account> Accounts = AccountRepo.findByAddress(address);
		if(Accounts.isEmpty()) {
			throw new AccountException("Accounts Not found with Address "+address);
		}else
			return Accounts;
	}

	@Override
	public Account updateAccount(Account acc) throws AccountException {
		Optional<Account> opt = AccountRepo.findById(acc.getAccountNo());
		if(opt.isPresent()) {
		 return AccountRepo.save(acc);
		}else
			throw new AccountException("Account Not Found with AccountNo "+acc.getAccountNo());
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws AccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountDTO> getNameAddressSalaryOfAllAccount() throws AccountException {
		// TODO Auto-generated method stub
		return null;
	}




}
