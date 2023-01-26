package com.masai;

public class SumOfN {
	
	
	public static double sumUptoN(int n) {
		double ans=(n*n+1)/2;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
         double ans= sumUptoN(n);
         System.out.println(ans);
	}

}
