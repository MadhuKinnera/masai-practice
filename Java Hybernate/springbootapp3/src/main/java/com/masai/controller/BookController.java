package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookException;
import com.masai.model.Book;

@RestController
public class BookController {
	
	List<Book> books = new ArrayList<>();
	
	public BookController() {
		
		books.add(new Book(1,"naa istam","rgv",1000));
		books.add(new Book(2,"bluebook","kanthrisa",800));
		books.add(new Book(3,"intelligence","osho",1200));
		books.add(new Book(4,"fountainhead","ayn rand",8000));
		books.add(new Book(5,"atlas struggle","ayn rand",4000));
	}
	



@PostMapping("/books")
public  ResponseEntity<String> addBook(@RequestBody Book book) {
	books.add(book);
	return new ResponseEntity<>("book Inserted ",HttpStatus.ACCEPTED);

}


@GetMapping("/books")
public ResponseEntity<List<Book>> getAllBooks(){
	
	return new ResponseEntity<List<Book>>(books,HttpStatus.ACCEPTED);
	
}

@GetMapping("/books/{id}")
public ResponseEntity<Book> getAllBooks(@PathVariable("id") Integer id) throws BookException{
	
	Book book = null;
	Boolean flag=false;
	
	
	for(Book b : books) {
		if(b.getBookId()==id) {
			book=b;
			flag=true;
		}
	}
	
	if(!flag) {
		throw new BookException("Book Not Found With The Given Id");
	}
	return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
	
}

@DeleteMapping("/books/{id}")
public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id) throws BookException{
	
	Boolean res = books.removeIf(b->b.getBookId()==id);
	
	if(!res){
	throw new BookException("Book Not Found With The Given Id");
	}
	return new ResponseEntity<String>("Book Deleted Successfully ",HttpStatus.ACCEPTED);		
}

@PutMapping("/books")
public ResponseEntity<String> updateBook(@RequestBody Book book) throws BookException{
	
	Boolean flag = true;
   for(Book b : books) {
	   if(b.getBookId()==book.getBookId()) {
		   flag=false;
		   b.setAuthor(book.getAuthor());
		   b.setName(book.getName());
		   b.setPrice(book.getPrice());
		   break;
	   }
   }
   
   if(!flag) {
	   return new ResponseEntity<String>("Updation Success",HttpStatus.ACCEPTED);
	}else {
		throw new BookException("Provided Book Id Not Found ");
	}
   
}



}
         
