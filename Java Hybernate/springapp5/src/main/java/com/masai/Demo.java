package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Autowired
	private Environment env;
	
	
	public void getName() {
		System.out.println("Name is "+env.getProperty("name"));
	}
	
	
	public void connectjdbc() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		
		String url = "jdbc:mysql://localhost:3306/springdb1";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(env.getProperty("url"),env.getProperty("user"),env.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Demo d1  = ctx.getBean(Demo.class);
		
		d1.getName();
		d1.connectjdbc();
	}

}
