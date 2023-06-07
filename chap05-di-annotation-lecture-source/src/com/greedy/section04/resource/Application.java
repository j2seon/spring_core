package com.greedy.section04.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* 스프링 전용인 @Autowired 대신 자바 표준 어노테이션 @Resource로 POJO 연결
		 * 
		 * 스프링이 @Autowired를 처음 선보이고 얼마지나지 않아 자바진영에도 동일한 기능의 
		 * 어노테이션을 여러개 표준화했다.
		 * @Resource @Inject @named
		 * 
		 * */
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.greedy.section04.resource");
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
		
	}
}

