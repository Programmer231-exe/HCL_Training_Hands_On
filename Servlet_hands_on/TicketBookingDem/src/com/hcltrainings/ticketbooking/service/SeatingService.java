package com.hcltrainings.ticketbooking.service;

import java.sql.Connection;
import java.util.List;

import com.hcltrainings.ticketbooking.dao.TicketBookingDAO;
import com.hcltrainings.ticketbooking.model.SeatingSection;


public class SeatingService {
	private static int countee = 1;
	private static Connection connection;
	
	public static void insertIntoTable(String type,double cost,int count) {
		connection = TicketBookingDAO.getConnection();
		TicketBookingDAO.insert(connection, new SeatingSection(countee,type,cost,count));
		System.out.println(connection);
		countee++;
		
	}
	
	public static List<SeatingSection> getTable() {
		connection = TicketBookingDAO.getConnection();
		return TicketBookingDAO.getSeatingSectionList(connection);
	}

}
