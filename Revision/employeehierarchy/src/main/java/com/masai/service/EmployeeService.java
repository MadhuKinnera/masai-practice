package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.Manager;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	Manager addManager(Manager manager);
	
	Employee getEmployee(Integer id)throws EmployeeException;
	
	Manager getManager(Integer id)throws EmployeeException;
	
	List<Employee> addEmpToMan(Integer eid,Integer mid)throws EmployeeException;
	
	List<Employee> getEmpsByManId(Integer mid)throws EmployeeException;
	
	Manager getManByEmpId(Integer eid)throws EmployeeException;
	
	

}
