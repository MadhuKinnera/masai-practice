package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private LocalDateTime timestamp;
	private String message;
	private String desciption;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime localdate, String message, String desciption) {
		super();
		this.timestamp = localdate;
		this.message = message;
		this.desciption = desciption;
	}

	public LocalDateTime getLocaldate() {
		return timestamp;
	}

	public void setLocaldate(LocalDateTime localdate) {
		this.timestamp = localdate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "MyErrorDetails [localdate=" + timestamp + ", message=" + message + ", desciption=" + desciption + "]";
	}
	
	

}
