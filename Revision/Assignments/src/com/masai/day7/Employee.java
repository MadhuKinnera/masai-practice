package com.masai.day7;

import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Externalizable{
	
	private Integer salary ;
	private String department;
	private String work_loc;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public Employee(Integer id, String name, Integer age,Integer salary,String department,String work_loc) {
		super(id, name, age);
		this.salary=salary;
		this.department=department;
		this.work_loc=work_loc;
	}



	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getWork_loc() {
		return work_loc;
	}


	public void setWork_loc(String work_loc) {
		this.work_loc = work_loc;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", department=" + department + ", work_loc=" + work_loc + "]";
	}


    @Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(salary);
		out.writeObject(department);
		out.writeObject(work_loc);
		
		
	}




    @Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readObject();
		in.readObject();
		in.readObject();
		
	}




}
