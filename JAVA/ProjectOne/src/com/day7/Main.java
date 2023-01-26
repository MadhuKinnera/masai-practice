package com.day7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2= new String("Hello");
		
		System.out.println(str1==str2);//it will print false

	}

}
/*
 *1. In the above program we created two strings str1 and str2 with and 
 *without new keyword respectively.
 *
 *2. When we comparing both the strings it will return false
 *
 *3. Even though the content is same. There Locations of memory is 
 *different 
 *
 *4. The str1 is created without new keyword so the str1 is created
 *inside a SCP(String constant Pool) in Heap area.
 *
 *5. And the reference is stored in str1;
 *
 *6. When we use new Keyword the string will create in SCP and the memory 
 *is create in heap area and that string reference store in the str2 object
 *in heap memory and the address is stored in str2
 *
 *7. so their scope of their memory is different.
 * 
 *8. This is the process when we use new and not use new while creating a 
 *string .
 */
