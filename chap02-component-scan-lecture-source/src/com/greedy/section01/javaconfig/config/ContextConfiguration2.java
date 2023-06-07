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
								/* 1. Ÿ������ ���� */
//								type = FilterType.ASSIGNABLE_TYPE,
//								classes = {MemberRepository.class}
								/* 2. ������̼� ������ ���� */
//								type = FilterType.ANNOTATION,
//								classes = {Component.class}
								/* 3. ǥ�������� ���� */
								type = FilterType.REGEX,
								pattern = {"com.greedy.section01.*"}
								/* 4. ASPECTJ ���� : ����Ʈ �� ǥ�������� Ŭ���� ��ġ */
								
						)
				})
public class ContextConfiguration2 {

	
}
