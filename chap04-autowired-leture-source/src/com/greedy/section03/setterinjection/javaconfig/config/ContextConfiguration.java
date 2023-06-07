package com.greedy.section03.setterinjection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greedy.section03.setterinjection.javaconfig.RandomGenerator;
import com.greedy.section03.setterinjection.javaconfig.RandomNumberGenrator;


@Configuration
@ComponentScan(basePackages = "com.greedy.section03.setterinjection.javaconfig")
public class ContextConfiguration {
	
	@Bean
	public RandomGenerator generator() {
		return new RandomNumberGenrator(1,10);
	}
	
}
