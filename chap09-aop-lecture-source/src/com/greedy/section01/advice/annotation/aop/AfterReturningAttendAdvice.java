package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.AchievementResult;

@Aspect
@Component
public class AfterReturningAttendAdvice {
	
	/* returning �Ӽ��� ���� ������ �޾ƿ� ������Ʈ�� �Ű����� �̸��� �����ؾ��ϸ�,
	 * JoinPoint�� �ݵ�� ù ��° �Ű� ������ �����ؾ��Ѵ�. 
	 * */
	@AfterReturning(pointcut = "execution(* com.greedy.section01.advice.annotation..*(..))", returning = "result")
	public void afterReturningAttending(JoinPoint joinPoint, Object result) {
		
		/* ��������Ʈ�� ó���� �� �ִ� ������ �����ϸ�, after advice���� ���� �����Ѵ�. */
		System.out.println("==============after returning attending");
		System.out.println("������ �Ϸ����� �������� �δٸ� ����� ������ �ȹ�");
		System.out.println("������ ���ص� : " + ((AchievementResult) result).getUnderstandingScore());
		System.out.println("������ ������ : " + ((AchievementResult) result).getSatisfactionScore());
		
		/* ����� ��ġ�� ������� ȯ���ؼ� �ۼ�Ʈ�� ȯ�� 1000�� ���� */
		double employeementRate = ((AchievementResult) result).getEmployeementRate();
		double percent = employeementRate / 1000.0 * 100;
		System.out.println(percent + "%");
		
		System.out.println("===========================================");
		
	}
	
	
}
