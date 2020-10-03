package com.hcltrainings.jdbc.mysqldemo.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

public class JDBCConnectionPooling implements Runnable {
	private int initialConnection = 5;
	private Vector<Connection> connectionsAvailable = new Vector<>();
	private Vector<Connection> connectionsUsed = new Vector<>();
	private static Properties properties = setProperties();
	
	public JDBCConnectionPooling() {
		for(int count = 0; count < initialConnection; count++) {
			connectionsAvailable.addElement(getConnection());
		}
	}

	public synchronized Connection connectionCheck() {
		Connection newConnection = null;
		if(connectionsAvailable.size() == 0) {
			newConnection = getConnection();
			connectionsUsed.addElement(newConnection);
		}else {
			newConnection = connectionsAvailable.lastElement();
			connectionsAvailable.removeElement(newConnection);
			connectionsUsed.addElement(newConnection);
		}
		
		return newConnection;
		
	}
	
	public int availableCount() {
		return connectionsAvailable.size();
	}
	public void run() {
		try {
			while(true) {
				synchronized(this) {
					while(connectionsAvailable.size() > initialConnection) {
						Connection connection = connectionsAvailable.lastElement();
						connectionsAvailable.removeElement(connection);
						connection.close();
					}
				}
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
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
	

	private Connection getConnection() {
		Connection connection = null;
		try  {
			System.out.println("--> Successfully connected to the database");

			  connection = DriverManager.getConnection(properties.getProperty("dbURL"),
					properties.getProperty("username"), properties.getProperty("password"));
			return connection;
			
		} catch (SQLException se) {
			System.out.println("Check the property file whether the details are correct or not");
			connection = null;
			}
			return connection;
		}

	}
	


