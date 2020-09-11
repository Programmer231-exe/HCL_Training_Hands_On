package com.hcltrainings.stringdemo.case15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count;
		String detail;
		String[] details;
		Item[] items = null;
		try {
			System.out.println("Enter the number of items:");
			count = Integer.parseInt(br.readLine());
			items = new Item[count];
			System.out.println("Enter the item details in the format(Item Name$Item Type$ITem Cost$Item Availability");
			for(int i = 0; i < count ; i++) {
				detail = br.readLine();
				details = detail.split("\\$");
				items[i] = new Item(details[0],details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]));
			}
			
		}catch(IOException e) {
			System.out.println("Error occurs");
		}
		
		System.out.println("Items:");
		StringBuilder sb = new StringBuilder();
		for(Item item : items) {
			sb.append(item.getName());
			sb.append(",");
			sb.append(item.getType());
			sb.append(",");
			sb.append(item.getCost());
			sb.append(",");
			if(item.getAvailableQuantity() > 0)
				sb.append("Available");
			else
				sb.append("Not Available");
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
	}

}
