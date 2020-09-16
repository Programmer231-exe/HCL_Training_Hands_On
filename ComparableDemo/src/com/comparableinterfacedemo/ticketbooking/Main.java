package com.comparableinterfacedemo.ticketbooking;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<TicketBooking> tbList;
		TicketBooking min;
		TicketBooking max;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		int count = scanner.nextInt();
		System.out.println("Enter the booking price accordingly with Customer name in CSV(Customer Name,price");
		tbList = TicketFactory.tbGenerator(count);
		min = (TicketBooking)Collections.min(tbList);
		max = (TicketBooking)Collections.max(tbList);
		System.out.println(min.getCustomerName() + " spends minimum amount of Rs." + min.getPrice());
		System.out.println(max.getCustomerName() + " spends maximum amount of Rs." + max.getPrice());
		scanner.close();
	}

}
