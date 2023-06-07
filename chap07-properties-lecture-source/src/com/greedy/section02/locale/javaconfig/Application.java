package com.greedy.section02.locale.javaconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section02.locale.javaconfig.config.ContextConfiguration;


public class Application {

	public static void main(String[] args) {
		
		/* i18n 소프트 웨어 국제화(internationalization)에서 첫글자인 I와 마지막글자 N
		 * 사이 알파벳 갯수가 18개 (국제화말고 현대화도 있다 Localization:현지화)
		 * 
		 * 소프트웨어를 국제화하기 위해서는 처리해야할 작업이 많이 있다.
		 * 1. 언어 , 지역별 번역
		 * 2. OS/플랫폼 인코딩
		 * 3. 문자열 치환 방법 : 서버쪽 클라이언트쪽 치환 중 서버쪽에서 하는 게 좋다.
		 * 4. 국제화 UI(문자열 크기 변화,폰트,아이콘 등 ) 
		 * 5. 쓰기 방향의차이
		 * 6. 숫자, 공백, 화폐날짜, 주소, 측정단위 등
		 * 7. 타임존, 섬머타임등 시각
		 * 8. 문자열 정렬방법
		 * 
		 * */
		
		/* message_en_US, message_ko_KR 
		 * 사용자가 선택한 지역의 상태값에 따라 번역을 달리하려고 한다.
		 * */
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String error404Message = context.getMessage("error.404" , null, Locale.KOREA);
		String error500Message = context.getMessage("error.500" , new Object[] {"jjs", new Date()}, Locale.US);
		
		System.out.println(error404Message);
		System.out.println(error500Message);
		
	}
}
