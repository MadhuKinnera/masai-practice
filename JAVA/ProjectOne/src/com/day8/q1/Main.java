package com.day8.q1;
import java.util.Scanner;


class Main{
	
	
public static String reverseString (String input){
//write the logic
	
	
	StringBuilder str=new StringBuilder();
	for(int i=input.length()-1;i>=0;i--) {
		str.append(input.charAt(i));
		
	}
	
	
	return str.toString();
	

}



public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String to reverse");
String originalString = sc.next();
String result = reverseString(originalString);
System.out.println("Original String is :"+ originalString);
System.out.println("Reversed String is :"+ result);
}
}