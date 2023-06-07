package com.greedy.section02.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	
	/* init-method�� ���� ������̼� */
	@PostConstruct
	public void openShop() {
		System.out.println("������� ���Թ��� �����ϼ̽��ϴ�. ���� ������ �Ͻ� �� �ֽ��ϴ�.");
	}
	
	/* destroy-method�� ���� ���� ������̼� */
	@PreDestroy
	public void closeShop() {
		System.out.println("������� �������� �ݾҽ��ϴ�. ���� ������ �Ͻ� �� �����ϴ�.");
	}

	
	
}
