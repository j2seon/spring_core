package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

	//���� ��� ��ü ��ȸ
	List<BookDTO> findAll();
	
	//������ȣ�� ���� ��ȸ
	Optional<BookDTO> findById(int num);

}
