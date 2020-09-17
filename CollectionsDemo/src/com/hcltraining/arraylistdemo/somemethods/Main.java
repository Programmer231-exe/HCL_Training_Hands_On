package com.hcltraining.arraylistdemo.somemethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> hallList = new ArrayList<String>();
		int count;
		String searcher;
		try {
			System.out.println("Enter the Number of Halls:");
			count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				System.out.println("Enter the Hall Name " + (i + 1));
				hallList.add(br.readLine());
			}

			System.out.println("Enter the Hall name to be searched");
			searcher = br.readLine();

			if (hallList.contains(searcher)) {
				System.out.println(searcher + " hall is found in the list at position " + hallList.indexOf(searcher));
			} else {
				System.out.println(searcher + " hall is not found");
			}

		} catch (IOException err) {
			System.err.println("Input error occurs");
		}

	}

}
