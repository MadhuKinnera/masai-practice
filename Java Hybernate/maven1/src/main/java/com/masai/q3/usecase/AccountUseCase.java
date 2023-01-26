package com.masai.q3.usecase;

import java.util.Scanner;

import com.masai.q3.doa.AccountDoa;
import com.masai.q3.doa.AccountDoaImpl;
import com.masai.q3.entity.Account;

public class AccountUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AccountDoa ad = new AccountDoaImpl();
		
		while(true) {
		
		System.out.println("1. Find By Id ");
		System.out.println("2. Save Account ");
		System.out.println("3. Delete Account ");  
		System.out.println("4. Withdrawl ");
		System.out.println("5. Deposit ");
		System.out.println("6. Exit ");
		
		int c = sc.nextInt();
		
		if(c==1) {
			System.out.println("Find Account");
			System.out.println("================");
			System.out.println("Enter Id ");
			int id = sc.nextInt();
			Account acc = ad.findById(id);
			if(acc!=null)
			System.out.println(acc);
			else{
				System.out.println("Account Not Found ");
			}
		}else if(c==2) {
			System.out.println("Save Account");
			System.out.println("================");
			
			System.out.println("Enter id ");
			int id = sc.nextInt();
			
			System.out.println("Enter email");
			String email = sc.next();
			
			System.out.println("Enter address");
			String address = sc.next();
			
			System.out.println("Enter balance");
			double balance = sc.nextDouble();
			
			Account acc = new Account(id,email,address,balance);
			ad.save(acc);
		}else if(c==3) {
			
			System.out.println("Delete Account");
			System.out.println("================");
			
			System.out.println("Enter id ");
			int id = sc.nextInt();
			ad.deleteAccountById(id);
		}else if(c==4) {
			
			System.out.println("Withdrawl Account");
			System.out.println("================");
			
			System.out.println("Enter Id ");
			int id = sc.nextInt();
			
			System.out.println("Enter Amount ");
			int amount = sc.nextInt();
			
			ad.withdraw(amount, id);
			
		}else if(c==5) {
			
			
			System.out.println("Deposit Account");
			System.out.println("================");
			
			System.out.println("Enter Id ");
			int id = sc.nextInt();
			
			System.out.println("Enter Amount ");
			int amount = sc.nextInt();
			
			ad.deposit(amount, id);
			
		}else if(c==6) {
			System.out.println("Thank You ");
			break;
		}else {
			System.out.println("Invalid Input ");
		}
		
		  
		
		
		
		
		}
	}

}
