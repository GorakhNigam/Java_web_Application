package JavaSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestSql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver drive = new Driver();
		DriverManager.registerDriver(drive);
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root";
		String pass = "root";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
		//Create a table
		Statement st = conn.createStatement();
		String sql = "insert into emp values(101,'virtusa',5000)";
		st.executeUpdate(sql);
		System.out.println("inserted");
		conn.close();
	}

}
