package com.virtusa.tms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.tms.beans.Employee;
import com.virtusa.tms.dao.EmployeeDao;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/ViewEmployee")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();  
        String username = (String)session.getAttribute("username"); 
        //System.out.println("ViewPrevious");
		EmployeeDao dao = new EmployeeDao();

		List<Employee> empList = dao.getAllEmpls(username);
		RequestDispatcher rd = request.getRequestDispatcher("ViewPrevPlan.jsp");
		request.setAttribute("empls", empList);
		rd.forward(request, response);
		
		
		
		
		
		
		
		
	}

}
