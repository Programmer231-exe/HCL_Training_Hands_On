package com.hcltrainings.collectiondemo.setdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> userList = new HashSet<String>();
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
		
		System.out.println("The unique number of username : " + userList.size());
		
	}

}
