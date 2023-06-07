package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.greedy.section01.javaconfig.MemberRepository;


//@Configuration
@ComponentScan(basePackages = "com.greedy.section01.javaconfig",
				excludeFilters = {
						@ComponentScan.Filter(
								/* 1. 타입으로 설정 */
//								type = FilterType.ASSIGNABLE_TYPE,
//								classes = {MemberRepository.class}
								/* 2. 어노테이션 종류로 설정 */
//								type = FilterType.ANNOTATION,
//								classes = {Component.class}
								/* 3. 표현식으로 설정 */
								type = FilterType.REGEX,
								pattern = {"com.greedy.section01.*"}
								/* 4. ASPECTJ 설정 : 포인트 컷 표현식으로 클래스 매치 */
								
						)
				})
public class ContextConfiguration2 {

	
}
