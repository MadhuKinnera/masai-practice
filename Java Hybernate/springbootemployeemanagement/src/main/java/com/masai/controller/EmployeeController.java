package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.EmployeeDTO;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee emp) throws EmployeeException{
		return new ResponseEntity<Employee>(employeeService.registerEmployee(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable Integer id) throws EmployeeException{
		
		Employee employee = employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeesHandler() throws EmployeeException{

		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployeeDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployeeByIdHandler(@PathVariable Integer id) throws EmployeeException{
		
     return new ResponseEntity<Employee>(employeeService.deleteEmployeeById(id),HttpStatus.OK);
	}
	
	@PostMapping("/loginemployees")
	public ResponseEntity<Employee> loginEmployeeHandler(@RequestParam String username,@RequestParam String password) throws EmployeeException{
		
    return new ResponseEntity<Employee>(employeeService.loginEmployee(username, password),HttpStatus.OK);
		
	}
	
	@GetMapping("/getemployees/{address}")
	public ResponseEntity<List<Employee>> getEmployeeDetailsByAddressHandler(@PathVariable String address) throws EmployeeException{
		
		return new ResponseEntity<List<Employee>>(employeeService.getEmployeeDetailsByAddress(address),HttpStatus.OK);
	}
	
	@PutMapping("/employees")
	public  ResponseEntity<Employee> UpdateEmployeeHandler(@RequestBody Employee emp) throws EmployeeException {
		
		return new ResponseEntity<>(employeeService.updateEmployee(emp),HttpStatus.OK);
	}
	
	@GetMapping("/employeesna/{id}")
	public ResponseEntity<String> getNameAndAddressByIdHandler(@PathVariable Integer id) throws EmployeeException{
		
		return new ResponseEntity<String>(employeeService.getNameAndAddressOfEmplyeeById(id),HttpStatus.OK);
	}
	
	@GetMapping("/employeesdto")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployeesDTOHandler() throws EmployeeException{
		
		return new ResponseEntity<List<EmployeeDTO>>(employeeService.getNameAddressSalaryOfAllEmployee(),HttpStatus.OK);
	}
	
	
	
	
	

	

}
