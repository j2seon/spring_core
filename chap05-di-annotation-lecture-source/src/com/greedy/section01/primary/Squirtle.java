package com.greedy.section01.primary;

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
