package com.masai.model;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InsurancePolicy {
	
	@Id
	@GeneratedValue
	private Long ID;
  //  @Length(min = 11 ,max = 12,message = "Policy number must be length of 11")
	private Long PolicyNo;
    @Future
	private LocalDateTime ExpiryDate;
	private Double MonthlyPremium;;
	private String CustomerName;
	private String CustomerAddress;
	private Long MobileNumber;
	@Min(18)
	@Max(60)
	private Integer CustomerAge;
	@Email
	private String EmailAddress;
	
}
