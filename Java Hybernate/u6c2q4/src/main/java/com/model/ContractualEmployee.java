package com.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class ContractualEmployee extends Employee{
	
	private int noOfWorkingDays;
	private int costofperday;
	private String mobileNumber;
	
    public ContractualEmployee() {
		// TODO Auto-generated constructor stub
	}
    

	
	public ContractualEmployee(int noOfWorkingDays, int costofperday, String mobileNumber) {
		super();
		this.noOfWorkingDays = noOfWorkingDays;
		this.costofperday = costofperday;
		this.mobileNumber = mobileNumber;
	}





	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getCostofperday() {
		return costofperday;
	}
	public void setCostofperday(int costofperday) {
		this.costofperday = costofperday;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costofperday=" + costofperday
				+ ", mobileNumber=" + mobileNumber + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName();
	}





	
	

}
