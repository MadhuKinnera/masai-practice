package com.day3.q3;

public class Main {

	public static void main(String[] args) {
		

	}

}

/*
 * 
 *                      Object
 *                         |
 *                     Throwable
 *                         |
 *    -------------------------------------------
 *    |                                          |
 * Exception                                   Error
 *    |
 * RunTimeException 
 * 
 * 
 *  1. This is the hierarchy of exceptions 
 *  2. all the exceptions we are facing in our day to day life is from that
 *   RunTimeExceptions
 *  3. Exceptions are the run  time errors. or logical errors that can be handle .
 *  4. There are so many predefined Exception classes 
 *  
 *     1.NullPointerException - While accessing a value with null reference we get 
 *     this Exception.
 *     
 *     2.ClassCastException - while converting the object of a class into another class 
 *     object if it not supportable to cast then this exception will raise
 *     
 *     3.ArithmeticException - While we are trying to divide an integer by 0 
 *     JVM dont know how to store infinity so it will raise this exception
 *     
 *     4.ArrayIndexOutOfBounds - while we are trying to accessing the date which the index
 *     is not available in array .this exception will raise
 *     
 *     5.InputMismatchException - if we give the input with different data type or illegal
 *     input then this exception will raise 
 *  
 * 
 *    these are the reasons why the exception objects will created in our application
 *    
 *    after jvm throws the object we need to handle using catch..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
