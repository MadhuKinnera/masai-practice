package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{
	
	public List<Account> findByAddress(String address);

	@Query("select e from Account e where e.email=?1 and e.password=?2")
	public Account loginAccount(String username,String password);

}
