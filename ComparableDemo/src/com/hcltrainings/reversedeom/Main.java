package com.hcltrainings.reversedeom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entet the number of users:");
		count = scanner.nextInt();
		Map<Integer,User> userDetails= new HashMap<Integer,User>();
	
		for(int i = 0; i < count ; i++) {
			userDetails.put(i, UserFactory.generateUser(i));
		}
		
		List<User> list = new ArrayList<User>(userDetails.values());
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < count; i++) {
			userDetails.replace(i, list.get(i));
		}
		
		System.out.format("\n%-15s%-15s\n","Name","Mobile Number");
		for(Map.Entry<Integer,User> user : userDetails.entrySet())
		{
			System.out.println(user.getValue());
		}
		
	
		scanner.close();
	}

}
