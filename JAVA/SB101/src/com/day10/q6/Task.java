package com.day10.q6;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	
	int num;
	
	Task(int n){
		this.num=n;
	}

	@Override
	public String call() throws Exception {
	
		if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}

	
}
