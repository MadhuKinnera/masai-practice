package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mail_id;
	private String email;
	private LocalDate created_date;

	@JsonIgnore
	@OneToOne
	private User user;
	

}
