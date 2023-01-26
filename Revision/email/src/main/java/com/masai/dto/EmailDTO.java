package com.masai.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmailDTO {
	private Integer mail_id;
	private String email;
	private LocalDate created_date;
	private Integer id; 
	private String name;
    private String phoneNo;
	private String dateOfBirth;

}
