package com.hands_on_hcl.case_5;

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
		
		
		Venue venue = new Venue();
		venue.setName(name);
		venue.setCity(city);
		
		
		int menu = 0;
		do {
			venue.displayVenueDetails();
			System.out.println("Verify and Update Details \nMenu" +
								"\n1. Update Venue Name" +
								"\n2. Update City Name" +
								"\n3. All Information Correct/Exit");
			System.out.println("\nEnter 1 or 2 or 3");
			menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu) {
			case 1:
				System.out.println("\nEnter the venue name:");
				venue.setName(scanner.nextLine());
				break;
				
			case 2:
				System.out.println("\nEnter the City name");
				venue.setCity(scanner.nextLine());
				break;
				
			case 3:
				venue.displayVenueDetails();
				break;
				
			
			}
			
		}while(menu!=3);
		
		scanner.close();
		}
	
	
	

}
