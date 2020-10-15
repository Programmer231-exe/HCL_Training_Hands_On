package org.onlinetransactiondemo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.onlinetransactiondemo.services.OnlineServicers;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome.au")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String)request.getSession().getAttribute("username");
		Double walletBalance = OnlineServicers.getWalletBalance(username);
		Double accountBalance = OnlineServicers.getAccountBalance(username);
		request.setAttribute("walletBal",walletBalance);
		request.setAttribute("accountBal",accountBalance);
		request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
		}

}
