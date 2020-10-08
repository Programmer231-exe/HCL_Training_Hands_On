package com.hcltrainings.sessiondemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class Display extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("/display.jsp");
		request.setAttribute("eventname",request.getSession().getAttribute("name"));
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
	}
}
