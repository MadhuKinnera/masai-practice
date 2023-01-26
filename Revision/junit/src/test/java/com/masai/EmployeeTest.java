package com.masai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	EmployeeService es = null;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Hello Madhu ");
	}
	
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Test Started...");
		es = new EmployeeServiceImpl();
	}
	
	@Test
	public void addEmployee() {
		assertEquals(Employee.class,es.addEmployee(new Employee(1,"madhu",8000)).getClass());
	}
	
	@Test
	public void deleteEmployee() throws EmployeeException {
		assertTrue(es.deleteEmployee(1));
	}
	
	@Test
	public void getAllEmps() {
		assertEquals(ArrayList.class,es.getAllEmployees().getClass());
	}
	
	@Test
	public void getById() throws EmployeeException {
		assertEquals(Employee.class, es.get(3).getClass());
	}
	
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test is ended ...");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Bye Madhu");
	}
	
}
