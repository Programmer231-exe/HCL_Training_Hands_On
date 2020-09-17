package com.hcltrainings.listoflistdemo.remainingticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<ArrayList<Integer>> ticketBookedlist = TicketManager.ticketBooker();
		ArrayList<Integer> remainingTicketsOfDay;
		Scanner scanner = new Scanner(System.in);
		char choice = 'y';
		
		while(choice == 'y') {
			remainingTicketsOfDay = (ArrayList<Integer>)TicketManager.remainingTickets(ticketBookedlist);
			System.out.println("RemainingTickets " + remainingTicketsOfDay.toString());
			remainingTicketsOfDay.removeAll(remainingTicketsOfDay);
			System.out.println("Do you want to continue?(y/n)");
			choice = scanner.nextLine().charAt(0);
		}
		
		scanner.close();
	}
}
