package com.hcltrainings.binarysearchdemo;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<User> userList;
		Scanner scanner = new Scanner(System.in);
		int count;
		String name;
		String email;
		User searcher = null;
		User output = null;
		System.out.println("Enter the number of users");
		count = scanner.nextInt();

		userList = UserFactory.tbGenerator(count);

		System.out.println("Search by " + "\n1.Name" + "\n2.Email");
		int choice = scanner.nextInt();
		int result;
		scanner.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter the name");
			name = scanner.nextLine();
			searcher = new User();
			searcher.setName(name);
			Collections.sort(userList, new NameComparator());
			result = Collections.binarySearch(userList, searcher, new NameComparator());
			if (result > 0) {
				output = userList.get(result);
			} else {
				System.out.println("No Record Found with the name");
			}
			break;
		case 2:
			System.out.println("Enter the Email");
			email = scanner.nextLine();
			searcher = new User();
			searcher.setEmail(email);
			Collections.sort(userList, new EmailComparator());
			result = Collections.binarySearch(userList, searcher, new EmailComparator());
			if (result > 0) {
				output = userList.get(result);
			} else {
				System.out.println("No record found with the email");
			}
			break;
		}

		System.out.format("\n%-20s %-20s %-20s %-20s", "Name", "Email", "User Name", "Password");
		System.out.println(output);
		scanner.close();
	}

}
