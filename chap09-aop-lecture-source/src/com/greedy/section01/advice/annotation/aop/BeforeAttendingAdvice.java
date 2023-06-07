package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.Passion;

@Aspect
@Component
public class BeforeAttendingAdvice {
	
	/* JoinPoint 객체는 현재 조인포인트의 메소드명, 인수값등 자세한 정보를 엑세스 할 수 있다. 
	 * joinPoint에 advice를 끼워넣는 행위를 위빙이라고한다.
	 * */
	@Before("StudentPointcut.studyPointcut()")
	public void beforeAttending(JoinPoint joinPoint) {
		System.out.println("================ before attending ==============");
		System.out.println("오늘도 신나게 등원해서 입실카드를 찍는다.");
		System.out.println("수강생 타입 : " + joinPoint.getTarget().getClass());// 타깃 클래스의 정보
		System.out.println("수강생의 행위 : " + joinPoint.getSignature()); // 리턴타입을 포함한 시그니처
		System.out.println("행위 요약 : " + joinPoint.getSignature().getName()); // 메소드의 이름만 반환
		System.out.println("수강생의 열정 : " + ((Passion) joinPoint.getArgs()[0]).getScore());
		System.out.println("================================================");
	}
}
