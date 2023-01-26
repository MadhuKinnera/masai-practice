package com.day11.q2;
import java.util.Scanner;

public class Main {
	
	public static double calculateAverage(int[] age) {
		int total=0;
		for(int i:age) {
			total+=i;
		}
		
		return (double)(total*1.0/age.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Enter The Number of Employees : ");
				int N= sc.nextInt();
				
				if(N<2) {
					System.out.println("Please Enter a valid Employee Count");
					return;
				}
				System.out.println("Enter the age for "+N+ " Employees ");
				
				int[] age = new int[N];
				
				for(int i=0;i<N;i++) {
 					int ans = sc.nextInt();
					age[i]=ans;
				}
				
				
					double average = calculateAverage(age);
					System.out.println("The Average age is : "+ average);
					


	}

}
