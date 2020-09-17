package com.hcltrainings.listdemo.comparabledemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Address> addressList;
		Scanner scanner = new Scanner(System.in);
		int count;
		System.out.println("Enter the number of users");
		count = scanner.nextInt();
		scanner.nextLine();
		addressList = AddressFactory.tbGenerator(count);
		Collections.sort(addressList);
		Iterator<Address> iterator = addressList.iterator();
		System.out.println("User Details: ");
		while(iterator.hasNext()) {
			Address address = iterator.next();
			System.out.println(address);
		}
		scanner.close();

	}

}
