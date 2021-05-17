package com.scm.vendor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scm.vendor.util.VendorAthuntiacater;

public class venorlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String VendorName = request.getParameter("VendorName");
			String VendorPassword = request.getParameter("VendorPassword");
			boolean auth = VendorAthuntiacater.validate(VendorName, VendorPassword);
			if (auth) {
				session.setAttribute("AUTH", true);
				request.getRequestDispatcher("/vendorhome").forward(request, response);
			} else {
				response.sendRedirect("vendor/login.jsp");
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
