package com.day17.q3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateExample {

	public static void main(String[] args) {
		
         LocalDate today = LocalDate.now();
         
           LocalDate nextWeek = today.plus(1,ChronoUnit.WEEKS);
           LocalDate nextMonth = today.plus(1,ChronoUnit.MONTHS);
           LocalDate nextYear = today.plus(1,ChronoUnit.YEARS);
           LocalDate next10thYear = today.plus(10,ChronoUnit.YEARS);
           
           System.out.println("Today : "+today);
           System.out.println("Next Week : "+nextWeek);
           System.out.println("Next Month : "+nextMonth);
           System.out.println("Next Year : "+nextYear);
           System.out.println("Next 10th Year : "+next10thYear);
           

	}

}

/*
 * By using plus method in LocalDate class we can achieve this 
 * adding date to a date object
 * 
 * ChronoUnit will convert the number to our specified duration 
 * ex: Days,weeks,months,years etc
 * 
 * Every time we add using plus we will get a new LocalDate object.
 */


