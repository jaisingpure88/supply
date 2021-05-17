package com.scm.admin.servlet;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.scm.admin.util.AdminUserDbUtil;
import com.scm.model.Euser;


/**
 * Servlet implementation class Admin_UserServlet
 */
public class Admin_UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private AdminUserDbUtil adminUserDbUtil;
    @Resource(name="jdbc/supplychainmanagement")
    private DataSource dataSource;
    
    @Override
   	public void init() throws ServletException {
   		// TODO Auto-generated method stub
   		super.init();
   		try {
   			adminUserDbUtil = new AdminUserDbUtil(dataSource);
   		} catch (Exception e) {
   			// TODO: handle exception
   			throw new ServletException(e);
   		}
   	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listUsers(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
				List<Euser> users = adminUserDbUtil.getUsers();
				request.setAttribute("User_LIST", users);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("admin/list-users.jsp");
				dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
