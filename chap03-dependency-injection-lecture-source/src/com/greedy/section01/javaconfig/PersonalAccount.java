package com.greedy.section01.javaconfig;

public class PersonalAccount implements Account {

	
	private int bankCode;
	private String accNo;
	private String accPwd;
	private int balance;
	
	
	public PersonalAccount(int bankCode, String accNo, String accPwd) {
		this.bankCode = bankCode;
		this.accNo = accNo;
		this.accPwd = accPwd;
	}

	@Override
	public String getBalance() {
		 
		return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니다.";
 	}

	@Override
	public String desposit(int money) {
		String str = "";
		
		if(money >= 0) {
			this.balance += money;
			str = money + "원이 입금되었습니다.";
		}else {
			str = "금액을 잘못입력하셨습니다";
		}
		return str;
	}

	@Override
	public String withDrwa(int money) {
		String str = "";
		
		if(this.balance >= money) {
			this.balance -= money;
			str = money + "원이 출금되었습니다.";
		}else {
			str = "잔액이 부족합니다. 잔액을 확인해주세요";
		}
		return str;
	}
	
	

}
