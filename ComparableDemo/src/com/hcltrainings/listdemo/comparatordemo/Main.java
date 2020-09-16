package com.hcltrainings.listdemo.comparatordemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<User> userList;
		Scanner scanner = new Scanner(System.in);
		int count;
		System.out.println("Enter the number of users");
		count = scanner.nextInt();
		scanner.nextLine();
		userList = UserFactory.tbGenerator(count);
		
		System.out.println("Sort by " +
							"\n1.Name" +
							"\n2.Email");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(userList,new NameComparator());
			break;
		case 2:
			Collections.sort(userList,new EmailComparator());
			break;
		}
		
		
		Iterator<User> iterator = userList.iterator();
		System.out.format("\n%-20s %-20s %-20s %-20s","Name","Email","Username","Password");
		while(iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}
		scanner.close();

	}

}
