package com.hcltrainings.contextdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcltraining.contextdemo.service.ContextService;

/**
 * Servlet implementation class Displayi
 */

public class Displayi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public Displayi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		LocalDate date = LocalDate.parse(request.getParameter("date1"),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		System.out.println(config);
		String name  = config.getInitParameter("eventlist");
		request.setAttribute("eventList", ContextService.getEvents(name,date));
		System.out.println(name);
		PrintWriter pw = response.getWriter();
		pw.println(name);
		rd.forward(request, response);
	}

}
