package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.Passion;

@Aspect
@Component
public class BeforeAttendingAdvice {
	
	/* JoinPoint ��ü�� ���� ��������Ʈ�� �޼ҵ��, �μ����� �ڼ��� ������ ������ �� �� �ִ�. 
	 * joinPoint�� advice�� �����ִ� ������ �����̶���Ѵ�.
	 * */
	@Before("StudentPointcut.studyPointcut()")
	public void beforeAttending(JoinPoint joinPoint) {
		System.out.println("================ before attending ==============");
		System.out.println("���õ� �ų��� ����ؼ� �Խ�ī�带 ��´�.");
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());// Ÿ�� Ŭ������ ����
		System.out.println("�������� ���� : " + joinPoint.getSignature()); // ����Ÿ���� ������ �ñ״�ó
		System.out.println("���� ��� : " + joinPoint.getSignature().getName()); // �޼ҵ��� �̸��� ��ȯ
		System.out.println("�������� ���� : " + ((Passion) joinPoint.getArgs()[0]).getScore());
		System.out.println("================================================");
	}
}
