package JavaSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestDB4 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root"; 
		String pass = "root";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
		String sql = "select * from emp";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData metadata = rs.getMetaData();
		for(int i = 1; i<= metadata.getColumnCount(); i++)
			System.out.println(metadata.getColumnName(i)+" ");
		System.out.println("\n-----------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getDouble(3));
		}
		conn.close();
	}

}
