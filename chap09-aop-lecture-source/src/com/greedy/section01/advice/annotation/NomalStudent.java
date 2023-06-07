package com.greedy.section01.advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class NomalStudent implements Student{

	@Override
	public AchievementResult study(Passion passion) {
		
		if(passion.getScore() <= 0) {
			throw new RuntimeException("열정이 부족합니다 열정을 가지고 오세요");
		}
		
		int understandingScore = 0;
		int satisfactionScore = 0;
		int employeementRate = 0;
		
		int passionScore = passion.getScore(); //열정점수
		 
		int difficulty = 5; // 난이도 
		
		for (int i = 0; i <= 8; i++) {
			System.out.println(i + "교시 수업을 열심히 듣습니다. 오 프로그래밍이 뭔지 알 것같습니다.");
			System.out.println("이해도와 만족도가 열정에 비례하여 올라갑니다.");
			understandingScore += difficulty + passionScore;
			satisfactionScore += difficulty + passionScore;
			System.out.println("하지만 신기하게도 취업률을 생각보다 오르지 않습니다. 취업난이 심각");
			
			employeementRate += difficulty + passionScore;
			
			if(i ==4) {
				System.out.println("밥을 먹습니다 스트레스 풀림");
				
				understandingScore /= 2;
				satisfactionScore *= 2;
				employeementRate /= 2;
			}
		}
		
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

	
}
