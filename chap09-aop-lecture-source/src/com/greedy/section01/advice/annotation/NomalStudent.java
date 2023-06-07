package com.greedy.section01.advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class NomalStudent implements Student{

	@Override
	public AchievementResult study(Passion passion) {
		
		if(passion.getScore() <= 0) {
			throw new RuntimeException("������ �����մϴ� ������ ������ ������");
		}
		
		int understandingScore = 0;
		int satisfactionScore = 0;
		int employeementRate = 0;
		
		int passionScore = passion.getScore(); //��������
		 
		int difficulty = 5; // ���̵� 
		
		for (int i = 0; i <= 8; i++) {
			System.out.println(i + "���� ������ ������ ����ϴ�. �� ���α׷����� ���� �� �Ͱ����ϴ�.");
			System.out.println("���ص��� �������� ������ ����Ͽ� �ö󰩴ϴ�.");
			understandingScore += difficulty + passionScore;
			satisfactionScore += difficulty + passionScore;
			System.out.println("������ �ű��ϰԵ� ������� �������� ������ �ʽ��ϴ�. ������� �ɰ�");
			
			employeementRate += difficulty + passionScore;
			
			if(i ==4) {
				System.out.println("���� �Խ��ϴ� ��Ʈ���� Ǯ��");
				
				understandingScore /= 2;
				satisfactionScore *= 2;
				employeementRate /= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

	
}
