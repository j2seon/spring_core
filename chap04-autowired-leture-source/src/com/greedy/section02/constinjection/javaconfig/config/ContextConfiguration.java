
package com.greedy.section02.constinjection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greedy.section02.constinjection.javaconfig.RandomGenerator;
import com.greedy.section02.constinjection.javaconfig.RandomNumberGenrator;

@Configuration
@ComponentScan(basePackages = "com.greedy.section02.constinjection.javaconfig")
public class ContextConfiguration {
	
	@Bean
	public RandomGenerator generator() {
		return new RandomNumberGenrator(1, 10);
	}
	
//	@Bean
//	public MakeRandomString makeRandomString() {
//		return new MakeRandomString(generator());
//	}

}
