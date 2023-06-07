package com.greedy.section02.constinjection.javaconfig;

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
	
	
	private final RandomGenerator generator;

	@Autowired
	public MakeRandomString(RandomGenerator generator) {
		/* @Autowired�� ������ 4.3 ���ĺ��ʹ� �����ڿ� ������ �� �����ڰ� �Ѱ� ���̶�� 
		 * �ش� �����ڿ� @Autowired ������̼��� �����ص� �ڵ����� �������ش�.
		 * @Autowired�� Ÿ������ ��ġ�ϴ� ���� �켱������ �����ϱ� ������ �̸��� �޶����� �������.
		 * */
		
		this.generator = generator;
		
		/* ������ ����ó�� �⺻�����ڸ� �߰��ϰ� ������̼��� �������� �ÿ��� ������ �߻��ϰԵȴ�.
		 * �����ڸ� ���� �ʵ忡 ��ü�� ���Ե��� �ʾұ� ������ nullPointException
		 * */
		
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
