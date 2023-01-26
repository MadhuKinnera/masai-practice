package com.masai.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EventDTO {
	
	private String name;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate start;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate end;

}
