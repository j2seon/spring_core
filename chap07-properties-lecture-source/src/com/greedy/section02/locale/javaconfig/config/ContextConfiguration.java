package com.greedy.section02.locale.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ContextConfiguration {
	
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		
		/* 다국어 메세지를 읽어올 properties 파일의 기본 파일 이름을 설정 */
		
		// 불러온 메세지를 해당 시간 동안 캐싱
		messageSource.setBasename("message");
		
		// 불러올 메세지를 해당 시간 동안 캐싱
		messageSource.setCacheMillis(10);
		// 기본 인코딩 셋을 설정
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
		
		
	}

}
