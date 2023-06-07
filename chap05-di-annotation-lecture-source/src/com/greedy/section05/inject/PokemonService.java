package com.greedy.section05.inject;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	/* @Inject�� @Autowired�� �����ϰ� Ÿ���� �̿��ؼ� ���� �ڵ������Ѵ�.
	 * ���������� bean�� �������� ��ȣ������ ���� ������ ������ �� �� ����.
	 * �ٸ� �÷��� ���·� �����ϸ� �����ϴ�.
	 * */
	
	/* 1. �ʵ� ����*/
//	@Inject
//	@Named("pikachu")
//	@Qualifier("pikachu") // import�Ҷ� ������������ ����
	private Pokemon pokemon;

	/* 2. ������ ���� */
//	@Inject
//	@Named("pikachu")
//	public PokemonService( Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}

	//�Ķ���ͷ������� ��밡��
//	@Inject
//	public PokemonService(@Named("pikachu") Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	/* 3. �������� */
//	@Inject
//	@Named("charmander")
//	public void setPokemon(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	//�Ķ���ͷ������� ��밡��
	@Inject
	public void setPokemon(@Named("charmander")Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
