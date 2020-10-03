package com.hcltrainings.jdbc.mysqldemo.transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerFactory {
	public static Customer getCustomer() {
		int cust_id;
		String name;
		LocalDate dob;
		double loan_amount;
		double monthly_due;
		double pending_due;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String contact_no;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		try{
			System.out.println("Enter the Customer id");
			cust_id = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter the name");
			name = bufferedReader.readLine();
			System.out.println("Enter the dob(yyyy-mm-dd)");
			dob = LocalDate.parse(bufferedReader.readLine(),formatter);
			System.out.println("Enter the loan amount");
			loan_amount = Double.parseDouble(bufferedReader.readLine());
			System.out.println("Enter the monthly due");
			monthly_due = Double.parseDouble(bufferedReader.readLine());
			System.out.println("Enter the pending due");
			pending_due = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter the contact_no");
			contact_no =  bufferedReader.readLine();
			return new Customer(cust_id,name,dob,loan_amount,monthly_due,pending_due,contact_no);
		}catch(IOException ioe) {
			System.out.println("Input Format Error");
			return null;
		}
	}

}
