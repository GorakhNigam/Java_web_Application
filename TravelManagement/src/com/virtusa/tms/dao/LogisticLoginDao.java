package com.virtusa.tms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
import com.virtusa.tms.beans.Employee;
import com.virtusa.tms.utils.AdminQueries;
import com.virtusa.tms.utils.LogisticQueries;

public class LogisticLoginDao {
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	public void openConnection() {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/gorakh";
			String user = "root";
			String pass = "root";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Estiblished");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Employee> getAllEmpls(){
		openConnection();
		List<Employee> empList = new ArrayList<Employee>();
		String status = "Approved";
		double expense = 0;
		try {
			pst = conn.prepareStatement(LogisticQueries.review);
			pst.setString(1, status);
			pst.setDouble(2, expense);
			rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp  = new Employee();
				emp.setSerialNo(rs.getInt(1));
				emp.setEmployeeName(rs.getString(2));
				emp.setEmailId(rs.getString(3));
				emp.setSource(rs.getString(4));
				emp.setDestination(rs.getString(5));
				emp.setTravelPurpose(rs.getString(6));
				emp.setTravelMode(rs.getString(7));
				emp.setDuration(rs.getInt(8));
				emp.setTravelExpense(rs.getDouble(9));
				emp.setStatus(rs.getString(10));
//				emp.setDateFrom(rs.getDate(9));
//				emp.setDateTo(rs.getDate(10));
				empList.add(emp);
				
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			closeConnection();
			return empList;
		}
}
