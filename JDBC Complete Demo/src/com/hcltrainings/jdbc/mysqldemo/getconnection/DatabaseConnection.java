package com.hcltrainings.jdbc.mysqldemo.getconnection;

import java.io.InputStream;
import java.util.Properties;

public class DatabaseConnection {

	public static void main(String[] args) {
		Properties p = new Properties();
		DatabaseConnection dbconnection = new DatabaseConnection();
		try {
			InputStream propertiesStream = dbconnection.getClass().getClassLoader().getResourceAsStream("database-info.properties"); 
			p.load(propertiesStream);
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Exception occurs");
		}
		
	}

}
