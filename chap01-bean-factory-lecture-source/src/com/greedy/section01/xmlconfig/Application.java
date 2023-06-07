package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		
		/* 스프링 컨테이너의 최상의 컨테이너 이며 ApplicationContext와 함께 스프링 컨테이너라고한다.
		 * Bean의 생성과 설정, 관리등의 역할을 맡고있다.
		 * */
		
		/* GenericXmlApplicationContex는 xml설정 메타정보룰 읽어와서 BeanFactory를 동작시킨다.
		 * GenericXmlApplicationContex는 설정 메타정보가 담긴 xml 파일의 경로를 클래스 패스 하위의 경로를
		 * 전부 기술해야 설정파일을 읽어온다.
		 * */
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/spring-context.xml");
		
		/* context를 생성할 시 설정정보를 읽어 왔기 때문에 컨테이너는 우리가 bean으로 등록한 인스턴스를 컨테이너 라이프 사이클이 유지되는 동안 유지하고 있다.
		 * 이때 보관하는 bean을 꺼내서 사용할 때 getBean()메소드를 이용할 수 있다.
		 * getBean()메소드는 타입, id를 이용해서 bean을 꺼내올 수 있는 다양한 기능을 오버로딩한다. 
		 * */
		
		/* 1. bean의 id를 이용해 bean을 가져오는 방법
		 * id를 이용하는 경우 bean의 정확한 type을 유추할 수 없기 때문에 Object타입으로 반환하므로 다운캐스팅을 해야함.
		 * */
		
		MemberDTO member = (MemberDTO) context.getBean("member");
		
		/* 2. bean의 클래스 메타정보를 전달하여 가져오는 방법*/
		MemberDTO member2 = context.getBean(MemberDTO.class);
		
		/* 3. bean의 id와 클래스 메타정보를 전달하여 가져오는 방법
		 * */
		MemberDTO member3 = context.getBean("member", MemberDTO.class);
		System.out.println(member);
		
	}

}
