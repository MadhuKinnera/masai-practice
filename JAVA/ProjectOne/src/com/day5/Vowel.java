package com.day5;

public class Vowel {
	
	String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	String vowels="aeiouAEIOU";
	
	
	
	void isVowel(char c) {
		int flag1=0;
		int flag2=0;
		for(int i=0;i<str.length();i++) {
			//System.out.println("checking the input char or not");
			if(c==str.charAt(i)) {
				flag2=1;
			//	System.out.println("it is a character");
				break;
			}
			
		}
		
		if(flag2==1) {
			for(int i=0;i<vowels.length();i++) {
				if(c==vowels.charAt(i)) {
					System.out.println("Vowel");
					flag1=1;
					break;
				}
			}
		}
		
		
		if(flag1!=1 && flag2==1) {
			System.out.println("Consonant");
		}
		if(flag2!=1) {
			System.out.println("Invalid Character");
		}
		
		
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		Vowel v=new Vowel();
		v.isVowel('o');
	}

}
