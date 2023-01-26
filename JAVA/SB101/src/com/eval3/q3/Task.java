package com.eval3.q3;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{
	int num;
	Task(int n){
		this.num=n;
	}

	@Override
	public Integer call() throws Exception {
		int res=1;
		for(int i =1;i<=num;i++) {
			res=res*i;
		}
		return res;
	}

}
