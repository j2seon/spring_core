package com.greedy.section03.setterinjection.javaconfig;

public interface RandomGenerator {

	/* 난수 발생시키는 메소드 */
	
	int randomGenerate();
	
	public int getStartNum();
	
	public int getEndNum();

}
