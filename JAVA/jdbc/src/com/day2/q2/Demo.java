package com.day2.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id ");
	     int empid = sc.nextInt();
	     
	     System.out.println("Enter Employee Name ");
	     String ename = sc.next();
	     
	     System.out.println("Enter Address ");
	     String address = sc.next();
	     
	     System.out.println("Enter Mobile Number ");
	     String mobile = sc.next();
	     
	     System.out.println("Enter deptid ");
	     int deptid = sc.nextInt();
	     
	     
		
		 String url = "jdbc:mysql://localhost:3306/jdbcdb";
		 
		  try(Connection conn = DriverManager.getConnection(url, "root", "Madhu123")){
			  
			  
			 PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?) ");
			 ps.setInt(1, empid);
			 ps.setString(2, ename);
			 ps.setString(3, address);
			 ps.setString(4, mobile);
			 ps.setInt(5, deptid);
			 
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 System.out.println("Record successfully inserted ");
			 }else {
				 System.out.println("Record insertion failed ");
			 }

			 
			  
			  
			  
		  }catch(SQLException e ) {
			  System.out.println(e.getMessage());
		  }

	}

}
