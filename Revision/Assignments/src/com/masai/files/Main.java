package com.masai.files;

import java.util.regex.Pattern;

class Main
{
	
	int add() {
		return 0;
	}
	
	public static void main(String[] args) {
		
	//	System.out.println(Pattern.matches("^[6789]{1}[0-9]{9}$","6793794998"));
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$]).{5,10}$";
//		
		System.out.println(Pattern.matches(regex, "Ma@179"));
		
		
		
		
//		float f = 1000.576206f;
//		long l  =(long) f;
//		
//		System.out.println(l);
//		System.out.println(f);
	}
}
