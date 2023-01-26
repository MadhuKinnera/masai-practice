package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Book;
import com.masai.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo brepo;
	
	@Override
	public List<Book> getAllBooks() {
		List<Book> books = brepo.findAll();
		return books;
	}

	@Override
	public Book getBookById(Integer id) {
		Optional<Book> opt = brepo.findById(id);
		return opt.get();
	}

	@Override
	public Book insertBook(Book book) {
		Book b = brepo.save(book);
		return b;
	}

	@Override
	public Book deleteBook(Integer id) {
		Optional<Book> opt = brepo.findById(id);
		if(opt.isPresent()) {
			brepo.delete(opt.get());
			return opt.get();
		}else {
			return null;
		}
	}

	@Override
	public Book updateBook(Integer id, Book book) {
		Optional<Book> opt= brepo.findById(id);
		if(opt.isPresent())
		return brepo.save(book);
		else 
	    return null;
		
	}

}
