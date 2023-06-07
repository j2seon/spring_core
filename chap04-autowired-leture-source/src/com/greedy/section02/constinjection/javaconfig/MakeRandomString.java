package com.greedy.section02.constinjection.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeRandomString {
	
	/* 생성자 주입의 장점
	 * 1. 필드 주입이 간단하긴 하지만 단일 책임의 원칙 관점에서 볼때 필드는 수많은 빈들을 주입받을 수 있다.
	 * 	  하지만 생성자 주입을 하게 되면 생성자의 매개변수가 많아지면서 이게 아닌데라는 느낌을 받고 리팩토링을 할 수 있는 지표가 될 수 있다,.
	 * 2. 필드에 final 키워드 사용이 가능해진다. 따라서 변경불가능하게 사용할 수 있다.
	 * 3. 순환참조 방지(필드 주입이나 세터 주입의 경우 메소드 실행 시점에만 발생할 수 있지만, 생성자 주입을 하면 애플리케이션 실행시점에 확인이 가능하다.)
	 * 4. DI컨테이너와 결합도가 낮기 때문에 테스트하기 좋다(스프링 컨테이너 없이 테스트 할 수 있다.)
	 * */
	
	
	private final RandomGenerator generator;

	@Autowired
	public MakeRandomString(RandomGenerator generator) {
		/* @Autowired는 스프링 4.3 이후부터는 생성자에 주입할 시 생성자가 한개 뿐이라면 
		 * 해당 생성자에 @Autowired 어노테이션을 생략해도 자동으로 주입해준다.
		 * @Autowired는 타입으로 일치하는 빈을 우선적으로 적용하기 때문에 이름이 달라져도 상관없다.
		 * */
		
		this.generator = generator;
		
		/* 하지만 위에처럼 기본생성자를 추가하고 어노테이션을 생략했을 시에는 에러가 발생하게된다.
		 * 생성자를 통해 필드에 객체가 주입되지 않았기 때문에 nullPointException
		 * */
		
	}
	
	public String getRandomLengthString() {
		
		StringBuilder sb = new StringBuilder();
		
		int randomNumber = generator.randomGenerate();
		
		for (int i = generator.getStartNum(); i <= randomNumber; i++) {
			sb.append("*");
		}
		return sb.toString();
	}
	
	
	
}
