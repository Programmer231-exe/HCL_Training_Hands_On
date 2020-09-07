package com.hands_on_hcl.case_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Long over;
		Long ball;
		Long runs;
		String batsman;
		String bowler;
		String nonStriker;
		
		Scanner scanner = new Scanner(System.in);
	
	
		System.out.println("Enter the over:");
		over = scanner.nextLong();
		System.out.println("Enter the ball:");
		ball = scanner.nextLong();
		System.out.println("Enter the runs:");
		runs = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter the batsman name:");
		batsman = scanner.nextLine();
		System.out.println("Enter the bowler name:");
		bowler = scanner.nextLine();
		System.out.println("Enter the nonStriker name:");
		nonStriker = scanner.nextLine();
		
		
		Delivery delivery = new Delivery(over, ball,runs,batsman,bowler,nonStriker);
		delivery.displayDeliveryDetails();
		scanner.close();
		
		
	}
	
	
	

}

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

delivery.displayDeliveryDetails();

*/