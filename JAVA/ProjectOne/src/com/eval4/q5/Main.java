package com.eval4.q5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		String str="HEllo Students madhu My name is Kinnera Madhu is Name";
		String[] strArr=str.split(" ");
		System.out.println(Arrays.toString(strArr));
		int count=0;
		for(int i=0;i<strArr.length;i++) {
			int flag=0;
			for(int j=i+1;j<strArr.length;j++) {
				if(strArr[i].equalsIgnoreCase(strArr[j])) {
					//System.out.println(strArr[i]);
					flag=1;
					break;
				}
			}
			if(flag==0) {
				count++;
			}
		}
		
		System.out.println("Number of words "+(strArr.length)+" Number of unique words "+
		(count));

		
		System.out.println("The Words are : ");
		
		int c=1;
		for(int i=0;i<strArr.length;i++) {
			int flag=0;
			for(int j=i+1;j<strArr.length;j++) {
				if((strArr[i].equalsIgnoreCase(strArr[j]))) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println((c++)+"."+" "+strArr[i]);
			}
			
		}
		
	}

}
