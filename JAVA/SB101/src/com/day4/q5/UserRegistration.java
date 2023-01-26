package com.day4.q5;

import java.util.Scanner;

public class UserRegistration {
	
	
	void registerUser (String userName,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equalsIgnoreCase("india")) {
			System.out.println("User Registration Successful");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException();
			throw ice; 
		}

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration ur = new UserRegistration();
		
		System.out.println("Enter your UserName and Country");
		String userName = sc.next();
		String userCountry = sc.next();
		try {
			ur.registerUser(userName, userCountry);
		}
		catch(InvalidCountryException ice ) {
			System.out.println(ice.getMessage());
		}
		
		System.out.println("Thank You...");
	
	}
	
	

}
