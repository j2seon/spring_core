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
		 
		return this.accNo + " ������ ���� �ܾ��� " + this.balance + "�� �Դϴ�.";
 	}

	@Override
	public String desposit(int money) {
		String str = "";
		
		if(money >= 0) {
			this.balance += money;
			str = money + "���� �ԱݵǾ����ϴ�.";
		}else {
			str = "�ݾ��� �߸��Է��ϼ̽��ϴ�";
		}
		return str;
	}

	@Override
	public String withDrwa(int money) {
		String str = "";
		
		if(this.balance >= money) {
			this.balance -= money;
			str = money + "���� ��ݵǾ����ϴ�.";
		}else {
			str = "�ܾ��� �����մϴ�. �ܾ��� Ȯ�����ּ���";
		}
		return str;
	}
	
	

}
