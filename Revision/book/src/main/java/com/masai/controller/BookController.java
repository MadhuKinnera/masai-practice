package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;
import com.masai.service.BookService;

@RestController
@RequestMapping("/bookservice")
public class BookController {
	
	@Autowired
	BookService bservice;
	
	@GetMapping("/")
	public String print() {
		return "Hello";
	}
	
	@GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
    	
    	List<Book> books = bservice.getAllBooks();
    	if(books.isEmpty()) {
    		return new ResponseEntity<List<Book>>(books,HttpStatus.BAD_REQUEST);
    	}
       
    	return new ResponseEntity<List<Book>>(books,HttpStatus.ACCEPTED);
    	
    }
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") Integer id) {
		
		Book book = bservice.getBookById(id);
		if(book==null) {
			return new ResponseEntity<Book>(book,HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
		}
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> insertBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(bservice.insertBook(book),HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id) {
	   Book book = bservice.deleteBook(id);
	   if(book==null) {
			return new ResponseEntity<Book>(book,HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
		}
		
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id,@RequestBody Book book) {
		
		Book b= bservice.getBookById(id);
		 if(b==null) {
				return new ResponseEntity<Book>(b,HttpStatus.BAD_REQUEST);
			}else {
				bservice.insertBook(book);
				return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
			}
			
		
	}
	
	

}
