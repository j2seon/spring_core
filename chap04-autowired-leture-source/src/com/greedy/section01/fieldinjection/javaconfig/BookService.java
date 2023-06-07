package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	/* BookDAO 타입의 빈으로 생성된 객체를 해당 프로퍼티에 자동으로 연결시켜준다.
	 * 간단하지만 필드주입은 최대한 사용을 지양한다.
	 * */
	@Autowired
	private BookRepository bookRepository;
	
	public List<BookDTO> selectAllbooks(){
		return bookRepository.findAll();
	}
	
	public Optional<BookDTO> selectBook(int num){
		return bookRepository.findById(num);
	}
	

}
