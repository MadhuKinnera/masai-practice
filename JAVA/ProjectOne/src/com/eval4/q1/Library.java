package com.eval4.q1;

import java.util.LinkedHashSet;

public class Library {
	
	static LinkedHashSet<Book> booksCollection=new LinkedHashSet<>();
	
	
	
	
	public static void main(String args[]) {
		
		
		
		
		//Creating books 
		booksCollection.add(new Book(1, "naaistam", "rgv"));
		booksCollection.add(new Book(2,"bluebook","kanthrisa"));
		booksCollection.add(new Book(3,"whitebook","madhurisa"));
		booksCollection.add( new Book(1,"naaistam","rgv"));
		
		for(Book b:booksCollection) {
			System.out.println(b);
		}
		
		
		
		
	}
}
