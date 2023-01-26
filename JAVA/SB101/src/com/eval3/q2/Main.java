package com.eval3.q2;

public class Main extends Thread{
	int product=1;
	@Override
	public void run() {
		
		
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
				product = product * i;
			}
			notify();
		}
		
		
	}

	public static void main(String[] args) {
		
		Main m = new Main();
		
		Thread t1 = new Thread(m);
		
		t1.start();
		
		synchronized(m) {
			try {
			 m.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("The Product is : "+m.product);

	}

}
