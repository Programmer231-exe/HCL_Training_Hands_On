package com.hcltrainings.jdbc.mysqldemo.transaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseManager {
	private static Properties properties = setProperties();
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	

	private static Properties setProperties() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("Properties/database-info.properties"));
			System.out.println("-->Properties File is valid");
			return properties;
		} catch (FileNotFoundException fe) {
			System.err.println("Please check the path of the file");
			return null;
		} catch (IOException ioe) {
			System.err.println("File is not in readable format");
			return null;
		}
	}

	public static void establishConnection() {
		try  {
			connection = DriverManager.getConnection(properties.getProperty("dbURL"),
					properties.getProperty("username"), properties.getProperty("password"));
			connection.setAutoCommit(false);
			System.out.println("--> Successfully connected to the database");
		} catch (SQLException se) {
			System.out.println("Check the property file whether the details are correct or not");
			closeEverything();
		}

	}
	
	public static void generateStatement() {
		try{
			statement = connection.createStatement();
			System.out.println("-->Statement is generated");
			
		}catch(SQLException sqle) 
		{	
			System.out.println("Statement can not be created");
			closeEverything();
			
		}
	}
	
	public static void showTable() {
		try {
			resultSet = statement.executeQuery("SELECT * FROM bank_customers");
			System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %-20s %-20s","Customer ID","Name","DOB","Loan Amount","Monthly Due","Pending Due","Contact No");
			System.out.println();
			for(int i = 0 ; i <140; i++) {
				System.out.print("*");
			}
			while(resultSet.next()) {
				System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %-20s %-20s",resultSet.getInt("cust_id"),resultSet.getString("name"),resultSet.getDate("dob"),resultSet.getDouble("loan_amount"),resultSet.getDouble("monthly_due"),resultSet.getInt("pending_due"),resultSet.getString("contact_no"));
				
			}
		}catch(SQLException sqle) {
			System.out.println("Recheck your query");
			System.out.println(sqle.getMessage());
			closeEverything();
		}
		
		
		
	}
	
	public static int insertTable() {
		Customer customer = CustomerFactory.getCustomer();
		String query = "INSERT INTO bank_customers(name,dob,loan_amount,monthly_due,pending_due,contact_no) VALUES "
				+ "('"+customer.getName()+"','"+customer.getDob()+"',"+customer.getLoan_amount()+","+
				customer.getMonthly_due()+","+customer.getPending_due()+",'"+customer.getContact_no()+"')";
		int rowsaffected = 0;
		try {
			rowsaffected = statement.executeUpdate(query);
		}catch(SQLException exc) {
			System.out.println("Insert operation cannot be performed");
			System.out.println(exc.getMessage());
		}
		return rowsaffected;
	}
	
	public static int updateTable() {
		try {
			return statement.executeUpdate("UPDATE bank_customers SET monthly_due = 5000 WHERE loan_amount > 25000 AND cust_id != 0;");
		}catch(SQLException e) {
			System.out.println("\nUpdate operation failed");
			System.err.println(e.getMessage());
			closeEverything();
			return 0;
		}
	}
	
	public static boolean deleteRow() {
		try {
			return statement.execute("DELETE FROM bank_customers WHERE pending_due = 0 AND cust_id != 0;");
		}catch(SQLException e) {
			System.out.println("\nUpdate operation failed");
			System.err.println(e.getMessage());
			closeEverything();
			return false;
		}
	}
	
	public static void commitAll() {
		try{
			connection.commit();
		}catch(SQLException sql2) {
			System.err.println(sql2.getMessage());
			System.out.println("Commit operation fail");
		}
	}
	public static void rollBackAll(Savepoint savepoint) {
		try{
			if(savepoint != null) {
				connection.rollback(savepoint);
			}else {
				connection.rollback();
			}
			
		}catch(SQLException sql2) {
			System.err.println(sql2.getMessage());
			System.out.println("Commit operation fail");
		}
	}
	public static Savepoint setSavepoint(String msg) {
		Savepoint savepoint = null;
		try{
			savepoint = connection.setSavepoint(msg);
		}catch(SQLException sqle){
			System.out.println("Cannot able to set savepoint");
			System.err.println(sqle.getMessage());
		}
		return savepoint;
		
	}
	public static void closeEverything() {
		try {
			if(connection != null) {
				connection.close();
			}if(statement != null) {
				statement.close();
			}if(resultSet != null) {
				resultSet.close();
			}
			System.exit(0);
		}catch(SQLException sqe) {
			System.out.println(sqe.getMessage());
		}
		
	}
}
