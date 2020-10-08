package com.hcltrainings.ticketbooking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcltrainings.ticketbooking.service.SeatingService;

@WebServlet("/confirm")
public class Confirm extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		String event_type = request.getParameter("tickettype");
		String count = request.getParameter("count");
		System.out.println(event_type);
		System.out.println(count);
		
		Cookie cookie1 = new Cookie("type",event_type);
		Cookie cookie2 = new Cookie("count",count);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		RequestDispatcher rd = request.getRequestDispatcher("confirm.jsp");
		
		double cost = 0.0;
		 if(event_type.equals("platinum")) {
			 cost = Integer.parseInt(count) * 1000;
		 }
		 if(event_type.equals("gold")) {
			 cost = Integer.parseInt(count) * 500;
		 }
		 if(event_type.equals("silver")) {
			 cost = Integer.parseInt(count) * 250;
		 }
		 
		 Cookie cookie3 = new Cookie("cost",String.valueOf(cost));
		 response.addCookie(cookie3);
		 
		 System.out.println("Type: " + event_type);
		 System.out.println("Cost : " + cost);
		 System.out.println("Count : " +count);
		 request.setAttribute("cost",cost);
		 //SeatingService.insertIntoTable(event_type,cost,Integer.parseInt(count)); 
		 
		try {
			rd.forward(request,response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
