package com.greedy.section02.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	
	/* init-method와 같은 어노테이션 */
	@PostConstruct
	public void openShop() {
		System.out.println("사장님이 가게문을 오픈하셨습니다. 이제 쇼핑을 하실 수 있습니다.");
	}
	
	/* destroy-method와 같은 설정 어노테이션 */
	@PreDestroy
	public void closeShop() {
		System.out.println("사장님이 가제문을 닫았습니다. 이제 쇼핑을 하실 수 없습니다.");
	}

	
	
}
