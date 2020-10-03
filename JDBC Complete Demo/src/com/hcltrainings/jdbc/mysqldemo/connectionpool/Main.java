package com.hcltrainings.jdbc.mysqldemo.connectionpool;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("Unable to load a driver");
		}
		
		try {
			JDBCConnectionPooling connectionPooling = new JDBCConnectionPooling(); 
			Connection[] connArr = new Connection[10];
			for(int i = 0; i<connArr.length;i++) {
				connArr[i] = connectionPooling.connectionCheck();
				System.out.println("Checking Connections "+ connArr[i]);
				System.out.println("Connections Available " + connectionPooling.availableCount());
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
