package com.greedy.section04.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* ������ ������ @Autowired ��� �ڹ� ǥ�� ������̼� @Resource�� POJO ����
		 * 
		 * �������� @Autowired�� ó�� �����̰� �������� �ʾ� �ڹ��������� ������ ����� 
		 * ������̼��� ������ ǥ��ȭ�ߴ�.
		 * @Resource @Inject @named
		 * 
		 * */
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.greedy.section04.resource");
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
		
	}
}

