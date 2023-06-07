package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

	//도서 목록 전체 조회
	List<BookDTO> findAll();
	
	//도서번호로 도서 조회
	Optional<BookDTO> findById(int num);

}
