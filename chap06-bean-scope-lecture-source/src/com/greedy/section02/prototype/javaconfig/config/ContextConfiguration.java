package com.greedy.section02.prototype.javaconfig.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.greedy.section02.prototype.javaconfig.Beverage;
import com.greedy.section02.prototype.javaconfig.Bread;
import com.greedy.section02.prototype.javaconfig.Product;
import com.greedy.section02.prototype.javaconfig.ShoppingCart;


@Configuration
public class ContextConfiguration {

	@Bean
	public Product carpBread() {
		return new Bread("�ؾ", 1000, new Date());	
	}
	
	@Bean 
	public Product milk() {
		return new Beverage("�������", 1500, 500);
	}
	
	@Bean 
	public Product water() {
		return new Beverage("������Ϲݼ�", 3000, 500);
	}
	
	@Bean
	@Scope("prototype")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
}
