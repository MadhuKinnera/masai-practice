package com.masai.s2d2.q2.doa;

import com.masai.s2d2.q2.exception.EmployeeException;
import com.masai.s2d2.q2.model.Employee;

public interface EmployeeDoa {
	
	
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(int empId)throws EmployeeException;
	
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeException;


}
