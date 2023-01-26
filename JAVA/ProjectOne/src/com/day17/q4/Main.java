package com.day17.q4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		LocalDate start;
		LocalDate end;
		
		try {
			System.out.println("Enter The Starting date : (dd/MM/yyyy)");
			String sd=sc.next();
			
			start = LocalDate.parse(sd,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.println("Enter The Ending date : (dd/MM/yyyy)" );
			String ed= sc.next();
			
	        end = LocalDate.parse(ed,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		}
		catch (Exception e) {
			System.out.println("Follow The Correct Format");
			return;
		}
		
		if(start.isAfter(end)) {
			System.out.println("Starting Date shold be Less than ending date ");
			return;
		}
		
		
		Period p = Period.between(start, end);
		int days= p.getDays();
		System.out.println("The Amount for "+days+" days are : "+days*1200);
		

	}

}
