package com.madhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TollCalculator {
	
	
    //intialized when tollcalculator obj will creates ie in constuctor
	private Set<Vehicle> vehicles = null;
	
	private Map<String , Integer> passedVehicles = null;
	
	private Map<String,Integer> amountByType = null;
	
	private List<Map.Entry<String, Integer>> list=null;
	

	//getters and setters
	public Set<Vehicle> getVehicles() {
		return vehicles;
	}


	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}


	public Map<String, Integer> getPassedVehicles() {
		return passedVehicles;
	}


	public void setPassedVehicles(Map<String, Integer> passedVehicles) {
		this.passedVehicles = passedVehicles;
	}


	public Map<String, Integer> getAmountByType() {
		return amountByType;
	}


	public void setAmountByType(Map<String, Integer> amountByType) {
		this.amountByType = amountByType;
	}


	public int getTotalDiscountGiven() {
		return totalDiscountGiven;
	}


	public void setTotalDiscountGiven(int totalDiscountGiven) {
		this.totalDiscountGiven = totalDiscountGiven;
	}


	public int getFasttagCollected() {
		return fasttagCollected;
	}


	public void setFasttagCollected(int fasttagCollected) {
		this.fasttagCollected = fasttagCollected;
	}


	public int getCashCollected() {
		return cashCollected;
	}


	public void setCashCollected(int cashCollected) {
		this.cashCollected = cashCollected;
	}


	public TollCalculator() {
		vehicles = new HashSet<>();
		passedVehicles = new HashMap<>();
	    amountByType = new HashMap<>();
	}
	

	//private Integer totalAmountCollected= fasttagCollected+cashCollected;
	private int totalDiscountGiven;
	
	private int fasttagCollected;
	private int cashCollected;


	


	//To calcualte The Toll Price
	public void caculateTollPrice(String vehicleNumber) {
	//	System.out.println("Inside caculate toll price ");
		
		Vehicle vehicle = null;
		
		for(Vehicle v : vehicles) {
			if(v.getVehicleNumber().equals(vehicleNumber)) {
				vehicle = v;
				break;
			}
		}
		
		if(vehicle.getBalance()>=vehicle.getTollCharged()) {
			this.collectTollByFastTag(vehicle);
		}else  if(vehicle.getBalance()==0){
            this.collectTollByCash(vehicle);			
		}else {
			this.collectTollByBothCashAndFastTag(vehicle);
		}
		
	}
	
	//paying with cash
	public void collectTollByCash(Vehicle vehicle) {
		//System.out.println("Inside collect toll by cash");
		
		if(vehicle.getIsReturnJourny()) {
			Integer amount = vehicle.getTollCharged()/2+40;
			this.cashCollected+=amount;
			this.totalDiscountGiven+=vehicle.getTollCharged()/2;
			amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
		}else {
			Integer amount = vehicle.getTollCharged()+40;
			this.cashCollected+=vehicle.getTollCharged()+40;
			amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
		}
		
		
       this.vehicleAuthenticated(vehicle);
		
	}
	
    //paying through fastag
	public void collectTollByFastTag(Vehicle vehicle) {
		//System.out.println("Inside collect toll by fasttag");
		
		if(vehicle.getIsReturnJourny()) {
			Integer amount = vehicle.getTollCharged()/2;
			this.fasttagCollected+=amount;
			this.totalDiscountGiven+=vehicle.getTollCharged()/2;
			vehicle.setBalance(vehicle.getBalance()-vehicle.getTollCharged()/2);
			amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
		}else {
			Integer amount = vehicle.getTollCharged();
			this.fasttagCollected+=vehicle.getTollCharged();
			vehicle.setBalance(vehicle.getBalance()-vehicle.getTollCharged());
			amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
		}
		
		this.vehicleAuthenticated(vehicle);
		
		
	}
	

	//paying from both ways
	public void collectTollByBothCashAndFastTag(Vehicle vehicle) {
		//System.out.println("Inside collect toll by cash and fasttag");
		if(vehicle.getIsReturnJourny()) {
			if(vehicle.getBalance()>=vehicle.getTollCharged()/2) {
				this.collectTollByFastTag(vehicle);
			}else {
				this.fasttagCollected+=vehicle.getBalance();
				this.cashCollected+=(vehicle.getTollCharged()/2)-vehicle.getBalance()+40;
				this.totalDiscountGiven+=vehicle.getTollCharged()/2;
				Integer amount = vehicle.getBalance()+(vehicle.getTollCharged()/2)+40;
				amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
				vehicle.setBalance(0);
			}
		}else {
			
			this.fasttagCollected+=vehicle.getBalance();
			this.cashCollected+=(vehicle.getTollCharged())-vehicle.getBalance()+40;
			Integer amount = vehicle.getBalance()+(vehicle.getTollCharged())+40;
			amountByType.put(vehicle.getType(),amountByType.getOrDefault(vehicle.getType(),0)+amount);
			vehicle.setBalance(0);
			
		}
		
		this.vehicleAuthenticated(vehicle);
	}
	
	//is the vehicle is already present in fasttag list
	public boolean isVehicleExist(String vehicleNumber) {
		//System.out.println("Inside isVehicleExist");
		
		for(Vehicle v : vehicles) {
			if(v.getVehicleNumber().equals(vehicleNumber)) return true;
		}
		
		return false;
	}
	
	//adding the non-fasttag vehicles
	public Vehicle addVehicleToSet(String vehicleNumber) {
		//System.out.println("Inside add Vehicle without fastTag");
		Vehicle vehicle = new Vehicle();
		
		vehicle.setBalance(0);
		vehicle.setVehicleNumber(vehicleNumber);
		
	     if(vehicleNumber.charAt(0)=='T') {
			vehicle.setType("Truck");
            vehicle.setVehicleCategory("Heavy");
            vehicle.setTollCharged(200);
		}else if(vehicleNumber.charAt(0)=='B') {
			vehicle.setType("Bus");
            vehicle.setVehicleCategory("Heavy");
            vehicle.setTollCharged(200);
		} else if(vehicleNumber.charAt(0)=='V') {
			vehicle.setType("Van");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='C') {
			vehicle.setType("Car");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='R') {
			vehicle.setType("Rikshaw");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='S') {
			vehicle.setType("Scooter");
            vehicle.setVehicleCategory("TwoWheeler");
            vehicle.setTollCharged(50);
		}else if(vehicleNumber.charAt(0)=='M') {
			vehicle.setType("MotorBike");
            vehicle.setVehicleCategory("TwoWheeler");
            vehicle.setTollCharged(50);
		}
	     
	     vehicles.add(vehicle);
	     return vehicle;
	    
	}

	//adding the fasttag vehicles
	public Vehicle addVehicleToSet(String vehicleNumber,Integer fastTagAmount) {
		//System.out.println("Inside add Vehicle with fastTag");
		Vehicle vehicle = new Vehicle();
		
		vehicle.setBalance(fastTagAmount);
		vehicle.setVehicleNumber(vehicleNumber);
		
	     if(vehicleNumber.charAt(0)=='T') {
			vehicle.setType("Truck");
            vehicle.setVehicleCategory("Heavy");
            vehicle.setTollCharged(200);
		}else if(vehicleNumber.charAt(0)=='B') {
			vehicle.setType("Bus");
            vehicle.setVehicleCategory("Heavy");
            vehicle.setTollCharged(200);
		} else if(vehicleNumber.charAt(0)=='V') {
			vehicle.setType("Van");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='C') {
			vehicle.setType("Car");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='R') {
			vehicle.setType("Rikshaw");
            vehicle.setVehicleCategory("Light");
            vehicle.setTollCharged(100);
		}else if(vehicleNumber.charAt(0)=='S') {
			vehicle.setType("Scooter");
            vehicle.setVehicleCategory("TwoWheeler");
            vehicle.setTollCharged(50);
		}else if(vehicleNumber.charAt(0)=='M') {
			vehicle.setType("MotorBike");
            vehicle.setVehicleCategory("TwoWheeler");
            vehicle.setTollCharged(50);
		}
	     
	     vehicles.add(vehicle);
	     return vehicle;
	    
	}
	

	//the vehicle toll is calculated and it is ready to go 
    public void vehicleAuthenticated(Vehicle vehicle) {
    	//System.out.println("Inside Vehicle Authenticated");
		passedVehicles.put(vehicle.getType(),passedVehicles.getOrDefault(vehicle.getType(),0)+1);
		vehicle.setIsReturnJourny(!vehicle.getIsReturnJourny());
		
	}

    //to print the output in our required format
    public void printCollection() {
    	//System.out.println("Inside PrintCollection");
    	System.out.println("TOTAL_COLLECTION "+(this.cashCollected+this.fasttagCollected)+" "+this.totalDiscountGiven);
    	System.out.println("PAYMENT_SUMMARY "+this.fasttagCollected+" "+this.cashCollected);
    	System.out.println("VEHICLE_TYPE_SUMMARY");
    	
    	this.sortList();
    	 
    	 for(Map.Entry<String, Integer> me : list) {
    		 System.out.println(me.getKey().toUpperCase()+" "+passedVehicles.get(me.getKey()));
    	 }
    	 
    	 
    }
    
    
    
    //to sort the result by type collection and name
    public void sortList() {

    	 list = new ArrayList<>(amountByType.entrySet());
    	
    	Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				
				int result = Integer.compare(e2.getValue(), e1.getValue());
				
				if(result==0) {
					result = e1.getKey().compareTo(e2.getKey());
				}
				
				return result;
			}
		});
    	
    }

   

}




