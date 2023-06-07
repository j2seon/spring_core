package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		
		/* ������ �����̳��� �ֻ��� �����̳� �̸� ApplicationContext�� �Բ� ������ �����̳ʶ���Ѵ�.
		 * Bean�� ������ ����, �������� ������ �ð��ִ�.
		 * */
		
		/* GenericXmlApplicationContex�� xml���� ��Ÿ������ �о�ͼ� BeanFactory�� ���۽�Ų��.
		 * GenericXmlApplicationContex�� ���� ��Ÿ������ ��� xml ������ ��θ� Ŭ���� �н� ������ ��θ�
		 * ���� ����ؾ� ���������� �о�´�.
		 * */
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/spring-context.xml");
		
		/* context�� ������ �� ���������� �о� �Ա� ������ �����̳ʴ� �츮�� bean���� ����� �ν��Ͻ��� �����̳� ������ ����Ŭ�� �����Ǵ� ���� �����ϰ� �ִ�.
		 * �̶� �����ϴ� bean�� ������ ����� �� getBean()�޼ҵ带 �̿��� �� �ִ�.
		 * getBean()�޼ҵ�� Ÿ��, id�� �̿��ؼ� bean�� ������ �� �ִ� �پ��� ����� �����ε��Ѵ�. 
		 * */
		
		/* 1. bean�� id�� �̿��� bean�� �������� ���
		 * id�� �̿��ϴ� ��� bean�� ��Ȯ�� type�� ������ �� ���� ������ ObjectŸ������ ��ȯ�ϹǷ� �ٿ�ĳ������ �ؾ���.
		 * */
		
		MemberDTO member = (MemberDTO) context.getBean("member");
		
		/* 2. bean�� Ŭ���� ��Ÿ������ �����Ͽ� �������� ���*/
		MemberDTO member2 = context.getBean(MemberDTO.class);
		
		/* 3. bean�� id�� Ŭ���� ��Ÿ������ �����Ͽ� �������� ���
		 * */
		MemberDTO member3 = context.getBean("member", MemberDTO.class);
		System.out.println(member);
		
	}

}
