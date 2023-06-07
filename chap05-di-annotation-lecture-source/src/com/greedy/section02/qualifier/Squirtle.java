package com.greedy.section02.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Squirtle implements Pokemon{

	@Override
	public void attack() {
		System.out.println("���αⰡ ������ �մϴ�.");
	}

}
