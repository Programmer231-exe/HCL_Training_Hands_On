package org.onlinetransactiondemo.services;

import com.onlinetransactiondemo.dba.DBConnectors;

public class OnlineServicers {
	public static String isValidUser(String username, String password) {
		if (DBConnectors.isValidUser(username)) {
			if (DBConnectors.checkPassword(username, password)) {
				return username;
			} else {
				return "Username and Password does not match";
			}
		} else {
			return "There is no valid user found in the list";
		}
	}

	public static double getWalletBalance(String username) {
		return DBConnectors.getWalletBalance(username);
	}

	public static double getAccountBalance(String username) {
		return DBConnectors.getAccountBalance(username);
	}

	public static String beginTransaction(String transactionType, String sender, String from, String to,
			double amount) {
		System.out.println(transactionType);
		if (transactionType.equals("self")) {
			System.out.println(from);
			if (from.equals("wallet")) {
				if (amount > DBConnectors.getWalletBalance(sender)) {
					DBConnectors.updateTransaction(sender,sender,amount,"Failure","Insuffiecient Balance");
					return "Sorry |~~~Insufficient Balance";
				} else {
					DBConnectors.sendMoney(sender, "wallet", amount);
					return "Transaction Successful";
				}
			} else {
				if (amount > DBConnectors.getAccountBalance(sender)) {
					DBConnectors.updateTransaction(sender,sender,amount,"Failure","Insuffiecient Balance");
					
					return "Sorry !-- Insufficiet balance";
				} else {
					DBConnectors.sendMoney(sender, "bank", amount);
					return "Transaction Successful";
				}
			}
		} 

		if(transactionType.equals("another")){
			System.out.println("another transaction");
			System.out.println("+++++> "+ to);
			if (DBConnectors.isValidUser(to)) {
				System.out.println("Valid user only");
				if (from.equals("wallet")) {
					System.out.println("Wallet transaction");
					if (amount > DBConnectors.getWalletBalance(sender)) {
						DBConnectors.updateTransaction(sender,to,amount,"Failure","Insuffiecient Balance");
						return "Sorry INsufficiet balance";
					} else {
						System.out.println("This is worked or not");
						return DBConnectors.sendMoney(sender, from, to, amount);
					}
				}else {
					System.out.println("Bank account transaction");
					if(amount > DBConnectors.getAccountBalance(sender)) {
						DBConnectors.updateTransaction(sender,to,amount,"Failure","Insuffiecient Balance");
						return "Sorry Insufficient Balance";
				
					}else {
						System.out.println("Successful transaction");
						return DBConnectors.sendMoney(sender,from,to,amount);
					}
				}
			}

			
		}
		return "Transaction Failed";
	}
	
	public static String registerUser(Long accountNumber) {
		System.out.println(DBConnectors.isValidAccountNumber(accountNumber));
		return null;
	}
}
