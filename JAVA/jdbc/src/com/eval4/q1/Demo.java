package com.eval4.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Inserting 5 Student Details 

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		
		
		String url = "jdbc:mysql://localhost:3306/eval4";
		
		 try(Connection conn= DriverManager.getConnection(url, "root","Madhu123")) {
			 
			 for(int i=0;i<5;i++) {
				 System.out.println("Enter "+(i+1)+" record details ");
				 System.out.println("Enter Roll : ");	
				 int roll = sc.nextInt();
				 
				 System.out.println("Enter Name : ");
				 String name = sc.next();
				 
				 System.out.println("Enter Address : ");
				 String address = sc.next();
				 
				 System.out.println("Enter Mobile : ");
				 String mobile = sc.next();
				 
				 	
				 PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
				 
				 ps.setInt(1, roll);
				 ps.setString(2,name );
				 ps.setString(3, address);
				 ps.setString(4, mobile);
				 
				 
				 int x = ps.executeUpdate();
				 
				 if(x>0) {
					 System.out.println(i+1+" Record Inserted successfully ");
				 }
				 else {
					 System.out.println("Inserting a Record failed");
				 }
				 
				 
			 }
			 
			 
			 
			 
		 }catch(SQLException e ) {
			 System.out.println(e.getMessage());
		 }

	}

}
