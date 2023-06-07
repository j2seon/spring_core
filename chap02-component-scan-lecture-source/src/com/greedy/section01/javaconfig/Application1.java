package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {

	public static void main(String[] args) {
		/* ComponentScan�̶�?
		 * base-package�� ������ ��� ������ Ư�� ������̼��� ������ �ִ� Ŭ������ bean���� ���
		 * @Component ������̼��� �ۼ��� Ŭ������ �ν��ϸ� bean���� ����� �Ǹ�, Ư�������� ����
		 * ���α���� �����ϴ� @Controller, @Repository, @Service, @Configuration�� �ν��Ѵ�.
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
