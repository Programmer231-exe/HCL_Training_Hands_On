package com.hcltrainings.listdemo.comparatordemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserFactory {
	public static List<User> tbGenerator(int count) {
		List<User> userList = new ArrayList<User>();
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < count; i++) {
			System.out.println("Enter the user " + (i+1) + " detail");
			try {
				detail = br.readLine();
				splittedDetail = detail.split(",");
				userList.add(new User(splittedDetail[0],splittedDetail[1],splittedDetail[2],splittedDetail[3]));
			}catch(IOException ioe) {
				System.err.println("Some problem with reading");
			}
			
			
			
		}
		
		return userList;
	
		
	}
}
