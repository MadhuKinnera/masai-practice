package com.masai.day5;

public class Test {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		
		Thread t2 = new Thread(new Thread2());
		System.out.println("In Main Thread");
		t1.start();
		t2.start();
	
		

	}

}
