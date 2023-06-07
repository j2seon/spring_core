package com.greedy.section01.javaconfig;

public interface Account {
	
	// 조회
	String getBalance();
	
	// 입금
	String desposit(int money);
	
	// 출금
	String withDrwa(int money);
	
}
