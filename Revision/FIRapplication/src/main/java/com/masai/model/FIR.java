package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class FIR {
	
	@Id
	@GeneratedValue
	private Integer fid;
	private String crimeDetail;
	private LocalDateTime timestamp;
	private String policeStation;
	
	@JsonIgnore
	@ManyToOne
	private User user;

}
