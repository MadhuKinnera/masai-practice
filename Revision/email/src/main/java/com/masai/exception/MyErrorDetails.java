package com.masai.exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MyErrorDetails {
	
	private LocalDateTime timestamp;
	private String message;
	private String description;

}
