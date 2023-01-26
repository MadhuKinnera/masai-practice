package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
public class Post {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Length(min = 2)
	private String title;
	private Integer pages;
	private String imgurl;
	@Length(min = 10)
	private String description;
	@NotNull
	private String name;
	@Email
	@NotNull
	private String email;
	
	
	@OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
	List<Comment> comments = new ArrayList<>();
	
	public Post(Integer pages, String imgurl, String description) {
		super();
		this.pages = pages;
		this.imgurl = imgurl;
		this.description = description;
	}

	public Post(@Min(2) String title, Integer pages, String imgurl, @Min(10) String description, @NotNull String name,
			@Email @NotNull String email) {
		super();
		this.title = title;
		this.pages = pages;
		this.imgurl = imgurl;
		this.description = description;
		this.name = name;
		this.email = email;
	}
	
	
	
	

}
