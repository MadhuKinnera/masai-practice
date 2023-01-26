package com.eval3.q3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) {
		
		
		
		Task[] task = {
				new Task(10),
				new Task(5),
				new Task(3),
				new Task(11),
				new Task(4),
				new Task(6)
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Task t : task) {
			Future<Integer> f = service.submit(t);
			try {
				System.out.println("The Result for "+ t.num+" is "+f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();

	}

}
