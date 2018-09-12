package com.virtusa.empls.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.empls.beans.Employee;
import com.virtusa.empls.dao.EmployeeDao;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		int code = Integer.parseInt(request.getParameter("empcode"));
		String name = request.getParameter("empname");
		String job = request.getParameter("job");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String doj = request.getParameter("doj");
		Employee emp = new Employee(code,name,job,salary,doj);
		EmployeeDao dao = new EmployeeDao();
		int row = dao.addEmployee(emp);
		if(row > 0)
			out.println("Inserted");
		else
			out.println("Not Inserted");
	}

}
