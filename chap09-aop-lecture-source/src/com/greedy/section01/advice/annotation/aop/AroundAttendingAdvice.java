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
	
	
	/* Around Advice는 가장 강력한 어드바이스이다.
	 * 이 어드바이스는 조인포인트를 완전히 장악하기 때문에
	 * 앞에서 살펴본 어드바이스 모두 Around 어드바이스로 조합할 수 있다.
	 * 심지어 원본 조인 포인트를 언제 실행할지 실행 자체를 안할지 계속 실행할지 여부까지도 제어하게 된다.
	 * 
	 * AroundAdvice의 조인포인트 매개변수는 ProceedingJoinPoint로 고정되어있다.
	 * --> JoinPoint의 하위 인터페이스로 원본 조인 포인트의 진행 시점을 제어할 수 있다.
	 * 
	 * 조인포인트를 진행하는 호출을 잊는 경우가 자주 발생하기 때문에 주의해야하며,
	 * 최소한의 요건을 충족하면서 가장 기능이 약한 어드바이스를 쓰는게 바람직하다.
	 * */
	
	@Around("studentAroundPointcut()")
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("============= around attending before =============");
		System.out.println("오늘도 학원에 가서 열심히 공부해야지!!라는 마음가짐으로 아침일찍 일어납니다.");
		System.out.println("===================================================");
		
		/* 공부시간을 체크하기 위해 스탑워치를 켠다. */
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		/* 원본 조인포인트 */
		Object result = joinPoint.proceed();
		
		System.out.println("============== around attending after ===============");
		
		/* 만약에 greedy 학생이면 학원 문이 닫을때 까지 열심히 스터디를 합니다 */
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("수업이 끝나도 학원이 닫을때까지는 끝난게 아닙니다. 자율적 스터디 그룹과 함께 다시 공부합니다.");
		}
		
		System.out.println("열심히 공부했으니 퇴실카드를 찍는다.");
		
		stopWatch.stop();
		
		System.out.println("총 공부 소요시간 : " + stopWatch.getTotalTimeMillis() + "(ms)");
		
		return result;
		
	}
	
	/* 포인트컷은 void형 메소드로 작성하고 표현식을 작성한 뒤 메소드 이름이 포인트컷의 이름이 된다. */
	@Pointcut("execution(* com.greedy.section01.advice.annotation..*(..))")
	private void studentAroundPointcut() {}
	
}
