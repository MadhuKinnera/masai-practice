package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptid;
	private String deptname;
	private String location;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "dept")
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Department( String deptname, String location) {
		super();
		this.deptname = deptname;
		this.location = location;
	}




	public Department(String deptname, String location, List<Employee> employees) {
		super();
		this.deptname = deptname;
		this.location = location;
		this.employees = employees;
	}
	
	
	
	
	public int getDeptid() {
		return deptid;
	}




	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}




	public String getDeptname() {
		return deptname;
	}




	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public List<Employee> getEmployees() {
		return employees;
	}




	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}




	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + "]";
	}
	
	
	
	

}
