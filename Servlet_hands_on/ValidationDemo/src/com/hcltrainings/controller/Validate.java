package com.hcltrainings.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Validate extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		String hallname = request.getParameter("hallname");
		String type = request.getParameter("eventtype");
		String details = request.getParameter("details");
		String owner = request.getParameter("owner");
		System.out.println(request.getParameter("startdate"));
		LocalDate startDate = null;
		System.out.println(request.getParameter("startdate"));
		if(request.getParameter("startdate") != ""){
			startDate = LocalDate.parse(request.getParameter("startdate"),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}
		LocalDate endDate = null;
		if(request.getParameter("enddate") != ""){
			endDate = LocalDate.parse(request.getParameter("enddate"),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}
		
		
		
		if(name != null && hallname != null && type != null && details != null && owner != null && startDate != null && endDate != null) {
			RequestDispatcher rd = request.getRequestDispatcher("/Display");
			try {
				String tableString = "<h1>Event Successfully Created</h1>\r\n" +
											"<h2>Event Details</h2>\r\n" + 
						"	<table border = \"1\">\r\n" + 
						"	<tr><td>Event name : </td><td> "+ name +"</td></tr>\r\n" + 
						"	<tr><td>Hall Name : </td><td>"+ hallname +"</td></tr>\r\n" + 
						"	<tr><td>Event Type : </td><td> "+ type +"</td></tr>" +
						"  	<tr><td>Details : </td><td>"+details+"</td></tr>\r\n" + 
						"  	<tr><td>Owner :</td><td>"+owner+ "</td></tr>\r\n" + 
						"  	<tr><td>Start Date : </td><td>"+startDate + "</td></tr>\r\n" + 
						"  	<tr><td>End Date:</td><td>"+endDate + "</td></tr>\r\n" + 
						"  	</table>\r\n" + 
						""; 
				
				PrintWriter pw = response.getWriter();
				pw.println(tableString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			String errorMessage = "<div style = \"color : red\";>";
			if(name == null) {
				errorMessage += "<p>Event name should not be empty</p>";
			}
			if(hallname == null) {
				errorMessage += "<p>Event hall Name should not be empty</p>";
			}
			if(type == null) {
				errorMessage += "<p>Event hall type should not be empty</p>";
			}
			if(details == null) {
				errorMessage += "<p>Event hall details should not be empty</p>";
			}
			if(owner == null) {
				errorMessage += "<p>Event hall owner name should not be empty</p>";
			}
			if(startDate == null) {
				errorMessage += "<p>Event start date should not be empty</p>";
			}
			if(endDate == null) {
				errorMessage += "<p>Event end date should not be empty</p>";
			}
			
			if(endDate == null) {
				errorMessage += "<p>Event end date should not be empty</p>";
			}
			errorMessage += "</div>";
	
			
			try {
				PrintWriter pw = response.getWriter();
				pw.println(errorMessage);
				RequestDispatcher rd  = request.getRequestDispatcher("/Index");
				try {
					rd.include(request,response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
		

}
}
