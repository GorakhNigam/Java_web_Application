package com.virtusa.empls.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.empls.beans.Employee;
import com.virtusa.empls.dao.EmployeeDao;

/**
 * Servlet implementation class getEmployee
 */
@WebServlet("/getEmployee")
public class getEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		EmployeeDao dao = new EmployeeDao();
		List<Employee> empList = dao.getAllEmpls();
		RequestDispatcher rd = request.getRequestDispatcher("ViewEmployees.jsp");
		request.setAttribute("empls", empList);
		rd.forward(request, response);
	}

}
