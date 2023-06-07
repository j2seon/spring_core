package com.greedy.section02.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {
	
	/* @Qualifier ������̼����� ������ ������ �ϴ� ��� Ÿ���� �ƴ� �̸����� ����
	 * @Primary ���� �� �켱���� ������.
	 * 
	 * */
	
	//�ʵ�����
	//@Qualifier("pikachu")
	private final Pokemon pokemon;

	//����������
	public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
	

}
