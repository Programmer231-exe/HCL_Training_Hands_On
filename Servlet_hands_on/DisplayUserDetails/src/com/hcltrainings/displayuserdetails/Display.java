package com.hcltrainings.displayuserdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("This is working");
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.println("<h1 style = \"text-align : center; \">The User Details</h1>");
			pw.println("<table border = \"1\"/ style = \"margin: auto; width : 50%; \">");
			pw.println("<tr><td>Name : </td><td>"+request.getParameter("name")+"</td>");
			pw.println("<tr><td>Phone Number : </td><td>"+request.getParameter("phonenumber")+"</td>");
			pw.println("<tr><td>Email  : </td><td>"+request.getParameter("email")+"</td>");
			pw.println("<tr><td>city : </td><td>"+request.getParameter("city")+"</td>");
			pw.println("</table>");
		
		}catch(IOException ie) {
			System.err.println("Exception occurs");
		}
		
		
	}

}
