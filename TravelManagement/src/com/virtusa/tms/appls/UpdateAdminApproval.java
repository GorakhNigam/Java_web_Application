package com.virtusa.tms.appls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.tms.dao.AdminLoginDao;
import com.virtusa.tms.dao.EmployeeLoginDao;

/**
 * Servlet implementation class UpdateAdminApproval
 */
@WebServlet("/UpdateAdminApproval")
public class UpdateAdminApproval extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String status = request.getParameter("status");
		int code = Integer.parseInt(request.getParameter("serialNo"));
		AdminLoginDao dao = new AdminLoginDao();
		dao.updateStatus(status,code);
		out.println("update servlet executed");
	}

}
