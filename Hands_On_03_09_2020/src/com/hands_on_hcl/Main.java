package com.hands_on_hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		/*Venue venue = new Venue();
		
	
		System.out.println("Enter the Venue name: ");
		venue.setName(scanner.nextLine());
		System.out.println("Enter the city name: ");
		venue.setCity(scanner.nextLine());
		
		System.out.println("Venue Details : \nVenue Name : " + venue.getName() + "\nCity Name :"  + venue.getCity());
		
		//scanner.close();
		
		Player player = new Player();
		System.out.println("Enter the player name;");
		player.setName(scanner.nextLine());
		System.out.println("Enter the country name:");
		player.setCountry(scanner.nextLine());
		System.out.println("Enter the player Skill:");
		player.setSkill(scanner.nextLine());
		
		System.out.println("\n\nPlayer Details:\nPlayer Name:" + player.getName() +"\nCountry Naame:"+player.getCountry() +"\nSkill:" + player.getSkill() );
		
	
	*/	
		//scanner.close();
		
		/*Delivery delivery = new Delivery();
		System.out.println("\n\nEnter the over:");
		delivery.setOver(scanner.nextLong());
		System.out.println("\nEnter the ball:");
		delivery.setBall(scanner.nextLong());
		System.out.println("\nEnter the runs:");
		delivery.setRuns(scanner.nextLong());
		scanner.nextLine();
		System.out.println("\nEnter the batsman name:");
		delivery.setBatsman(scanner.nextLine());
		System.out.println("\nEnter the bowler name:");
		delivery.setBowler(scanner.nextLine());
		System.out.println("\nEnter the nonStriker name:");
		delivery.setNonStriker(scanner.nextLine());
		
		delivery.deliveryDetails();*/
		//scanner.close();
		
		Player player2 = new Player();
		System.out.println("Enter the Player Details:");
		
		String commonDetails = scanner.nextLine();
		
		String[] Details = commonDetails.split(",");
		
		for(String detail : Details ) {
			System.out.println(detail);
		}
		
		scanner.close();
	}
	
	
	

}
