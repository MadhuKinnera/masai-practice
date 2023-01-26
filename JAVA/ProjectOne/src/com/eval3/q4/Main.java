package com.eval3.q4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String ==> ");
		String str= sc.next();
		
		System.out.println("Enter a position ==>");
		int index=sc.nextInt();
		int flag=0;
		while(flag!=1) {
			if(index<str.length()) {
				System.out.println("Character at the position "+(index)+ "==>"+str.charAt(index));
				flag=1;
			}
			else {
				System.out.println("Invalid Position ,Please enter a Valid position ==>");
				index=sc.nextInt();
			}

		}
		
		
	}

}
