package com.hcltrainings.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet{
	

private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request,HttpServletResponse response) {
	response.setContentType("text/html");
	try {
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><title>Hall Paradise</title></head>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Hall Paradise</h1>");
		pw.println("<p>The type of events</p>");
		pw.println("<ul><li>Exhibition</li>");
		pw.println("<li>Stage Show</li>");
		pw.println("</body></html>");
		Cookie cookie = new Cookie("name","Sivasankar");
		response.addCookie(cookie);
	}catch(IOException e) {
		System.out.println("Error occurs");
	}
	
}

}
