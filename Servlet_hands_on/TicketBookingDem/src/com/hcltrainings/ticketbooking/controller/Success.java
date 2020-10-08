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

@WebServlet("/display")
public class Success extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();		
		//SeatingService.insertIntoTable(event_type,cost,Integer.parseInt(count));
		String type = cookies[0].getValue();
		int count = Integer.parseInt(cookies[1].getValue());
		double cost = Double.parseDouble(cookies[2].getValue());
		
		System.out.println(type + " " + count + " " + cost);
		SeatingService.insertIntoTable(type, cost, count);
		request.setAttribute("type",type);
		request.setAttribute("count",count);
		request.setAttribute("cost", cost);
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
