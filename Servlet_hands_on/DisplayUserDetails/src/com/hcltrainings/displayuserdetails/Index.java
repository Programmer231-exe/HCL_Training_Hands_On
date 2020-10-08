package com.hcltrainings.displayuserdetails;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("./Display");
		
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
