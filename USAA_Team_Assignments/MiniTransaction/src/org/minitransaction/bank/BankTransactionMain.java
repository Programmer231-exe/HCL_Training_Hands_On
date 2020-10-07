package org.minitransaction.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BankTransactionMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		char ch = 'y';
		
		do {
			BankAccountManager.welcome();
			List<BankAccount> bankAccounts = BankAccountManager.getBankAccounts(BankAccountManager.username);
			if(bankAccounts != null) {
				BankAccountManager.customDisplay(bankAccounts);
			}
				
			try{
				br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("\n==>Do you want to continue(y/n)");
					ch = br.readLine().charAt(0);
				}catch(IOException ioe) {
					System.err.println("Format Exception");
				
			}finally {
				br = null; 
			}
		}while(ch == 'y');
			
		System.out.println("Thank you!!!!!!!");
	}

}
