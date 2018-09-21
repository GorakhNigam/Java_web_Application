package com.virtusa.tms.appls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.tms.beans.Employee;
import com.virtusa.tms.dao.AdminLoginDao;
import com.virtusa.tms.dao.LogisticLoginDao;

/**
 * Servlet implementation class LogisticAppl
 */
@WebServlet("/LogisticAppl")
public class LogisticAppl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("Logistic") && password.equals("Logistic")) {
			LogisticLoginDao dao = new LogisticLoginDao();
			List<Employee> empList = new ArrayList<Employee>();
			empList = dao.getAllEmpls();
			RequestDispatcher rd = request.getRequestDispatcher("LogisticView.jsp");
			request.setAttribute("empls", empList);
			rd.forward(request, response);
		}
		else {
			out.println("Logistic Username or Password Incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("LogisticLogin.jsp");		
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
