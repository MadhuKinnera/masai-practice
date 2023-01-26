package com.masai.service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.FIRRegDTO;

public interface FIRService {
	FIR createFIR(String username, FIRRegDTO fir)throws FIRException,UserException;
}
