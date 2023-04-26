package com.tutorial.apidemo.Spring.Boot.tutorial.database;

import java.lang.System.Logger;


import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.apidemo.Spring.Boot.tutorial.models.Product;
import com.tutorial.apidemo.Spring.Boot.tutorial.repositories.ProductRepository;

@Configuration
public class Database {
	// logger
	private static final org.slf4j.Logger logger =  LoggerFactory.getLogger(Database.class);
	
	@Bean
	CommandLineRunner initDatabase(ProductRepository productRepository) {	
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Product productA = new Product("Macbook pro 16 inch", 2020, 2400.0, "");
				Product productB = new Product("Samsung Galaxy S9", 2020, 2400.0, "");
				((org.slf4j.Logger) logger).info("insert data: " + productRepository.save(productA));
				((org.slf4j.Logger) logger).info("insert data: " + productRepository.save(productB));
			}
		};
	}
	
}
