package com.hcltrainings.jdbc.mysqldemo.imagestore;

import java.sql.SQLException;

public class SimpleQueries {


	public static void main(String[] args) throws SQLException{
		DatabaseManager.establishConnection();
		DatabaseManager.generateStatement();
		DatabaseManager.showTable();
		int rowsAffected = DatabaseManager.updateTable();
		System.out.println(rowsAffected + " updated successsfully");
		DatabaseManager.showTable();
		boolean result = DatabaseManager.deleteRow();
		if(result) {
			System.out.println("Rows deleted Successfully");
		}else {
			System.out.println("Delet operation Failed");
		}
		DatabaseManager.showTable();
		DatabaseManager.closeEverything();
	}

}
