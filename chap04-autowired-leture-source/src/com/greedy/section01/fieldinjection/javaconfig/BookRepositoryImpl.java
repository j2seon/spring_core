package com.greedy.section01.fieldinjection.javaconfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository{

	private Map<Integer, BookDTO> store = new HashMap<>();
	
	@Override
	public List<BookDTO> findAll() {
		store.put(1, new BookDTO(1, 123123, "�ڹ��� ����", "���ü�", "��������", new Date()));
		store.put(2, new BookDTO(2, 56565, "������ ����", "���m", "��������", new Date()));
		store.put(3, new BookDTO(3, 12221, "������ ����", "����", "����", new Date()));
		
		return new ArrayList<BookDTO>(store.values());
	}

	@Override
	public Optional<BookDTO> findById(int num) {
		return store.values().stream().filter((book)-> book.getSequence()==num).findFirst();
		
	}
	
	

}
