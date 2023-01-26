package com.evaluation2.q3;

public class Ticket {

	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		if(noOfTickets> availableTickets) {
			return -1;
		}
		
		availableTickets-=noOfTickets;
		int totalAmount=noOfTickets * price;
		
		
		
		
		return totalAmount;
	}

}
