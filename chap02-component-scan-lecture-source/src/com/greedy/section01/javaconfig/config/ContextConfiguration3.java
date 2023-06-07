package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javaconfig.MemberRepository;


/* basePackage의 기본 설정 결로를 지정하고 useDefaultFilters를 false로 하면 모든 어노테이션을 스캔하지 않는다. */
@Configuration
@ComponentScan(basePackages = "com.greedy.section01.javaconfig",
				useDefaultFilters = false,
				includeFilters = {
						@ComponentScan.Filter(
						type = FilterType.ASSIGNABLE_TYPE,
						classes = {MemberRepository.class}
					)
				}
			)
public class ContextConfiguration3 {
	
}
