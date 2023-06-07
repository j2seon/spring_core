package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.javaconfig.Account;
import com.greedy.section01.javaconfig.MemberDTO;
import com.greedy.section01.javaconfig.PersonalAccount;

@Configuration
public class ContextConfiguration2 {

	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(20, "110-1234-5454522", "1234");
	}
	
	@Bean
	public MemberDTO memberGenerator() {
		
		MemberDTO member = new MemberDTO();
		Account account = accountGenerator();
		
		member.setSequence(1);
		member.setName("ȫ�浿");
		member.setPhone("010-1234-5678");
		member.setEmail("ddj04323@naver.com");
		member.setPersonalAccount(account);
		
		return member;
	}
	
	
	
	
}
