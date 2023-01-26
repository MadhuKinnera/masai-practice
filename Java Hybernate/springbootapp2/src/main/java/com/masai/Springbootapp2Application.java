package com.masai;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masai.model.Book;

@SpringBootApplication
public class Springbootapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootapp2Application.class, args);
		

	}

}
