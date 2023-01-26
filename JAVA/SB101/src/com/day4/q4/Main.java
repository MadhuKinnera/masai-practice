package com.day4.q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a Numerator N and Denominator D ");
			int N = sc.nextInt();
			int D = sc.nextInt();
			System.out.println("The Quetient of "+N+"/"+D+" is "+(N/D));
			
		}catch(ArithmeticException ae ) {
			System.out.println(ae.getMessage()+" Exception ");
		}finally {
			System.out.println("Inside Finally Block");
		}
		
			
		

	
	}
}
