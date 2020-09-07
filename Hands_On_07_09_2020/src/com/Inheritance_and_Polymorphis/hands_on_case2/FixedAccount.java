package com.Inheritance_and_Polymorphis.hands_on_case2;

public class FixedAccount extends SavingAccount {
	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
	public FixedAccount() {
		super();
		
	}

	public FixedAccount(String accountNumber, double balance, String accountHolderName,double minimumBalance,int lockingPeriod ) {
		super.accountNumber = accountNumber;
		super.balance = balance;
		super.accountHolderName = accountHolderName;
		super.minimumBalance = minimumBalance;
		this.lockingPeriod = lockingPeriod;
		
	}
	
	public void displayFixedAccountDetails() {
		System.out.format("%20s %10s %20s %20s %20s\n", "Accout Number","Balance","Account holder Name","Minimum Balance","Locking Period");
		System.out.format("%20s %10s %20s %20s %20s\n", super.accountNumber,super.balance,super.accountHolderName,super.minimumBalance,this.getLockingPeriod());
	}

}
