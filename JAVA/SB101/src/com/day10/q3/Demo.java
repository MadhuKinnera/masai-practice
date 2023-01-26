package com.day10.q3;

public class Demo {
	
	int num=10;
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		System.out.println("The Original val of Num is "+d.num);		
	    Thread t1 = new Thread(new ThreadA(d));
	    
	    Thread t2 = new Thread(new ThreadB(d));
	    
	    t1.start();
	    t2.start();
	   
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		
    System.out.println("the Num is "+d.num);
	    

	}

}

/*
 * Race condition means If two or more threads are working on common resource
 * 
 * it might leads to data inconsistency like above example
 * 
 * if the t1 thread got chance first then the t2 will update the shared value at final 
 * 
 * if the t2 thread got chance first then the t1 will update the shared value at final
 * 
 * if t1 executes first the answer become 9
 * 
 * if t2 excutes first the answer become 11
 * 
 * but in this process we are increasing by 1 
 * and decreasing by 1 so we need the value at intial point.
 * 
 * 
 * this leads the data inconsistency .
 * 
 * 
 * here there is a race between two threads to who excutes first.
 * 
 * this process is called race condition..
 * 
 * 
 * 
 * Solution
 * --------
 * 
 * We avoid race condition by using thread synchronisation
 * 
 * we can allow only one thread to critical section at a time
 * 
 * until then another thread need to wait 
 * 
 * after completion of thread 1 it will notify to thread 2 
 * 
 * this process is called thread synchronisation
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
