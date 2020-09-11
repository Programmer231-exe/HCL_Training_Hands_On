package com.inheritanceandpolymorphism.case1;

public class CurrentAccount extends Account {
	private String tinNumber;
	
	
	
	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public CurrentAccount() {
		
	}
	
	public CurrentAccount(String accName,String accNo,String bankName,String tinNumber) {
		super.accName = accName;
		super.accNo = accNo;
		super.bankName = bankName;
		this.tinNumber = tinNumber;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Tin Number : " + this.getTinNumber());
	}
}
