package com.greedy.section01.properties.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.properties.javaconfig.config.ContextConfiguration;


public class Application {
	
	public static void main(String[] args) {
	
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		

		String[] beanNames = context.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		
		cart1.addItem(carpBread);
		cart1.addItem(milk);
		System.out.println(cart1.getItems());
		
		ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
		cart2.addItem(water);
		
		System.out.println("cart2에 담긴 내용 : " + cart2.getItems());
		
		System.out.println("cart1의 hashCode : " + cart1.hashCode());
		System.out.println("cart2의 hashCode : " + cart2.hashCode());


		
	}

}
