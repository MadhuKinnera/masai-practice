package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InsurancePolicyException;
import com.masai.model.InsurancePolicy;
import com.masai.service.InsurancePolicyService;

import jakarta.validation.Valid;

@RestController
public class InsurancePolicyController {
	@Autowired
	private InsurancePolicyService ips;
	
	@GetMapping("/")
	public String hello() {
		return "Hi Madhu ";
	}
	
	@PostMapping("/ip")
	public ResponseEntity<InsurancePolicy> addInsurancePolicyHandler(@RequestBody @Valid InsurancePolicy ip) throws InsurancePolicyException{
		return new ResponseEntity<InsurancePolicy>(ips.addInsurancePolicy(ip),HttpStatus.OK);
	}
	
	@GetMapping("/ip")
	public ResponseEntity<List<InsurancePolicy>> getAllInsurancePoliciesHandler() throws InsurancePolicyException{
		return new ResponseEntity<List<InsurancePolicy>>(ips.getAllInsurancePolicies(),HttpStatus.OK);
	}
	
	
	@GetMapping("/ip/{id}")
	public ResponseEntity<InsurancePolicy> getInsurancePolicyByIdHandler(@PathVariable Long id) throws InsurancePolicyException{
		return new ResponseEntity<InsurancePolicy>(ips.getInsurancePolicyById(id),HttpStatus.OK);
	}
	
	

}
