package  AutomationSQL.AutomationSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) throws Exception{
		Connection con = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationselenium?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root1";
		String password = "root";
		
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(dbUrl, userName, password);
		
		System.out.println("Connection Established Succesfully");
		
		PreparedStatement ps = con.prepareStatement("INSERT into credentials(UserName,Password,Date,Result,Grade)VALUES('Mohit','mohit@123','2025-02-24','Pass','A')");
		ps.executeUpdate();
		
		con.close();
	}
}
