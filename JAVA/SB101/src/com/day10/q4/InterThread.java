package com.day10.q4;

public class InterThread {

	public static void main(String[] args) {
		Q q = new Q();
		
		Thread producer = new Thread(new Producer(q));
		
		
		Thread consumer = new Thread(new Consumer(q));
		
		producer.start();
		consumer.start();
		

	}

}

/*
 * InterThread Communication
 * --------------------------
 * it is used to synchronize the threads for data consistency
 * 
 * in this example if there is a value which is produced ...then it is notified to consumer
 * 
 * here consumer and producer are the threads
 * 
 * 
 * after consuming the data he will notified to consumer
 * 
 * before consuming or producing data
 *  
 *  they will check if any already produced data which is not consumed is there are not 
 *  if it is there producer will wait until consumer consumes it
 *  
 *   in the same way  before consuming data he will check is there any data ready to consume
 *   if data is not there then the thread will wait until data produced..
 *   
 *   this is about the inter thread communication..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
