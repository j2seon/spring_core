package com.greedy.section02.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon{

	@Override
	public void attack() {
		System.out.println("���̸��� ������ �մϴ�.");
	}
	
	

	
	
}
