package com.hcltrainings.listdemo.usercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		UserBO userBo = new UserBO();
		userBo.addAll(UserBO.getList());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userdetail;
		String[] splittedDetail;
		int count;
		int from;
		int to;
		try {
			System.out.println("Enter the Number of user details to be added:");
			count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				System.out.println("Enter the user detail " + (i + 1) + " in CSV format");
				userdetail = br.readLine();
				splittedDetail = userdetail.split(",");
				userBo.add(new User(splittedDetail[0], splittedDetail[1], splittedDetail[2], splittedDetail[3]));
			}

		} catch (IOException err) {
			System.err.println("Input error occurs");
		}

		System.out.format("%-20s %-20s %-20s %-20s", "Name", "Contact Number", "User Name", "Email");
		Iterator<User> iterator = userBo.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			user.display();
		}
		
		System.out.println("\nEnter the range to be removed from the arraylist");
		try {
			from = Integer.parseInt(br.readLine());
			to = Integer.parseInt(br.readLine());
			userBo.remove(from, to);
		}catch(IOException ioe) {
			System.err.println("Error occurs");
		}
		
		iterator = userBo.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			user.display();
		}
	}
}
