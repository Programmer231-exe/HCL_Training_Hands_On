package com.hcltraining.arraylistdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> userList = new ArrayList<String>();
		char cond = 'y';
		int count = 1;
		while (cond != 'n') {

			try {
				System.out.println("Enter the user name " + count);
				userList.add(br.readLine());
				System.out.println("Do you want to continue?(y/n)");
				cond = br.readLine().charAt(0);
				count++;
			} catch (IOException err) {
				System.err.println("Input error occurs");
			}
		}
		
		System.out.println("The Names entered are:");
		for(String username: userList) {
			System.out.println(username.toString());
		}

	}

}
