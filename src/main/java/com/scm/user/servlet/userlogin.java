package com.scm.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scm.user.util.UserAthuntiacater;

public class userlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String UserName = request.getParameter("UserName");
			String UserPassword = request.getParameter("UserPassword");
			boolean auth = UserAthuntiacater.validate(UserName, UserPassword);
			if (auth) {
				session.setAttribute("AUTH", true);
				request.getRequestDispatcher("/userhome").forward(request, response);
			} else {
				response.sendRedirect("user/login.jsp");
				session.setAttribute("ERROR", "Athuentication Fail");
			}
		} catch (Exception e) {

		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
