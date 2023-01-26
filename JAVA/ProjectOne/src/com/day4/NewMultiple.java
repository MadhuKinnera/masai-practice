package com.day4;

public class NewMultiple {

	
	void nextMultipleOfTen(int num) {
		if(num<0) {
			System.out.println("Error");
		}
		else {
			num=(num/10)+1;
			
			System.out.println(num*10);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NewMultiple obj= new NewMultiple();
		obj.nextMultipleOfTen(37);
		
		
	}

}
