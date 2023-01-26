package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Session {
	@Id
	@Column(unique = true)
	private Integer userid;
	private String uuid;
	private LocalDateTime time;
	

}
