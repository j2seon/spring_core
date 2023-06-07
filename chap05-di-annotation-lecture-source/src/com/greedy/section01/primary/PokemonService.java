package com.greedy.section01.primary;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	private final Pokemon pokemon;

	public PokemonService(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
	

}
