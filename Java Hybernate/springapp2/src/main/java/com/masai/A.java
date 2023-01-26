package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@PropertySource("a1.properties")
@Service
public class A {
	
	
	@Autowired
	private Environment env ;
	
	@Bean("clist")
	public List<String> getCities(){
		List<String> cities = new ArrayList<>();
		System.out.println("In getCities Method ");
		
		
		System.out.println(env.getProperty("city1"));
		
		cities.add(env.getProperty("city1"));
		cities.add(env.getProperty("city2"));
		cities.add(env.getProperty("city3"));
		cities.add(env.getProperty("city4"));
		cities.add(env.getProperty("city5"));
	
		
		return cities;
		
		
	}

}
