package com.greedy.section03.setterinjection.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeRandomString {
	
	/* ������ ������ ����
	 * 1. �ʵ� ������ �����ϱ� ������ ���� å���� ��Ģ �������� ���� �ʵ�� ������ ����� ���Թ��� �� �ִ�.
	 * 	  ������ ������ ������ �ϰ� �Ǹ� �������� �Ű������� �������鼭 �̰� �ƴѵ���� ������ �ް� �����丵�� �� �� �ִ� ��ǥ�� �� �� �ִ�,.
	 * 2. �ʵ忡 final Ű���� ����� ����������. ���� ����Ұ����ϰ� ����� �� �ִ�.
	 * 3. ��ȯ���� ����(�ʵ� �����̳� ���� ������ ��� �޼ҵ� ���� �������� �߻��� �� ������, ������ ������ �ϸ� ���ø����̼� ��������� Ȯ���� �����ϴ�.)
	 * 4. DI�����̳ʿ� ���յ��� ���� ������ �׽�Ʈ�ϱ� ����(������ �����̳� ���� �׽�Ʈ �� �� �ִ�.)
	 * */
	
	private RandomGenerator generator;
	
	@Autowired
	public void setGenerator(RandomGenerator generator) {
		this.generator = generator;
	}

	public String getRandomLengthString() {
		
		StringBuilder sb = new StringBuilder();
		
		int randomNumber = generator.randomGenerate();
		
		for (int i = generator.getStartNum(); i <= randomNumber; i++) {
			sb.append("*");
		}
		return sb.toString();
	}
	
	
	
}
