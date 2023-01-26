package com.day4.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		String str = sc.next();
		
		try {
			int num = Integer.parseInt(str);
			System.out.println("The Square Value is : "+num*num);
			
		}catch(NumberFormatException nfe) {
			System.out.println("Entered Input is Not a valid Format of Number ");
		}
		
		System.out.println("Work Done Successfully ");
		
		

	}

}
