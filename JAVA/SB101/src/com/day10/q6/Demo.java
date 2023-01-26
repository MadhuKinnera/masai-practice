package com.day10.q6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Task[] tasks = {
				new Task(6),
				new Task(7),
				new Task(3),
				new Task(34),
				new Task(24),
				new Task(11)
				
		};
		
		
		for(Task task : tasks) {
			Future<String> res = service.submit(task);
			try {
				System.out.println(res.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
