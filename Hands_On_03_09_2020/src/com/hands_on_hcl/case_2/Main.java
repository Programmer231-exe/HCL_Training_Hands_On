package com.hands_on_hcl.case_2;

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
		
		Delivery delivery = new Delivery();
		delivery.setOver(over);
		delivery.setBall(ball);
		delivery.setRuns(runs);
		delivery.setBatsman(batsman);
		delivery.setBowler(bowler);
		delivery.setNonStriker(nonStriker);
		
		delivery.displayDeliveryDetails();
		scanner.close();
		
	}
	
	
	

}
