package JavaSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class TestDB3 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root";
		String pass = "root";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
//		String sql = "update emp set salary = ? where code = ?";
//		PreparedStatement pst = conn.prepareStatement(sql);
//		pst.setDouble(1, 8000);
//		pst.setInt(2, 101);
//		pst.executeUpdate();
//		System.out.println("updated");
		String sql = "delete from emp where code = ?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1,101);
		pst.executeUpdate();
		System.out.println("deleted");
				
	}

}
