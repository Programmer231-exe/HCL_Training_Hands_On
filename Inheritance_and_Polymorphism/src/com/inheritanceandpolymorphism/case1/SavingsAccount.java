package com.inheritanceandpolymorphism.case1;

public class SavingsAccount extends Account{
	
	private String orgName;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super.accName = accName;
		super.accNo = accNo;
		super.bankName = bankName;
		this.orgName = orgName;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Organisation Name :" + this.getOrgName());
	}

}
