package com.greedy.section01.singleton.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.singleton.javaconfig.config.ContextConfiguration;

public class Application {
	
	
	public static void main(String[] args) {

		/* ���� �� ������ singleton���� �����Ǿ� �ִ�. (�⺻��)
		 * 
		 * singleton�� IoC �����̳� �� �� �ν��Ͻ� �ϳ��� �����Ѵ�.
		 * 
		 * �������� �� ������
		 * singleton      IoC �����̳� �� �� �ν��Ͻ� �ϳ��� �����Ѵ�.
		 * prototype ��û�Ҷ����� �� �ν��Ͻ��� ���� �����.
		 * request HTTP ��û�� �ϳ��� �� �ν��Ͻ��� �����Ѵ�. �� ���ø����̼� ���ؽ�Ʈ���� �ش�
		 * session HTTP ���Ǵ� �� �ν��Ͻ� �ϳ��� �����Ѵ�. �� ���ø����̼� ���ؽ�Ʈ���� �ش�
		 * globalSession ���� HTTP ���Ǵ� �� �ν��Ͻ� �ϳ��� �����Ѵ�.
		 * 
		 * */
		
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
		
		System.out.println("cart2�� ��� ���� : " + cart2.getItems());
		
		System.out.println("cart1�� hashCode : " + cart1.hashCode());
		System.out.println("cart2�� hashCode : " + cart2.hashCode());


		
	}

}
