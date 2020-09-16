package com.hcltrainings.reversedeom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entet the number of users:");
		count = scanner.nextInt();
		Map<Integer,User> userDetails= new TreeMap<Integer,User>();
	
		for(int i = 0; i < count ; i++) {
			userDetails.put(i, UserFactory.generateUser(i));
		}
		
		List<User> list = new ArrayList<User>(userDetails.values());
		Collections.sort(list);
		Collections.reverse(list);
		int i =0;
		for(User user : list) {
			userDetails.put(i, user);
			i++;
		}
		
		for(Map.Entry<Integer,User> user : userDetails.entrySet())
		{
			System.out.println(user);
		}
		
	
		scanner.close();
	}

}
