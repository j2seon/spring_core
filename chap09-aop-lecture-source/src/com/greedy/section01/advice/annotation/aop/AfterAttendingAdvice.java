package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.Passion;

@Aspect
@Component
public class AfterAttendingAdvice {

	@After("execution (* com.greedy.section01.advice.annotation..*(..))")
	public void afterAttending(JoinPoint joinPoint) {
		
		System.out.println("================= after attending ================");
		System.out.println("���ϵ� �п��� ���� ������ �����ؾ��� ��� �������� ��ϴ�.");
		
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());
		System.out.println("������ Ÿ�� : " + joinPoint.getTarget().getClass());
		System.out.println("�������� ���� : " + joinPoint.getSignature()); // ����Ÿ���� ������ �ñ״�ó
		System.out.println("���� ��� : " + joinPoint.getSignature().getName()); // �޼ҵ��� �̸��� ��ȯ
		System.out.println("�������� ���� : " + ((Passion) joinPoint.getArgs()[0]).getScore());
		System.out.println("==================================================");
	}
	
}
