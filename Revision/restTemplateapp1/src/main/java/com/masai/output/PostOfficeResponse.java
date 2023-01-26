package com.masai.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostOfficeResponse {
	
	@JsonProperty("Message")
	private String message;

	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOffice> postOffice;

}
 