package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@RequestMapping("/getEmployee")
	public Employee getEmployee() {
		return new Employee(10,"Madhu",78000);
	}
	
	@RequestMapping("/getEmployees")
	public List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(12,"Ram",67000));
		list.add(new Employee(13,"Raghu",56000));
		list.add(new Employee(14,"Ravi",59000));
		list.add(new Employee(16,"Pavan",61000));
		list.add(new Employee(18,"Prakash",90000));
		
		
		return list;
	}
}
