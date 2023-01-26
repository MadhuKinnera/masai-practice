package com.eval2.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	
	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book )throws BookException{
		if(bookList.contains(book)) {
			BookException be = new BookException("Book is already Exist");
			throw be;
		}
		else {
			bookList.add(book);
			System.out.println("Book Added Successfully ");
		}
	}
	
	List<Book> viewAllBooks() throws BookException{
		if(bookList.size()==0) {
			BookException be = new BookException("Book List is empty");
			throw be;
		}
		else {
			
			Collections.sort(bookList,(b1,b2)->b1.getBookName().compareTo(b2.getBookName()));
			
			return bookList;
			
			
		}
	}
	
	List<Book> viewBooksByAuthor(String author) throws BookException{
		List<Book> authorBooks = new ArrayList<>();
		
		for(Book b  : bookList) {
			if(b.getBookAuthor().equalsIgnoreCase(author)) {
				authorBooks.add(b);
			}
		}
		
		if(authorBooks.size()==0) {
			BookException be = new BookException("No Books By Author "+author);
			throw be;
		}
		
		return authorBooks;
		
	}
	
	
	Book getBookByISBN(int isbn) throws BookException {
		
		for(Book b:bookList) {
			if(b.getBookisbn()==isbn) {
				return b;
			}
		}
		
		BookException be = new BookException("No book exist With the isbn "+isbn);
		throw be;
	}
	
	
	

}
