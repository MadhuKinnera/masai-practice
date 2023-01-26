package com.day10.q1;

public class Main extends Thread{
	int product=1;
	@Override
	public void run() {
		
		synchronized(this) {
			System.out.println("working on operation...");
			for(int i=1;i<=10;i++) {
				product*=i;
			}
			System.out.println("work done notifying ...");
			this.notify();
		}
		
		
	}

	public static void main(String[] args) {
		
		
		Main m= new Main();
		
		m.start();
		
		synchronized(m) {
			try {
				System.out.println("waiting ....");
				m.wait();
				System.out.println("wait is over...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Product is "+m.product);
		
	}

}
