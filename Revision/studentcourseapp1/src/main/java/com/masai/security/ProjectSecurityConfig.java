package com.masai.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	
	@Bean
	public SecurityFilterChain collegeSecurityConfig(HttpSecurity http) throws Exception {
		
	     http.authorizeHttpRequests(
	    		 (auth)->auth.antMatchers("/students","/students/add").hasAuthority("user")
                 .antMatchers("/courses").hasAuthority("admin")
	    		 ).httpBasic();
		
		return http.build();
		
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetails() {
	
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
	  UserDetails admin = User.withUsername("admin").password("1234").authorities("admin").build();
	    UserDetails user = User.withUsername("user").password("1234").authorities("user").build();
	    userDetailsService.createUser(admin);
	    userDetailsService.createUser(user);
	    return userDetailsService;
	}

	 @Bean
	 public PasswordEncoder passwordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	 }

}
