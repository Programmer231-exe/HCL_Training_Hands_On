package com.hcltrainings.popularparadise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StageShow extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.println("<h1>New Year Eve</h1>");
			pw.println("<table border=\"1\" id = \"exhibition\" >");
			pw.println("<tr><th>Name</th><th>PVR Lulu Mall</th></tr>");
			pw.println("<tr><td>Hall Name</td><td>PVR Superplus</td></th></tr>");
			pw.println("<tr><td>Date</td><td>10-10-2020</td></tr>");
			pw.println("<tr><td>Start Time</td><td>10:00:00</td></tr>");
			pw.println("<tr><td>Start Time</td><td>12:00:00</td></tr>");
			pw.println("</table>");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
