package com.hands_on_hcl.case_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name;
		String city;		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Venue name: ");
		name = scanner.nextLine();
		System.out.println("Enter the city name: ");
		city = scanner.nextLine();
		Venue venue = new Venue(name,city);
		//venue.setName(name);
		//venue.setCity(city);
		System.out.println("Venue Details: \nVenue Name: " + venue.getName() + "\nCity Name: "  + venue.getCity());
		scanner.close();
	}
	
}
