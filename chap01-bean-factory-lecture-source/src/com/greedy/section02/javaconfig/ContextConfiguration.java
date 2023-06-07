package com.greedy.section02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* �� Ŭ������ ���� ��Ÿ������ ������ �ִٴ� �ǹ̸� ���� ������̼��� �������ش�.
 * �����̳ʸ� ������ �� �ش� ������̼��� �޸� Ŭ������ ���� �ν��Ͽ� �����̳ʸ� �����Ѵ�.
 * */
@Configuration
public class ContextConfiguration {
	
	
	/* bean�� ����ϱ� ���ؼ��� @Bean ������̼��� �̿��Ѵ�.,
	 * @Bean("member")Ȥ�� @Bean(name = "member")�� �̿��Ͽ� bean�� id�� ������ �� �ִ�.
	 * �� �� bean�� �̸��� �������� ������ �޼ҵ��� �̸��� bean�� id�� �ڵ� ����
	 * 
	 * */
	@Bean("member")
	public MemberDTO getMember() {
		return new MemberDTO(1,"user01","pass01", "ȫ�浿");
	}

}
