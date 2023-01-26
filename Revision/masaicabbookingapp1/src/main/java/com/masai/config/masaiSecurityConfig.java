package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class masaiSecurityConfig {

	@Bean
	public SecurityFilterChain userSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((auth)-> auth
				.antMatchers("masaicab/user/login")
				.hasAuthority("user"))
		        .csrf().disable()
		        .httpBasic();
				
				return http.build();
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return  NoOpPasswordEncoder.getInstance();
	}
	
}
