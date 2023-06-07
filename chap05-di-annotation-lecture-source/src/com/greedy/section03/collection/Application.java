package com.greedy.section03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) {
		
		/* �� ���� �� ��� ����ؾ� �ϴ� ��� 
		 * ==> �̶��� ������ ������ ���� �ʵ��� Ÿ���� �����ؾ��Ѵ�.
		 * */
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.greedy.section03.collection");
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
	}
}
