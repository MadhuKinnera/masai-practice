package com.day2.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		
		try(Connection conn = DriverManager.getConnection(url,"root","Madhu123")){
			
			PreparedStatement ps = conn.prepareStatement("select * from department where did in (select deptid from employee where address='mumbai')");
			ResultSet rs = ps.executeQuery();
			boolean flag=true;
			
			while(rs.next()) {
				flag=false;
				System.out.println("Department id : "+rs.getInt(1));
				System.out.println("Department Name : "+rs.getString(2));
				System.out.println("Department Location : "+rs.getString(3));
				System.out.println("=====================");
			}
			
			if(flag) {
				System.out.println("No records found");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
