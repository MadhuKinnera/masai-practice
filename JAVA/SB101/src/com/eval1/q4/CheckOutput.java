package com.eval1.q4;

public class CheckOutput {

	public static void main(String[] args) {
		try
		{
		System.out.print("A");//prints
		int num = 99/0;
		System.out.print("B");
		}
		catch(ArithmeticException ex)
		{
		System.out.print("C");//prints
		}
		catch(Exception ex)
		{
		System.out.print("D");
		}
		System.out.print("E");//prints
		}

	}

/*
 * The output of the program is 
 * -----------------------------
 * A
 * C
 * E
 * 
 * 1.control will go to the try block and print the A in console.
 * 2.After that  num=99/0 will excute and the result is infinity hence 
 * the jvm dont know how to store the infinity value;
 * 3. so it will raise the ArithmeticException and it goes to the respected catch block
 * It will Print C in that excution.
 * 4. At the final the exception is handled so it will print the last statement 
 * as E 
 * this is the flow of excution . 
 * hence the output is 
 * A
 * C
 * E
 * 
 * 
 * 
 * 
 */
 

