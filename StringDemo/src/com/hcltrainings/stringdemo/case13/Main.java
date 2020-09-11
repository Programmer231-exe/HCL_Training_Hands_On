package com.hcltrainings.stringdemo.case13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int count;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data;
		Address[] addresses = null;
		try {
			System.out.println("Enter the number of users: ");
			count =Integer.parseInt(br.readLine());
			addresses = new Address[count];
			System.out.println("Enter user address details in CSV format(User ID, Street,City,State");
			for(int i = 0; i < count; i++) {
				data = br.readLine().split(",");
				int userId = Integer.parseInt(data[0]);
				addresses[i] = new Address(userId,data[1],data[2],data[3]);
			}
		}catch(IOException ioe){
			System.err.println("Error Occurs");
		}
		
		System.out.format("%-15s %-15s %-15s %s\n","User ID","Street","City","State");
		for(Address address : addresses) {
			System.out.format("%-15s %-15s %-15s %s\n",address.getUserId(),address.getStreet(),address.getCity(),address.getState());
		}
		

	}

}
