package com.hcltrainings.controller;

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
	private String tableString = "<h1>Event Creation</h1>\r\n" + 
			"<form method = \"post\" action = \"./Display\">\r\n" + 
			"	<table>\r\n" + 
			"	<tr><td><label for = \"name\">Event name : </label></td><td><input type = \"text\" id = \"name\" name = \"name\"/></td></tr>\r\n" + 
			"	<tr><td><label for = \"hallname\">Hall Name : </label></td><td><input type = \"text\" id = \"hallname\" name = \"hallname\"/></td></tr>\r\n" + 
			"	<tr><td><label for = \"exhibition\">Event Type : </label></td><td><input type=\"radio\" id=\"exhibiton\" name=\"eventtype\" value=\"exhibition\"><label for = \"exhibition\">Exhibition</label>\r\n" + 
			"  	<input type=\"radio\" id=\"stageshow\" name=\"eventtype\" value=\"stageshow\"><label for = \"stageshow\">StageShow</label>\r\n" + 
			"  	<tr><td><label for = \"details\">Details : </label></td><td><input type = \"text\" id = \"details\" name = \"details\"/></td></tr>\r\n" + 
			"  	<tr><td><label for = \"owner\">Owner : </label></td><td><input type = \"text\" id = \"owner\" name = \"owner\"/></td></tr>\r\n" + 
			"  	<tr><td><label for = \"startdate\" >Start Date : </label></td><td><input type = \"date\" id = \"startdate\" name = \"startdate\"/></td></tr>\r\n" + 
			"  	<tr><td><label for = \"enddate\">End Date:</label> </td><td><input type = \"date\" id = \"enddate\" name = \"enddate\"/></td></tr>\r\n" + 
			"  	</table>\r\n" + 
			"  	<input type = \"submit\" value = \"Submit\"/>\r\n" + 
			"</form>\r\n" + 
			""; 
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			PrintWriter pw = response.getWriter();
			pw.println(tableString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		
		
		try {
			PrintWriter pw = response.getWriter();
			pw.println(tableString);
		}catch(IOException ioe) {
			System.out.println("Error");
		}
	}

}
