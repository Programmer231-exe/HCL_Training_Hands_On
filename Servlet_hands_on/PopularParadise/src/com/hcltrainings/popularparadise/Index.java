package com.hcltrainings.popularparadise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.println("<h1>Welcome to Popular Paradise</h1>");
			pw.println("<a href = \"./Exhibition\">Exhibition</a>");
			pw.println("<a href = \"./StageShow\">Stage Show</a>");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
