package com.greedy.section01.javaconfig.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.greedy.section02.annotation.Beverage;
import com.greedy.section02.annotation.Bread;
import com.greedy.section02.annotation.Owner;
import com.greedy.section02.annotation.Product;
import com.greedy.section02.annotation.ShoppingCart;

@Configuration
public class ContextConfiguration {
	
	@Bean
	public Product carpBread() {
		return new Bread("ºØ¾î»§", 1000, new Date());	
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
	@Scope("prototype")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
	
	@Bean(initMethod = "openShop", destroyMethod = "closeShop") 
	public Owner owner() {
		return new Owner();
	}
}
