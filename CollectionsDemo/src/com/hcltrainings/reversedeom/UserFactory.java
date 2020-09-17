package com.hcltrainings.reversedeom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserFactory {
	public static User generateUser(int count) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		User user = null;
		String detail;
		String[] splitDetail;
		try {
			System.out.println("Enter the details of User " + count);
			detail = br.readLine();
			splitDetail = detail.split(",");
			user = new User(splitDetail[0],splitDetail[1],splitDetail[2],splitDetail[3]);
		}catch(IOException ioe) {
			System.out.println("Error Occurs");
		}
		
		return user;
	}
}
