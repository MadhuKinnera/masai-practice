package com.eval2.q3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
	
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"Madhu",560,"Telangana"));
		students.add(new Student(12,"Pavan",380,"AP"));
		students.add(new Student(14,"Raghu",580,"MP"));
		students.add(new Student(15,"Sathis",420,"Tamilnadu"));
		students.add(new Student(17,"Ramu",900,"Kerala"));
		//List<Employee> employees = new ArrayList<>();
		
		List<Employee> employees= students.stream().filter(s->s.getMarks()>500)
		.map(s->(new Employee(s.getRoll(),s.getName(),s.getMarks()*10000,s.getAddress())))
		.collect(Collectors.toList());
		
		employees.stream().forEach(e->{
		System.out.println("Employee id : "+e.getEmpid());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee Address : "+e.getAddress());
		System.out.println("=================");
		});

	}

}
