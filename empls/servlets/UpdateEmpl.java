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
 * Servlet implementation class UpdateEmpl
 */
@WebServlet("/UpdateEmpl")
public class UpdateEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee();
		int code = Integer.parseInt(request.getParameter("empcode"));
		emp = dao.getEmpl(code);
		request.setAttribute("empls", emp);
		RequestDispatcher rd = request.getRequestDispatcher("UpdateEmpl.jsp");		
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//doGet(request, response);
			PrintWriter out = response.getWriter();
			int code = Integer.parseInt(request.getParameter("empcode"));
			String name = request.getParameter("empname");
			String job = request.getParameter("job");
			double salary = Double.parseDouble(request.getParameter("salary"));
			String doj = request.getParameter("doj");
			Employee emp = new Employee(code,name,job,salary,doj);
			EmployeeDao dao = new EmployeeDao();
			dao.updateAll(emp);
			out.println("update servlet executed");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
