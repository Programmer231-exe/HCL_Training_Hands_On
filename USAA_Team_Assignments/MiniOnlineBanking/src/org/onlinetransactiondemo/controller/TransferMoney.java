package org.onlinetransactiondemo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.onlinetransactiondemo.services.OnlineServicers;

/**
 * Servlet implementation class TransferMoney
 */
@WebServlet("/transfer.au")
public class TransferMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/Views/transfer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String transactionType = request.getParameter("type_of");
		System.out.println(transactionType);
		String sender = (String)request.getSession().getAttribute("username");
		String from = request.getParameter("from_amount");
		System.out.println(from);
		String to = request.getParameter("receiver");
		double amount = Double.parseDouble(request.getParameter("amount"));
		
		String message = OnlineServicers.beginTransaction(transactionType,sender,from,to,amount);
		System.out.println(message);
		
		request.setAttribute("transactionmessage", message);
		
		request.getRequestDispatcher("/WEB-INF/Views/transfer.jsp").forward(request, response);
		
		
	}

}
