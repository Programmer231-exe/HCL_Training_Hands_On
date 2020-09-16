package com.hcltrainings.listoflistdemo.remainingticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TicketManager {
	public static ArrayList<ArrayList<Integer>> ticketBooker(){
		ArrayList<ArrayList<Integer>> ticketBookedList = new ArrayList<ArrayList<Integer>>(5);
		
		 	for(int i = 0; i < 5; i++) {
		 		ticketBookedList.add(ticketPerShow(i));
		 	}
			
		return ticketBookedList;

	}
	
	public static List<Integer> remainingTickets(List<ArrayList<Integer>> list){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day;
		ArrayList<Integer> ticket;
		ArrayList<Integer> remainingTickets = new ArrayList<Integer>();
		try {
			System.out.println("Enter the day to know its remaining ticket count");
			day = (Integer.parseInt(br.readLine())-1);
			ticket = list.get(day);
			remainingTickets = new ArrayList<Integer>();
			for(Integer i : ticket) {
				Integer remainingTicket = new Integer(100 - i);
				remainingTickets.add(remainingTicket);
			}
			
		}catch(IOException ioe) {
			System.err.println("Error Occurs");
		}
		
		return remainingTickets;
	}
	
	private static ArrayList<Integer> ticketPerShow(int day){
		String ticketBooked;
		String[] ticketBookedPerShow;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ticketList = new ArrayList<Integer>();
		ticketList.removeAll(ticketList);
 		try {
 			System.out.println("On Day " +(day+1));
 	 		ticketBooked = br.readLine();
 	 		ticketBookedPerShow = ticketBooked.split(",");
 	 		for(int i = 0; i < 4;i++) {
 	 			ticketList.add(Integer.parseInt(ticketBookedPerShow[i]));
 	 		}
 		}catch(IOException ioe) {
 			System.out.println("Error Occurs");
 		}
 		return ticketList;
		
	}
}
