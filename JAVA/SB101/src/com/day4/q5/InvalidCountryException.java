package com.day4.q5;

public class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		super("User Outside India Cannot be Registered");
	}

}
