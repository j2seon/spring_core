package com.greedy.section01.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Pikachu implements Pokemon{

	@Override
	public void attack() {
		System.out.println("��ī�� ������ �մϴ�.");
		
	}
	
	
}
