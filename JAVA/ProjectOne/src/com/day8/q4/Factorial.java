package com.day8.q4;

public class Factorial {
	
	
	public static int fact(int n) {
		if(n==1 || n==0 )
			return 1;
		return n* fact(n-1);
	}
	

	public static void main(String[] args) {
	
		
		int length= args.length;
		if(length==1) {
			int num=Integer.parseInt(args[0]);
		    int ans= fact(num);
		    System.out.println("The Factorial of "+num+ " is  : "+ans);
  
		}
		else if(length==2) {
			int num1= Integer.parseInt(args[0]);
			int num2= Integer.parseInt(args[1]);
			int diff = num1>num2 ? num1-num2: num2-num1;
			int ans= fact(diff);
			System.out.println("The Factorial of "+ diff + " number is : "+ans);
		}
		else if(length<=3){
			
			System.out.println("ERROR 404");
		}
		

	}

}
