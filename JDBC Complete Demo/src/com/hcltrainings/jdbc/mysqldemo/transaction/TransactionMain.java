package com.hcltrainings.jdbc.mysqldemo.transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransactionMain {


	public static void main(String[] args) throws SQLException,IOException{
		DatabaseManager.establishConnection();
		DatabaseManager.generateStatement();
		DatabaseManager.showTable();
		int choice; 
		Savepoint start = DatabaseManager.setSavepoint("Starting");
		Savepoint insert = null,update = null,delete = null;
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		char cond = 'y';
		do {
		System.out.println("What operation do you want to perform" +
							"\n1.Insert " +
							"\n2.Update " + 
							"\n3.Delete" +
							"\n4.Savepoint( roll back to start,insert,update,delete)"
							+ "\n5.Commit");
		choice = Integer.parseInt(scanner.readLine());
		
		switch(choice) {
		case 1:
			System.out.println("Enter the customer details");
			DatabaseManager.insertTable();
			DatabaseManager.showTable();
			insert = DatabaseManager.setSavepoint("insert");
			break;
		case 2:
			DatabaseManager.updateTable();
			DatabaseManager.showTable();
			update = DatabaseManager.setSavepoint("update");
			break;
		case 3:
			DatabaseManager.deleteRow();
			DatabaseManager.showTable();
			delete = DatabaseManager.setSavepoint("delete");
			break;
		case 4:
			System.out.println("Where you want to rollback?");
			System.out.println("\n1.start\n2.insert\n3.update\n4.delete");
			int id = Integer.parseInt(scanner.readLine());
			switch(id) {
			case 1:
				DatabaseManager.rollBackAll(start);
				break;
			case 2:
				DatabaseManager.rollBackAll(insert);
				break;
			case 3:
				DatabaseManager.rollBackAll(update);
				break;
			case 4:
				DatabaseManager.rollBackAll(delete);
				break;
			}
			
			break;
		case 5:
			DatabaseManager.commitAll();
			DatabaseManager.showTable();
			break;
		}
			System.out.println("\nDo you want to contine?y/n");
			cond = scanner.readLine().charAt(0);
			
		
		
		}while(cond == 'y');
		
		DatabaseManager.commitAll();
		DatabaseManager.showTable();
		DatabaseManager.closeEverything();
		scanner.close();
	}

}
