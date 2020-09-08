package com.abstract_class_introduction.case2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		eventManager();
	}
	
	
	private static void eventManager() throws IOException{
		String name;
		String detail;
		String ownerName;
		int noOfStall;
		int noOfShows;
		int noOfSeatsPerShow;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the Event:");
		name = br.readLine();
		System.out.println("Enter the detail of the Event: ");
		detail = br.readLine();
		System.out.println("Enter the owner Name: ");
		ownerName = br.readLine();
		Event event;
		int choice;
		System.out.println("Enter the type of the event : " +
							"\n1.Exhibition" +
							"\n2. StageEvent");
		choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1 :
			System.out.println("Enter the number of Stalls");
			noOfStall = Integer.parseInt(br.readLine());
			event = new Exhibition(name,detail,ownerName,noOfStall);
			System.out.format("The Projected Revenue is %.2f",event.projectedRevenue());
			break;
		
		case 2:
			System.out.println("Enter the number of shows");
			noOfShows = Integer.parseInt(br.readLine());
			System.out.println("Enter the Number of seats per show:");
			noOfSeatsPerShow = Integer.parseInt(br.readLine());
			event = new StageEvent(name,detail,ownerName,noOfShows,noOfSeatsPerShow);
			System.out.format("The Projected Revenue is %.2f",event.projectedRevenue());
			break;
			
		}
		
	}
}
