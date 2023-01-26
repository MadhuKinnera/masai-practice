package com.day3.q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start of main...");
		
		try {
			
		System.out.println("Enter Your Date Of Birth in dd/MM/yyyy format ");
		
		String dob=sc.next();
		
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateOfBirth=LocalDate.parse(dob, dateformat);
		LocalDate now = LocalDate.now();
		Period period = Period.between(dateOfBirth, now);

		System.out.println("The Age is : "+period.getYears());
		
		
		}
		catch(Exception e ) {
			System.out.println("Enter the dob in correct format ");
		}
		
		
		System.out.println("End of main....");
		

	}

}
