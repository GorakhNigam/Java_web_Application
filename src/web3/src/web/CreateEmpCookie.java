package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CreateEmpCookie
 */
@WebServlet("/CreateEmpCookie")
public class CreateEmpCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//String Empname = request.getParameter("empname");
		//int empid =Integer.parseInt(request.getParameter("id"));
		//int mob = Integer.parseInt(request.getParameter("mobile"));
		Cookie ck1 = new Cookie("empname",request.getParameter("empname"));
		Cookie ck2 = new Cookie("id",request.getParameter("id"));
		Cookie ck3 = new Cookie("mob",request.getParameter("mobile"));
		PrintWriter out = response.getWriter();
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		out.println("cookies created ..<a href=empcookie.html>click here</a>");
	}

}
