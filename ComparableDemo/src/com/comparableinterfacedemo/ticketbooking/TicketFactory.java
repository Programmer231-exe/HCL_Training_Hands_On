package com.comparableinterfacedemo.ticketbooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TicketFactory {
	public static List<TicketBooking> tbGenerator(int count) {
		List<TicketBooking> tbList = new ArrayList<TicketBooking>();
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < count; i++) {
			try {
				detail = br.readLine();
				splittedDetail = detail.split(",");
				tbList.add(new TicketBooking(splittedDetail[0],Integer.parseInt(splittedDetail[1])));
			}catch(IOException ioe) {
				System.err.println("Some problem with reading");
			}
			
			
			
		}
		
		return tbList;
	
		
	}
}
