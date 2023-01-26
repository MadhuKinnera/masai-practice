package com.day14.q4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		
		while(true) {
			System.out.println("================");
			
		System.out.println("1. Add Book ");
		System.out.println("2. Display all Book Details ");
		System.out.println("3. Search Book by Author ");
		System.out.println("4. Count Books by Name ");
		System.out.println("5. Exit ");
		int choice = sc.nextInt();
		
		
		if(choice==1) {
			System.out.println("Enter isbn number : ");
			int isbn= sc.nextInt();
			System.out.println("Enter Book Name : ");
			sc.nextLine();
			String bookName= sc.nextLine();
			System.out.println("Enter Author : ");
			String author= sc.next();
			Book b = new Book(isbn,bookName,author);
			l.addBook(b);
		}
		else if(choice ==2) {
			if(l.isEmpty()) {
				System.out.println("Book List is empty");
			}
			else {
				System.out.println(l.viewAllBooks());
			}
		}
		
		
		
		else if(choice==3) {
			if(l.isEmpty()) {
				System.out.println("Book List is empty");
			}
			else {
				System.out.println("Enter author name to find ..");
				String author= sc.nextLine();
				 ArrayList<Book> authBooks= l.viewBooksByAuthor(author);
		         
				 if(authBooks.size()==0) {
					 System.out.println("No Books Found...");
				 }
				 else {
					 System.out.println(authBooks);
				 }
			
			}
			
		}
		
		else if(choice==4) {
			if(l.isEmpty()) {
				System.out.println("No Books Available ");
				continue;
			}
			
			System.out.println("Enter book Name : ");
			String bookName=sc.next();
			
			int count = l.countNoOfBooks(bookName);
			System.out.println("The Count of "+bookName+ " books are "+count);
		}
		else if(choice==5) {
			System.out.println("Thank You for using This application Hava a good day :)");
			break;
		}
		else {
			System.out.println("Wrong Choice :( ");
		}
		
		
		
		
		
		}

	}

}
