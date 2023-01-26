package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
public class MailDTO {
	
	@GeneratedValue
	private Integer id;
	
	private LocalDateTime time;
	
	private String message;
	
	private boolean isStarred;
	
	@ManyToOne
	private Email email = new Email();

}
