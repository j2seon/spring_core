package com.greedy.section02.constinjection.javaconfig;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	
	private final TestService service;

	public TestController(TestService service) {
		this.service = service;
	}

}
