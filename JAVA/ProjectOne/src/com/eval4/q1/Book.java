package com.eval4.q1;
import java.util.Objects;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	
     Book(int bookId,String bookName,String author){
		this.bookId=bookId;
		this.bookName=bookName;
		this.author=author;
	}
     
     @Override
    public boolean equals(Object obj) {
    	Book b=(Book)obj;
    	if(this.bookId==b.bookId) {
    		return true;
    	}
    	else {
    		return true;
    	}
    }
     
     @Override
    public int hashCode() {
    	return this.bookId;
    }

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

     
     

}
