package com.greedy.section01.javaconfig;

public interface MemberRepository {
	
	/* ȸ�� ��ȣ�� ȸ�� ������ ��ȸ�ϴ� �޼ҵ�*/
	public 
	MemberDTO findById(int sequence);
	
	/* ȸ�� ������ �����ϰ� ����� �����ϴ� �޼ҵ� */
	public boolean save(MemberDTO newMember);
	
	

}
