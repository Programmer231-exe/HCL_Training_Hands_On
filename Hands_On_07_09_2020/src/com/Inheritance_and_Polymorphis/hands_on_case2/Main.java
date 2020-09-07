package com.Inheritance_and_Polymorphis.hands_on_case2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String detail;
		System.out.println("Enter Account Details: (Account Number,Balance,Account Holder Name, Minimum Balance, Locking Period");
		detail = br.readLine();
		FixedAccount account = AccountBO.getAccountDetails(detail);
		
		
		System.out.println("Account Details \n");
		account.displayFixedAccountDetails();
		
	}
	
}
