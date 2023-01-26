package com.masai.q5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	
	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	public void myInit(){
	System.out.println("inside myInit method");
	}
	public void cleanUp(){
	System.out.println("inside cleanUp method");
	}
	public void showDetails(){
	System.out.println("inside showDetails of Demo class");
	//print all the details of all the employees department-wise.
	Set<Map.Entry<Department,Employee>> set = theMap.entrySet();
	
	for(Map.Entry<Department,Employee> entry : set) {
		System.out.println(entry.getKey()+"-----------"+entry.getValue());
	}
	
	}
	
	

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp1 = ctx.getBean("employee1",Employee.class);
		Employee emp2 = ctx.getBean("employee2",Employee.class);
		Employee emp3 = ctx.getBean("employee3",Employee.class);
		
		Department accounts = ctx.getBean("dept-accounts",Department.class);
		Department marketing = ctx.getBean("dept-marketing",Department.class);
		Department sales = ctx.getBean("dept-sales",Department.class);
		
		Demo d1 = ctx.getBean("demo",Demo.class);
		
	     d1.theMap = new HashMap<>();
		
		d1.theMap.put(accounts, emp1);
		d1.theMap.put(marketing, emp2);
		d1.theMap.put(sales, emp3);
		
		d1.showDetails();
		
		ClassPathXmlApplicationContext cpctx = (ClassPathXmlApplicationContext)ctx;
		
		cpctx.close();
		


	}

}
