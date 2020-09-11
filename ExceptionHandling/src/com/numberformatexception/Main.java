package com.numberformatexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String name;
		int deposit;
		int costPerDay;
		ItemType itemType = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Item type details: ");
		try {
			System.out.println("Enter the name:");
			name = br.readLine();
			System.out.println("Enter the Deposit");
			deposit = Integer.parseInt(br.readLine());
			System.out.println("Enter the cost per day:");
			costPerDay = Integer.parseInt(br.readLine());
			itemType = new ItemType(name,deposit,costPerDay);
			System.out.println(itemType.toString());
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.toString());
		}catch(IOException e) {
			System.err.println("Input output error occurs");
		}
		
				
	}

}
