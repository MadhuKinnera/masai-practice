package com.day2.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url ="jdbc:mysql://localhost:3306/jdbcdb";
		
		try(Connection conn =  DriverManager.getConnection(url,"root","Madhu123")){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where deptid=(select did from department where dname='accounting')");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Employee Id : "+rs.getInt("empid") );
				System.out.println("Employee Name : "+rs.getString("ename"));
				System.out.println("Employee Address : "+rs.getString("address"));
				System.out.println("Employee Phone : "+rs.getString("mobile"));
				System.out.println("Employee Department id : "+rs.getInt("deptid"));
				System.out.println("=======================================");
				System.out.println();
				
			}
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}

