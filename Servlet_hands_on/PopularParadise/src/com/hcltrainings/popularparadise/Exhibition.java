package com.hcltrainings.popularparadise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exhibition extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.println("<h1>TextFair 2018 expo</h1>");
			pw.println("<table border=\"1\" id = \"exhibition\" >");
			pw.println("<tr><th>Name</th><th>TextFair 2017 expo</th></tr>");
			pw.println("<tr><td>Hall Name</td><td>PVR Superplus</td></th></tr>");
			pw.println("<tr><td>Start Date</td><td>10-10-2020</td></tr>");
			pw.println("<tr><td>End Date</td><td>10-10-2030</td></tr>");
			pw.println("</table>");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
