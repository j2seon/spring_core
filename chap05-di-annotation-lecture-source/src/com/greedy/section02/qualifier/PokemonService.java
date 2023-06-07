package com.greedy.section02.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	/* @Qualifier 어노테이션으로 의존성 주입을 하는 경우 타입이 아닌 이름으로 주입
	 * @Primary 보다 더 우선권을 가진다.
	 * 
	 * */
	
	//필드주입
	//@Qualifier("pikachu")
	private final Pokemon pokemon;

	//생성자주입
	public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
	

}
