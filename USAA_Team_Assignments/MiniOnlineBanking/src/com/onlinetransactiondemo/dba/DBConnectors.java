package com.onlinetransactiondemo.dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class DBConnectors {
	
	private static Connection connection = null;
	private static PreparedStatement pStatement = null;
	private static ResultSet resultSet = null;
	private static Logger logger =  Logger.getLogger(DBConnectors.class);
	
	/*
	 * public static void main(String[] args) {
	 * System.out.println(getConnection("database",new Locale("db","MS")));
	 * System.out.println(getWalletBalance("Siva321"));
	 * System.out.println(getAccountBalance("Siva321"));
	 * System.out.println("=====?|" +sendMoney("Siva231","wallet",500));
	 * 
	 * 
	 * }
	 */
	public static boolean getConnection(String bundlename,Locale locale) {
		
		ResourceBundle rd = ResourceBundle.getBundle(bundlename,locale);
		System.out.println(rd.getLocale());

		try {
			Class.forName(rd.getString("dbDriver"));
			logger.info("Driver Successfully instantiated");
		}catch(ClassNotFoundException cefe) {
			logger.error("JDBC Driver not found");
			//System.err.println("====>JDBC Driver Not Found");
			return false;
		}
		
		try {
			connection = DriverManager.getConnection(rd.getString("dbURL"),rd.getString("dbusername"),rd.getString("password"));
			logger.info("Database Connection Successful");
			return true;
		}catch(SQLException se) {
			//System.err.println("====>Driver connection fails");
			logger.error("Driver Connections Fails");
			connection = null;
			return false;
		}finally {
			
		}
	}
	
	public static boolean isValidUser(String username) {
		getConnection("database",new Locale("db","MS"));
		try {
			pStatement = connection.prepareStatement("SELECT username FROM `cloud_customers` WHERE  username LIKE ?");
			pStatement.setString(1,username);
			resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				if(resultSet.getString("username").equals(username)) {
					logger.info("Valid user only");
					return true;
				}
			}
		}catch(SQLException se) {
			System.err.println("===>Cannot execute the statement");
		}finally {
			pStatement = null;
			resultSet = null;
			connection = null;
		}
		return false;
	}
	
	public static boolean checkPassword(String username,String password) {
		getConnection("database",new Locale("db","MS"));
		try {
			pStatement = connection.prepareStatement("SELECT password FROM `cloud_customers` WHERE username LIKE ?");
			pStatement.setString(1,username);
			resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				if(resultSet.getString("password").equals(password)) {
					logger.info("Authorised user only");
					return true;
				}
			}
		}catch(SQLException se) {
			System.err.println("===>Cannot execute the statement");
		}finally {
			pStatement = null;
			resultSet = null;
			connection = null;
		}
		logger.warn("Username and password doesn't match");
		return false;
		
	}
	
	public static double getWalletBalance(String username) {
		getConnection("database",new Locale("db","MS"));
		double balance = 0.0;
		try {
			pStatement = connection.prepareStatement("SELECT amount FROM pay_wallet WHERE id = (SELECT customer_id FROM cloud_customers WHERE username LIKE ?)");
			pStatement.setString(1,username);
			resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				if(resultSet.getDouble("amount") != 0.0) {
					balance = resultSet.getDouble("amount");
				}
			}
			
		}catch(SQLException se) {
			System.err.println("===> Cannot able to get the balance");
		}finally {
			resultSet = null;
			pStatement = null;
			connection = null;
		}
		return balance;
	}
	
	public static double getAccountBalance(String username) {
		getConnection("database",new Locale("db","MS"));
		double balance = 0.0;
		try {
			pStatement = connection.prepareStatement("SELECT balance FROM partner_bank WHERE bank_account_number = (SELECT bank_account_number FROM cloud_customers_bankdetails WHERE id = " + 
					"(SELECT customer_id FROM cloud_customers WHERE username LIKE ?))");
			pStatement.setString(1,username);
			resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
					balance = resultSet.getDouble("balance");
				
			}
			
		}catch(SQLException se) {
			System.err.println("===> Cannot able to get the balance");
		}finally {
			resultSet = null;
			pStatement = null;
			connection = null;
		}
		return balance;
	}
	public static String sendMoney(String sender,String from,double amount) {
		getConnection("database",new Locale("db","MS"));
		System.out.println(connection);
		double wallet_amount = getWalletBalance(sender);
		double bank_amount = getAccountBalance(sender);
		double bankUpdateamount = bank_amount;
		double walletUpdateamount = wallet_amount;
		if(from.equals("wallet")) {
			bankUpdateamount = bank_amount + amount;
			walletUpdateamount = wallet_amount - amount;
			System.out.println(walletUpdateamount);
		}else {
			bankUpdateamount = bank_amount - amount;
			walletUpdateamount = wallet_amount + amount;
			System.out.println(walletUpdateamount);
		}
			try {
				getConnection("database",new Locale("db","MS"));
				System.out.println(connection);
				connection.setAutoCommit(false);
				pStatement = connection.prepareStatement("UPDATE `partner_bank` SET balance = ? WHERE bank_account_number = (SELECT bank_account_number FROM cloud_customers_bankdetails WHERE id= (SELECT "
						+ "			customer_id FROM cloud_customers WHERE username LIKE ?))");
				pStatement.setDouble(1, bankUpdateamount);
				pStatement.setString(2, sender);
				if(!pStatement.execute()) {
					
					pStatement = connection.prepareStatement("UPDATE `pay_wallet` SET amount = ? WHERE id = (SELECT customer_id FROM cloud_customers WHERE username LIKE ?)");
					pStatement.setDouble(1, walletUpdateamount);
					pStatement.setString(2,sender);
					System.out.println("This blocvk is fu");
					pStatement.execute();
					connection.commit();
					updateTransaction(sender,sender,amount,"Successful","");
					return "Transaction Successful";
				}else {
					connection.rollback();
					updateTransaction(sender,sender,amount,"Failed","Cannot able to reach receiver account");
					return "Transaction Fails";
				}
			} catch (SQLException e) {
				try {
					connection.rollback();
					updateTransaction(sender,sender,amount,"Failed","Server Error");
				} catch (SQLException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
				return "Transaction Fails";
			}finally {
				connection = null;
				pStatement = null;
				connection = null;
			}
		
	}
	public static String sendMoney(String sender, String from, String to, double amount) {
		
		double walletBalance = getWalletBalance(sender) - amount;
		double accountBalance = getAccountBalance(sender) - amount;
		double receiverBalance = getAccountBalance(to) + amount;
		try {
			getConnection("database",new Locale("db","MS"));
			connection.setAutoCommit(false);
			if(from.equals("wallet")) {
				pStatement = connection.prepareStatement("UPDATE `pay_wallet` SET amount = ? WHERE id = (SELECT customer_id FROM cloud_customers WHERE username LIKE ?)");
				pStatement.setDouble(1, walletBalance);
				pStatement.setString(2, sender);
				System.out.println("This is the correct choid");
					}else {
				pStatement = connection.prepareStatement("UPDATE `partner_bank` SET balance = ? WHERE bank_account_number = (SELECT bank_account_number FROM cloud_customers_bankdetails WHERE id= (SELECT "
						+ "			customer_id FROM cloud_customers WHERE username LIKE ?))");
				System.out.println("This is correct choice");
				pStatement.setDouble(1, accountBalance);
				pStatement.setString(2, sender);
				
			}
			if(!pStatement.execute()) {
				pStatement = connection.prepareStatement("UPDATE pay_wallet SET amount = ? WHERE id = (SELECT customer_id FROM cloud_customers WHERE username LIKE ?)");
				pStatement.setDouble(1,receiverBalance);
				pStatement.setString(2,to);
				System.out.println("This is executed");
				if(!pStatement.execute()) {
					connection.commit();
					updateTransaction(sender,to,amount,"Successful","");
					System.out.println("Successfully commited");
					
					return "Transaction successful";
				}
			}else {
				connection.rollback();
				return "Transaction failed";
			}

			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "Transaction failed";
			}
			
			e.printStackTrace();
			return "Transaction failed";
		}finally {
			connection = null;
			pStatement = null;
			connection = null;
		}
		return "Transaction FAiled";
		
	}


	public static void updateTransaction(String from,String to,double amount,String status,String reason) {
		getConnection("database",new Locale("db","MS"));
		try {
			pStatement = connection.prepareStatement("INSERT INTO `transactions`(`from`,`to`,`amount`,`status`,`reason`)  VALUES (?,?,?,?,?)");
			pStatement.setString(1, from);
			pStatement.setString(2, to);
			pStatement.setDouble(3,amount);
			pStatement.setString(4, status);
			pStatement.setString(5,reason);
			pStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection = null;
			pStatement = null;
		}

	}
	
	
	public static boolean isValidAccountNumber(Long accountNumber) {
		getConnection("database",new Locale("db","MS"));
		try {
			pStatement = connection.prepareStatement("SELECT bank_account_number FROM `partner_bank` WHERE  bank_account_number = ?");
			pStatement.setLong(1,accountNumber);
			resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				if(resultSet.getLong("bank_account_number") == accountNumber)  {
					System.out.println("This is working");
					return true;
				}
			}
		}catch(SQLException se) {
			System.err.println("===>Cannot execute the statement");
		}finally {
			pStatement = null;
			resultSet = null;
			connection = null;
		}
		return false;
	}

}
