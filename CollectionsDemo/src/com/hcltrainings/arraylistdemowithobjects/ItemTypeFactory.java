package com.hcltrainings.arraylistdemowithobjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemTypeFactory {
	public static ItemType itlGenerator() {
		ItemType itemType = new ItemType();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Name:");
			itemType.setName(br.readLine());
			System.out.println("Deposit");
			itemType.setDeposit(Double.parseDouble(br.readLine()));
			System.out.println("Cost per Day");
			itemType.setCostPerDay(Double.parseDouble(br.readLine()));
		} catch (IOException ioe) {
			System.err.println("Some problem with reading");
		}

		return itemType;

	}
}
