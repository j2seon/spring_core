package com.greedy.section02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 이 클래스가 설정 메타정보를 가지고 있다는 의미를 가진 어노테이션을 지정해준다.
 * 컨테이너를 생성할 때 해당 어노테이션이 달린 클래스를 먼저 인식하여 컨테이너를 설정한다.
 * */
@Configuration
public class ContextConfiguration {
	
	
	/* bean을 등록하기 위해서는 @Bean 어노테이션을 이용한다.,
	 * @Bean("member")혹은 @Bean(name = "member")을 이용하여 bean의 id를 설정할 수 있다.
	 * 이 때 bean의 이름을 지정하지 않으면 메소드의 이름을 bean의 id로 자동 설정
	 * 
	 * */
	@Bean("member")
	public MemberDTO getMember() {
		return new MemberDTO(1,"user01","pass01", "홍길동");
	}

}
