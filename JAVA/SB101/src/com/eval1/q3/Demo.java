package com.eval1.q3;

public class Demo {
	
	 public void doTransaction(Payment type){
  	   type.doPayment();
  	   type.doPayment();
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		d1.doTransaction(new CashPayment(7000));
		d1.doTransaction(new CardPayment(5000));
		;
      
	}

}
