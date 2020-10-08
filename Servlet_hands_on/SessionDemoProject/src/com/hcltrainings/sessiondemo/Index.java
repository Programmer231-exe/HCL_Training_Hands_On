package com.hcltrainings.sessiondemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/index")
public class Index extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		try {
			rd.forward(request, response);
		}catch(ServletException se) {
			System.err.println("Servlet Exception occurs");
		}catch(IOException ioe) {
			System.err.println("IOException occurs");
		}
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("/welcome");
		HttpSession session = null;
		if(request.getParameter("name") != null) 
			session = request.getSession();
			session.setAttribute("Name", request.getParameter("name"));
			try {
				rd.forward(request,response);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

