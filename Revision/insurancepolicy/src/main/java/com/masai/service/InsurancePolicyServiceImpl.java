package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.InsurancePolicyException;
import com.masai.model.InsurancePolicy;
import com.masai.repository.InsurancePolicyRepo;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService{

	@Autowired
	InsurancePolicyRepo ipr;
	
	@Override
	public InsurancePolicy addInsurancePolicy(InsurancePolicy ip) throws InsurancePolicyException {
		 InsurancePolicy i =  ipr.save(ip);
		 if(i==null) throw new InsurancePolicyException("Duplicate Id Found ");
		 return i;
	}

	@Override
	public List<InsurancePolicy> getAllInsurancePolicies() throws InsurancePolicyException {
		List<InsurancePolicy> list = ipr.findAll();
		if(list.isEmpty()) throw new InsurancePolicyException("List Empty ");
		return list;
	}

	@Override
	public InsurancePolicy getInsurancePolicyById(Long id) throws InsurancePolicyException {
	Optional<InsurancePolicy> opt= ipr.findById(id);
	if(opt.isEmpty()) throw new InsurancePolicyException("Policy Not Found ");
	return opt.get();
	}

}
