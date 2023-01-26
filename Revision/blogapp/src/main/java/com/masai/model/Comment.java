package com.masai.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@javax.persistence.Entity
@Data
@NoArgsConstructor
@ToString
public class Comment {
	@Id
	@GeneratedValue
	private Integer id;
	private String text;
	
	@JsonIgnore
	@ManyToOne
	private Post post = new Post();

	public Comment(String text, Post post) {
		super();
		this.text = text;
		this.post = post;
	}

	public Comment(String text) {
		super();
		this.text = text;
	}
	
	
	
	

}
