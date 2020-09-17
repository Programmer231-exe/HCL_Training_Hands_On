package com.iteratordemo.stall;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		List<Stall> stallList;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Stalls");
		int count = scanner.nextInt();
		System.out.println("Enter the stall details");
		stallList = StallFactory.tbGenerator(count);
		Iterator<Stall> iterator = stallList.iterator();
		
		System.out.format("\n%-15s %-20s %-15s %s","Name","Detail","Type","Owner Name");
		while(iterator.hasNext()) {
			Stall stall = (Stall)iterator.next();
			System.out.format("\n%-15s %-20s %-15s %s", stall.getName(),stall.getDetail(),stall.getType(),stall.getOwnerName());
		}
		scanner.close();

	}

}
