package com.greedy.section03.collection;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	/* 1. List타입으로 주입받기 */
	/* List타입으로 하나의 타입인 빈들을 한번에 주입할 수 있다.
	 * 순서는 bean의 클래스명 영어 알파벳 사전순이다.
	 * */
//	private List<Pokemon> pokemonList;
//	
//	public PokemonService(List<Pokemon> pokemonList) {
//		this.pokemonList = pokemonList;
//	}
//	public void pokemonAttack() {
//		for(Pokemon pokemon : pokemonList) {
//			pokemon.attack();
//		}
//	}
	/* 2. Map 타입으로 주입받기 */
	
	private Map<String, Pokemon> pokemonMap;
	
	public PokemonService(Map<String, Pokemon> pokemonMap) {
		this.pokemonMap = pokemonMap;
	}
	
	public void pokemonAttack() {
		
//		Iterator<String> iter = pokemonMap.keySet().iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		pokemonMap.values().stream().forEach(Pokemon::attack);
		
	}

	
}
