package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.greedy.section01.advice.annotation.GreedyStudent;

@Aspect
@Component
public class AroundAttendingAdvice {
	
	
	/* Around Advice�� ���� ������ �����̽��̴�.
	 * �� �����̽��� ��������Ʈ�� ������ ����ϱ� ������
	 * �տ��� ���캻 �����̽� ��� Around �����̽��� ������ �� �ִ�.
	 * ������ ���� ���� ����Ʈ�� ���� �������� ���� ��ü�� ������ ��� �������� ���α����� �����ϰ� �ȴ�.
	 * 
	 * AroundAdvice�� ��������Ʈ �Ű������� ProceedingJoinPoint�� �����Ǿ��ִ�.
	 * --> JoinPoint�� ���� �������̽��� ���� ���� ����Ʈ�� ���� ������ ������ �� �ִ�.
	 * 
	 * ��������Ʈ�� �����ϴ� ȣ���� �ش� ��찡 ���� �߻��ϱ� ������ �����ؾ��ϸ�,
	 * �ּ����� ����� �����ϸ鼭 ���� ����� ���� �����̽��� ���°� �ٶ����ϴ�.
	 * */
	
	@Around("studentAroundPointcut()")
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("============= around attending before =============");
		System.out.println("���õ� �п��� ���� ������ �����ؾ���!!��� ������������ ��ħ���� �Ͼ�ϴ�.");
		System.out.println("===================================================");
		
		/* ���νð��� üũ�ϱ� ���� ��ž��ġ�� �Ҵ�. */
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		/* ���� ��������Ʈ */
		Object result = joinPoint.proceed();
		
		System.out.println("============== around attending after ===============");
		
		/* ���࿡ greedy �л��̸� �п� ���� ������ ���� ������ ���͵� �մϴ� */
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("������ ������ �п��� ������������ ������ �ƴմϴ�. ������ ���͵� �׷�� �Բ� �ٽ� �����մϴ�.");
		}
		
		System.out.println("������ ���������� ���ī�带 ��´�.");
		
		stopWatch.stop();
		
		System.out.println("�� ���� �ҿ�ð� : " + stopWatch.getTotalTimeMillis() + "(ms)");
		
		return result;
		
	}
	
	/* ����Ʈ���� void�� �޼ҵ�� �ۼ��ϰ� ǥ������ �ۼ��� �� �޼ҵ� �̸��� ����Ʈ���� �̸��� �ȴ�. */
	@Pointcut("execution(* com.greedy.section01.advice.annotation..*(..))")
	private void studentAroundPointcut() {}
	
}
