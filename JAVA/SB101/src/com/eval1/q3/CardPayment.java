package com.eval1.q3;

public class CardPayment implements Payment {
	int amount;
	

		
		public CardPayment(int amount) {
		super();
		this.amount = amount;
	}



		@Override
		public void doPayment() {
			// TODO Auto-generated method stub
			System.out.println("Payment done using card  "+this.amount);
			
		}
		
	

}
