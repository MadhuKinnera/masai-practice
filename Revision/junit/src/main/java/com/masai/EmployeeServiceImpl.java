package com.masai;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list = EmployeeService.employees;
	
	public EmployeeServiceImpl() {
		list.add(new Employee(1,"madhu",8990));
		list.add(new Employee(2,"ram",5000));
		list.add(new Employee(3,"raghu",6000));
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException{
		List<Employee> temp = list.stream().filter(s->s.getEmployeeId()==empId).collect(Collectors.toList());
	         
		if(!temp.isEmpty()) {
			Employee emp = temp.get(0);
			return list.remove(emp);
		}else {
			throw new EmployeeException("Employee DoesNot Exist");
		}
	
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return list;
	}

	@Override
	public Employee get(int empId) throws EmployeeException {
		List<Employee> emps = list.stream().filter(s->s.getEmployeeId()==empId).collect(Collectors.toList());
		
		if(emps.isEmpty()) {
			throw new EmployeeException("Employee Not Found ");
		}else {
			return emps.get(0);
		}
	}

}
