package web;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

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
		PrintWriter out  = response.getWriter();
		int code = Integer.parseInt(request.getParameter("code"));
		String name = request.getParameter("name");
		double sal = Double.parseDouble(request.getParameter("sal"));
		
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root";
		String pass = "root";
		String sql = "insert into emp values(?,?,?)";
		Driver driver;
		Connection conn = null;
		int rows = 0;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, code);
			pst.setString(2, name);
			pst.setDouble(3, sal);
			rows = pst.executeUpdate();
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
		out.println("Inserted");
	}

}
