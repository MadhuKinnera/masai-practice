package com.masai.service;

import java.util.List;

import com.masai.exception.InsurancePolicyException;
import com.masai.model.InsurancePolicy;

public interface InsurancePolicyService {
	
	InsurancePolicy addInsurancePolicy(InsurancePolicy ip) throws InsurancePolicyException;
	
	List<InsurancePolicy> getAllInsurancePolicies()throws InsurancePolicyException;
	
	InsurancePolicy getInsurancePolicyById(Long id)throws InsurancePolicyException;

}
