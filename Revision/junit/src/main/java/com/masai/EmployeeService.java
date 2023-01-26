package com.masai;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
	
	public static List<Employee> employees = new ArrayList<>();
	
	public Employee addEmployee(Employee employee);
		/*- This method should be
	implemented in ServiceImpl to add some dummy employee objects in ArrayList
	collection*/

	public boolean deleteEmployee(int empId) throws EmployeeException;
		/*- This should delete the employee
	from collection if exists with provided empId. It should throw EmployeeNotExist
	Exception if emp not available with provided ID*/
		

	public List<Employee> getAllEmployees();
		//- This should return list of emps
	
	
	public Employee get(int empId)throws EmployeeException ;

}
