package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.repository.DriverRepo;

@Service
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	private DriverRepo dRepo;

	@Override
	public Driver registerDriver(Driver driver) throws DriverException {
		return dRepo.save(driver);
	}

}
