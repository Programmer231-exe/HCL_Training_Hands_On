package com.hcltrainings.sessiondemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		try {
			RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
			request.setAttribute("name",request.getSession().getAttribute("name"));
			rd.forward(request,response);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(ServletException se) {
			se.printStackTrace();
		}
	}
	
}
