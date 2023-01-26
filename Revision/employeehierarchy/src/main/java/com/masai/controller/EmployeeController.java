package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.Manager;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employees/add")
	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(eService.addEmployee(employee),HttpStatus.CREATED);
	}
	
	@PostMapping("/managers/add")
	public ResponseEntity<Manager> addManagerHandler(@RequestBody Manager manager){
		return new ResponseEntity<Manager>(eService.addManager(manager),HttpStatus.CREATED);
	}
	
	@GetMapping("/get-employees/{id}")
	public ResponseEntity<Employee> getEmployeeHandler(@PathVariable Integer id) throws EmployeeException{
		return new ResponseEntity<Employee>(eService.getEmployee(id),HttpStatus.OK);
	}
	
	@GetMapping("/get-managers/{id}")
	public ResponseEntity<Manager> getManagerHandler(Integer id)throws EmployeeException{
		return new ResponseEntity<Manager>(eService.getManager(id),HttpStatus.OK);
	}
	
	@PutMapping("employees/{eid}/{mid}")
	public ResponseEntity<List<Employee>> addEmpToManHanlder(@PathVariable("eid") Integer eid,@PathVariable("mid") Integer mid) throws EmployeeException{
		return new ResponseEntity<List<Employee>>(eService.addEmpToMan(eid, mid),HttpStatus.OK);
	}
	
	@GetMapping("/get-employee-list/{mid}")
	public ResponseEntity<List<Employee>> getEmployeeByManHandler(@PathVariable Integer mid) throws EmployeeException{
		return new ResponseEntity<List<Employee>>(eService.getEmpsByManId(mid),HttpStatus.OK);
	}
	
	@GetMapping("/get-employee-manager/{eid}")
	public ResponseEntity<Manager> getManagerByEmpHandler(@PathVariable Integer eid) throws EmployeeException{
		return new ResponseEntity<Manager>(eService.getManByEmpId(eid),HttpStatus.OK);
	}
}
