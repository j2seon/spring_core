package com.greedy.section01.fieldinjection.javaconfig;

import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) {
		
		/* @Autowired�� �̿��� ������ ����
		 * ������ 3.1 ���� �������� ������̼��� �̿��� bean ���� �� ������ ������ ���� ������̼��� �����Ѵ�.
		 * ������̼� ����� �̿��ϸ� ������ ���԰� setter���Կܿ� �ʵ� ������ �߰������� �� �� �ִ�.
		 * */

		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.fieldinjection.javaconfig");
	
		String[] beanNames = context.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		BookService bookService = context.getBean(BookService.class);
		
		for (BookDTO bList : bookService.selectAllbooks()) {
			System.out.println(bList);
		}
		
		
		BookDTO book = bookService.selectBook(3).orElseThrow(()-> new RuntimeException("�ش� å�� �����ϴ�."));
		
		System.out.println(book);
	}

}
