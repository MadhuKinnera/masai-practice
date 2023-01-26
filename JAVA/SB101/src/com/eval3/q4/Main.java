package com.eval3.q4;

public class Main {
	
	public static void main(String[] args) {
		
		
		Thread tb = new Thread(new ThreadB());
		Thread tc = new Thread(new ThreadC(tb));
		Thread ta = new Thread(new ThreadA(tc));
	
		
		
		
		ta.setName("Kohli");
		tb.setName("Dhoni");
		tc.setName("Rohith");
		
		tb.setPriority(Thread.MAX_PRIORITY);
		
		ta.start();
		tb.start();
		tc.start();
		
		
	}
	

	
	

}
