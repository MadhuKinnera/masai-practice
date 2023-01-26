package com.madhu;

public class Vehicle {
	
	private String type;
	private int balance;
	private String vehicleNumber;
	private String vehicleCategory;
	private boolean isReturnJourny;
	private int tollCharged;
	
	public Integer getTollCharged() {
		return tollCharged;
	}


	public void setTollCharged(Integer tollCharged) {
		this.tollCharged = tollCharged;
	}


	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Vehicle(String type, Integer balance, String vehicleNumber, String vehicleCategory, Boolean isReturnJourny) {
		super();
		this.type = type;
		this.balance = balance;
		this.vehicleNumber = vehicleNumber;
		this.vehicleCategory = vehicleCategory;
		this.isReturnJourny = isReturnJourny;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Integer getBalance() {
		return balance;
	}


	public void setBalance(Integer balance) {
		this.balance = balance;
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public String getVehicleCategory() {
		return vehicleCategory;
	}


	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}


	public Boolean getIsReturnJourny() {
		return isReturnJourny;
	}


	public void setIsReturnJourny(Boolean isReturnJourny) {
		this.isReturnJourny = isReturnJourny;
	}


	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", balance=" + balance + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleCategory=" + vehicleCategory + ", isReturnJourny=" + isReturnJourny + ", tollCharged="
				+ tollCharged + "]";
	}


	
	

}
