package com.masai.service;

import java.util.List;

import com.masai.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book getBookById(Integer id);
	
	public Book insertBook(Book book);
	
	public Book deleteBook(Integer id);
	
	public Book updateBook(Integer id , Book book);
}
