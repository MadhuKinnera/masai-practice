package com.eval2.q1;

import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Library l = new Library();
		
	  while(true) {
		  System.out.println("1. Add Book ");
		  System.out.println("2. Display all the Book Details ");
		  System.out.println("3. Search Book by Author ");
		  System.out.println("4. Search Book by ISBN ");
		  System.out.println("5. Exit");
		  
		  int choice = sc.nextInt();
		  
		  if(choice==1) {
			  System.out.println("Enter The Book Details ");
			  System.out.println("======================");
			  System.out.println("Enter Book Name : ");
			  String name = sc.next();
			  System.out.println("Enter Book Author : ");
			  String author = sc.next();
			  System.out.println("Enter Book ISBN : ");
			  int isbn = sc.nextInt();
			  try {
				l.addBook(new Book(name,author,isbn));
			} catch (BookException be) {
				System.out.println(be.getMessage());
			}
			  
		  }
		  else if(choice==2) {
			  try {
				  List<Book> books = l.viewAllBooks();
				  
				  books.stream().forEach(book->{
					  
				  System.out.println("Book ISBN : "+book.getBookisbn());
				  System.out.println("Book Name : "+book.getBookName());
				  System.out.println("Book Author : "+book.getBookAuthor());
				  System.out.println("========================");
				  System.out.println();
				
				  });
				  
			  }catch(BookException be ) {
				  System.out.println(be.getMessage());
			  }
			  
		  }
		  else if(choice==3) {
			  try {
				  System.out.println("Enter Author Name ");
				  String author = sc.next();
				  List<Book> books = l.viewBooksByAuthor(author);
				  
				  
				 
				  books.stream().forEach(b->{
					  System.out.println("Book ISBN : "+b.getBookisbn());
					  System.out.println("Book Name :"+b.getBookName());
					  System.out.println("Book Author : "+b.getBookAuthor());
					  System.out.println("================================");
					  System.out.println();
					  
				  });
				  
			  }catch(BookException be) {
				  System.out.println(be.getMessage());
			  }
		  }
		  else if(choice==4) {
			  System.out.println("Enter Isbn number ");
			  int isbn = sc.nextInt();
			  try {
				  Book book = l.getBookByISBN(isbn);
				  
				  System.out.println("Book ISBN : "+book.getBookisbn());
				  System.out.println("Book Name : "+book.getBookName());
				  System.out.println("Book Author : "+book.getBookAuthor());
				  System.out.println("================================");
				  System.out.println();

				  
				  
			  }catch(BookException be) {
				  System.out.println(be.getMessage());
			  }
			
			  
		  }
		  else if(choice==5) {
			  System.out.println("Thank You <3");
			  break;
		  }
		  else {
			  System.out.println("Wrong Input. Please Try Again ");
		  }
		  
		  
		  
	  }

	}

}
