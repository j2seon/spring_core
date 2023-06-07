package com.greedy.section03.setterinjection.javaconfig;


public class RandomNumberGenrator implements RandomGenerator {

	private int startNum;
	private int endNum;
	
	public RandomNumberGenrator(int startNum, int endNum) {
		if(startNum >= endNum) {
			throw new RuntimeException("���۰��� ���ᰪ���� Ŭ �� �����ϴ�");
		}
		
		if(startNum <=0 && endNum <=0){
			throw new RuntimeException("���� ������ �Է����ּ���");
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
