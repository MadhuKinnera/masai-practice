package com.madhu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("WELCOME TO TOLL CALCULATOR");
		
		TollCalculator tc = new TollCalculator();
		
	     String s = "";
	     
	     while(true) {
	    	  s = sc.next();
	    	  if(s.equals("PRINT_COLLECTION")) break;
	    	  
	    	  if(s.equals("FASTAG")) {
	    		 String vehicleNumber = sc.next();
	    		 Integer balance = sc.nextInt();
	
	    		 tc.addVehicleToSet(vehicleNumber, balance);
	    	 }
	    	  else {
	    		 String vehicleNumber = sc.next();
	    
	    		 if(!tc.isVehicleExist(vehicleNumber)) {
	    			 tc.addVehicleToSet(vehicleNumber);
	    		 }
	    		 tc.caculateTollPrice(vehicleNumber);
	    	 }
	     }
	     
	     tc.printCollection();
	    // System.out.println("THANK YOU");
	     

	}

}
/*
FASTAG C1N1 200
FASTAG T1N1 500 
FASTAG C1N2 50 
FASTAG B1N1 500 
COLLECT_TOLLCAR C1N1 
COLLECT_TOLLTRUCK T1N1 
COLLECT_TOLLCAR C1N2 
COLLECT_TOLLBUS B1N1 
COLLECT_TOLLCAR C1N3 
PRINT_COLLECTION
*/



/*
TOTAL_COLLECTION780 0
PAYMENT_SUMMARY550 230
VEHICLE_TYPE_SUMMARY
CAR 3
BUS 1
TRUCK 1
*/

/*
FASTAG V2N1 100
FASTAG T2N1 300 
COLLECT_TOLLVAN V2N1 
COLLECT_TOLLTRUCK T2N1 
COLLECT_TOLLVAN V2N1 
PRINT_COLLECTION 
*/


/*
TOTAL_COLLECTION 390 50
PAYMENT_SUMMARY 300 90
VEHICLE_TYPE_SUMMARY
TRUCK 1
VAN 2
*/