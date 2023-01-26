package com.eval3.q6;
import java.util.Scanner;

public class Main {
	
	
	public static double getStudent(int choice) {
		Scanner sc=new Scanner(System.in);
		if(choice==1) {
		
			System.out.println("Enter Marks for Hindhi : ");
			int hindhi=sc.nextInt();
			
			System.out.println("Enter Marks for English : ");
			int english=sc.nextInt();
			
			System.out.println("Enter Marks for History : ");
			int history= sc.nextInt();
			
			Student s= new ArtStudent(hindhi,english,history);
			
			 return s.findPercentage();
		}
		else if(choice==2) {
			System.out.println("Enter Marks for physics : ");
			int physics=sc.nextInt();
			
			System.out.println("Enter Marks for chemistry : ");
			int chemistry=sc.nextInt();
			
			System.out.println("Enter Marks for maths : ");
			int maths= sc.nextInt();
			
			System.out.println("Enter Marks for biology : ");
			int biology= sc.nextInt();
			
			Student s= new ScienceStudent(physics,chemistry,maths,biology);
			return s.findPercentage();
			
		}
		else if(choice==3) {
			
			System.out.println("Enter Marks for Account : ");
			int accounts=sc.nextInt();
			
			System.out.println("Enter Marks for ecomomics: ");
			int economics=sc.nextInt();
			
			System.out.println("Enter Marks for bussiness : ");
			int business= sc.nextInt();
		
			
			Student s= new CommerceStudent(accounts,economics,business);
			return s.findPercentage();
		}
		else {
			return 0;
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Which Student Do you want to find ? ");
		System.out.println("1. ArtStudent");
		System.out.println("2. ScienceStudent");
		System.out.println("3. CommerceStudent");
		int num=sc.nextInt();
		double res=getStudent(num);
		System.out.println("The Percentage is : "+res);
		
	}

}
