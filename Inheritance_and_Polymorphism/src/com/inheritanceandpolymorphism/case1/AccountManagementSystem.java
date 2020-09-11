package com.inheritanceandpolymorphism.case1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountManagementSystem {
	
	
	public static SavingsAccount createSavingsAccount() throws IOException {
		
		
		String accountDetails;
		String[] accountDetail;
		String accName;
		String accNo;
		String bankName;
		String orgName;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Account Details in Comma Separated Value(Account Name,Account Number,Bank Name,Organisation Name)");
		accountDetails = br.readLine();
		accountDetail = accountDetails.split(",");
		accName = accountDetail[0];
		accNo = accountDetail[1];
		bankName = accountDetail[2];
		orgName = accountDetail[3];
		
		return new SavingsAccount(accName, accNo, bankName, orgName);
		
	}
	
	public static CurrentAccount createCurrentAccount() throws IOException{
		
		String accountDetails;
		String[] accountDetail;
		String accName;
		String accNo;
		String bankName;
		String orgName;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Account Details in Comma Separated Value(Account Name,Account Number,Bank Name,TIN Number");
		accountDetails = br.readLine();
		accountDetail = accountDetails.split(",");
		accName = accountDetail[0];
		accNo = accountDetail[1];
		bankName = accountDetail[2];
		orgName = accountDetail[3];
		
		return new CurrentAccount(accName, accNo, bankName, orgName);
		
	}
	


}
