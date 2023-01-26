package com.eval3.q5;

public interface Vehicle {

	void run();
	
	default void service() {
		System.out.println("Car needs Service");
	}
}
