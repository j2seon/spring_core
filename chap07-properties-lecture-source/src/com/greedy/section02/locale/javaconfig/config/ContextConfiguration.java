package com.greedy.section02.locale.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ContextConfiguration {
	
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		
		/* �ٱ��� �޼����� �о�� properties ������ �⺻ ���� �̸��� ���� */
		
		// �ҷ��� �޼����� �ش� �ð� ���� ĳ��
		messageSource.setBasename("message");
		
		// �ҷ��� �޼����� �ش� �ð� ���� ĳ��
		messageSource.setCacheMillis(10);
		// �⺻ ���ڵ� ���� ����
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
		
		
	}

}
