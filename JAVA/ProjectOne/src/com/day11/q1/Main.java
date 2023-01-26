package com.day11.q1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number Of Passengers : ");
		int numberOfPassengers = sc.nextInt();
		
		System.out.println("Enter The Number Of Kms ");
		int numberOfKMs = sc.nextInt();
		
		Ola myOla = new Ola();
		Car c1 = myOla.bookCar(numberOfPassengers, numberOfKMs);//how to know which object returned
		int res= myOla.calculateBill(c1);
		System.out.println("The Fare Amount is : "+ res );
	}

}
