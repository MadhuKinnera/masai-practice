package com.masai.q3.doa;

import javax.persistence.EntityManager;

import com.masai.q3.entity.Account;
import com.masai.q3.utility.EMUtil;

public class AccountDoaImpl implements AccountDoa {

	public Account findById(int id) {
		
	EntityManager em = EMUtil.getEMObj();
	Account acc = em.find(Account.class,id);
	
	em.close();
	
		return acc;
	}

	public String save(Account account) {
		String msg = "Account Not Saved ";
		
		EntityManager em = EMUtil.getEMObj();
		
		em.getTransaction().begin();
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		em.close();
		
		msg="Account Saved Successfully";
		
		return msg;
	}

	public String deleteAccountById(int id) {
		String msg = "Account Deletion Failed  ";
		
		EntityManager em = EMUtil.getEMObj();
		
		Account acc = em.find(Account.class, id);
		
		em.getTransaction().begin();
		
		em.remove(acc);
		
		em.getTransaction().commit();
		
		em.close();
	
		msg="Account Delete Successfully ";
		
		return msg;
	}

	public String withdraw(double amount, int accountId) {
		String msg ="-Insufficient balance ";
		
		EntityManager em = EMUtil.getEMObj();
		
		Account acc = em.find(Account.class,accountId);
		
		if(amount<=acc.getBalance()) {
		
		em.getTransaction().begin();
		
		acc.setBalance(acc.getBalance()-amount);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		msg="Amount Withdrawl Successful ";
		}
		
		return msg;
	}

	public String deposit(double amount, int accountId) {
		
		String msg = "Amount Deposit Failed ";
		
		EntityManager em = EMUtil.getEMObj();
		
	     Account acc = em.find(Account.class,accountId);
	     
	     em.getTransaction().begin();
	     
	     acc.setBalance(acc.getBalance()+amount);
	     
	     em.getTransaction().commit();
	     
	     em.close();
		
	    msg="Amount Deposit Successful ";
		
		return msg;
	}
	
	

}
