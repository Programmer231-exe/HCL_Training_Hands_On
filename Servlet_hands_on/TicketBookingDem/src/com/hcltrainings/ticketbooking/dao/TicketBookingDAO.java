package com.hcltrainings.ticketbooking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hcltrainings.ticketbooking.model.SeatingSection;

public class TicketBookingDAO {
	public static Connection getConnection() {
		ResourceBundle rb = ResourceBundle.getBundle("mysql");
		System.out.println(rb.getString("dbURL"));
		System.out.println("Working");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		try {
			return DriverManager.getConnection(rb.getString("dbURL"),rb.getString("user"),rb.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<SeatingSection> getSeatingSectionList(Connection connection){
		List<SeatingSection> seatingList = new ArrayList<>();
		String query = "SELECT * FROM seating_section";
		try{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				seatingList.add(new SeatingSection(resultSet.getInt("id"),resultSet.getString("seating_type"),resultSet.getDouble("seating_cost"),resultSet.getInt("number_of_seats")));
			}
			return seatingList;
		}catch(SQLException sqle) {
			System.out.println("DB fails");
			return null;
		}
	}
		public static boolean insert(Connection connection,SeatingSection seating) {
			try {
				PreparedStatement ps = connection.prepareStatement("INSERT INTO seating_section VALUES (?,?,?,?)");
				ps.setInt(1, seating.getId());
				ps.setString(2, seating.getSeatingType());
				ps.setDouble(3, seating.getTicketCost());
				ps.setDouble(4,seating.getNumberOfSeats());
				return ps.execute();
			}catch(SQLException sqle) {
				System.out.println("Sql Exception occurs");
				return false;
			}
		}
	
	
	
	
}
