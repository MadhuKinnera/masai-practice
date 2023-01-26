package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.EmployeeDTO;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		Employee employee = employeeRepo.save(emp);
		if(employee==null) 
			throw new EmployeeException("Registration Failed");
		else
			return employee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt = employeeRepo.findById(empId);
		if(opt.isPresent()) {
			return opt.get();
		}else 
			throw new EmployeeException("Employee Not exist with empId"+empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		List<Employee> employees = employeeRepo.findAll();
		if(employees.isEmpty())
			throw new EmployeeException("Employees Not Exist ");
		else
			return employees;
	}
	

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt = employeeRepo.findById(empId);
		if(opt.isPresent()) {
			Employee employee = opt.get();
			employeeRepo.delete(employee);
			return employee;
		}else
			throw new EmployeeException("Employee Not Exist With empId"+empId+" to delete ");
		
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		Employee employee = employeeRepo.loginEmployee(email, password);
		if(employee==null) 
			throw new EmployeeException("Employee Not Found : Login Failed");
		else
			return employee;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		List<Employee> employees = employeeRepo.findByAddress(address);
		if(employees.isEmpty()) {
			throw new EmployeeException("Employees Not found with Address "+address);
		}else
			return employees;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		Optional<Employee> opt = employeeRepo.findById(emp.getEmpId());
		if(opt.isPresent()) {
		 return employeeRepo.save(emp);
		}else
			throw new EmployeeException("Employee Not Found with empId "+emp.getEmpId());
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt= employeeRepo.findById(empId);
		if(!opt.isPresent()) 
			throw new EmployeeException("Employee Not found with empId "+empId);
		else {
			Employee emp = opt.get();
			return emp.getEmpName()+emp.getAddress();
		}
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		List<Employee> employees = employeeRepo.findAll();
		List<EmployeeDTO> employeesdto = new ArrayList<>();
		
		for(Employee emp : employees) {
			employeesdto.add(new EmployeeDTO(emp.getEmpName(),emp.getAddress(),emp.getSalary()));	
			}
		if(employeesdto.isEmpty()) {
			throw new EmployeeException("No Employees Exist");
		}else
			return employeesdto;
	}
	


}
