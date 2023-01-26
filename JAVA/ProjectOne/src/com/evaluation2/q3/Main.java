package com.evaluation2.q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Bookings : ");
		int N=sc.nextInt();
		
		System.out.println("Enter Available Tickets : ");
		Ticket.availableTickets=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.println("Enter Details for "+(i+1)+"th Booking ");
			Ticket t1=new Ticket();
			
			System.out.println("Enter Ticket id : ");
			t1.ticketid=sc.nextInt();
			
			System.out.println("Enter Price : ");
			t1.price=sc.nextInt();
			
			System.out.println("Enter No of Tickets : ");
			int noOfTickets=sc.nextInt();
			
			
			int total=t1.calculateTicketCost(noOfTickets);
			
			System.out.println("Available Tickets : "+Ticket.availableTickets);
			System.out.println("The Cost is : " +total+"RS");
			System.out.println("Available Tickets after Booking : "+Ticket.availableTickets);
			
		}
		

	}

}
