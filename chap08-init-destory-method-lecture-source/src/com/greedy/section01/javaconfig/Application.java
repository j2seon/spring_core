package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration;



public class Application {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
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

		((AnnotationConfigApplicationContext)context).close();
	}

}
