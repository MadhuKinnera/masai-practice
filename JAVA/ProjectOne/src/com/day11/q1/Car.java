package com.day11.q1;

public class Car {
	private int numberOfPassengers;
	private int numberOfKMs;
	
	Car(){
		
	}
	
	
	public Car(int numberOfPassengers, int numberOfKMs) {
		super();
		this.numberOfPassengers = numberOfPassengers;
		this.numberOfKMs = numberOfKMs;
	}






	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfKms() {
		return numberOfKMs;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKMs = numberOfKms;
	}
	
	
	
	

}
