package com.greedy.section03.collection;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

	@Override
	public void attack() {
		System.out.println("���̸��� ������ �մϴ�! �޾ƶ� ��~~~ǡ�̾�~~~~");
	}

}