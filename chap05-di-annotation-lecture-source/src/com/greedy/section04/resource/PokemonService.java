package com.greedy.section04.resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	
	//1. ���� Ÿ���� bean�� ������ 
	
//	@Resource(name="pikachu")
//	private Pokemon pokemon;
//	
//	public void pokemonAttack() {
//		pokemon.attack();
//
//	}
	
	//2. ���� Ÿ���� bean�� �Ѱ�
	
//	@Resource
	private Pokemon pokemon;
	
	
//	@Resource // ������ ������ ������� ���Ѵ� (���ʿ� ������ �߻�)
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
