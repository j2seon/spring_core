package com.greedy.section05.inject;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	/* @Inject는 @Autowired와 유사하게 타입을 이용해서 빈을 자동연결한다.
	 * 마찬가지로 bean이 여러개면 모호성으로 인해 의존성 주입을 할 수 없다.
	 * 다만 컬렉션 형태로 변경하면 가능하다.
	 * */
	
	/* 1. 필드 주입*/
//	@Inject
//	@Named("pikachu")
//	@Qualifier("pikachu") // import할때 스프링용으로 적용
	private Pokemon pokemon;

	/* 2. 생성자 주입 */
//	@Inject
//	@Named("pikachu")
//	public PokemonService( Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}

	//파라미터레벨에서 사용가능
//	@Inject
//	public PokemonService(@Named("pikachu") Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	/* 3. 세터주입 */
//	@Inject
//	@Named("charmander")
//	public void setPokemon(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	//파라미터레벨에서 사용가능
	@Inject
	public void setPokemon(@Named("charmander")Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
