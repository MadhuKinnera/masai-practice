package com.masai.service;

import com.masai.output.PostOfficeResponse;

public interface PostalService {
	
	PostOfficeResponse findPostOfficeByCity(String city);

}
