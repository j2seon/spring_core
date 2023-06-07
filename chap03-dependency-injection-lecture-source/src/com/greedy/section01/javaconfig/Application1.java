package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration1;


public class Application1 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		

		String[] beanNames = context.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		/* �������� bean�� ��ȣ�ۿ�
		 * 
		 * association ����(1:1)
		 * �� �� ȸ���� �ϳ��� ���������� ������ �ִ� ��� 
		 * */
		
		MemberDTO member = context.getBean(MemberDTO.class);
		
		System.out.println(member);
		
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().desposit(1000000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().withDrwa(300000));
		System.out.println(member.getPersonalAccount().getBalance());

		

	}
	
}
