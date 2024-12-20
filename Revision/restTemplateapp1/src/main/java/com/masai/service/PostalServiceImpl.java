package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masai.output.PostOfficeResponse;

@Service
public class PostalServiceImpl implements PostalService{
	
	@Autowired
   private RestTemplate restTemplate;

	@Override
	public PostOfficeResponse findPostOfficeByCity(String city) {
		String url = "https://api.postalpincode.in/postoffice/{city}";
		url = url.replace("{city}",city);
		ResponseEntity<PostOfficeResponse[]> postOfficeArray = 
				restTemplate.getForEntity(url,PostOfficeResponse[].class);
		
		return postOfficeArray.getBody()[0];
	}

}
