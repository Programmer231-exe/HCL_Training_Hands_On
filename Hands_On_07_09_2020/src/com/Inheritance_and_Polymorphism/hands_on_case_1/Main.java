package com.Inheritance_and_Polymorphism.hands_on_case_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		byte choice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Type: "  +
						   "\n1.Savings Account " +
						   "\n2.Current Account");
		
		choice = scanner.nextByte();
		
		switch(choice) {
		case 1:
			SavingsAccount savingAccount = AccountManagementSystem.createSavingsAccount();
			savingAccount.display();
			break;
		
		case 2:
			CurrentAccount currentAccount = AccountManagementSystem.createCurrentAccount();
			currentAccount.display();
			break;
		
		}
		
		scanner.close();
		
	}

}
