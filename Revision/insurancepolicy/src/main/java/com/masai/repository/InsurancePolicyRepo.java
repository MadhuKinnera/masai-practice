package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.InsurancePolicy;

public interface InsurancePolicyRepo extends JpaRepository<InsurancePolicy, Long> {

}
