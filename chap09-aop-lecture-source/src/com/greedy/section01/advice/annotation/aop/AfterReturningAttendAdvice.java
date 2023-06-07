package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.AchievementResult;

@Aspect
@Component
public class AfterReturningAttendAdvice {
	
	/* returning 속성은 리턴 값으로 받아올 오브젝트의 매개변수 이름과 동일해야하며,
	 * JoinPoint는 반드시 첫 번째 매개 변수로 선언해야한다. 
	 * */
	@AfterReturning(pointcut = "execution(* com.greedy.section01.advice.annotation..*(..))", returning = "result")
	public void afterReturningAttending(JoinPoint joinPoint, Object result) {
		
		/* 조인포인트로 처리할 수 있는 정보는 동일하며, after advice보다 먼저 동작한다. */
		System.out.println("==============after returning attending");
		System.out.println("보람찬 하루일을 끝마지고서 두다리 쭉펴면 고향의 안방");
		System.out.println("오늘의 이해도 : " + ((AchievementResult) result).getUnderstandingScore());
		System.out.println("오늘의 만족도 : " + ((AchievementResult) result).getSatisfactionScore());
		
		/* 취업률 수치를 백분율로 환산해서 퍼센트로 환산 1000점 만점 */
		double employeementRate = ((AchievementResult) result).getEmployeementRate();
		double percent = employeementRate / 1000.0 * 100;
		System.out.println(percent + "%");
		
		System.out.println("===========================================");
		
	}
	
	
}
