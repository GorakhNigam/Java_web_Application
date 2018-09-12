package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;


/**
 * Servlet implementation class GetEmployee
 */
@WebServlet("/GetEmployee")
public class GetEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root";
		String pass = "root";
		String sql = "select * from emp";
		Driver driver;
		Connection conn = null;
		int rows = 0;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			out.println("<table><th>EmpId</th> <th>Empname</th> <th>Salary</th>" +while(rs.next())"<td></table>");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
