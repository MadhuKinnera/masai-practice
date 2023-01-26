package com.day7;
import java.util.Scanner;

public class AccessString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String ");
		String str=sc.nextLine();
		System.out.println("Enter The index you want to access");
		
		int n=sc.nextInt();
		if(n<str.length())
			System.out.println("The character at position "+n+" is : "+ str.charAt(n));
		else
			System.out.println("Enter a valid Index");
		
			
	
		
		

	}

}
