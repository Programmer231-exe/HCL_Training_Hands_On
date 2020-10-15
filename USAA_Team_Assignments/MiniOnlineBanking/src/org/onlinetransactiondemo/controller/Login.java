package org.onlinetransactiondemo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.onlinetransactiondemo.services.OnlineServicers;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login.ru")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/Views/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		String result = OnlineServicers.isValidUser(username,password);
		if(username.equals(result)) {
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			request.getRequestDispatcher("/Welcome.au").forward(request,response);
		}else {
			request.setAttribute("errorMessage",result);
			request.getRequestDispatcher("/WEB-INF/Views/Login.jsp").forward(request, response);
		}
		
	}

}
