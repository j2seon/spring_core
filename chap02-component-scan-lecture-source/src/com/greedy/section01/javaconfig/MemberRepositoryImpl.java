package com.greedy.section01.javaconfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/* �������̽��� �޼ҵ带 ����ȭ�� �� �����Ͽ� ����ϸ� �������� �ο��ǰ� ���հ��踦 �����ϰ� ���� �� �ִ�.
 * */

/* ������ �����̳ʰ� ��ĳ�� ����� �̿��Ͽ� �ش� Ŭ������ bean���� ����� �� �ֵ��� ������̼��� �����Ѵ�. 
 * value �Ӽ��� �̿��Ͽ� bean�� id�� ������ �� ������, value�� ���� �����ϴ�.
 * �̸�(id)�� �������� ������ Class�� �� ���ڸ� �ҹ��ڷ� �Ͽ� bean�� �����Ѵ�.
 * @Controller, @Service, @Repository�� ������ ����� �������� �� ������ ǥ���ϴ� ������̼���
 * Ư�� �뵵�� �´� �ΰ����� ������ ������ �������� �����Ͽ� ����ϴ� ���� ����.
 * @Component : ���������� �����Ǵ� ��ü���� ǥ���ϱ� ���� ����ϴ� ���� �⺻���� ������̼��̴�.
 * @Controller : Web MVC �ڵ忡�� ���Ǵ� ������̼����� @RequestMapping ������̼��� �ش� ������̼��� �ۼ��� Ŭ���� �������� ��� �����ϴ�.
 * @Service : �����Ͻ� ������ �ۼ��� Ŭ������ ����Ѵ�. �߰����� ����� ������ �߰����� ����� ������ ���ɼ��� ������ ������ ����� �� ����Ѵ�.
 * @Repository : �÷����� ���ܸ� �����Ͽ� PersistenceExceptionTranslationPostProcessor�� DataAccessException���� ��ȯ�Ͽ� �ٽ� �߻��Ѵ�.
 * ������ ��Ȯ���� ���� ��쿡�� @Component�� ����Ѵ�.
 * */



@Repository
@Primary
public class MemberRepositoryImpl implements MemberRepository{
	
	private final Map<Integer, MemberDTO> memoryRepository;
	
	public MemberRepositoryImpl() {
		memoryRepository = new HashMap<Integer, MemberDTO>();
		memoryRepository.put(1, new MemberDTO(1,"user01","pass01","ȫ�浿"));
		memoryRepository.put(2, new MemberDTO(2,"user02","pass02","������"));
	}
	
	
	@Override
	public MemberDTO findById(int sequence) {
		return memoryRepository.get(sequence);
	}

	@Override
	public boolean save(MemberDTO newMember) {
		int before = memoryRepository.size();
		memoryRepository.put(newMember.getSequence(), newMember);
		int after = memoryRepository.size();
		return (after > before)? true : false; 
		
	}
	
	

}
