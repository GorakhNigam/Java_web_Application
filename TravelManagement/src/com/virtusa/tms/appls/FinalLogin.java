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
import javax.servlet.http.HttpSession;

import com.virtusa.tms.beans.Employee;
import com.virtusa.tms.dao.AdminLoginDao;
import com.virtusa.tms.dao.EmployeeLoginDao;
import com.virtusa.tms.dao.LogisticLoginDao;

/**
 * Servlet implementation class FinalLogin
 */
@WebServlet("/FinalLogin")
public class FinalLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("EmployeeLogin");
		EmployeeLoginDao dao = new EmployeeLoginDao();
		ArrayList<String> al=new ArrayList<String>();
		al = dao.getPass(username);
		String pass = al.get(0);
		String role = al.get(1);
		System.out.println(pass);
		if(pass.equals(password) && role.equals("Employee")) {
//			request.setAttribute("empls", empl);
			HttpSession session=request.getSession();  
	        session.setAttribute("username",username);  
			RequestDispatcher rd = request.getRequestDispatcher("EmpPage.jsp");		
			rd.forward(request, response);
		}
		else if(pass.equals(password) && role.equals("Admin")) {
			AdminLoginDao daoa = new AdminLoginDao();
			List<Employee> empList = new ArrayList<Employee>();
			empList = daoa.getAllEmpls();
			RequestDispatcher rd = request.getRequestDispatcher("ViewEmployee.jsp");
			request.setAttribute("empls", empList);
			rd.forward(request, response);
		}
		else if(pass.equals(password) && role.equals("Logistic")) {
			LogisticLoginDao daol = new LogisticLoginDao();
			List<Employee> empList = new ArrayList<Employee>();
			empList = daol.getAllEmpls();
			RequestDispatcher rd = request.getRequestDispatcher("LogisticView.jsp");
			request.setAttribute("empls", empList);
			rd.forward(request, response);
		}
		else {
			out.println("Logistic Username or Password Incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("FinalLogin.jsp");		
			rd.forward(request, response);
		}
	}

}
