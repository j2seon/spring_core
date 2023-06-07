package com.greedy.section03.setterinjection.javaconfig;


public class RandomNumberGenrator implements RandomGenerator {

	private int startNum;
	private int endNum;
	
	public RandomNumberGenrator(int startNum, int endNum) {
		if(startNum >= endNum) {
			throw new RuntimeException("시작값이 종료값보다 클 수 없습니다");
		}
		
		if(startNum <=0 && endNum <=0){
			throw new RuntimeException("양의 정수만 입력해주세요");
		}
		
		this.startNum = startNum;
		this.endNum = endNum;
	}

	@Override
	public int randomGenerate() {
		return (int) (Math.random() * (endNum - startNum + 1)) + startNum;
	}

	@Override
	public int getStartNum() {
		
		return startNum;
	}

	@Override
	public int getEndNum() {
		
		return endNum;
	}
	
}
