package com.hcltrainings.jdbc.mysqldemo.resourcebundle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale("db","01"));
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(bundle.getString("dbURL"),bundle.getString("username"),bundle.getString("password"));
			System.out.println("First connection executed Correction");
		}catch(SQLException sqle) {
			System.out.println("This block won't get executed");
		}finally{
			if(connection!= null) {
				try {
					connection.close();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		bundle = ResourceBundle.getBundle("MessageBundle",new Locale("db","02"));
		
		try {
			connection = DriverManager.getConnection(bundle.getString("dbURL"),bundle.getString("username"),bundle.getString("password"));
		}catch(SQLException sqle) {
			System.out.println("This block will give exception");
			System.out.println("This Connection give exception");
		}finally{
			if(connection!= null) {
				try {
					connection.close();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
