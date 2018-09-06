package JavaSql;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;





public class TestDb2 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root";
		String pass = "root";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
		//Create a table
		Statement st = conn.createStatement();
		String sql = "insert into emp values(?, ?, ?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
		Double z = sc.nextDouble();
		pst.setInt(1,x);
		pst.setString(2,y);
		pst.setDouble(3,z);
		pst.executeUpdate();
		System.out.println("inserted");
		conn.close();
	}

}
