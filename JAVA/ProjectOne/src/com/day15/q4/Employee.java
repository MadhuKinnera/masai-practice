package com.day15.q4;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	Department department;
	
	
	
	public Employee() {
		
	}
	
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary,int deptId,String deptName) {
		super();
		department=new Department(deptId,deptName);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	

}
