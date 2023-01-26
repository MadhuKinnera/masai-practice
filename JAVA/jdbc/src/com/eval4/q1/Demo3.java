package com.eval4.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter roll number of Student : ");
		int roll = sc.nextInt();
		
		String url="jdbc:mysql://localhost:3306/eval4";
		
		try(Connection conn= DriverManager.getConnection(url, "root", "Madhu123")) {
			
		PreparedStatement ps = conn.prepareStatement("select c.cid,c.cname,c.fee,c.duration from course c  inner join student s inner join student_course sc  on c.cid=sc.cid and s.roll = sc.roll and s.roll=?");
		ps.setInt(1, roll);		
		
		ResultSet rs = ps.executeQuery();
		
		boolean flag=true;
		
		while(rs.next()) {
			flag=false;
			System.out.println("Course id : "+rs.getInt("cid"));
			System.out.println("Course Name : "+rs.getString("cname"));
		    System.out.println("Course Fee : "+rs.getInt("fee"));
		    System.out.println("Course Duration : "+rs.getString("duration"));
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
