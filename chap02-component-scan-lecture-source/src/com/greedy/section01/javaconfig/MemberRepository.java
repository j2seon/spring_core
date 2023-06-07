package com.greedy.section01.javaconfig;

public interface MemberRepository {
	
	/* 회원 번호로 회원 정보를 조회하는 메소드*/
	public 
	MemberDTO findById(int sequence);
	
	/* 회원 정보를 저장하고 결과를 리턴하는 메소드 */
	public boolean save(MemberDTO newMember);
	
	

}
