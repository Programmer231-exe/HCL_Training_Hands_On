package com.hcltrainings.ticketbooking.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcltrainings.ticketbooking.dao.TicketBookingDAO;
import com.hcltrainings.ticketbooking.service.SeatingService;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }
    SeatingService service = new SeatingService();
    TicketBookingDAO td = new TicketBookingDAO();
    
    Connection connection;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * connection = td.getConnection(); td.insert(connection, new
		 * SeatingSection(1,"Siva",2000,2)); System.out.println(connection);
		 */
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String event_type = request.getParameter("tickettype");
		String count = request.getParameter("count");
		System.out.println(event_type);
		System.out.println(count);
		Cookie cookie1 = new Cookie("type",event_type);
		Cookie cookie2 = new Cookie("count",count);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		RequestDispatcher rd = request.getRequestDispatcher("./confirm");
		rd.forward(request, response);
		
	}

}
