package com.greedy.section01.singleton.javaconfig.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.greedy.section01.singleton.javaconfig.Beverage;
import com.greedy.section01.singleton.javaconfig.Bread;
import com.greedy.section01.singleton.javaconfig.Product;
import com.greedy.section01.singleton.javaconfig.ShoppingCart;

@Configuration
@ComponentScan("com.greedy.section01.singleton.javaconfig")
public class ContextConfiguration {

	@Bean
	public Product carpBread() {
		return new Bread("ºØ¾î»§",1000, new Date());	
	}
	
	@Bean 
	public Product milk() {
		return new Beverage("µþ±â¿ìÀ¯", 1500, 500);
	}
	
	@Bean 
	public Product water() {
		return new Beverage("Áö¸®»ê¾Ï¹Ý¼ö", 3000, 500);
	}
	
	@Bean
	@Scope("singleton")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
}
