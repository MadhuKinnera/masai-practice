package com.day17.q2;

import java.util.Scanner;

public class IPL {

	public void homeTeamStadium(Stadium stadium) {
		
		switch (stadium) {
		
		case EDEN_GARDENS_STADIUM :
			System.out.println("This is home ground for KKR");
			break;
		
		case WANKHEDE_STADIUM :
			System.out.println("This is home town for Mumbai");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is home town for CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is home town for RCB");
			break;
			
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IPL ipl = new IPL();
		
		System.out.println("Enter the Name of the Stadium");
		String stdName=sc.next();
		
		Stadium std = Stadium.valueOf(stdName.toUpperCase());
	    ipl.homeTeamStadium(std);
		
		
	}
	
}
