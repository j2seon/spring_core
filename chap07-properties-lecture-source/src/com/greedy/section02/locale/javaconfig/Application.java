package com.greedy.section02.locale.javaconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section02.locale.javaconfig.config.ContextConfiguration;


public class Application {

	public static void main(String[] args) {
		
		/* i18n ����Ʈ ���� ����ȭ(internationalization)���� ù������ I�� ���������� N
		 * ���� ���ĺ� ������ 18�� (����ȭ���� ����ȭ�� �ִ� Localization:����ȭ)
		 * 
		 * ����Ʈ��� ����ȭ�ϱ� ���ؼ��� ó���ؾ��� �۾��� ���� �ִ�.
		 * 1. ��� , ������ ����
		 * 2. OS/�÷��� ���ڵ�
		 * 3. ���ڿ� ġȯ ��� : ������ Ŭ���̾�Ʈ�� ġȯ �� �����ʿ��� �ϴ� �� ����.
		 * 4. ����ȭ UI(���ڿ� ũ�� ��ȭ,��Ʈ,������ �� ) 
		 * 5. ���� ����������
		 * 6. ����, ����, ȭ��¥, �ּ�, �������� ��
		 * 7. Ÿ����, ����Ÿ�ӵ� �ð�
		 * 8. ���ڿ� ���Ĺ��
		 * 
		 * */
		
		/* message_en_US, message_ko_KR 
		 * ����ڰ� ������ ������ ���°��� ���� ������ �޸��Ϸ��� �Ѵ�.
		 * */
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String error404Message = context.getMessage("error.404" , null, Locale.KOREA);
		String error500Message = context.getMessage("error.500" , new Object[] {"jjs", new Date()}, Locale.US);
		
		System.out.println(error404Message);
		System.out.println(error500Message);
		
	}
}
