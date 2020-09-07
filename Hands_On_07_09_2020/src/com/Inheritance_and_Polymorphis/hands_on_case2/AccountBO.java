package com.Inheritance_and_Polymorphis.hands_on_case2;

public class AccountBO {
	
	public static FixedAccount getAccountDetails(String detail) { //--> accountNumber, balance,accountHolderName,minimum balance, lockingPeriod
		String accountNumber;
		double balance;
		String accountHolderName;
		double minimumBalance;
		int lockingPeriod;
		
		String[] splited_details = detail.split(",");
		accountNumber = splited_details[0];
		balance = Double.parseDouble(splited_details[1]);
		accountHolderName = splited_details[2];
		minimumBalance = Double.parseDouble(splited_details[3]);
		lockingPeriod = Integer.parseInt(splited_details[4]);
		
		
		
		
		return new FixedAccount(accountNumber, balance, accountHolderName,minimumBalance,lockingPeriod);
	}

}
