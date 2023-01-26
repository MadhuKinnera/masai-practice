package com.eval2.q1;

import java.util.Objects;

public class Book {

	private String bookName;
    private String bookAuthor;
    private int bookisbn;
    
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String bookAuthor, int bookisbn) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookisbn = bookisbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(int bookisbn) {
		this.bookisbn = bookisbn;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookisbn=" + bookisbn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookName, bookisbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookName, other.bookName)
				&& bookisbn == other.bookisbn;
	}
    
	
	
}
