package com.day14.q3;

public class Auto {
	
	static Integer getInt(int x) {
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		Integer i1= x;//this process is known as autoboxing
		
		int y=getInt(20);//this process is called as autoUnboxing
		
		System.out.println("The AutoBoxing value of i1 is : "+i1);
		
		System.out.println("The AutoUnBoxing value of y is : "+y);
		
		
		
	}

}
//The process of converting primitive into object type is called AutoBoxing.
//The process of converting Object type into primitive is called AutoUnBoxing.

