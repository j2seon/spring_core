package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	/* BookDAO Ÿ���� ������ ������ ��ü�� �ش� ������Ƽ�� �ڵ����� ��������ش�.
	 * ���������� �ʵ������� �ִ��� ����� �����Ѵ�.
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
