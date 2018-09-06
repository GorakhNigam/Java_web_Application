package JavaSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.Driver;

public class TestDate {

	public static void main(String[] args) throws ParseException, SQLException{
		// TODO Auto-generated method stub
		Date doj = new Date();
		System.out.println(doj);
		String today = "26/03/2015";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = sdf.parse(today);
		System.out.println(dt);
		System.out.println("formate date : "+sdf.format(dt));
		System.out.println("send date to database");
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/gorakh";
		String user = "root"; 
		String pass = "root";
		Connection conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
		String sql = "insert into date values(?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "abcd");
		//convert date
		java.sql.Date sqldate = new java.sql.Date(dt.getTime());
		pst.setDate(2, sqldate);
		pst.executeUpdate();
		System.out.println("inserted");
	}

}
