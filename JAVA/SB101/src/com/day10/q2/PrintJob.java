package com.day10.q2;

public class PrintJob implements Runnable{
	
	String name;
	PrintJob(String name){
		this.name=name;
	}

	@Override
	public void run() {
		
		System.out.println(name+" is Started the job "+Thread.currentThread().getName());
		
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println(name+" is Completed the job "+Thread.currentThread().getName());
		
	}

}
