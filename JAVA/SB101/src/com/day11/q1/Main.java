package com.day11.q1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		
		fw.write("Employee Name :"+name);
		
		System.out.println("Enter your address : ");
		String address = sc.next();
		fw.write("\nEmployee Address : "+address);
		
		fw.flush();
		fw.close();
		
		

	}

}
