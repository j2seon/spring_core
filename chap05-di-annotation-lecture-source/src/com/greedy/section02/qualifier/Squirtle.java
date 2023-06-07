package com.greedy.section02.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Squirtle implements Pokemon{

	@Override
	public void attack() {
		System.out.println("꼬부기가 공격을 합니다.");
	}

}
