package com.day8.q2;

import java.util.Scanner;

public class Main {
	
	public static void printEvenSum(int[][] arr) {
		for(int i=0;i<arr[0].length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j][i]%2==0) {
					sum+=arr[j][i];
				}
			}
			System.out.println("The "+(i+1)+"th column sum is : "+sum);
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter No of Columns : ");
		int cols = sc.nextInt();
		
		int[][] arr= new int[rows][cols];
		System.out.println("Enter "+rows*cols+" Numbers ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		printEvenSum(arr);
		

	}

}
