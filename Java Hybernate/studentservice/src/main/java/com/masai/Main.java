package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	StudentService ss = ctx.getBean("ss",StudentService.class);
	
	ss.printMap();
	ss.printList();
	ss.printAppName();

	}

}
