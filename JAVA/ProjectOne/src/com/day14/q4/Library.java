package com.day14.q4;
import java.util.ArrayList;
//import java.util.Scanner;


public class Library {
	
 	ArrayList<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {	
	  bookList.add(book);
	  System.out.println("Book Added Successfully..");
	 
	}
	
	boolean isEmpty() {
		if(bookList.size()>0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	
	ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> authBooks= new ArrayList<>();
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getAuthor().equalsIgnoreCase(author)) {
				authBooks.add(bookList.get(i));
			}
		}
		return authBooks;
	}
	
	int countNoOfBooks(String bookName) {
		int count=0;
		for(Book i : bookList) {
			if(i.getBookName().equalsIgnoreCase(bookName)) {
				count++;
			}
		}
		return count;
	}
	

}
