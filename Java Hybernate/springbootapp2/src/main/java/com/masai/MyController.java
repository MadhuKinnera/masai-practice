package com.masai;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;
import com.masai.utility.EMUtil;

@RestController
public class MyController {
	
	
	@GetMapping("/books")
	public List<Book> getBooks() {
	    EntityManager em = EMUtil.provideEntityManager();
	    
	    String jpql = "from Book";
	    
	    Query q = em.createQuery(jpql);
	    
	    List<Book> list = q.getResultList();
	    
	   return list;
	   
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Integer id) {
	    EntityManager em = EMUtil.provideEntityManager();
	    em.getTransaction().begin();
	    Book book = em.find(Book.class, id);
	    em.getTransaction().commit();

		
	    return book;
	}

	@PostMapping("/books")
	public String createBook(@RequestBody Book book) {
		
//		EntityManager em = EMUtil.provideEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(book);
//		em.getTransaction().commit();
		
		return "book inserted successfully"+book.toString();
		
	}
	
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id") Integer bookId) {
		
		String op = "deletion Failed ";
		EntityManager em = EMUtil.provideEntityManager();
	    em.getTransaction().begin();
	    Book book = em.find(Book.class, bookId);
	    em.getTransaction().commit();
	    
	    String jpql = "from Book where bookId=:id";
	    
	    
	    Query q = em.createQuery(jpql);
	    
	    q.setParameter("id", bookId);
	    
	    Integer x = q.executeUpdate();
	    if(x>0)op="deletion Successful";
		
		return op;
	}
	
	
	

}
