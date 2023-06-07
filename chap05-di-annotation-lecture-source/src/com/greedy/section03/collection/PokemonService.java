package com.greedy.section03.collection;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	/* 1. ListŸ������ ���Թޱ� */
	/* ListŸ������ �ϳ��� Ÿ���� ����� �ѹ��� ������ �� �ִ�.
	 * ������ bean�� Ŭ������ ���� ���ĺ� �������̴�.
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
	/* 2. Map Ÿ������ ���Թޱ� */
	
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
