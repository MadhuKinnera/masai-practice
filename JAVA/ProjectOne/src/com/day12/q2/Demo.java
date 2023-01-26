package com.day12.q2;
import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		Hotel h1=null;
		if(amount>=1000) {
			h1= new TajHotel();
		}
		else if(amount>200) {
			h1= new RoadSideHotel();
		}
		
		return h1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int amount=sc.nextInt();
		
		Demo d1 =new Demo();
		Hotel h=d1.provideFood(amount);
		if(h==null) {
			System.out.println("Enter a valid Amount ");
	        return;
		}
		if(h instanceof TajHotel) {
			h.chickenBiryani();
			h.masalaDosa();
			TajHotel t1=(TajHotel)h;
			t1.welcomeDrink();
		}
		else {
			h.chickenBiryani();
			h.masalaDosa();
		}
			

	}

}
