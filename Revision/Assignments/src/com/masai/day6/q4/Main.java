package com.masai.day6.q4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	private static List<BankAccount> accounts = new ArrayList<>();

	public static void main(String[] args) throws NoCustomerException, LowBalanceException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		accounts.add(new BankAccount("Madhu",123,1000));
		accounts.add(new BankAccount("Pavan",456,6000));
		accounts.add(new BankAccount("Ram",789,5900));
		accounts.add(new BankAccount("Raghu",143,2000));
		accounts.add(new BankAccount("Rajesh",420,10000));
		
		
		System.out.println("Enter Name ");
		String name = sc.next();
		
		System.out.println("Enter A/c Number");
		Integer accountNumber = sc.nextInt();
		
		System.out.println("Enter Withdrawl Amount");
		Integer withdrawlAmount = sc.nextInt();
		
		List<BankAccount> accountlist = accounts.stream()
		.filter(a-> a.getName().equals(name) && a.getAccountNumber()==accountNumber)
		.collect(Collectors.toList());
		
		BankAccount acc = null;
		
		if(accountlist.isEmpty()) {
			throw new NoCustomerException("Customer DoestNot Exist ");
		}else {
		 acc = accountlist.get(0);
		}
		
		if(acc.getAmount()>=withdrawlAmount) {
			acc.setAmount(acc.getAmount()-withdrawlAmount);
		}else {
			throw new LowBalanceException("Not Enough Balance");
		}
		
	    Path path = Paths.get("./data.txt");
	    

	    String str = "Hello";
	    Files.write(path,acc.toString().getBytes());
	    
	     System.out.println("Done");

	}

}
