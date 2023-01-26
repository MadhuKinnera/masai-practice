package com.day9.q3;

public class Main {

	public static void main(String[] args) {
		Even e = new Even();
		Odd o= new Odd();
		
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(o);
		
		t1.start();
		
		try {
			t1.join();
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		t2.start();

	}

}
