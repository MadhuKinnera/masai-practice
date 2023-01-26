package com.masai.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Event {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	private LocalDate start;

	private LocalDate end;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

}
