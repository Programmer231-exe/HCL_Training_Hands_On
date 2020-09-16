package com.hcltrainings.mapdemo.addressdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,HashMap<String,ArrayList<Address>>> finalMappedAddress = AddressFactory.finalMappedAddress();
		System.out.println(finalMappedAddress);
		Scanner scanner = new Scanner(System.in);
		String state;
		String city;
		System.out.println("Enter the State to be searched");
		state = scanner.nextLine();
		System.out.println("Enter the City to be searched");
		city = scanner.nextLine();
		Map<String,ArrayList<Address>> getter = finalMappedAddress.get(state);
		System.out.println(getter);
		ArrayList<Address> address = getter.get(city);
		System.out.println(address);
		Iterator<Address> iterator = address.iterator();
		System.out.format("\n%-15s%-15s%-15s%-15s%-15s", "Line 1","Line 2","City","State","Pincode");
		Address addrs;
		while(iterator.hasNext()) {
			addrs = iterator.next();
			System.out.println(addrs);
		}
		
		scanner.close();
	}

}
