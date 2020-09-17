package com.hcltrainings.sortdemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		List<Hall> hallList;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Stalls");
		int count = scanner.nextInt();
		System.out.println("Enter the stall details");
		hallList= HallFactory.hlGenerator(count);
		Collections.sort(hallList,new MyComparator());
		Iterator<Hall> iterator = hallList.iterator();
		
		System.out.format("\n%-15s%-15s%-15s%-15s","Name","Contact Number","Cost Per Day","Owner Name");
		while(iterator.hasNext()) {
			Hall hall = (Hall)iterator.next();
			System.out.println(hall);
		}
		scanner.close();

	}

}
