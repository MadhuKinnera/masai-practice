package com.day16.q2;
import java.lang.Comparable;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		
        return   this.salary>emp.getSalary()? +1 : -1 ;
	}
	

}
