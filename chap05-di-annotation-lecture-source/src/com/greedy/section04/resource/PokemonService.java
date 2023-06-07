package com.greedy.section04.resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	
	//1. 같은 타입의 bean이 여러개 
	
//	@Resource(name="pikachu")
//	private Pokemon pokemon;
//	
//	public void pokemonAttack() {
//		pokemon.attack();
//
//	}
	
	//2. 같은 타입의 bean이 한개
	
//	@Resource
	private Pokemon pokemon;
	
	
//	@Resource // 생성자 주입을 사용하지 못한다 (애초에 에러가 발생)
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void pokemonAttack() {
		pokemon.attack();
	}
}
