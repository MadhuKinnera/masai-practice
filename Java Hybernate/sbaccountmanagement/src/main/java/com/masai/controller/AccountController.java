package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.AccountDTO;
import com.masai.exception.AccountException;
import com.masai.model.Account;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> registeraccountHandler(@RequestBody Account emp) throws AccountException{
		return new ResponseEntity<Account>(accountService.registerAccount(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<Account> getaccountByIdHandler(@PathVariable Integer id) throws AccountException{
		
		Account account = accountService.getAccountById(id);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
		
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAllaccountsHandler() throws AccountException{

		return new ResponseEntity<List<Account>>(accountService.getAllAccountDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Account> deleteaccountByIdHandler(@PathVariable Integer id) throws AccountException{
		
     return new ResponseEntity<Account>(accountService.deleteAccountById(id),HttpStatus.OK);
	}
	
	@PostMapping("/loginaccounts")
	public ResponseEntity<Account> loginaccountHandler(@RequestParam String username,@RequestParam String password) throws AccountException{
		
    return new ResponseEntity<Account>(accountService.loginAccount(username, password),HttpStatus.OK);
		
	}
	
	@GetMapping("/getaccounts/{address}")
	public ResponseEntity<List<Account>> getaccountDetailsByAddressHandler(@PathVariable String address) throws AccountException{
		
		return new ResponseEntity<List<Account>>(accountService.getAccountDetailsByAddress(address),HttpStatus.OK);
	}
	
	@PutMapping("/accounts")
	public  ResponseEntity<Account> UpdateaccountHandler(@RequestBody Account emp) throws AccountException {
		
		return new ResponseEntity<>(accountService.updateAccount(emp),HttpStatus.OK);
	}
	
	@GetMapping("/account/{id}")
	public ResponseEntity<String> getNameAndAddressByIdHandler(@PathVariable Integer id) throws AccountException{
		
		return new ResponseEntity<String>(accountService.getNameAndAddressOfEmplyeeById(id),HttpStatus.OK);
	}
	
	@GetMapping("/accountdto")
	public ResponseEntity<List<AccountDTO>> getAllaccountsDTOHandler() throws AccountException{
		
		return new ResponseEntity<List<AccountDTO>>(accountService.getNameAddressSalaryOfAllAccount(),HttpStatus.OK);
	}
	
	
	
	
	

	

}
