package com.hcltrainings.arraylistdemowithobjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<ItemType> itemTypeList = new ArrayList<ItemType>();
		char cond = 'y';
		int count = 1;
		while (cond != 'n') {

			try {
				System.out.println("Enter the ItemType " + count);
				itemTypeList.add(ItemTypeFactory.itlGenerator());
				System.out.println("Do you want to continue?(y/n)");
				cond = br.readLine().charAt(0);
				count++;
			} catch (IOException err) {
				System.err.println("Input error occurs");
			}
		}
		
		System.out.format("%-20s %-20s %-20s","Name","Deposit","Cost Per Day");
		for(ItemType itemType : itemTypeList) {
			System.out.println(itemType);
		}

	}

}
