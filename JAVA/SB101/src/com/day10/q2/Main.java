package com.day10.q2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		PrintJob[] jobs = {
				new PrintJob("Madhu"),
				new PrintJob("Praveen"),
				new PrintJob("Ramu"),
				new PrintJob("Ratan")		
		};
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		for(PrintJob job : jobs) {
			service.submit(job);
		}

	}

}

/*
 * ThreadPool
 * -----------
 * 
 * The collection of some readymade threads are called Threadpool
 * 
 * 
 * we dont need to create thread and assign object to that.
 * 
 * 
 * We can create no of threads usign Executor Framework.
 * 
 * 
 * Using
 * 
 * ExecutorService threads = newFixedThreadpool(4);
 * we can create the threads..
 * 
 * by passing number to the static method we can create that much 
 * no of threads in our applicatioin.
 * 
 * 
 * Difference between Runnable and Callable
 * ------------------------------------------
 * 
 * Runnable
 * --------
 * It belongs to java.lang package
 * 
 * return type is void
 * 
 * method signature doesnt throws any expection
 * 
 * it is a functional interface
 * 
 * it is introduced in java 1.0
 * 
 * 
 * 
 * Callable
 * ---------
 * 
 * it belongs to java.util.concurrent package
 * 
 * return type is Object we can use generics also
 * 
 * it might throws Exception
 * 
 * 
 * It is a functional interface
 * 
 * it is introduced in java 1.5
 * 
 * 
 * 
 * 
 * 
 */
