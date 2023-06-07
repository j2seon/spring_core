package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {

	public static void main(String[] args) {
		/* ComponentScan이란?
		 * base-package로 설정된 경로 하위에 특정 어노테이션을 가지고 있는 클래스를 bean으로 드록
		 * @Component 어노테이션이 작성된 클래스를 인식하며 bean으로 만들게 되며, 특수목적에 따라
		 * 세부기능을 제공하는 @Controller, @Repository, @Service, @Configuration을 인식한다.
		 * */
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.javaconfig");
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		MemberRepository repository = context.getBean(MemberRepository.class);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.save(new MemberDTO(3,"user03","pass03","new")));
	}
}
