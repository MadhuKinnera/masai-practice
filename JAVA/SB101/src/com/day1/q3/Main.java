package com.day1.q3;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book(10,"Naa istam","rgv");
		Book b2 = new Book(12,"blue book","Kanth risa");
		Book b3 = new Book(12,"fountainhead","ayn rand");
		
		Library.books.put(b1.getBookId(), b1);
		Library.books.put(b2.getBookId(),b2);
		Library.books.put(b3.getBookId(), b3);
		
		Member m1 = new Member(1,"Madhu",100,"18th Aug");
		Member m2 = new Member(12,"Thor",5,"18th Aug");
		Member m3 = new Member(10,"IronMan",200,"18th Aug");
		Member m4 = new Member(11,"AntMan",100,"18th Aug");
		Member m5 = new Member(1,"Sathish",300,"18th Aug");
		
		Library.members.add(m1);
		Library.members.add(m2);
		Library.members.add(m3);
		Library.members.add(m4);
		Library.members.add(m5);
		
		System.out.println("Book Details ");
		System.out.println("===============");
	 for(int i : Library.books.keySet()) {
		 System.out.println("Key is "+i+" value is : "+Library.books.get(i));
	 }
	 
	 System.out.println();
	 System.out.println("The MemberShip Details : ");
	 System.out.println("===========================");
	 
	 
	 for(Member m : Library.members) {
		 System.out.println("Member Id : "+m.getMemberId());
		 System.out.println("Member Name : "+m.getMemberName());
		 System.out.println("MemberShip Number : "+m.getMemberShipNumber());
		 System.out.println("MemberShip Ending Date : "+m.getMemberShipEndDate());
		 System.out.println("======================================");
	 }
	 
	 
	   
		
		

	}

}
