package com.eval4.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Inserting 5 Course Details 
public class Demo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/eval4";
		
		try(Connection conn =  DriverManager.getConnection(url,"root","Madhu123")) {
			
		for(int i=0;i<5 ;i++) {	
			
			System.out.println("Enter "+(i+1)+"th Course Details ");
			System.out.println("Enter course id  : ");
			int cid = sc.nextInt();
			
			System.out.println("Enter Course Name : ");
			String cname = sc.next();
			
			System.out.println("Enter course fee : ");
			int fee = sc.nextInt();
			
			System.out.println("Enter course Duration ");
			String duration = sc.next();
			
			System.out.println();
	        		

		PreparedStatement ps = 	conn.prepareStatement("insert into course values(?,?,?,?)");
		
		
		ps.setInt(1, cid);
		ps.setString(2, cname);
		ps.setInt(3, fee);
		ps.setString(4, duration);
		
		int x = ps.executeUpdate();
		
		if(x>0) {
			System.out.println("record inserted successfully ");
		}
		else {
			System.out.println("Record insertion failed ");
		}
		
			
		}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}

/*
 * 
 * SQL queries
 * ----------
 * 
 * mysql> insert into student_course values(2,11);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_course values(1,11);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(3,12);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(3,15);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,11);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,13);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,14);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(4,14);
Query OK, 1 row affected (0.00 sec)
 * 
 */
