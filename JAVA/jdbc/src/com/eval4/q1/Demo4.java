package com.eval4.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter Course Name : ");
		String courseName = sc.next();
		
		String url="jdbc:mysql://localhost:3306/eval4";
		
		try(Connection conn= DriverManager.getConnection(url, "root", "Madhu123")) {
			
		PreparedStatement ps = conn.prepareStatement("select s.roll, s.name , s.address , s.mobile from student s inner join course c inner join student_course sc on s.roll=sc.roll and c.cid=sc.cid and c.cname=?");
		ps.setString(1,courseName);		
		
		ResultSet rs = ps.executeQuery();
		
		boolean flag=true;
		
		while(rs.next()) {
			flag=false;
			System.out.println("Roll no : "+rs.getInt("roll"));
			System.out.println("Student Name : "+rs.getString("name"));
		    System.out.println("Address : "+rs.getString("address"));
		    System.out.println("Mobile : "+rs.getString("mobile"));
		    System.out.println("=============");
		    System.out.println();
		   	
		}
		if(flag) {
			System.out.println("No record found");
		}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		

	}

}
