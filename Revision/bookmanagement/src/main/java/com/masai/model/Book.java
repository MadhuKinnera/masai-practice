package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Book {
	
	private  String bookId;
	private String name;
    private String author;
    private String publication;
    private String category;
    private Integer pages;
    private Integer price;

}
