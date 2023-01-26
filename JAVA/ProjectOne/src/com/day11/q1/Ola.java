package com.day11.q1;

public class Ola {
	
	public Car bookCar(int numberOfPassengers,int numberOfKMs) {
		if(numberOfPassengers<=3) {
			return new HatchBack(numberOfPassengers,numberOfKMs);
		}
		else {
			return new Sedan(numberOfPassengers,numberOfKMs);
		}
		
	}
	
	public int calculateBill(Car car) {
		int x =car.getNumberOfPassengers();
		int totalBill;
		
		if(x<=3) {
			HatchBack s1 = (HatchBack)car;
			totalBill=s1.getNumberOfKms()*s1.farePerKm;

		}
		else {
			Sedan s1=(Sedan)car;
			totalBill=s1.getNumberOfKms()*s1.farePerKm;
		}
		
				
		        return totalBill;
	}

}
